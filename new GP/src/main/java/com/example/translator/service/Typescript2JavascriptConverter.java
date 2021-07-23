package com.example.translator.service;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;




import com.example.translator.TypeScriptParserBaseListener;
import com.example.translator.TypeScriptLexer;
import com.example.translator.TypeScriptParser;
import com.example.translator.dto.Constants;

import org.springframework.beans.factory.annotation.Autowired;



@Scope("prototype")
@Component("Typescript2JavascriptConverter")

public class Typescript2JavascriptConverter extends TypeScriptParserBaseListener  implements CodeConverter{
	
	
	private File file;

	private StringBuffer backend = new StringBuffer();
	/* global variables*/
	List<String> classBinding = new ArrayList<String>();
	List<String> states_ngModel = new ArrayList<String>();
	List<String> states_ngModel2 = new ArrayList<String>();
	List<String> states_propBinding = new ArrayList<String>();
	List<String> allstates = new ArrayList<String>();
	List<String> newState = new ArrayList<String>();
	String handleFunctions="";
	String state = "";
	Boolean flag_api=false;
	String imports="";

	public ParseTree convert(String  uploadedFileName)  throws IOException {
		
		
        
        CharStream charStream_TypeScript= CharStreams.fromFileName(uploadedFileName);
        
        TypeScriptLexer typescriptlexer = new TypeScriptLexer(charStream_TypeScript);
        
        CommonTokenStream typescript_tokens = new CommonTokenStream(typescriptlexer);
        
        TypeScriptParser typescript_parser=new TypeScriptParser(typescript_tokens);
        
        typescript_parser.setBuildParseTree(true); 
        ParseTree typescript_tree = typescript_parser.program();
      
	   
		return typescript_tree;
	}

	
	
	
	
	public void setFile(File file) {
		this.file = file;
	}

	
	@Override
	public File getFile() {
		// TODO Auto-generated method stub
		return file;
	}


	@Override
	public void setFileName(String fileName) {
		file=new File(fileName);
		
	}
	
    
	
	
	public  String handleSpaces(String text){
        String out="";
        int index = 0;
        out = text;

        while(index != -1){
                index =  text.indexOf("let", index);
                if (index != -1) {
                        out=out.replace("let","let ");
                        index++;
                }
        }
        return out ;
	}
	
	public void WriteContent(File file , String content  ){
	        try {
	                FileWriter outputfile = new FileWriter(file.getName());
	                outputfile.write(content);
	                outputfile.close();
	        } catch (Exception e) {
	                e.printStackTrace();
	        }
	}
	
	
	/** this func to check if there is state var in the line and convert
	 * it in the proper way
	 * **/
	
	public String handleState(String exp){
	        exp = handleSpaces(exp);
	        short posOfEqual= (short)exp.indexOf("=");
	        String out="";
	
	        if (posOfEqual > 0){
	
	                String left = exp.substring(0,posOfEqual);
	                String right = exp.substring(posOfEqual);
	                Boolean flagLeft_twoWayBinding=false;
	                //right
	                for(short i = 0; i< allstates.size(); i++){
	                        if (right.contains(allstates.get(i))){
	                                String st= allstates.get(i);
	                                right= right.replace(st,"state."+st+" ");
	                        }
	                }
	
	                //left side
	                for(short i = 0; i < allstates.size(); i++) {
	                        if (left.contains(allstates.get(i))){
	                                String st= allstates.get(i);
	                                left= left.replace(st,"setState({"
	                                        +st+":"+right.replace("=","")+"})");
	                                flagLeft_twoWayBinding = true;
	                                break;
	                        }
	                }
	
	                if(flagLeft_twoWayBinding){
	                        out=left + "\n";
	                }
	                else{
	                        out = left + right + "\n";
	                }
	
	        }
	        // no equal sign
	        else{
	                String line=  exp;
	                for(short i = 0; i< states_ngModel.size(); i++){
	                        if (line.contains(states_ngModel.get(i))){
	                                String st= states_ngModel.get(i);
	                                line= line.replace(st,"state."+st+" ");
	                        }
	                }
	                for(short i = 0; i< states_propBinding.size(); i++){
	                        if (line.contains(states_propBinding.get(i))){
	                                String st= states_propBinding.get(i);
	                                line= line.replace(st,"state."+st+" ");
	                        }
	                }
	
	                out=line + "\n" ;
	        }
	        return  out;
	}
	

	
	
