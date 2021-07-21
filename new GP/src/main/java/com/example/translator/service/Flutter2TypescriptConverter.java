package com.example.translator.service;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;

import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.TerminalNode;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import org.springframework.web.multipart.MultipartFile;

import com.example.translator.Dart2BaseListener;
import com.example.translator.Dart2Lexer;
import com.example.translator.Dart2Parser;


@Component("Flutter2TypescriptConverter")
public class Flutter2TypescriptConverter extends Dart2BaseListener  implements CodeConverter{
	
	private  File file;
	Map<String, ArrayList<String>> FunctionNameAndBody = new LinkedHashMap<>();
    Map<String, ArrayList<String>> InitializedIdentifiers = new LinkedHashMap<>();
    ArrayList<String> ControllersNames = new ArrayList<>();
    ArrayList<String> Variables = new ArrayList<>();
    ArrayList<String> InsideConstructor = new ArrayList<>();
    ArrayList<String> DefinedinConstructor = new ArrayList<>();
    ArrayList<String> NeededImports = new ArrayList<>();


    public String Replace(String expression){
        String replacedExpression=expression;
        int alert=0;
        if(replacedExpression.contains("double.parse")){
            replacedExpression = replacedExpression.replace("double.parse","parseFloat");
        }
        if(replacedExpression.contains("int.parse")){
            replacedExpression = replacedExpression.replace("int.parse","parseInt");
        }
        if(replacedExpression.contains("\"")){
            replacedExpression = replacedExpression.replace("\"","\'");
        }

        if(replacedExpression.contains("Colors.") && replacedExpression.contains("=")){
            //replacedExpression = replacedExpression.replace("Colors.","");
            String name = replacedExpression.substring(0, replacedExpression.indexOf("="));
            String color = replacedExpression.substring(replacedExpression.indexOf(".")+1);

            replacedExpression = "document.documentElement.style.setProperty(\'--" + name + "\', \'" + color + "\' )";
        }

        for (String controller:ControllersNames) {
            if(replacedExpression.contains(controller+".text"))
                replacedExpression = replacedExpression.replace(controller+".text","this."+controller);
            if(replacedExpression.contains("$"+controller)){
                replacedExpression = replacedExpression.replace("$"+controller,"\' this."+ controller + "\'") ;
            }
        }

        for(String name: Variables){
            if(replacedExpression.contains("$"+name)){
                replacedExpression = replacedExpression.replace("$"+name,"\' + this."+ name + " +\'");
            }
            if(replacedExpression.contains(name+".year")){
                replacedExpression = replacedExpression.replace(name+".year",name+".getFullYear()");
            }
            if(!replacedExpression.contains("this."+name) && !replacedExpression.contains("setProperty")){
                replacedExpression = replacedExpression.replace(name,"this."+name);
            }

        }
        if(replacedExpression.contains("FlutterPhoneDirectCaller")){
            if(!NeededImports.contains("import {CallNumber} from '@ionic-native/call-number/ngx';"))
                NeededImports.add("import {CallNumber} from '@ionic-native/call-number/ngx';");
            replacedExpression = replacedExpression.replace("FlutterPhoneDirectCaller", "await this.call");
            replacedExpression = replacedExpression.replace(")", ", true)");
            System.out.print(replacedExpression);
            DefinedinConstructor.add("public call: CallNumber,");
        }
        if(replacedExpression.contains("awaitlaunch")){
            if(!NeededImports.contains("import { InAppBrowser } from '@ionic-native/in-app-browser/ngx';"))
                NeededImports.add("import { InAppBrowser } from '@ionic-native/in-app-browser/ngx';");
            replacedExpression = replacedExpression.replace("awaitlaunch", "this.iab.create");
            replacedExpression = replacedExpression.replace(")", ", '_system')");
            System.out.print("n3m"+replacedExpression);
            DefinedinConstructor.add("public iab: InAppBrowser");
        }
        if(replacedExpression.contains("AlertDialog")){
            if(!NeededImports.contains("import { AlertController } from '@ionic/angular';"))
                NeededImports.add("import { AlertController } from '@ionic/angular';");
            System.out.print("HEEEEEEEEEEEEEEEE" +NeededImports);
            DefinedinConstructor.add("public alertDialog: AlertController,");
            replacedExpression = replacedExpression.replace("AlertDialog(", "await this.alertDialog.create({");
            replacedExpression = replacedExpression.replace("title", "header");
            replacedExpression = replacedExpression.replace("content", "message");
            replacedExpression = replacedExpression.replace("Text(", "");
            replacedExpression = replacedExpression.replace(")", "");
            alert = 1;
        }
        if(replacedExpression.contains("showDialog")){
            String out = replacedExpression.substring(replacedExpression.indexOf("return")+6, replacedExpression.indexOf(";"));
            replacedExpression = "await " + out + ".present()";
        }
        if (alert == 1){
            replacedExpression = replacedExpression + "});";
        }
        else
            replacedExpression = replacedExpression + ";";
        return replacedExpression;
    }

