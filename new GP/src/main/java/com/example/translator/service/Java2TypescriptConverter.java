package com.example.translator.service;

import java.io.File;
import java.io.IOException;

import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import com.example.translator.Java8Lexer;
import com.example.translator.Java8Parser;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.TerminalNode;
import com.example.translator.Java8ParserBaseListener;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;



@Scope("prototype")
@Component("Java2TypescriptConverter")
public class Java2TypescriptConverter extends Java8ParserBaseListener implements CodeConverter{
	
	 	private File file = new File("MainActivity") ;
	    private StringBuilder output = new StringBuilder();
	    private int importButton = 0;
	    private String processed;
	    private int flag = 0 ;
	    private int callNumberFlag = 0;

	    @Override
	    public void visitTerminal(TerminalNode node) {
	    }

	    @Override
	    public void visitErrorNode(ErrorNode node) {
	    }

	    @Override
	    public void enterEveryRule(ParserRuleContext ctx) {
	    }

	    @Override
	    public void exitEveryRule(ParserRuleContext ctx) {
	    }

//	    @Override
//	    public void enterCompilationUnit(Java8Parser.CompilationUnitContext ctx) {
//	        String name = ctx.packageDeclaration().packageName().Identifier().getText();
//	        int importSize = ctx.importDeclaration().size();
//	        String sh = ctx.typeDeclaration(0).classDeclaration().normalClassDeclaration().Identifier().toString();
//	        for (int i = 0; i<= importSize; i++){
//	        }
//	        int name2 = ctx.typeDeclaration().size();
//	        System.out.println(sh);
//	        System.out.println(importSize);
//	        System.out.println(name2);
//	    }



	    @Override
	    public void enterImportDeclaration(Java8Parser.ImportDeclarationContext ctx) {
	        String importNamesWithImport = ctx.singleTypeImportDeclaration().getText();
	        String[] importNames = importNamesWithImport.split("import");
	        for (String a : importNames){
	            if(a.equals("android.widget.Button;")){
	                importButton = 1;
//	            output.insert(0, "import { Button } from 'protractor';\n");
	            }
	        }

	    }


	    @Override
	    public void enterMethodDeclaration(Java8Parser.MethodDeclarationContext ctx) {
	        String methodName = ctx.methodHeader().methodDeclarator().Identifier().getText();
	        if(!(methodName.equals("onCreate"))){
	            output.append("\n  "+methodName+"(){\n");
	            int size = ctx.methodBody().block().blockStatements().blockStatement().size();
//	            System.out.println(size);
	            List<String> varString = new ArrayList<String>();
	            for (int i = 0; i < size - 1; i++) {
	                String expression = ctx.methodBody().block().blockStatements().
	                        blockStatement(i).localVariableDeclarationStatement().
	                        localVariableDeclaration().variableDeclaratorList().getText();
	                System.out.println(expression);


	                String var = ctx.methodBody().block().blockStatements().
	                        blockStatement(i).localVariableDeclarationStatement().
	                        localVariableDeclaration().variableDeclaratorList().
	                        variableDeclarator(0).variableDeclaratorId().Identifier().getText();
	                String type = ctx.methodBody().block().blockStatements().
	                        blockStatement(i).localVariableDeclarationStatement().
	                        localVariableDeclaration().start.getText();

	                String get_text = ctx.methodBody().block().blockStatements().
	                        blockStatement(i).localVariableDeclarationStatement().
	                        localVariableDeclaration().variableDeclaratorList().
	                        variableDeclarator(0).variableInitializer().expression().assignmentExpression().getText();

	                String var3 = String.valueOf(ctx.methodBody().block().blockStatements().blockStatement(i).getChildCount());
//	                System.out.println(var3);

	                String var2 = ctx.methodBody().block().blockStatements().
	                        blockStatement(size - 1).statement().getText();
//	                if(var2.contains("setText")&&var2.contains(var)){
//	                    System.out.println(var2+"bbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbb");
//	                    System.out.println(var);
//	                }

	                System.out.println(type);
	                if (get_text.contains("getText") || (var2.contains("setText") && var2.contains(var) && !(expression.contains("findViewById")))) {

	                    if (type.equals("double") || type.equals("int") || type.equals("long") || type.equals("float")) {
	                        output.insert(0, "\n    " + var + ":number;\n");
	                        varString.add(var);

//	                        System.out.println(varString + "ssssssssssssssssssssssssssssssssssssssssssssssssssssss");

	                    } else {
	                        output.insert(0, "\n    " + var + ";\n");
	                        varString.add(var);
//	                        System.out.println(varString + "ssssssssssssssssssssssssssssssssssssssssssssssssssssss");

	                    }

	                }
	                if (!(type.equals("EditText") || type.equals("TextView") || type.equals("Button") || expression.contains("setText") || expression.contains("getText"))) {
	                    if(type.equals("Intent")){
	                        callNumberFlag = 1;
	                        String telNumber = expression.substring(expression.indexOf("+")+2,expression.indexOf("\"))"));
	                        output.append( "this.callNumber.callNumber(\"");
	                        output.append(telNumber+"\", true)\n" +
	                                "  .then(res => console.log('Launched dialer!', res))\n" +
	                                "  .catch(err => console.log('Error launching dialer', err));\n");
	                        System.out.println(telNumber);
	                    }
	                    for (int counter = 0; counter < varString.size(); counter++) {
	                        if (expression.contains(varString.get(counter))) {
	                            processed = expression.replace(varString.get(counter), "this." + varString.get(counter));

	                            expression = processed;
	                            flag = 1;
	                        } else {

	                            output.append("\n    let ").append(expression).append(";\n");
	                        }

	                    }
	                    if (flag == 1) {
	                        output.append("\n    ").append(processed).append(";\n");
	                    }


	                }
	            }
	        }

	    }


