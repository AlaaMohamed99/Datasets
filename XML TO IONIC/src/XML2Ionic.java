import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.TerminalNode;
import java.io.FileWriter;
import java.io.IOException;

public class XML2Ionic extends XMLParserBaseListener {

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

    @Override
    public void enterDocument(XMLParser.DocumentContext ctx) {
    }

    @Override
    public void enterContent(XMLParser.ContentContext ctx) {
        System.out.println(ctx.element().size());
        int numOfElements = ctx.element().size();
        StringBuilder output = new StringBuilder("<ion-content>\n");
        String output_after_tag ;
        for(int i=0 ; i<numOfElements ; i++) {
            String methodName = ctx.element(i).Name(0).getText();
            System.out.println(methodName);
            int attSize = ctx.element(i).attribute().size();
            System.out.println(attSize);
            if (methodName.equals("Button")) {
                output.append("<ion-button ");
                for(int j=0 ; j<attSize ; j++) {
                    String attribtes_NAME = ctx.element(i).attribute(j).Name().getText();
                    String attribtes_VALUE = ctx.element(i).attribute(j).STRING().getText();
                    attribtes_VALUE = attribtes_VALUE.substring(1, attribtes_VALUE.length() - 1);
                    System.out.println(attribtes_NAME);
                    System.out.println(attribtes_VALUE + "9999999999999");
                    if (attribtes_NAME.equals("android:onClick")) {

                        output.append("(click)=\"" + attribtes_VALUE + "()\"");



                    }
                    if (attribtes_NAME.equals("android:text")) {
                        output.append("> ");
                        output_after_tag = attribtes_VALUE;
                        output_after_tag += "</ion-button>";
                        output.append(output_after_tag+"\n");
                }


            }}
            else if (methodName.equals("TextView")) {
                output.append("\n<ion-text ");
                int n=0;
                for(int j=0 ; j<attSize ; j++) {
                    String attribtes_NAME = ctx.element(i).attribute(j).Name().getText();
                    String attribtes_VALUE = ctx.element(i).attribute(j).STRING().getText();
                    attribtes_VALUE = attribtes_VALUE.substring(1, attribtes_VALUE.length() - 1);
                    System.out.println(attribtes_NAME);
                    System.out.println(attribtes_VALUE + "9999999999999");
                    if (attribtes_NAME.equals("android:background")) {
                        if (n==0) {
                            output.append("style=\"");
                        }
                        n=1;
                        output.append("background-color: " + attribtes_VALUE + ";");
                    }


                    if (attribtes_NAME.equals("android:text")) {
                        if (n==1) {
                            output.append("\"");
                        }
                        output.append("> ");
                        output_after_tag = attribtes_VALUE;
                        output_after_tag += " </ion-text>";
                        output.append(output_after_tag+"\n");

                    }}}
            else if (methodName.equals("EditText")) {
                output.append("\n<ion-input ");
                for(int j=0 ; j<attSize ; j++) {
                    String attribtes_NAME = ctx.element(i).attribute(j).Name().getText();
                    String attribtes_VALUE = ctx.element(i).attribute(j).STRING().getText();
                    attribtes_VALUE = attribtes_VALUE.substring(1, attribtes_VALUE.length() - 1);
                    System.out.println(attribtes_NAME);
                    System.out.println(attribtes_VALUE + "9999999999999");
                    if (attribtes_NAME.equals("android:inputType")) {

                        output.append("type=\"" + attribtes_VALUE + "\"");
                    }




                    }
                output.append("> ");
                output.append("</ion-input>");

            }
            else if (methodName.equals("ImageView")) {
                output.append("\n\n<ion-img ");
                int n=0;
                for(int j=0 ; j<attSize ; j++) {
                    String attribtes_NAME = ctx.element(i).attribute(j).Name().getText();
                    String attribtes_VALUE = ctx.element(i).attribute(j).STRING().getText();
                    attribtes_VALUE = attribtes_VALUE.substring(1, attribtes_VALUE.length() - 1);
                    System.out.println(attribtes_NAME);
                    System.out.println(attribtes_VALUE + "9999999999999");
                    if (attribtes_NAME.equals("android:layout_width")) {
                        if (n==0) {
                            output.append("style=\"");
                            n=1;
                        }
                        output.append("width: " + attribtes_VALUE + ";");
                    }
                    if (attribtes_NAME.equals("android:layout_height")) {
                        if (n==0) {
                            output.append("style=\"");
                            n=1;
                        }
                        output.append("height: " + attribtes_VALUE + ";");
                    }


                    if (attribtes_NAME.equals("app:srcCompat")) {
                        if (n==1) {
                            output.append("\" ");
                        }
                        output.append("src=\""+attribtes_VALUE+"\"");
                        output.append("> "+" </ion-img>"+"\n\n");
                    }}}

            else if (methodName.equals("ListView")) {
                output.append("<ion-list ");
                int n=0;
                for(int j=0 ; j<attSize ; j++) {
                    String attribtes_NAME = ctx.element(i).attribute(j).Name().getText();
                    String attribtes_VALUE = ctx.element(i).attribute(j).STRING().getText();
                    attribtes_VALUE = attribtes_VALUE.substring(1, attribtes_VALUE.length() - 1);
                    System.out.println(attribtes_NAME);
                    System.out.println(attribtes_VALUE + "9999999999999");
                    if (attribtes_NAME.equals("android:background")) {
                        if (n==0) {
                            output.append("style=\"");
                            n=1;
                        }
                        output.append("background-color: " + attribtes_VALUE + ";");
                    }

                    if (n==1){
                        output.append("\" >"+"\n");
                        n=2;
                    }
                    else if(n==0 &&j==attSize-1 ){

                        output.append(">"+"\n");
                    }


                    if (attribtes_NAME.equals("tools:listheader")) {



                        output.append("\n<ion-list-header >" + attribtes_VALUE + "</ion-list-header>");
                    }
                    }
                output.append("\n</ion-list> \n");
            }
            else if (methodName.equals("Spinner")) {
                output.append("\n<ion-select ");
                output.append(">\n ");
                output.append("</ion-select>");
                }



        }
        output.append("\n\n</ion-content>");
        try {
            FileWriter outputFile;
            outputFile = new FileWriter("file.html");
            outputFile.write(output.toString());
            outputFile.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    @Override
    public void enterElement(XMLParser.ElementContext ctx) {
//        System.out.println("//////////////////////"+ctx.Name(0).getText());
    }
}