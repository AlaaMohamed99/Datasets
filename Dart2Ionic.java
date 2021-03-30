//File name should be the same as class name

import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.Vocabulary;
import org.antlr.v4.runtime.VocabularyImpl;
import org.antlr.v4.runtime.tree.*;
import java.io.*;
import java.lang.*;
import java.io.IOException;
import java.util.*;


public class Dart2Ionic extends Dart2BaseListener{
    String methodName= "";
    String text= "";
    String variable = "";
    String listconetent = "";
    int flag = 0;
    int i = 0;
    int Textflag = 0;
    String exp = "";
    int ListTilecount = 0;
    ArrayList <String> Identifiers = new ArrayList<>();
    ArrayList <String> Ui_widgets = new ArrayList<>();
    ArrayList <String> ListContent = new ArrayList<>();

    public void Createfile(){
        try {
            File myObj = new File("Ionic.html");
            if (myObj.createNewFile()) {
                System.out.println("File created: " + myObj.getName());
            } else {
                System.out.println("File already exists.");
            }
            FileWriter outputfile = new FileWriter("Ionic.html", true);
            outputfile.write("<ion-content>" + "\n");
            outputfile.close();
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
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
    @Override public void enterIdentifier(Dart2Parser.IdentifierContext ctx){
        //System.out.print("enter iden");
        methodName = ctx.IDENTIFIER().getText();
        if(methodName.equals("InputDecoration"))
            Ui_widgets.add("InputDecoration");

        if(methodName.equals("AssetImage"))
            Ui_widgets.add("AssetImage");

        if(methodName.equals("ListView"))
            Ui_widgets.add("ListView");

        if(methodName.equals("ListTile"))
            Ui_widgets.add("ListTile");

        if (methodName.equals("TextField")) {
            Ui_widgets.add("TextField");
            exp = "";
        }
        if (methodName.equals("RaisedButton")) {
            Ui_widgets.add("RaisedButton");
            flag = 0;
            try {
                FileWriter outputfile = new FileWriter("Ionic.html", true);
                outputfile.write("<ion-button");
                outputfile.close();
            } catch (IOException e) {
                System.out.println("An error occurred.");
                e.printStackTrace();
            }
        }
        /*if(methodName.equals("Text") && !(Identifiers.get(Identifiers.size()-1).equals("child")) || !(Identifiers.get(Identifiers.size()-1).equals("title"))) {
            i += 1;
            System.out.print(i);
        }*/
        //I have a problem identifiying Text when it's just a text but not inside something, as I could wrap it inside a padding, it'll still be indv but inside a child
        if(!(Identifiers.isEmpty())) {
            if((methodName.equals("Text") && !(Identifiers.get(Identifiers.size()-1).equals("child"))) && (methodName.equals("Text") && !(Identifiers.get(Identifiers.size()-1).equals("title"))) )
                Ui_widgets.add("Text");
                //i += 1;
            //System.out.print(i);
        }
        Identifiers.add(methodName);
        System.out.print("this is methodname" + "\n");
        System.out.print(Ui_widgets + "\n");
    }


    @Override public void enterNamedArgument(Dart2Parser.NamedArgumentContext ctx) {
        String Label = ctx.label().getText();
        String expression = ctx.expression().getText();
        System.out.print("this is label and expression" + "\n");
        System.out.print(ctx.label().getText() + "\n");
        System.out.print(ctx.expression().getText() + "\n");

        //Appbar
        if(Label.equals("appBar:")){
            String appbar = ctx.expression().getText();
            int start = appbar.indexOf("\"") + 1;
            int end = appbar.lastIndexOf("\"");
            String appName = appbar.substring(start,end);
            try {
                FileWriter outputfile = new FileWriter("Ionic.html", false);
                outputfile.append("<ion-header>" +"\n"+ "<ion-toolbar> " + appName + " </ion-toolbar>" +"\n"+"</ion-header>" + "\n" + "<ion-content>" + "\n");

                outputfile.close();
            } catch (IOException e) {
                e.printStackTrace();
            }

        }
        //TextField
        if (Label.equals("labelText:")) {
            int start = expression.indexOf("'") + 1;
            int end = expression.lastIndexOf("'");
            exp = expression.substring(start, end);
            //System.out.print(Ui_widgets + "\n");
        }

        if (Label.equals("prefixIcon:")) {
            if(expression.contains("Text")) {
                int start = expression.indexOf("'") + 1;
                int end = expression.lastIndexOf("'");
                exp = expression.substring(start, end);
                //System.out.print(exp + "\n");

                //System.out.print(Ui_widgets + "\n");
            }
        }


        //Raisedbutton
        if(Label.equals("child:")) {
            System.out.print(methodName);
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
            }
        }
        if(Label.equals("onPressed:")) {
            if(expression.contains("setState")){
                int start = expression.lastIndexOf("{")+1;
                int end = expression.indexOf(";");
                String Functionname = expression.substring(start, end);
                System.out.print(Functionname);
                try {
                    FileWriter outputfile = new FileWriter("Ionic.html", true);
                    outputfile.write(" (click)=\"" + Functionname + "\"");
                    outputfile.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            Ui_widgets.remove("onPressed");
        }
        /*if (!Ui_widgets.isEmpty() && Ui_widgets.contains("RaisedButton")&& !Ui_widgets.contains("child") &&   !Ui_widgets.contains("onPressed")) {
            Ui_widgets.clear();
            Ui_widgets.add("RaisedButton");
        }*/

        //ListTile
        if(Label.equals("title:") && !Ui_widgets.isEmpty() && Ui_widgets.get(Ui_widgets.size()-1).equals("ListTile")){
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
                    FileWriter outputfile = new FileWriter("Ionic.html", true);
                    outputfile.write("<li>" + listconetent + "</li>" + "\n");
                    outputfile.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            ListTilecount--;

        }

    }

    @Override public void enterExpressionList(Dart2Parser.ExpressionListContext ctx) {
        if(ListTilecount != 0 && !Ui_widgets.isEmpty() && Ui_widgets.get(Ui_widgets.size()-1).equals("ListView")){
            try {
                FileWriter outputfile = new FileWriter("Ionic.html", true);
                outputfile.write("<ion-list>" + "\n" + "<ul>"+ "\n");
                outputfile.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
    @Override public void exitExpressionList(Dart2Parser.ExpressionListContext ctx) {
        if(ListTilecount == 0 && Ui_widgets.contains("ListTile") && Ui_widgets.contains("ListView")){
            try {
                FileWriter outputfile = new FileWriter("Ionic.html", true);
                outputfile.write("</ul>" + "\n" + "</ion-list>" + "\n");
                outputfile.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
            Ui_widgets.remove("ListView");
            Ui_widgets.removeAll(Collections.singleton("ListTile"));
        }
    }

    @Override public void exitNamedArgument(Dart2Parser.NamedArgumentContext ctx) {

        if(Ui_widgets.size()>=2 && Ui_widgets.get(Ui_widgets.size()-2).equals("InputDecoration") && Ui_widgets.get(Ui_widgets.size()-1).equals("prefixIcon")&& !exp.equals("")){
            try {
                FileWriter outputfile = new FileWriter("Ionic.html", true);
                outputfile.write("<ion-item lines=\"none\">" + "\n" + "<ion-label position=\"fixed\" >" + exp + " </ion-label>" + "\n");
                outputfile.write("<ion-input type=\"text\" > </ion-input>" + "\n"+ "</ion-item>" + "\n");
                outputfile.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
            Ui_widgets.remove(Ui_widgets.size()-1);
            Ui_widgets.remove(Ui_widgets.size()-1);
            Ui_widgets.remove(Ui_widgets.size()-1);
        }
        if(Ui_widgets.size()>=2 && Ui_widgets.get(Ui_widgets.size()-2).equals("InputDecoration") && Ui_widgets.get(Ui_widgets.size()-1).equals("labelText") && !exp.equals("")){
            try {
                FileWriter outputfile = new FileWriter("Ionic.html", true);
                outputfile.write("<ion-item lines=\"none\">" + "\n" + "<ion-label position=\"floating\" >" + exp + " </ion-label>" + "\n");
                outputfile.write("<ion-input type=\"text\" > </ion-input>" + "\n"+ "</ion-item>" + "\n");
                outputfile.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
            Ui_widgets.remove(Ui_widgets.size()-1);
            Ui_widgets.remove(Ui_widgets.size()-1);
            Ui_widgets.remove(Ui_widgets.size()-1);
        }
    }


    @Override public void exitPostfixExpression(Dart2Parser.PostfixExpressionContext ctx) {

        if(!Ui_widgets.isEmpty() && Ui_widgets.get(Ui_widgets.size()-1).equals("Text") && Textflag == 1){
            try {
                FileWriter outputfile = new FileWriter("Ionic.html", true);
                outputfile.write("<ion-text>" +"{{"+variable+"}}"+ "</ion-text>" + "\n");
                outputfile.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
            Ui_widgets.remove(Ui_widgets.size()-1);
            Textflag = 0;
        }

        if (!Ui_widgets.isEmpty() && Ui_widgets.contains("RaisedButton") && !Ui_widgets.contains("child") &&   !Ui_widgets.contains("onPressed")){
            //System.out.print("entered");
            try {
                FileWriter outputfile = new FileWriter("Ionic.html", true);
                outputfile.write(">" + text + "</ion-button>" +"\n");
                outputfile.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
            Ui_widgets.clear();
        }


        if(Ui_widgets.size()>=2 && Ui_widgets.get(Ui_widgets.size()-2).equals("TextField") && Ui_widgets.get(Ui_widgets.size()-1).equals("InputDecoration")){
            try {
                FileWriter outputfile = new FileWriter("Ionic.html", true);
                outputfile.write("<ion-input type=\"text\" > </ion-input>" + "\n");
                outputfile.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
            Ui_widgets.remove(Ui_widgets.size()-1);
            Ui_widgets.remove(Ui_widgets.size()-1);
        }
    }

    @Override public void exitStringLiteral(Dart2Parser.StringLiteralContext ctx) {
        String path = ctx.SingleLineString().toString();
        System.out.print(path);

        //Text of string
        if(!Ui_widgets.isEmpty() && Textflag == 0 && Ui_widgets.get(Ui_widgets.size()-1).equals("Text")){
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
                FileWriter outputfile = new FileWriter("Ionic.html", true);
                outputfile.write("<ion-text>" + path + " </ion-text>" + "\n");
                outputfile.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
            //remove all as there'll be several occarances of AssetImage
            Ui_widgets.remove("Text");
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
                FileWriter outputfile = new FileWriter("Ionic.html", true);
                outputfile.write("<ion-img src= \'" + path + "\' >" + " </ion-img>" + "\n");
                outputfile.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
            //remove all as there'll be several occarances of AssetImage
            Ui_widgets.removeAll(Collections.singleton("AssetImage"));
        }

    }

    @Override public void enterArguments(Dart2Parser.ArgumentsContext ctx) {
            if(ctx.argumentList() != null){
                String word = ctx.argumentList().getText();
                System.out.print("word"+ "\n");
                System.out.print(word+ "\n");
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
                //System.out.print(word+ "\n");
                Ui_widgets.add(word.substring(0, indexesofdots.get(0)));
                for (int i = 0; i < indexesofcol.size(); i++){
                    if (indexesofdots.get(i+1)> indexesofcol.get(i)+1)
                        Ui_widgets.add(word.substring(indexesofcol.get(i)+1, indexesofdots.get(i+1)));
                    else
                        Ui_widgets.add(word.substring(indexesofcol.get(i)+1, indexesofdots.get(i+2)));
                }
                Ui_widgets.removeIf( name -> name.equals(" "));
                //System.out.print(Ui_widgets);
                flag = 1;
                }

                if(!Ui_widgets.isEmpty() && Ui_widgets.get(Ui_widgets.size()-1).equals("Text")){
                    if(word.substring(0,1).equals("'") || word.substring(0,1).equals("\"")) {
                        Textflag = 0;
                    }
                    else{
                        Textflag = 1;
                        int end;
                        end = word.indexOf(",");
                        variable = word.substring(0, end);
                        if (variable.contains("this."))
                            variable = variable.substring(5);
                        System.out.print("VARIABLE");
                        System.out.print(variable);
                    }

                }
                if (!Ui_widgets.isEmpty() && Ui_widgets.get(Ui_widgets.size()-1).equals("InputDecoration")){
                    if(word.contains("labelText"))
                        Ui_widgets.add("labelText");
                    if(word.contains("prefixIcon"))
                        Ui_widgets.add("prefixIcon");

                }
                if (!Ui_widgets.isEmpty() && Ui_widgets.get(Ui_widgets.size()-1).equals("ListView")){
                    if (word.contains("ListTile"))
                        ListTilecount = (word.split("ListTile", -1).length) - 1;

                }
            }

    }


    @Override public void exitCompilationUnit(Dart2Parser.CompilationUnitContext ctx) {
        try {
            FileWriter outputfile = new FileWriter("Ionic.html", true);
            outputfile.write("</ion-content>");
            outputfile.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


}


/*    @Override public void enterArgumentPart(Dart2Parser.ArgumentPartContext ctx) {
        String Argumentsname = ctx.arguments().getText();
        Vocabulary vocabulary = new Vocabulary() {
            @Override
            public int getMaxTokenType() {
                return 0;
            }

            @Override
            public String getLiteralName(int i) {
                return null;
            }

            @Override
            public String getSymbolicName(int i) {
                return null;
            }

            @Override
            public String getDisplayName(int i) {
                return null;
            }
        };

    }*/