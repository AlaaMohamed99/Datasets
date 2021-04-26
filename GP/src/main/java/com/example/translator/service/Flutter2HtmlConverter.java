package com.example.translator.service;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
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

@Scope("prototype")
@Component("Flutter2HtmlConverter")
public class Flutter2HtmlConverter extends Dart2BaseListener implements CodeConverter{
	
	private  File file;
	private String methodName= "";
	private String text= "";
	private String variable = "";
	private String listconetent = "";
	private int flag = 0;
	private int ionContent = 0;
	private int counterTextfield = 0;
	private int counterButton = 0;
	private int counterAppbar = 0;
	private int startOfCheckbox = 0;
	private int counterTextPlain = 0;
	private int counterContainer = 0;
	private int counterList = 0;
	private int isList = 0;
	private int Textflag = 0;
	private String TextType = "text";
	private String TextfieldTextPosition ="";
	private String CheckboxText = "";
	private String CheckboxPosition = "";
	private int Childpadding = 0;
	private int ChildCenter = 0;
	private int Children = 0;
	private int doneColorButton = 0;
	private String exp = "";
	private int ListTilecount = 0;
	private String paddingtype = "";
	private ArrayList <String> Identifiers = new ArrayList<>();
	private ArrayList <String> Ui_widgets = new ArrayList<>();
	private ArrayList <String> finalstyles = new ArrayList<>();
	private Map<String, ArrayList<String>> stylesMap = new LinkedHashMap<>();
	private ArrayList<String> Brackets = new ArrayList<>();
	private String PaddingExpression = "";
	private String ControllerName = "";

	@Override
	public void visitTerminal(TerminalNode terminalNode) {

	}

	@Override
	public void visitErrorNode(ErrorNode errorNode) {

	}

	@Override
	public void enterEveryRule(ParserRuleContext parserRuleContext) {

	}

	@Override
	public void exitEveryRule(ParserRuleContext parserRuleContext) {

	}


	@Override public void enterReturnStatement(Dart2Parser.ReturnStatementContext ctx) {

		if(ctx.expression().getText().length()>10 && ctx.expression().getText().substring(0,9).equals("Container"))
			ionContent = 1;
	}
	@Override public void enterIdentifier(Dart2Parser.IdentifierContext ctx){
		methodName = ctx.IDENTIFIER().getText();
		if(methodName.equals("Container") && ionContent == 1){
			Ui_widgets.add("ion-content");

		}
		if(methodName.equals("child") && !Ui_widgets.isEmpty() && Ui_widgets.get(Ui_widgets.size()-1).equals("ion-content")){
			ionContent = 0;
		}

		if((methodName.equals("Container") || methodName.equals("Column") || methodName.equals("Row")) && ionContent==0)
			Ui_widgets.add("Container");

		if(methodName.equals("Padding"))
			Ui_widgets.add("Padding");

		if(methodName.equals("BorderSide"))
			Ui_widgets.add("BorderSide");

		if(methodName.equals("margin"))
			Ui_widgets.add("margin");

		if(methodName.equals("Center"))
			Ui_widgets.add("Center");


		if(methodName.equals("AssetImage"))
			Ui_widgets.add("AssetImage");

		if(methodName.equals("ListView"))
			Ui_widgets.add("ListView");

		if(methodName.equals("ListTile"))
			Ui_widgets.add("ListTile");

		if(methodName.equals("CheckboxListTile"))
			Ui_widgets.add("CheckboxListTile");
		if(methodName.equals("controlAffinity"))
			Ui_widgets.add("controlAffinity");

		if (methodName.equals("TextField")) {
			counterTextfield++;
			Ui_widgets.add("TextField");
			stylesMap.put(".item" + counterTextfield, new ArrayList<>());
			exp = "";
		}

		if(!Ui_widgets.isEmpty() && methodName.equals("child") && Ui_widgets.get(Ui_widgets.size()-1).equals("Padding"))
			Childpadding = 1;

		if (methodName.equals("RaisedButton")) {
			Ui_widgets.add("RaisedButton");
			counterButton++;
			flag = 0;
			if (Children == 1){
				try {
					FileWriter outputfile = new FileWriter(file.getName(), true);
					outputfile.write("<ion-button expand = \"block\" class= \"button" + counterButton + "\" ");
					outputfile.close();
				} catch (IOException e) {
					System.out.println("An error occurred.");
					e.printStackTrace();
				}
			}
			else{
				try {
					FileWriter outputfile = new FileWriter(file.getName(), true);
					outputfile.write("<ion-button class= \"button" + counterButton + "\" ");
					outputfile.close();
				} catch (IOException e) {
					System.out.println("An error occurred.");
					e.printStackTrace();
				}
			}
			stylesMap.put(".button" + counterButton, new ArrayList<>());
		}


		if (methodName.equals("Radio")) {
			try {
				FileWriter outputfile = new FileWriter(file.getName(), true);
				outputfile.write("<ion-radio></ion-radio> \n");
				outputfile.close();
			} catch (IOException e) {
				System.out.println("An error occurred.");
				e.printStackTrace();
			}
		}

		//I have a problem identifiying Text when it's just a text but not inside something, as I could wrap it inside a padding, it'll still be indv but inside a child
		if(!(Identifiers.isEmpty())) {
			if((methodName.equals("Text") && !(Identifiers.get(Identifiers.size()-1).equals("child"))) && (methodName.equals("Text") && !(Identifiers.get(Identifiers.size()-1).equals("title")) && !(Identifiers.get(Identifiers.size()-1).equals("content")) && !(Identifiers.get(Identifiers.size()-1).equals("icon"))  && !(Identifiers.get(Identifiers.size()-1).equals("prefixIcon"))) )
				Ui_widgets.add("Text");
		}
		if(!(Identifiers.isEmpty()) && !Ui_widgets.isEmpty()) {
			if((methodName.equals("Text") && (Identifiers.get(Identifiers.size()-1).equals("child"))) && Ui_widgets.get(Ui_widgets.size()-1).equals("Padding"))
				Ui_widgets.add("Text");
		}

		Identifiers.add(methodName);
		System.out.print("this is methodname \n" + methodName + "\n");
		System.out.print(Ui_widgets + "\n");
	}


