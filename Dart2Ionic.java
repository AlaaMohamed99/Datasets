//File name should be the same as class name
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.Vocabulary;
import org.antlr.v4.runtime.VocabularyImpl;
import org.antlr.v4.runtime.tree.*;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;


public class Dart2Ionic extends Dart2BaseListener{
    String methodName= "";
    String text= "";
    int flag = 0;
    int i = 0;
    String exp;
    ArrayList <String> Identifiers = new ArrayList<>();
    ArrayList <String> Ui_widgets = new ArrayList<>();
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
            try {
                FileWriter outputfile = new FileWriter("Ionic.html", true);
                outputfile.write("<ion-item lines=\"none\">" + "\n" + "<ion-label");
                outputfile.close();
            } catch (IOException e) {
                System.out.println("An error occurred.");
                e.printStackTrace();
            }
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
                i += 1;
            //System.out.print(i);
        }
        Identifiers.add(methodName);
        System.out.print("this is methodname" + "\n");
        System.out.print(methodName + "\n");
    }

    @Override public void enterExpressionList(Dart2Parser.ExpressionListContext ctx) {
        //System.out.print(ctx);
    }

    @Override public void enterPostfixExpression(Dart2Parser.PostfixExpressionContext ctx) {

    }

    @Override public void enterNamedArgument(Dart2Parser.NamedArgumentContext ctx) {
        String Label = ctx.label().getText();
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
                FileWriter outputfile = new FileWriter("Ionic.html", true);
                outputfile.write("<ion-toolbar>" + appName + " </ion-toolbar>" + "\n");
                outputfile.close();
            } catch (IOException e) {
                e.printStackTrace();
            }

        }
        //TextField
        if (Label.equals("labelText:")) {
            String expression = ctx.expression().getText();
            int start = expression.indexOf("'") + 1;
            int end = expression.lastIndexOf("'");
            exp = expression.substring(start, end);
            //System.out.print(exp + "\n");
            Ui_widgets.add("labelText");
            //System.out.print(Ui_widgets + "\n");
        }

        if(Ui_widgets.size()>=2 && Ui_widgets.get(Ui_widgets.size()-2).equals("InputDecoration") && Ui_widgets.get(Ui_widgets.size()-1).equals("labelText")){
            try {
                FileWriter outputfile = new FileWriter("Ionic.html", true);
                outputfile.write(" position=\"floating\" >" + exp + " </ion-label>" + "\n");
                outputfile.write("<ion-input type=\"text\" > </ion-input>" + "\n"+ "</ion-item>" + "\n");
                outputfile.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
            Ui_widgets.remove(Ui_widgets.size()-1);
            Ui_widgets.remove(Ui_widgets.size()-1);
            Ui_widgets.remove(Ui_widgets.size()-1);
        }

        //Raisedbutton
        if(Label.equals("child:")) {
            String expression = ctx.expression().getText();
            System.out.print(methodName);
            if(expression.substring(0,4).equals("Text") && Ui_widgets.contains("RaisedButton")) {
                int start = expression.indexOf("\'") + 1;
                int end = expression.lastIndexOf("\'");
                text = expression.substring(start, end);
                //System.out.print(text);
                Ui_widgets.remove("child");
                if (Ui_widgets.contains("textScaleFactor"))
                    Ui_widgets.remove("textScaleFactor");
            }
        }
        if(Label.equals("onPressed:")) {
            String expression = ctx.expression().getText();
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

    }


    @Override public void exitPostfixExpression(Dart2Parser.PostfixExpressionContext ctx) {
        if (!Ui_widgets.isEmpty() && Ui_widgets.get(Ui_widgets.size()-1).equals("RaisedButton")){
            //System.out.print("entered");
            try {
                FileWriter outputfile = new FileWriter("Ionic.html", true);
                outputfile.write(">" + text + "</ion-button>" +"\n");
                outputfile.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
            Ui_widgets.remove(Ui_widgets.size()-1);
        }

    }

    @Override public void exitStringLiteral(Dart2Parser.StringLiteralContext ctx) {
        String path = ctx.SingleLineString().toString();
        System.out.print(path);
        if(!Ui_widgets.isEmpty() && Ui_widgets.get(Ui_widgets.size()-1).equals("AssetImage")){
            int start = path.indexOf("\'") + 1;
            int end = path.lastIndexOf("\'");
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
                        indexcol = word.indexOf(",", indexcol + 1);
                        if (index != -1) {
                            indexesofdots.add(index);
                        }
                        if (indexcol != -1) {
                            indexesofcol.add(indexcol);
                        }
                    }
                    //System.out.print(indexesofdots);
                    //System.out.print(indexesofcol);
                //System.out.print(word+ "\n");
                Ui_widgets.add(word.substring(0, indexesofdots.get(0)));
                for (int i = 0; i < indexesofdots.size()-1; i++){
                    Ui_widgets.add(word.substring(indexesofcol.get(i)+1, indexesofdots.get(i+1)));
                }
                Ui_widgets.removeIf( name -> name.equals(" "));
                //System.out.print(Ui_widgets);
                flag = 1;                }
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