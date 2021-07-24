package com.example.translator.service;

import java.io.File;
import java.io.IOException;

import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import com.example.translator.KotlinParserBaseListener;
import com.example.translator.KotlinLexer;
import com.example.translator.KotlinParser;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.TerminalNode;

import javax.lang.model.type.NullType;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

@Scope("prototype")
@Component("Kotlin2TypescriptConverter")


public class Kotlin2TypescriptConverter extends KotlinParserBaseListener implements CodeConverter {
    private File file = new File("home.page.ts") ;
    private StringBuilder ts_output = new StringBuilder();

    private String number;
    private String Alert_message;

    private int callNumberFlag=0;


    @Override
    public void enterPropertyDeclaration(KotlinParser.PropertyDeclarationContext ctx) {

        //System.out.print(ctx.variableDeclaration().getChild(0).getText()+"\n");
        //System.out.print(ctx.variableDeclaration().type().getText()+"\n");
        if (ctx.getText().contains("intent")) {
            callNumberFlag = 1;

            String left = ctx.variableDeclaration().getChild(0).getText();
            String right = ctx.expression().getText();
            System.out.print(right);
            number = right.substring(right.indexOf("\"tel\",") + 7, right.indexOf(",null") - 1);


            ts_output.append("this.callNumber.callNumber(\"" + number + "\", true);" + "\n");
            ts_output.append(".then(res => console.log('Launched dialer!', res));" + "\n");
            ts_output.append(".catch(err => console.log('Error launching dialer', err));" + "\n");


        }else if(ctx.getText().contains("AlertDialog")){
            String left = ctx.variableDeclaration().getChild(0).getText();
            String right = ctx.expression().getText();
            System.out.print(right);

            if(right.contains("setMessage")) {
                Alert_message = right.substring(right.indexOf("setMessage(") + 11, right.indexOf(").setNegativeButton") );

                ts_output.append("window.alert(" + Alert_message + ")\n");


            }


        }
            try {
                String left = ctx.variableDeclaration().getChild(0).getText();

                String type = ctx.variableDeclaration().type().getText();

                String right = ctx.expression().getText();

                System.out.print(type + "        rrrrrrrrrrr");

                if ((type.contains("Int")) || (type.contains("Float")) || (type.contains("Double"))) {
                    type = "number";
                }

                if (type == "Int") {

                    type = "number";
                }
                if (ts_output.toString().contains(left + ":" + type + ";" + "\n")) {


                } else {

                    ts_output.insert(0, left + ":" + type + ";" + "\n");

                }
                if (ts_output.toString().contains(left + ":" + type + ";" + "\n")) {


                } else {

                    ts_output.insert(0, left + ":" + type + ";" + "\n");

                }


                //System.out.print(right +"\n");
                String[] elements_id;
                //System.out.print(ctx.getText() +"\n");
                //System.out.print(ctx.getText() +"\n");
                //.out.print(ctx.getText() +"\n");

                if (right.contains("getText()") || right.contains("text")) {


                } else if (right.contains("+") || right.contains("-") || right.contains("*") || right.contains("/") || right.contains("%")) {

                    if (right.contains("+")) {

                        ts_output.append("this." + left + " = " + "this." + right.substring(0, right.indexOf("+")) + " + " + "this." + right.substring(right.indexOf("+") + 1, right.length()) + "\n" + "}" + "\n\n\n");


                    } else if (right.contains("-")) {

                        ts_output.append("this." + left + " = " + "this." + right.substring(0, right.indexOf("-")) + " - " + "this." + right.substring(right.indexOf("-") + 1, right.length()) + "\n" + "}" + "\n\n\n");


                    } else if (right.contains("*")) {

                        ts_output.append("this." + left + " = " + "this." + right.substring(0, right.indexOf("")) + " * " + "this." + right.substring(right.indexOf("") + 1, right.length()) + "\n" + "}" + "\n\n\n");


                    } else if (right.contains("/")) {

                        ts_output.append("this." + left + " = " + "this." + right.substring(0, right.indexOf("/")) + " / " + "this." + right.substring(right.indexOf("/") + 1, right.length()) + "\n" + "}" + "\n\n\n");


                    } else if (right.contains("%")) {

                        ts_output.append("this." + left + " = " + "this." + right.substring(0, right.indexOf("%")) + " % " + "this." + right.substring(right.indexOf("%") + 1, right.length()) + "\n" + "}" + "\n\n\n");


                    }


                } else {

                    if (left == "Result") {
                        ts_output.append("this." + left + "=" + "this." + right + ";\n\n");

                    } else {
                        ts_output.append(left + "=" + right + ";\n\n");


                    }
                }


            } catch (Exception e) {

            }


        }