	    @Override
	    public void exitMethodDeclaration(Java8Parser.MethodDeclarationContext ctx) {
	        String methodName = ctx.methodHeader().methodDeclarator().Identifier().getText();
	        if(!(methodName.equals("onCreate"))) {
	            output.append("  }\n");
	        }
	    }


	    @Override
	    public void exitClassDeclaration(Java8Parser.ClassDeclarationContext ctx) {
	        String x = ctx.normalClassDeclaration().Identifier().getText();
	        String n = ctx.normalClassDeclaration().classBody().RBRACE().getText();
	        if (x.equals("MainActivity") && n.equals("}")){
	            output.append("\n}");
	            if(callNumberFlag == 1){
	                output.insert(0,  "\n@Component({\n" +
	                        "  selector: \'app-home\',\n" +
	                        "  templateUrl: \'home.page.html\',\n" +
	                        "  styleUrls: [\'home.page.scss\'], \n" +
	                        "})\n"+
	                        "\nexport class HomePage {\n  c_class='';\n" +
	                        "  \n" +
	                        "  constructor(private callNumber: CallNumber) {}\n");
	            }
	            else {
	                output.insert(0, "\n@Component({\n" +
	                        "  selector: \'app-home\',\n" +
	                        "  templateUrl: \'home.page.html\',\n" +
	                        "  styleUrls: [\'home.page.scss\'], \n" +
	                        "})\n" +
	                        "\nexport class HomePage {\n  c_class='';\n" +
	                        "  \n" +
	                        "  constructor() {}\n");
	            }
	            if(importButton == 1){
	                output.insert(0, "import { Button } from 'protractor';\n");
	            }
	            if(callNumberFlag == 1){
	                output.insert(0, "import { CallNumber } from '@ionic-native/call-number/ngx';\n");
	            }
	            output.insert(0,"import { not } from \'@angular/compiler/src/output/output_ast\';\n" +
	                    "import { Component, ViewChild } from \'@angular/core\';\n" +
	                    "import { IonItemOption, IonItemOptions, IonList } from \'@ionic/angular\';\n"+
	                    "import { isNumber } from \'util\';\n"
	                   );

	                            try {
	                FileWriter outputFile;
	                outputFile = new FileWriter(file.getName()+".ts");
	                outputFile.write(output.toString());
	                outputFile.close();
	            } catch (IOException e) {
	                e.printStackTrace();
	            }
	            output.setLength(0);
	        }
	    }
	
	public ParseTree convert(String  uploadedFileName) throws IOException {
		

        CharStream charStream= CharStreams.fromFileName(uploadedFileName);
        Java8Lexer lexer = new Java8Lexer(charStream);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        Java8Parser parser = new Java8Parser(tokens);
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