	@Override public void enterUnconditionalAssignableSelector(Dart2Parser.UnconditionalAssignableSelectorContext ctx) {
		paddingtype = ctx.identifier().IDENTIFIER().getText();
		if(!Ui_widgets.isEmpty() && Ui_widgets.get(Ui_widgets.size()-1).equals("Text") && Textflag == 1) {
			//it's just called padding type bas it's the variable in this expression as well
			variable = paddingtype;
			counterTextPlain++;
			try {
				FileWriter outputfile = new FileWriter(file.getName(), true);
				outputfile.write("<ion-text class= \"text"+counterTextPlain +"\">" +"{{"+variable+"}}"+ "</ion-text>" + "\n");
				outputfile.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
			Ui_widgets.remove(Ui_widgets.size()-1);
			Textflag = 0;
			stylesMap.put(".text"+counterTextPlain, new ArrayList<>());
		}
		if(!Ui_widgets.isEmpty() && Ui_widgets.get(Ui_widgets.size()-1).equals("controlAffinity")) {
			CheckboxPosition = paddingtype;
			Ui_widgets.remove("controlAffinity");
		}
	}

	@Override public void enterNumericLiteral(Dart2Parser.NumericLiteralContext ctx) {
		if(paddingtype.equals("all") && Ui_widgets.get(Ui_widgets.size()-1).equals("Padding")){
			PaddingExpression = "padding:" + ctx.NUMBER() + "px";
		}

		if(paddingtype.equals("all") && Ui_widgets.get(Ui_widgets.size()-1).equals("margin")){
			PaddingExpression = "margin:" + ctx.NUMBER() + "px";
		}
	}

	@Override public void enterListLiteral(Dart2Parser.ListLiteralContext ctx) {
		//Number of children in Row and Column
		Children = ctx.expressionList().expression().size();
	}

	@Override public void enterNamedArgument(Dart2Parser.NamedArgumentContext ctx) {
		String Label = ctx.label().getText();
		String expression = ctx.expression().getText();


		System.out.print("this is label and expression" + "\n");
		System.out.print(ctx.label().getText() + "\n");
		System.out.print(ctx.expression().getText() + "\n");


		//Center
		if(!Ui_widgets.isEmpty() && Label.equals("child:") && Ui_widgets.get(Ui_widgets.size()-1).equals("Center")){
			ChildCenter = 1;
		}


		//Padding
		if(!Ui_widgets.isEmpty() && Label.equals("child:") && Ui_widgets.get(Ui_widgets.size()-1).equals("Padding")){
			paddingtype = " ";
		}

		if(!Ui_widgets.isEmpty() && paddingtype.equals("only") && Ui_widgets.get(Ui_widgets.size()-1).equals("Padding") && !Label.equals("child:") && !Label.equals("padding:")) {
			PaddingExpression += "padding-" + Label + expression + "px" + " ";

		}
		if(!Ui_widgets.isEmpty() && paddingtype.equals("only") && Ui_widgets.get(Ui_widgets.size()-1).equals("margin") && !Label.equals("child:")) {
			PaddingExpression += "margin-" + Label + expression + "px" + " ";

		}

		if(Childpadding == 1){
			List<String> Keys = new ArrayList<>(stylesMap.keySet());
			String [] list = PaddingExpression.split(" ");
			for (int i = 0; i< list.length; i++)
				stylesMap.get(Keys.get(Keys.size()-1)).add(list[i]);
			PaddingExpression = "";
			Childpadding = 0;
		}

		//Appbar
		if(Label.equals("appBar:")){
			counterAppbar++;
			String appbar = ctx.expression().getText();
			int start = appbar.indexOf("\"") + 1;
			int end = appbar.lastIndexOf("\"");
			String appName = appbar.substring(start,end);
			try {
				FileWriter outputfile = new FileWriter(file.getName(), true);
				outputfile.append("<ion-header>" +"\n"+ "<ion-toolbar class = \"appbar"+counterAppbar+ "\" >\n"+ "<ion-title> " + appName + " </ion-title> \n" + "</ion-toolbar>" +"\n"+"</ion-header>" + "\n" + "<ion-content>" + "\n");
				outputfile.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
			stylesMap.put(".appbar" + counterAppbar, new ArrayList<>());
			if(expression.contains("backgroundColor:")){
				String add = "";
				String expColors = expression.substring(expression.indexOf("Colors.")+7);
				//System.out.print(expColors);
				if(expColors.contains(")")){
					add = expColors.substring(0,expColors.indexOf(")"));
				}
				if(expColors.contains(",")){
					add = expColors.substring(0,expColors.indexOf(","));
				}
				stylesMap.get(".appbar" + counterAppbar).add("--background:"+ add);
			}
			else
				stylesMap.get(".appbar" + counterAppbar).add("--background: #3880ff");
			if(!expression.contains("color:"))
				stylesMap.get(".appbar" + counterAppbar).add("color:white");
		}

		//Container
		if(Label.equals("color:") && Brackets.get(Brackets.size()-1).equals("Container")){
			if(expression.contains("Colors.")){
				int start = expression.indexOf(".") + 1;
				stylesMap.get(".div" + counterContainer).add("background-color:"+ expression.substring(start));
			}
			else {
				stylesMap.get(".div" + counterContainer).add("background-color:"+ "\""+ expression + "\"");
			}
		}

		if(Label.equals("color:") && !Ui_widgets.isEmpty() && Ui_widgets.get(Ui_widgets.size()-1).equals("ion-content")){
			if(expression.contains("Colors.")){
				int start = expression.indexOf(".") + 1;
				stylesMap.get("ion-content").add("--background:"+ expression.substring(start));
			}
			else {
				stylesMap.get("ion-content").add("--background:"+ "\""+ expression + "\"");
			}
		}


		//CheckboxListTile
		if(Label.equals("title:") && !Ui_widgets.isEmpty() && Ui_widgets.get(Ui_widgets.size()-1).equals("CheckboxListTile")){
			int start;
			int end;
			if(expression.contains("'")){
				start = expression.indexOf("'") + 1;
				end = expression.lastIndexOf("'");
			}
			else {
				start = expression.indexOf("\"") + 1;
				end = expression.lastIndexOf("\"");
			}
			CheckboxText = expression.substring(start, end);
		}


		//TextField
		if (Label.equals("labelText:")) {
			int start;
			int end;
			if(expression.contains("'")){
				start = expression.indexOf("'") + 1;
				end = expression.lastIndexOf("'");
			}
			else {
				start = expression.indexOf("\"") + 1;
				end = expression.lastIndexOf("\"");
			}
			exp = expression.substring(start, end);
			TextfieldTextPosition="floating";
			//System.out.print(Ui_widgets + "\n");
		}

		if (Label.equals("prefixIcon:") || Label.equals("icon:")) {
			if(expression.contains("Text")) {
				int start;
				int end;
				if(expression.contains("'")){
					start = expression.indexOf("'") + 1;
					end = expression.lastIndexOf("'");
				}
				else {
					start = expression.indexOf("\"") + 1;
					end = expression.lastIndexOf("\"");
				}
				exp = expression.substring(start, end);
				TextfieldTextPosition = "fixed";
				//System.out.print(exp + "\n");

				//System.out.print(Ui_widgets + "\n");
			}
		}

		if (Label.equals("enabledBorder:")) {
			if(expression.contains("OutlineInputBorder")){
				stylesMap.get(".item" + counterTextfield).add("border: 1px solid grey");
				stylesMap.get(".item" + counterTextfield).add("margin: 5px auto");
				stylesMap.get(".item" + counterTextfield).add("width: 97%");
			}
			if(expression.contains("UnderlineInputBorder")){
				stylesMap.get(".item" + counterTextfield).add("border-bottom: 1px solid");
			}
		}

		if (Label.equals("border:")) {
			if(expression.contains("OutlineInputBorder")){
				stylesMap.get(".item" + counterTextfield).add("border: 1px solid grey");
				stylesMap.get(".item" + counterTextfield).add("margin: 5px auto");
				stylesMap.get(".item" + counterTextfield).add("width: 97%");
			}
			if(expression.contains("UnderlineInputBorder")){
				stylesMap.get(".item" + counterTextfield).add("border-bottom: 1px solid");
			}
		}
		if(Label.equals("color:") && !Ui_widgets.isEmpty() && Ui_widgets.get(Ui_widgets.size()-1).equals("BorderSide")) {
			stylesMap.get(".item" + counterTextfield).add("border-color:" + expression.substring(expression.indexOf(".") + 1));
			Ui_widgets.remove("BorderSide");
		}
		if (Label.equals("borderRadius:")) {
			int start = expression.indexOf("(") + 1;
			int end = expression.lastIndexOf(")");
			stylesMap.get(".item" + counterTextfield).add("border-radius:"+ expression.substring(start, end) + "px");

		}
		if (Label.equals("fillColor:")) {
			stylesMap.get(".item" + counterTextfield).add("--background:"+ expression.substring(7));
		}
		if(Label.equals("obscureText:")){
			if(expression.equals("true"))
				TextType="password";
		}
		
		if(Label.equals("keyboardType:")){
            TextType=expression.substring(expression.indexOf(".")+1);
        }
		if(Label.equals("controller:")){
            ControllerName=expression;
        }

		if(Label.equals("style:") && !Brackets.isEmpty() && (Brackets.get(Brackets.size()-1).equals("TextField"))){
			if(expression.contains("color:")){
				String add = "";

				String expColors = expression.substring(expression.indexOf("Colors.")+7);
				if(expColors.contains(")")){
					add = expColors.substring(0,expColors.indexOf(")"));
				}
				if(expColors.contains(",")){
					add = expColors.substring(0,expColors.indexOf(","));
				}
				stylesMap.get(".item" + counterTextfield).add("color:"+ add);
			}
			else
				stylesMap.get(".item" + counterTextfield).add("color: black");
		}

		//font-size
		if(Label.equals("fontSize:")){
			List<String> Keys = new ArrayList<>(stylesMap.keySet());
			stylesMap.get(Keys.get(Keys.size()-1)).add("font-size:" + expression+"px");
		}

		if(Label.equals("color:")){
			List<String> Keys = new ArrayList<>(stylesMap.keySet());
			if(Keys.get(Keys.size()-1).equals(".text"+counterTextPlain))
				stylesMap.get(Keys.get(Keys.size()-1)).add("color:" + expression.substring(expression.indexOf(".")+1));
		}


		//Raisedbutton
		if(Label.equals("child:")) {
			//System.out.print(methodName);
			if(expression.substring(0,4).equals("Text") && Ui_widgets.contains("RaisedButton")) {
				int start;
				int end;
				if(expression.contains("'")){
					start = expression.indexOf("'") + 1;
					end = expression.lastIndexOf("'");
				}
				else {
					start = expression.indexOf("\"") + 1;
					end = expression.lastIndexOf("\"");
				}
				text = expression.substring(start, end);
				//System.out.print(text);
				Ui_widgets.remove("child");
				if (Ui_widgets.contains("textScaleFactor"))
					Ui_widgets.remove("textScaleFactor");

				if(expression.contains("color:")){
					String add = "";

					String expColors = expression.substring(expression.indexOf("Colors.")+7);
					if(expColors.contains(")")){
						add = expColors.substring(0,expColors.indexOf(")"));
					}
					if(expColors.contains(",")){
						add = expColors.substring(0,expColors.indexOf(","));
					}
					stylesMap.get(".button" + counterButton).add("color:"+ add);
				}
				else
					stylesMap.get(".button" + counterButton).add("color: black");
			}
		}
		if(Label.equals("onPressed:")) {
			if(expression.contains("setState")){
				int start = expression.lastIndexOf("{")+1;
				int end = expression.indexOf(";");
				String Functionname = expression.substring(start, end);
				//System.out.print(Functionname);
				try {
					FileWriter outputfile = new FileWriter(file.getName(), true);
					outputfile.write(" (click)=\"" + Functionname + "\"");
					outputfile.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
			Ui_widgets.remove("onPressed");
		}
		if (Ui_widgets.contains("RaisedButton") && !Ui_widgets.contains("color")){
			if(!stylesMap.get(".button" + counterButton).contains("--background:lightgrey")){
				stylesMap.get(".button" + counterButton).add("--background:lightgrey");
			}

		}
		if (Label.equals("color:") && Ui_widgets.contains("RaisedButton") && Ui_widgets.contains("color") && doneColorButton == 0){
			stylesMap.get(".button" + counterButton).add("--background:"+expression.substring(7));
			doneColorButton = 1;
		}

		//ListTile
		if(Label.equals("leading:")&& !Ui_widgets.isEmpty() && Ui_widgets.get(Ui_widgets.size()-1).equals("ListTile")){
			if(expression.contains("Icons.circle"))
				isList =1;
		}

		if(Label.equals("title:") && !Ui_widgets.isEmpty() && Ui_widgets.get(Ui_widgets.size()-1).equals("ListTile") && isList == 0){
			int start;
			int end;
			if(expression.contains("'")){
				start = expression.indexOf("'") + 1;
				end = expression.lastIndexOf("'");
			}
			else {
				start = expression.indexOf("\"") + 1;
				end = expression.lastIndexOf("\"");
			}
			listconetent = expression.substring(start, end);
			try {
				FileWriter outputfile = new FileWriter(file.getName(), true);
				outputfile.write("<ion-list-header class = \"list" + counterList + "\">" + listconetent + "</ion-list-header>" + "\n");
				outputfile.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
			stylesMap.put(".list"+counterList, new ArrayList<>());
		}

		if(Label.equals("title:") && !Ui_widgets.isEmpty() && Ui_widgets.get(Ui_widgets.size()-1).equals("ListTile") && isList == 1){
			if(counterList == 0){
				try {
					FileWriter outputfile = new FileWriter(file.getName(), true);
					outputfile.write("<ul>" + "\n");
					outputfile.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
			counterList++;
			int start;
			int end;
			if(expression.contains("'")){
				start = expression.indexOf("'") + 1;
				end = expression.lastIndexOf("'");
			}
			else {
				start = expression.indexOf("\"") + 1;
				end = expression.lastIndexOf("\"");
			}
			listconetent = expression.substring(start, end);
			if(isList == 1){
				try {
					FileWriter outputfile = new FileWriter(file.getName(), true);
					outputfile.write("<li class = \"list" + counterList + "\">" + listconetent + "</li>" + "\n");
					outputfile.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}


			stylesMap.put(".list"+counterList, new ArrayList<>());
			ListTilecount--;
			isList = 0;
		}

	}

	@Override public void enterExpressionList(Dart2Parser.ExpressionListContext ctx) {
		if(ListTilecount != 0 && !Ui_widgets.isEmpty() && Ui_widgets.get(Ui_widgets.size()-1).equals("ListView")){
			try {
				FileWriter outputfile = new FileWriter(file.getName(), true);
				outputfile.write("<ion-list>" + "\n");
				outputfile.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
	@Override public void exitExpressionList(Dart2Parser.ExpressionListContext ctx) {
	}



	@Override public void exitPostfixExpression(Dart2Parser.PostfixExpressionContext ctx) {

		if (!Ui_widgets.isEmpty() && Ui_widgets.contains("RaisedButton") && !Ui_widgets.contains("child") &&   !Ui_widgets.contains("onPressed")){

			try {
				FileWriter outputfile = new FileWriter(file.getName(), true);
				outputfile.write(">" + text + "</ion-button>" +"\n");
				outputfile.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
			Ui_widgets.clear();
			doneColorButton = 0;
		}

	}

	@Override public void exitStringLiteral(Dart2Parser.StringLiteralContext ctx) {
		String path = ctx.SingleLineString().toString();
		//System.out.print(path);

		//Text of string
		if(!Ui_widgets.isEmpty() && Textflag == 0 && Ui_widgets.get(Ui_widgets.size()-1).equals("Text")){
			counterTextPlain++;
			int start;
			int end;
			System.out.print(path);
			if(path.contains("\"")){
				System.out.print("what");
				start = path.indexOf("\"") + 1;
				end = path.lastIndexOf("\"");
			}
			else {
				start = path.indexOf("'") + 1;
				end = path.lastIndexOf("'");
				System.out.print(start);
				System.out.print(end);
			}
			path = path.substring(start, end);
			try {
				FileWriter outputfile = new FileWriter(file.getName(), true);
				outputfile.write("<ion-text class= \"text"+counterTextPlain +"\">" + path + " </ion-text>" + "\n");
				outputfile.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
			//remove all as there'll be several occarances of AssetImage
			Ui_widgets.remove("Text");
			stylesMap.put(".text"+counterTextPlain, new ArrayList<>());
		}

		//Image
		if(!Ui_widgets.isEmpty() && Ui_widgets.get(Ui_widgets.size()-1).equals("AssetImage")){
			int start;
			int end;
			if(path.contains("'")){
				start = path.indexOf("'") + 1;
				end = path.lastIndexOf("'");
			}
			else {
				start = path.indexOf("\"") + 1;
				end = path.lastIndexOf("\"");
			}
			path = path.substring(start, end);
			try {
				FileWriter outputfile = new FileWriter(file.getName(), true);
				outputfile.write("<ion-img src= \'" + path + "\' >" + " </ion-img>" + "\n");
				outputfile.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
			//remove all as there'll be several occarances of AssetImage
			Ui_widgets.removeAll(Collections.singleton("AssetImage"));
		}

	}
	@Override public void exitArguments(Dart2Parser.ArgumentsContext ctx) {

		if(!Ui_widgets.isEmpty() && Ui_widgets.get(Ui_widgets.size()-1).equals("margin") && !(PaddingExpression== "")){
			List<String> Keys = new ArrayList<>(stylesMap.keySet());
			String [] list = PaddingExpression.split(" ");
			for (int i = 0; i< list.length; i++)
				stylesMap.get(Keys.get(Keys.size()-1)).add(list[i]);
			PaddingExpression = "";
			Childpadding = 0;
			Ui_widgets.remove("margin");
		}


		if(ctx.getChild(ctx.getChildCount()-1).getText().equals(")") && !Brackets.isEmpty() && (Brackets.get(Brackets.size()-1).equals("ListView"))){
			try {
				FileWriter outputfile = new FileWriter(file.getName(), true);
				outputfile.write("</ul>" + "\n" + "</ion-list>" + "\n");
				outputfile.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
			Ui_widgets.remove("ListView");
			Ui_widgets.removeAll(Collections.singleton("ListTile"));
		}


		if(ctx.getChild(ctx.getChildCount()-1).getText().equals(")") && !Brackets.isEmpty() && (Brackets.get(Brackets.size()-1).equals("CheckboxListTile")) && CheckboxPosition.equals("leading")){
			try {
				FileWriter outputfile = new FileWriter(file.getName(), true);
				outputfile.write("<ion-item lines=\"none\"> \n<ion-checkbox></ion-checkbox> \n <ion-label>" + CheckboxText + "</ion-label> \n </ion-item> \n");
				outputfile.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

		if(ctx.getChild(ctx.getChildCount()-1).getText().equals(")") && !Brackets.isEmpty() && (Brackets.get(Brackets.size()-1).equals("TextField")) && !exp.equals("")){
			if(TextfieldTextPosition.equals("floating")){
				try {
					FileWriter outputfile = new FileWriter(file.getName(), true);
					outputfile.write("<ion-item lines=\"none\" class = \"item"+ counterTextfield + "\" >" + "\n" + "<ion-label position=\""+TextfieldTextPosition+"\" >" + exp + " </ion-label>" + "\n");
					outputfile.write("<ion-input type=\""+TextType+"\" ");
                    if(!ControllerName.equals(""))
                        outputfile.write("[(ngModel)]=\""+ControllerName+"\"");
                    outputfile.write("> </ion-input> \n" + "</ion-item>" + "\n");
					outputfile.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
				ControllerName="";
			}
			else{
				try {
					FileWriter outputfile = new FileWriter(file.getName(), true);
					outputfile.write("<ion-item lines=\"none\" class = \"item"+ counterTextfield + "\" >" + "\n" + "<ion-label> " + exp + " </ion-label>" + "\n");
					outputfile.write("<ion-input type=\""+TextType+"\"");
                    if(!ControllerName.equals(""))
                        outputfile.write("[(ngModel)]=\""+ControllerName+"\"");
                    outputfile.write("> </ion-input> \n" + "</ion-item>" + "\n");
					outputfile.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
				ControllerName="";
			}
		}
		if(ctx.getChild(ctx.getChildCount()-1).getText().equals(")") && !Brackets.isEmpty() && (Brackets.get(Brackets.size()-1).equals("TextField")) && exp.equals("")){
			try {
				FileWriter outputfile = new FileWriter(file.getName(), true);
				outputfile.write("<ion-input type=\""+TextType+"\" class = \"item" + counterTextfield + "\" ");
                if(!ControllerName.equals(""))
                    outputfile.write("[(ngModel)]=\""+ControllerName+"\"");
                outputfile.write("> </ion-input> \n");
				outputfile.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
			ControllerName="";
		}

		if (ctx.getChild(ctx.getChildCount()-1).getText().equals(")") && !Brackets.isEmpty() && (Brackets.get(Brackets.size()-1).equals("Container") || Brackets.get(Brackets.size()-1).equals("Column") || Brackets.get(Brackets.size()-1).equals("Row")) ) {
			try {
				FileWriter outputfile = new FileWriter(file.getName(), true);
				outputfile.write("</div> \n");
				outputfile.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		if (ctx.getChild(ctx.getChildCount()-1).getText().equals(")") && !Brackets.isEmpty())
			Brackets.remove(Brackets.size()-1);

	}
	@Override public void enterArguments(Dart2Parser.ArgumentsContext ctx) {

		if(ctx.getChild(0).getText().equals("(") && !Ui_widgets.isEmpty() && !Ui_widgets.get(Ui_widgets.size()-1).equals("ion-content")){
			Brackets.add(methodName);
			//System.out.print(Brackets);
		}
		if(ctx.getChild(0).getText().equals("(") && !Ui_widgets.isEmpty() && !Ui_widgets.get(Ui_widgets.size()-1).equals("CheckboxListTile")){
			startOfCheckbox = 1;
		}
		if(ctx.getChild(0).getText().equals("(") && !Ui_widgets.isEmpty() && Ui_widgets.get(Ui_widgets.size()-1).equals("ion-content")){
			Brackets.add("ion-content");
			stylesMap.put("ion-content", new ArrayList<>());
			//System.out.print(Brackets);
		}


//!Ui_widgets.isEmpty() && !Ui_widgets.get(Ui_widgets.size()-1).equals("ion-content")

		if(!Brackets.isEmpty()&& (Brackets.get(Brackets.size()-1).equals("Container") || Brackets.get(Brackets.size()-1).equals("Column") || Brackets.get(Brackets.size()-1).equals("Row"))){
			counterContainer++;
			try {
				FileWriter outputfile = new FileWriter(file.getName(), true);
				outputfile.write("<div class=\"div"+ counterContainer +"\" > \n");
				outputfile.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
			stylesMap.put(".div" + counterContainer, new ArrayList<>());
			if(Brackets.get(Brackets.size()-1).equals("Column")){
				stylesMap.get(".div" + counterContainer).add("display: flex");
				stylesMap.get(".div" + counterContainer).add("flex-direction: column");
				stylesMap.get(".div" + counterContainer).add("align-items: center");
			}
			if(Brackets.get(Brackets.size()-1).equals("Row")){
				stylesMap.get(".div" + counterContainer).add("display: flex");

				stylesMap.get(".div" + counterContainer).add("align-items: center");
			}
		}

		if(ChildCenter == 1){

			String child = Identifiers.get(Identifiers.size()-1);
			List<String> Keys = new ArrayList<>(stylesMap.keySet());

			stylesMap.get(Keys.get(Keys.size()-1)).add("display: flex");
			stylesMap.get(Keys.get(Keys.size()-1)).add("justify-content: center");
			stylesMap.get(Keys.get(Keys.size()-1)).add("align-items: center");
			stylesMap.get(Keys.get(Keys.size()-1)).add("align-content: center");
			stylesMap.get(Keys.get(Keys.size()-1)).add("height: 100%");
			ChildCenter = 0;
		}


		if(ctx.argumentList() != null){
			String word = ctx.argumentList().getText();
			if(methodName.equals("TextField") && !(word.contains("fillColor")))
				stylesMap.get(".item"+counterTextfield).add("--background:transparent");

			ArrayList<Integer> indexesofdots = new ArrayList<>();
			ArrayList<Integer> indexesofcol = new ArrayList<>();
			//flag that i entered here before
			if(!Ui_widgets.isEmpty() && flag == 0 && Ui_widgets.get(Ui_widgets.size()-1).equals("RaisedButton")){
				int index = 0;
				int indexcol = 0;
				int wordLength = 0;
				int t = 0;
				while(index >=0){
					index = word.indexOf(":", index + 1);  // Slight improvement
					if (index != -1) {
						indexesofdots.add(index);
					}
				}
				while(indexcol >=0){
					indexcol = word.indexOf(",", indexcol + 1);
					if (indexcol != -1) {
						indexesofcol.add(indexcol);
					}
				}
				System.out.print(indexesofdots);
				System.out.print(indexesofcol);
				System.out.print("WORDDDD "+word);
				Ui_widgets.add(word.substring(0, indexesofdots.get(0)));
				System.out.print(Ui_widgets+ "\n");
				for (int i = 0; i < indexesofcol.size(); i++){
					if (indexesofdots.get(i+1)> indexesofcol.get(i)+1)
						Ui_widgets.add(word.substring(indexesofcol.get(i)+1, indexesofdots.get(i+1)));
					else
						Ui_widgets.add(word.substring(indexesofcol.get(i)+1, indexesofdots.get(i+2)));
				}

				flag = 1;
			}

			if(!Ui_widgets.isEmpty() && Ui_widgets.get(Ui_widgets.size()-1).equals("Text")){
				if(word.substring(0,1).equals("'") || word.substring(0,1).equals("\"")) {
					Textflag = 0;
				}
				else{
					Textflag = 1;

				}

			}

			if (!Ui_widgets.isEmpty() && Ui_widgets.get(Ui_widgets.size()-1).equals("ListView")){
				if (word.contains("ListTile"))
					ListTilecount = (word.split("ListTile", -1).length) - 1;

			}
		}
	}


	@Override public void exitCompilationUnit(Dart2Parser.CompilationUnitContext ctx) {
		try {
			FileWriter outputfile = new FileWriter(file.getName(), true);
			outputfile.write("</ion-content>");
			outputfile.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}








	@Override
	public ParseTree convert(String  uploadedFileName) throws IOException {
		FileWriter outputfile = new FileWriter(file.getName(), false);
		outputfile.write("<ion-content>" + "\n");
		outputfile.close();
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