    @Override
    public void enterPostfixUnaryExpression(KotlinParser.PostfixUnaryExpressionContext ctx) {
       // System.out.print(ctx.primaryExpression().getText());

        //System.out.print(ctx.getText());
        //System.out.print(ctx);



    }
    @Override
    public void enterPrefixUnaryExpression(KotlinParser.PrefixUnaryExpressionContext ctx) {

        //System.out.print(ctx.postfixUnaryExpression().primaryExpression());
    }

    @Override
    public void exitClassDeclaration(KotlinParser.ClassDeclarationContext ctx) {
        super.exitClassDeclaration(ctx);
        if (ts_output.toString().contains("}")){


        }else {

            ts_output.append("}\n\n");

        }
        if(callNumberFlag == 1){
            ts_output.insert(0,  "\n@Component({\n" +
                    "  selector: \'app-home\',\n" +
                    "  templateUrl: \'home.page.html\',\n" +
                    "  styleUrls: [\'home.page.scss\'], \n" +
                    "})\n"+
                    "\nexport class HomePage {\n  c_class='';\n" +
                    "  \n" +
                    "  constructor(private callNumber: CallNumber) {}\n");
        }
        else {
            ts_output.insert(0, "\n@Component({\n" +
                    "  selector: \'app-home\',\n" +
                    "  templateUrl: \'home.page.html\',\n" +
                    "  styleUrls: [\'home.page.scss\'], \n" +
                    "})\n" +
                    "\nexport class HomePage {\n  c_class='';\n" +
                    "  \n" +
                    "  constructor() {}\n");
        }

        ts_output.insert(0,"import { not } from \'@angular/compiler/src/output/output_ast\';\n" +
                "import { Component, ViewChild } from \'@angular/core\';\n" +
                "import { IonItemOption, IonItemOptions, IonList } from \'@ionic/angular\';\n"+
                "import { isNumber } from \'util\';\n"
        );
        ts_output.append("\n}");

        try {
            FileWriter outputFile;
            outputFile = new FileWriter(file.getName());
            outputFile.write(ts_output.toString());
            outputFile.close();
        } catch (IOException e) {
            e.printStackTrace();

        }
        ts_output.setLength(0);

    }

    @Override
    public void enterLambdaLiteral(KotlinParser.LambdaLiteralContext ctx) {
        //System.out.print(ctx.statements().getText()+"\n\n\n\n\n");

        if (ctx.statements().getText().contains("gettext")){

        }else if(ctx.statements().getText().contains(".text") && ctx.statements().getText().contains("textview") ) {

           // ts_output.append("}\n\n");


        }
        if (ts_output.toString().contains("}")){


        }else {

           // ts_output.append("}\n\n");

        }







    }
    int s=1;
    @Override
    public void enterAdditiveExpression(KotlinParser.AdditiveExpressionContext ctx) {


        s+=1;
        //System.out.print("\n"+s);
        //System.out.print("كاااااااااااااااااااام مرة");


        //System.out.print(ctx.getText() +"\n");

        //System.out.print(ctx.getChildCount() +"\n");

        if (ctx.getChildCount()==1 ){

            //System.out.print(s);

            if(s==7) {
                //System.out.print(ctx.getText().substring(0, ctx.getText().indexOf(".")));
                //System.out.print(ctx.getText() + "\n");
            }
            if (ctx.getText().contains(".")){

                if(ctx.getText().contains("button")) {
                    //System.out.print(ctx.getText().substring(0, ctx.getText().indexOf("."))+"hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh");
                    ts_output.append("\n\n"+ctx.getText().substring(0, ctx.getText().indexOf("."))+"(){\n");
                    //System.out.print(ctx.getText() + "\n");
                    int n=s+3;

                }
            }


            //System.out.print(ctx.additiveOperator(0).getText() +"\n");


            //System.out.print(ctx.getText() +"\n");

        }


        //System.out.print(ctx.getText()+"\n");


    }

    
	
	
	public ParseTree convert(String  uploadedFileName) throws IOException {
		

        CharStream charStream= CharStreams.fromFileName(uploadedFileName);
        KotlinLexer lexer = new KotlinLexer(charStream);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        KotlinParser parser = new KotlinParser(tokens);
        ParseTree tree = parser.kotlinFile();


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