    public String ReplaceInit(String expression){
        String exp = expression;
        if(exp.contains("newDateTime.now()"))
            exp = exp.replace("newDateTime.now()", "new Date()");
        if(exp.contains("\"")){
            exp = exp.replace("\"","\'");
        }
        String afterEqual = expression.substring(expression.indexOf("=")+1);
        if(afterEqual.contains(".") && !afterEqual.contains("this.")){
            String afterDot = afterEqual.substring(afterEqual.indexOf(".")+1,afterEqual.indexOf(";"));
            exp = exp.replace(afterEqual,"'"+afterDot + "';");
        }
        return exp;
    }

    @Override public void enterNamedArgument(Dart2Parser.NamedArgumentContext ctx){
        String Label = ctx.label().getText();
        if(Label.equals("controller:"))
            ControllersNames.add(ctx.expression().getText());
    }

    @Override public void enterFunctionSignature(Dart2Parser.FunctionSignatureContext ctx) {
        System.out.print("return type "+ctx.returnType().getText() + "\n");
        System.out.print("fn name "+ctx.identifier().getText() + "\n");

        String returnType = ctx.returnType().getText();
        String functionName = ctx.identifier().getText();
        if(!returnType.equals("Widget") && !returnType.contains("StatefulWidget")){
            if(!functionName.equals("main"))
                FunctionNameAndBody.put(functionName,new ArrayList<>());
        }
    }

    @Override public void enterBlock(Dart2Parser.BlockContext ctx) {
        //child 0 to get {
        System.out.print("start "+ctx.getChild(0).getText() + "\n");
        List<String> Keys = new ArrayList<>(FunctionNameAndBody.keySet());
        if(ctx.getChild(0).getText().equals("{") && !Keys.isEmpty()) {
            List values = FunctionNameAndBody.get(Keys.get(Keys.size()-1));
            if(values.isEmpty())
                FunctionNameAndBody.get(Keys.get(Keys.size() - 1)).add("{");
        }
    }
    @Override public void exitBlock(Dart2Parser.BlockContext ctx) {
        //child 0 to get }
        List<String> Keys = new ArrayList<>(FunctionNameAndBody.keySet());
        if(ctx.getChild(ctx.getChildCount()-1).getText().equals("}") && !Keys.isEmpty() ){
            List values = FunctionNameAndBody.get(Keys.get(Keys.size()-1));
            if(!values.get(values.size()-1).equals("}"))
                FunctionNameAndBody.get(Keys.get(Keys.size()-1)).add("}");
        }
    }