	@Override public void enterProgram(TypeScriptParser.ProgramContext ctx) {
		System.out.println("Enter program test");
	        try {
	            FileWriter outputfile =new FileWriter(file.getName(),true);
	            outputfile.write("test typescript file "+ state+"\n");
	            outputfile.close();
	        }
	        catch (Exception e){
	            e.printStackTrace();
	        }
	}




@Override public void enterIfStatement(TypeScriptParser.IfStatementContext ctx)
{
        backend.append(" "+ctx.If().getText() + ctx.OpenParen().getText()+" ");
}


@Override public void enterElseStatement(TypeScriptParser.ElseStatementContext ctx) {
        backend.append(ctx.Else().getText()+" ");

        // add { if it was only else not else if
        if(!ctx.getText().contains("if")){
            backend.append("{ \n ");
        }
}



@Override public void enterBlock(TypeScriptParser.BlockContext ctx) {
        if(ctx.parent.getText().contains("if") || ctx.parent.parent.getText().contains("if")){
                backend.append(" ){\n ");
        }
}
@Override public void exitBlock(TypeScriptParser.BlockContext ctx) {
        if(ctx.parent.getText().contains("if") || ctx.parent.parent.getText().contains("if")){
                backend.append("}\n ");
        }
}

// handle property declaration and special arrow func that has no () or {}
@Override public void enterPropertyDeclarationExpression(TypeScriptParser.PropertyDeclarationExpressionContext ctx) {
        /** we ignore type or access modifiers (public ,....)
                we ignore type annotations (Number,String,..)
         **/

        /** handle class binding variable
         * which should point to a style in the style sheet
         * **/
        String checkStateVar = ctx.propertyName().identifierName().Identifier().getText();


        /** do not convert variable which are in the state**/
        /** if prop in state of prop_binding and initalized
         *  update it with the initalization
         **/

         if(allstates.contains(checkStateVar)&&!classBinding.contains(checkStateVar)){
                if (ctx.initializer()==null){
                        // nothing to do
                }
                // update this state with the initial value
                else{
                        String initial = ctx.initializer().singleExpression().getText().replace("'", "").trim();
                        for (short i=0 ; i<allstates.size();i++){
                                if(allstates.get(i).equals(checkStateVar)){
                                        for (short j =0;j<newState.size();j++){
                                                if( newState.get(j).contains(allstates.get(i))){
                                                        newState.set(j, newState.get(j).replace("'", "")
                                                                + "'" + initial + "'");
                                                        break;
                                                }
                                        }
                                }
                        }
                }
        }
        else{
                if(!classBinding.contains(checkStateVar)){
                        if (ctx.initializer() != null ) {
                                String st = "";
                                String initial = ctx.initializer().getText();
                                for (short i = 0; i < allstates.size(); i++) {
                                        if (ctx.initializer().getText().contains(allstates.get(i))) {
                                                st = allstates.get(i);
                                                initial = initial.
                                                        replace(st, "state." + st);
                                        }
                                }
                                String propertyDeclaration = ctx.propertyName().getText()
                                        + initial + ctx.SemiColon();

                                backend.append(propertyDeclaration + " \n ");
                        }
                        else {
                                String propertyDeclaration = ctx.propertyName().getText()
                                        + ctx.SemiColon();
                                backend.append(propertyDeclaration+" \n ");
                        }
                }

        }
        if (classBinding.contains(checkStateVar))
        {
                String initializer = ctx.initializer().singleExpression().getText();
                String out="";
                for (short i =0;i<classBinding.size();i++){
                        if (classBinding.get(i).equals(checkStateVar)){
                                initializer = "Styles."+initializer.replace("\"","");
                        }
                }
                out = checkStateVar + " = " + initializer;
                backend.append(out+" \n");
        }
}




/* convert normal functions to arrow function because some functionalities
* do not work with normal function
* */
@Override public void enterMethodDeclarationExpression(TypeScriptParser.MethodDeclarationExpressionContext ctx) {
        String method = ctx.propertyName().getText() +" ="
                + ctx.callSignature().getText()+" => "
                +ctx.OpenBrace().getText() +"\n" ;
        backend.append( method +" ");
}

@Override public void exitMethodDeclarationExpression(TypeScriptParser.MethodDeclarationExpressionContext ctx) {
        backend.append("}\n"+" ");
}


@Override public void enterConstructorDeclaration(TypeScriptParser.ConstructorDeclarationContext ctx) {
        String superInsideConstructor =  "\nsuper();\n";
        String out ="";

        /** if there no constructor add it with super()**/
        if(ctx!=null){

        }

        String Args ="";

//        if(ctx.formalParameterList()!=null){
//                Args = ctx.formalParameterList().getText();
//        }

        out = ctx.Constructor().getText()+ctx.OpenParen().getText()
                +Args+ctx.CloseParen().getText()+ctx.OpenBrace().getText()+"\n"
                +superInsideConstructor+"\n";
        backend.append(out);

        }


@Override public void exitConstructorDeclaration(TypeScriptParser.ConstructorDeclarationContext ctx) {

        backend.append(" }\n ");

}


// handle arrow function
/** variable decalaration is only inside functions **/
@Override public void enterVariableStatement(TypeScriptParser.VariableStatementContext ctx) {
        String varModifier="";
        String text="";
        if(ctx.variableDeclarationList().variableDeclaration(0).typeAnnotation()!=null){
                text = ctx.varModifier().getText()+ctx.variableDeclarationList().variableDeclaration(0).identifierOrKeyWord().getText()
                        + ctx.variableDeclarationList().variableDeclaration(0).Assign().getText()
                        +ctx.variableDeclarationList().variableDeclaration(0).singleExpression(0).getText()
                        + ctx.SemiColon().getText();
        }
        else {
                text =ctx.getText();
        }
        String checkArrow=ctx.variableDeclarationList().variableDeclaration(0).singleExpression(0).getText();
        String out="";
        // not arrow func
        if(!checkArrow.contains("=>")){
                String handStateVar = handleState(text);
                out = handStateVar;
        }
        else{
                backend.append(ctx.variableDeclarationList().variableDeclaration(0).identifierOrKeyWord().getText()
                        +" "+ ctx.variableDeclarationList().variableDeclaration(0).Assign().getText()+" ");
        }
        backend.append(out+" ");
}

@Override public void exitVariableStatement(TypeScriptParser.VariableStatementContext ctx) {
        backend.append("\n");

}

@Override public void enterExpressionSequence(TypeScriptParser.ExpressionSequenceContext ctx) {
        String text = ctx.getText();


        if(ctx.parent.getChildCount() == 3
                && ctx.parent.getChild(0).getText().equals("(")) {

                // do nothing

        }
        else{

                String handlingState = handleState(ctx.getText());
                if (handlingState.contains(".callNumber(")){
                        imports = imports +"import {call} from 'react-native-phone-call';\n";
                        flag_api=true;
                        // getting the number ro call
                        Integer i1= handlingState.indexOf("(");
                        String temp= handlingState.substring(i1);
                        Integer i2= temp.indexOf(",");
                        temp = temp.substring(2,i2).replace("\"","");
                        handlingState = " let args = {\n" +
                                "\t\t\tnumber: '"+temp+"', \n" +
                                "\t\t  }"+"\ncall(args).catch(console.error);";
                }

                backend.append(handlingState+" ");
        }

}


@Override public void exitExpressionSequence(TypeScriptParser.ExpressionSequenceContext ctx) {
        backend.append(" ");
        if (ctx.getText().contains(".callNumber(")){
                flag_api=false;
        }
}




@Override public void enterReturnStatement(TypeScriptParser.ReturnStatementContext ctx) {
        backend.append(ctx.Return().getText()+" ");
}


@Override public void enterArrowFunctionDeclaration(TypeScriptParser.ArrowFunctionDeclarationContext ctx) {
        String out= ctx.arrowFunctionParameters().getText()
                + ctx.ARROW().getText() ;
        if (flag_api){
                out="";
        }
        backend.append(out +" ");
}
@Override public void enterArrowFunctionBody(TypeScriptParser.ArrowFunctionBodyContext ctx) {
        String out="{\n ";
        if (flag_api){
                out="";
        }
        backend.append(out);
}
@Override public void exitArrowFunctionBody(TypeScriptParser.ArrowFunctionBodyContext ctx) {
        String out="}\n ";
        if (flag_api){
                out="";
        }
        backend.append( out);

}

@Override public void exitProgram(TypeScriptParser.ProgramContext ctx) {
        StringBuilder finalBackend = new StringBuilder();


        /** convert states array to string to write it **/
        for (short i=0 ; i<newState.size();i++){
                if ( i!=0 && i % 3 ==0){
                        state = "\n"+state+ newState.get(i);
                }
                else{
                        state = state+ newState.get(i)+",";
                }
        }
        state ="state ={\n" + state +"\n} \n";

        if(!allstates.isEmpty()){
                finalBackend.append(state);

        }

        if (!states_ngModel.isEmpty() ){
                finalBackend.append(backend+"\n"+handleFunctions +" \n ");

        }
        else{
                finalBackend.append(backend+"\n"+handleFunctions +" \n ");

        }

        String fin =  finalBackend.toString();
//        System.out.println("File \n"+fin);


        /** add the backend code **/

        try {
                BufferedReader reader = new BufferedReader(new FileReader(file.getName()));
                StringBuilder stringBuilder = new StringBuilder();
                String line = null;
                String ls = System.getProperty("line.separator");
                while ((line = reader.readLine()) != null) {
                        stringBuilder.append(line);
                        stringBuilder.append(ls);
                }

                // delete the last new line separator
                stringBuilder.deleteCharAt(stringBuilder.length() - 1);
                reader.close();
                String content = stringBuilder.toString();

                short index_of_render= (short)content.indexOf("render");

                content = imports + content.substring(0,index_of_render)
                        + fin + content.substring(index_of_render);
                FileOutputStream fos = new FileOutputStream(file.getName());
                fos.write(content.getBytes());
                fos.flush();
        }
        catch (Exception e){
                e.printStackTrace();
        }



}

}
