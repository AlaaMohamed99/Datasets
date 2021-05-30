import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

import java.io.*;
import java.util.ArrayList;
import java.util.List;


public class TypeScript2ReactNativeConverter extends TypeScriptParserBaseListener {

private StringBuffer backend = new StringBuffer();

File file = new File("typescript2reactnative.js");

/* global variables*/
List<String> states = new ArrayList<String>();
List<String> newState = new ArrayList<String>();
String handleFunctions="";
String state = "";


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



public String handleState(String exp){
        exp = handleSpaces(exp);
        short posOfEqual= (short)exp.indexOf("=");
        String out="";

        if (posOfEqual > 0){
                String left = exp.substring(0,posOfEqual);
                String right = exp.substring(posOfEqual);
                Boolean flagLeft=false;
                //right
                for(short i=0;i<states.size();i++){
                        if (right.contains(states.get(i))){
                                String st=states.get(i);
                                right= right.replace(st,"state."+st);
                        }
                }
                //left side
                for(short i=0;i<states.size();i++) {
                        if (left.contains(states.get(i))){
                                /** avoid the error that the on of the state
                                 * is concatenated with some string on the left side**/
                                String check= left.substring
                                        (exp.indexOf(states.get(i)),exp.indexOf("="));
                                check =check.trim();
                                if(check.equals(states.get(i))){
                                        String st=states.get(i);
                                        left= left.replace(st,"setState({"
                                                +st+":"+right.replace("=","")+"})");
                                        flagLeft = true;
                                }
                                }


                }
                if(flagLeft){
                        out=left + "\n";
                }
                else{
                        out = left + right + "\n";
                }

        }
        // no equal sign
        else{
                String line=  exp;
                for(short i=0;i<states.size();i++){
                        if (line.contains(states.get(i))){
                                String st=states.get(i);
                                line= line.replace(st,"state."+st);
                        }
                }
                out=line + "\n" ;
        }
        return  out;
}


TypeScript2ReactNativeConverter() {

        try {
                /** executing Ionic2React **/
                // take inputs as stream of characters
                CharStream charStream= CharStreams.fromFileName("src/test.html");
                //send the stream of chracters to the lexer to generate tokens
                HTMLLexer ionic_html_lexer = new HTMLLexer(charStream);
                CommonTokenStream ionic_html_tokens = new CommonTokenStream(ionic_html_lexer);
                // send tokens to parser to parse it
                HTMLParser ionic_html_parser=new HTMLParser(ionic_html_tokens);
                //define the starting point inside the parser
                ionic_html_parser.setBuildParseTree(true); // not neccessary
                ParseTree tree = ionic_html_parser.htmlDocument();
                // intialize the parsetreewalker
                ParseTreeWalker walker = new ParseTreeWalker();
                //intalize our custom listner
                Ionic2reactConverter mylistner = new Ionic2reactConverter( );
                //walk through the tree using our listner so that is the link which send
                // the parse tree to our listner
                walker.walk(mylistner,tree);

                /** getting the state **/
                states = mylistner.ngModel_to_state;


                /* adding :'' to initialize the state's variables*/
                for(short i=0;i<states.size();i++){
                        newState.add(i,states.get(i)+": ''");
                }

                for (short i=0 ; i<newState.size();i++){
                        if ( i!=0 && i % 3 ==0){
                                state = "\n"+state+ newState.get(i);
                        }
                        else{
                                state = state+ newState.get(i)+",";
                        }
                }
                state ="state ={\n" + state +"\n} \n";


                // handle change functions
                for (short i=0 ; i<states.size();i++){
                        handleFunctions = handleFunctions
                                +"handleChangeOf"+states.get(i)
                                +"=(event)=>{\n"+"this.setState({"
                                +states.get(i) +": event.target.value});"
                                +"\n }\n";
                }



        } catch (IOException e) {
                e.printStackTrace();
        }


        try {
                if (file.createNewFile()) {
                        System.out.println("New file is created " + file.getName());
                        FileWriter outputfile = new FileWriter(file.getName());
                        outputfile.close();
                } else {
                        System.out.println("File already exists.");
                }
        } catch (Exception e) {
                e.printStackTrace();
        }
}




@Override public void enterProgram(TypeScriptParser.ProgramContext ctx) {

}


@Override public void enterIfStatement(TypeScriptParser.IfStatementContext ctx) {
        backend.append(ctx.If().getText() + ctx.OpenParen().getText()+" ");
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

        // do not convert variable which is the state
        String checkStateVar = ctx.propertyName().identifierName().Identifier().getText();
        if(!states.contains(checkStateVar)) {
                if (ctx.initializer() != null) {
                        String st="";
                        String initial=ctx.initializer().getText();
                        for(short i=0;i<states.size();i++){
                                if (ctx.initializer().getText().contains(states.get(i))) {
                                        st = states.get(i);
                                        initial= initial.
                                                replace(st,"state."+st);
                                }
                        }
                        String propertyDeclaration = ctx.propertyName().getText()
                                + initial + ctx.SemiColon();
                        backend.append(propertyDeclaration+" \n ");
                } else {
                        String propertyDeclaration = ctx.propertyName().getText()
                                + ctx.SemiColon();
                        backend.append(propertyDeclaration+" \n ");
                }
        }
        else {
                if (ctx.initializer() != null) {
                        String stateVal="";
                        String st="";
                        String initial=ctx.initializer().getText();
                        for(int i=0;i<states.size();i++){
                                if (ctx.initializer().getText().contains(states.get(i))) {
                                        st = states.get(i);
                                        initial= initial.
                                                replace(st,"this.state."+st);

                                        newState.set(i,newState.get(i).replace("'","")
                                                + "'"+initial+"'");
                                }
                        }
                }
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
        if(ctx.formalParameterList()!=null){
                Args = ctx.formalParameterList().getText();
        }
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


@Override public void enterExpressionSequence(TypeScriptParser.ExpressionSequenceContext ctx) {
        String text = ctx.getText();

        if(ctx.parent.getChildCount() == 3
                && ctx.parent.getChild(0).getText().equals("(")) {

                // do nothing

        }
        else{
                String handlingState = handleState(ctx.getText());
                backend.append(handlingState+" ");
        }

}

@Override public void enterReturnStatement(TypeScriptParser.ReturnStatementContext ctx) {
        backend.append(ctx.Return().getText()+" ");
}


@Override public void enterArrowFunctionDeclaration(TypeScriptParser.ArrowFunctionDeclarationContext ctx) {
        String out= ctx.arrowFunctionParameters().getText()
                + ctx.ARROW().getText() ;
        backend.append(out +" ");
}
@Override public void enterArrowFunctionBody(TypeScriptParser.ArrowFunctionBodyContext ctx) {
        backend.append("{\n ");
}
@Override public void exitArrowFunctionBody(TypeScriptParser.ArrowFunctionBodyContext ctx) {
        backend.append("}\n ");

}

@Override public void exitProgram(TypeScriptParser.ProgramContext ctx) {
        StringBuilder finalBackend = new StringBuilder();

        if (!states.isEmpty()){
                finalBackend.append(state);
                finalBackend.append(backend+"\n"+handleFunctions +" \n ");

        }
        else{
                finalBackend.append(backend+"\n"+handleFunctions +" \n ");

        }

        String fin =  finalBackend.toString();
        System.out.println("File \n"+fin);

        for(short i=0;i<20;i++){
                // do nothing
        }


}


}