    @Override public void enterInitializedVariableDeclaration(Dart2Parser.InitializedVariableDeclarationContext ctx) {
        //elements declared inside a function
        System.out.print(ctx.declaredIdentifier().identifier().IDENTIFIER().getText() + "\n");
        System.out.print(ctx.declaredIdentifier().finalConstVarOrType().getText() + "\n");
        System.out.print(ctx.expression().getText() + "\n");
        String type = ctx.declaredIdentifier().finalConstVarOrType().getText();
        String name = ctx.declaredIdentifier().identifier().IDENTIFIER().getText();
        String expression = ctx.expression().getText();
        Variables.add(name);
        if(!InitializedIdentifiers.isEmpty()){
            List<String> Keys = new ArrayList<>(InitializedIdentifiers.keySet());
            if(Keys.contains(type))
                InitializedIdentifiers.get(type).add(name);
            else {
                InitializedIdentifiers.put(type,new ArrayList<>());
                InitializedIdentifiers.get(type).add(name);
            }
        }
        else{
            InitializedIdentifiers.put(type,new ArrayList<>());
            InitializedIdentifiers.get(type).add(name);
        }
        List<String> Keys = new ArrayList<>(FunctionNameAndBody.keySet());
        if(!Keys.isEmpty()){
            expression = Replace(expression);
            List values = FunctionNameAndBody.get(Keys.get(Keys.size()-1));
            if(!values.get(values.size()-1).equals("}"))
                FunctionNameAndBody.get(Keys.get(Keys.size()-1)).add("this." + name + "=" + expression);
        }
        System.out.print(InitializedIdentifiers + "\n");
    }

    @Override public void enterExpressionStatement(Dart2Parser.ExpressionStatementContext ctx) {
        String expression = ctx.expression().getText();
        System.out.print("function body "+ ctx.expression().getText() + "\n");
       //i need 2li abl l equal yt3ml this.
        expression = Replace(expression);
        List<String> Keys = new ArrayList<>(FunctionNameAndBody.keySet());
       if(!Keys.isEmpty()){
           List values = FunctionNameAndBody.get(Keys.get(Keys.size()-1));
           if(!values.get(values.size()-1).equals("}"))
                FunctionNameAndBody.get(Keys.get(Keys.size()-1)).add(expression);
       }
        System.out.print(FunctionNameAndBody+"\n");
    }

    @Override public void enterDeclaration(Dart2Parser.DeclarationContext ctx) {
        //to put all declarations of variables
        String type;
        if(ctx.getChild(0).getClass().toString().equals("class Dart2Parser$DtypeContext")) {
            System.out.print(ctx.dtype().getText() + "\n");
            System.out.print(ctx.initializedIdentifierList().getText() + "\n");
            System.out.print(ctx.initializedIdentifierList().getText().substring(ctx.initializedIdentifierList().getText().indexOf("=") + 1));

            type = ctx.dtype().getText();
        }
        else{
            type=ctx.getChild(0).getText();
        }
            String expression = ctx.initializedIdentifierList().getText().substring(ctx.initializedIdentifierList().getText().indexOf("=") + 1);
            System.out.print("exp"+type+"\n");
            String name = ctx.initializedIdentifierList().getText().substring(0, ctx.initializedIdentifierList().getText().indexOf("="));


            Variables.add(name);
            if (!InitializedIdentifiers.isEmpty()) {
                List<String> Keys = new ArrayList<>(InitializedIdentifiers.keySet());
                if (Keys.contains(type))
                    InitializedIdentifiers.get(type).add(name);
                else {
                    InitializedIdentifiers.put(type, new ArrayList<>());
                    InitializedIdentifiers.get(type).add(name);
                }
            } else {
                InitializedIdentifiers.put(type, new ArrayList<>());
                InitializedIdentifiers.get(type).add(name);
            }

        if(!expression.equals(type+"()")) {
            expression = "this." + name + " = " + expression + ";";
            expression = ReplaceInit(expression);
            if(!type.equals("Color"))
                InsideConstructor.add(expression);
            System.out.print("final "+ expression + "\n");

        }

    }
    @Override public void enterReturnStatement(Dart2Parser.ReturnStatementContext ctx) {
        System.out.print(ctx.expression().getText());
        String expression =ctx.expression().getText();
        if(expression.contains("=")){
            expression = Replace(expression);
            List<String> Keys = new ArrayList<>(FunctionNameAndBody.keySet());
            if(!Keys.isEmpty()) {
                List values = FunctionNameAndBody.get(Keys.get(Keys.size()-1));
                if(!values.get(values.size()-1).equals("}"))
                    FunctionNameAndBody.get(Keys.get(Keys.size() - 1)).add(expression);
            }
        }

    }

    @Override public void exitCompilationUnit(Dart2Parser.CompilationUnitContext ctx) {
        try {
            FileWriter outputfile = new FileWriter(file.getName());
            outputfile.write("import { Component } from '@angular/core';\n");
            outputfile.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        for(int i = 0; i< NeededImports.size(); i++){
            try {
                FileWriter outputfile = new FileWriter(file.getName(),true);
                outputfile.write(NeededImports.get(i) + "\n");
                outputfile.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        try {
            FileWriter outputfile = new FileWriter(file.getName(),true);
            outputfile.write("\n" +
                    "@Component({\n" +
                    "  selector: 'app-home',\n" +
                    "  templateUrl: 'home.page.html',\n" +
                    "  styleUrls: ['home.page.scss'],\n" +
                    "})\n" +
                    "export class HomePage {\n");
            outputfile.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        for(String key: InitializedIdentifiers.keySet()){
            List<String> identifier =  InitializedIdentifiers.get(key);
            for(int i = 0; i< identifier.size(); i++){
                try {
                    FileWriter outputfile = new FileWriter(file.getName(),true);
                    if(key.equals("String") || key.equals("TextEditingController"))
                        outputfile.write(identifier.get(i) +":"+" string;\n");
                    if(key.equals("int") || key.equals("double"))
                        outputfile.write(identifier.get(i) +":"+" number;\n");
                    if(key.equals("var"))
                        outputfile.write(identifier.get(i) +":"+" any;\n");
                    if(key.equals("bool"))
                        outputfile.write(identifier.get(i) +":"+" boolean;\n");
                    outputfile.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }

        }
        try {
            FileWriter outputfile = new FileWriter(file.getName(), true);
            outputfile.write("constructor(");
            for (int i=0; i<DefinedinConstructor.size(); i++)
                outputfile.write(DefinedinConstructor.get(i));
            outputfile.write("){\n");
            outputfile.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        for(int i = 0; i< InsideConstructor.size(); i++){
            try {
                FileWriter outputfile = new FileWriter(file.getName(), true);
                outputfile.write(InsideConstructor.get(i) + "\n");
                outputfile.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        try {
            FileWriter outputfile = new FileWriter(file.getName(), true);
            outputfile.write( "}\n");
            outputfile.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        for(String key : FunctionNameAndBody.keySet()){
            List<String> body =  FunctionNameAndBody.get(key);
            try {
                FileWriter outputfile = new FileWriter(file.getName(), true);
                if(body.get(1).contains("alertDialog.create") || body.get(1).contains(".callNumber"))
                    outputfile.write("async " + key + "()\n");
                else
                    outputfile.write(key + "()\n");
                outputfile.close();
            } catch (IOException e) {
                e.printStackTrace();
            }

            for(int i = 0; i< body.size(); i++){
                try {
                    FileWriter outputfile = new FileWriter(file.getName(), true);
                    outputfile.write(body.get(i) + "\n");
                    outputfile.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }


        }
        try {
            FileWriter outputfile = new FileWriter(file.getName(), true);
            outputfile.write( "}\n ");
            outputfile.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public ParseTree convert(String  uploadedFileName) throws IOException {
        CharStream charStream= CharStreams.fromFileName(uploadedFileName);
        Dart2Lexer lexer = new Dart2Lexer(charStream);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        Dart2Parser parser = new Dart2Parser(tokens);

        parser.setBuildParseTree(true);
        ParseTree tree = parser.compilationUnit();

        return tree;
    }

    @Override
    public void setFileName(String fileName) {
        file=new File(fileName);

    }


    public void setFile(File file) {
        this.file = file;
    }

    @Override
    public File getFile() {
        // TODO Auto-generated method stub
        return file;
    }
}
