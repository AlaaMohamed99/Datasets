import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;
import org.antlr.v4.runtime.tree.TerminalNode;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class XML2Ionic extends XMLParserBaseListener {
    File file = new File("activity_main") ;
    StringBuilder css_output = new StringBuilder();
    StringBuilder output = new StringBuilder("<ion-content class=\"main\" >\n");
    CharStream charStream2= CharStreams.fromFileName("./strings.xml");
    String xmlString = charStream2.toString();


    public XML2Ionic() throws IOException {
    }


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
        String methodName = ctx.element().Name(0).getText();
        int attsize = ctx.element().attribute().size();
        System.out.println(methodName);
        for(int i=0 ; i<attsize ; i++) {
            String att = ctx.element().attribute(i).Name().getText();
            String attvalue = ctx.element().attribute(i).STRING().getText();
            attvalue = attvalue.substring(1, attvalue.length() - 1);

            if (att.equals("android:background")){
                System.out.println(attvalue);
                css_output.append(".main"+" {\n");
                css_output.append("--background: " +attvalue+ ";\n\n}\n");



            }


        }
    }

    @Override
    public void enterContent(XMLParser.ContentContext ctx) {
        int numOfElements = ctx.element().size();

        String output_after_tag ;

        for(int i=0 ; i<numOfElements ; i++) {
            String methodName = ctx.element(i).Name(0).getText();
            //System.out.println(methodName);
            int attSize = ctx.element(i).attribute().size();
            //System.out.println(attSize);

            ///////////////////1111111111111111111111
            if (methodName.equals("Button")) {
                output.append("<ion-button ");
                int background_flag =0;
                String text ="";
                double width = 1 ;
                double bias = 0.2;
                int f=0;
                double left = 1 ;

                for(int j=0 ; j<attSize ; j++) {
                    String attribtes_NAME = ctx.element(i).attribute(j).Name().getText();
                    String attribtes_VALUE = ctx.element(i).attribute(j).STRING().getText();
                    attribtes_VALUE = attribtes_VALUE.substring(1, attribtes_VALUE.length() - 1);
                    //System.out.println(attribtes_NAME);
                    //System.out.println(attribtes_VALUE + "9999999999999");

                    if (attribtes_NAME.equals("android:onClick")) {

                        output.append("(click)=\"" + attribtes_VALUE + "()\"");



                    }

                    if (attribtes_NAME.equals("android:id")) {

                        output.append(" class=\"" + attribtes_VALUE.substring(5) + "\" ");
                        css_output.append("."+attribtes_VALUE.substring(5)+" {\n");

                    }

                    if (attribtes_NAME.equals("android:text")) {
                        output.append("> "+attribtes_VALUE+"</ion-button>\n");
                        /*output_after_tag = attribtes_VALUE;
                        output_after_tag += "</ion-button>";
                        output.append(output_after_tag+"\n");*/
                    }


                    //STYLING AREA
                    if (attribtes_NAME.equals("android:textColor")) {


                        css_output.append("color: " +attribtes_VALUE+ ";\n");
                    }

                    if (attribtes_NAME.equals("app:layout_constraintVertical_bias")) {

                        System.out.println(attribtes_VALUE);
                        float m = Float.parseFloat(attribtes_VALUE);
                        String k = String.valueOf(m*100);
                        css_output.append("top: "+ k + "%;\n");
                    }
                    if (attribtes_NAME.equals("app:layout_constraintHorizontal_bias")) {
                        bias = Float.parseFloat(attribtes_VALUE);
                        left=(100-width)*bias;
                        String k = String.valueOf(left);
                        css_output.append("left: "+ k + "%;\n");
                    }
                    if (attribtes_NAME.equals("app:backgroundTint")) {
                        background_flag =1;

                        if((attribtes_VALUE.substring(0,1)).equals("#")){
                            css_output.append("--background: "+attribtes_VALUE+ ";\n");
                        }
                        else {
                            System.out.println(attribtes_VALUE.substring(0,1));
                            css_output.append("--background: "+attribtes_VALUE.split("/")[1]+ ";\n");
                        }
                    }

                    if (attribtes_NAME.equals("android:layout_width")) {

                        if((attribtes_VALUE.substring(0,1)).equals("w")){
                            width=52+10*150;
                        }

                        else if((attribtes_VALUE.substring(0,1)).equals("m")){
                            css_output.append("width: 97%;\n");
                            width=97;
                        }
                        else {
                            f=1;
                            System.out.println(attribtes_VALUE.substring(0,attribtes_VALUE.length()-2));
                            width = Float.parseFloat(attribtes_VALUE.substring(0,attribtes_VALUE.length()-2));
                            String k = String.valueOf(width*100/410);
                            css_output.append("width: "+ k + "%;\n");
                            width=width*100/410;
                        }
                    }

                    if (attribtes_NAME.equals("android:layout_height")) {

                        if((attribtes_VALUE.substring(0,1)).equals("w")){
                        }

                        else if((attribtes_VALUE.substring(0,1)).equals("m") ) {
                            css_output.append("height: 97%;\n");
                        }
                        else if((attribtes_VALUE.substring(0,1)).equals("f") ) {
                            css_output.append("height: 97%;\n");
                        }
                        else {

                            System.out.println(attribtes_VALUE.substring(0,attribtes_VALUE.length()-2));
                            float m = Float.parseFloat(attribtes_VALUE.substring(0,attribtes_VALUE.length()-2));
                            String k = String.valueOf(m*100/730);
                            css_output.append("height: "+ k + "%;\n");
                        }
                    }


                    if (j==attSize-1){

                        if(background_flag==0){
                            css_output.append("--background: transparent"+";\n");

                        }

                        if(text.length()==0 && f==0){

                            css_output.append("left: "+ 87.32*bias + "%;\n");

                        }
                        else if (text.length()>0 && f==0){
                            left=(100-((52+text.length()*10)*100/410))*bias;
                            System.out.println((52+text.length()*10)+ "////////");
                            String k = String.valueOf(left);

                            css_output.append("left: "+ k + "%;\n");

                        }

                        css_output.append("position: fixed;\n");
                        css_output.append("\n}\n");

                    }
                }}
            ///////////////////22222222222222
            else if (methodName.equals("TextView")) {
                output.append("\n<ion-text ");
                int background_flag =0;
                String text ="";
                int n =0;
                double width = 1 ;
                double bias = 0.2;
                int f=0;
                double left = 1 ;
                for(int j=0 ; j<attSize ; j++) {
                    String attribtes_NAME = ctx.element(i).attribute(j).Name().getText();
                    String attribtes_VALUE = ctx.element(i).attribute(j).STRING().getText();
                    attribtes_VALUE = attribtes_VALUE.substring(1, attribtes_VALUE.length() - 1);
                    //System.out.println(attribtes_NAME);
                    //System.out.println(attribtes_VALUE + "9999999999999");
                    /*if (attribtes_NAME.equals("android:background")) {
                        if (n==0) {
                            output.append("style=\"");
                        }
                        n=1;
                        output.append("background-color: " + attribtes_VALUE + ";");
                    }*/
                    if (attribtes_NAME.equals("android:id")) {

                        output.append(" class=\"" + attribtes_VALUE.substring(5) + "\" ");
                        css_output.append("."+attribtes_VALUE.substring(5)+" {\n");

                    }

                    if (attribtes_NAME.equals("android:text")) {
                        output.append("> " + attribtes_VALUE + " </ion-text>\n");
                        n=1;
                        /*output_after_tag = attribtes_VALUE;
                        output_after_tag += " </ion-text>";
                        output.append(output_after_tag+"\n");*/
                    }
                    else if(!attribtes_NAME.equals("android:text")&&j== attSize-1&&n==0) {
                        output.append("> "  + " </ion-text>\n");

                    }


                    //STYLING AREA

                    if (attribtes_NAME.equals("android:textColor")) {

                        css_output.append("color: "+attribtes_VALUE + ";\n");
                    }
                    if (attribtes_NAME.equals("app:layout_constraintVertical_bias")) {

                        System.out.println(attribtes_VALUE);
                        float m = Float.parseFloat(attribtes_VALUE);
                        String k = String.valueOf(m*100);
                        css_output.append("top: "+ k + "%;\n");
                    }

                    if (attribtes_NAME.equals("app:layout_constraintHorizontal_bias")) {
                        bias = Float.parseFloat(attribtes_VALUE);
                        left=(100-width)*bias;
                        String k = String.valueOf(left);
                        css_output.append("left: "+ k + "%;\n");
                    }
                    if (attribtes_NAME.equals("android:background")) {
                        background_flag =1;

                        if((attribtes_VALUE.substring(0,1)).equals("#")){
                            css_output.append("--background: "+attribtes_VALUE+ ";\n");
                        }
                        else {
                            System.out.println(attribtes_VALUE.substring(0,1));
                            css_output.append("--background: "+attribtes_VALUE.split("/")[1]+ ";\n");
                        }
                    }

                    if (attribtes_NAME.equals("android:layout_width")) {

                        if((attribtes_VALUE.substring(0,1)).equals("w")){
                            width=52+10*150;
                        }

                        else if((attribtes_VALUE.substring(0,1)).equals("m")){
                            css_output.append("width: 97%;\n");
                            width=97;
                        }
                        else {
                            f=1;
                            System.out.println(attribtes_VALUE.substring(0,attribtes_VALUE.length()-2));
                            width = Float.parseFloat(attribtes_VALUE.substring(0,attribtes_VALUE.length()-2));
                            String k = String.valueOf(width*100/410);
                            css_output.append("width: "+ k + "%;\n");
                            width=width*100/410;
                        }
                    }

                    if (attribtes_NAME.equals("android:layout_height")) {

                        if((attribtes_VALUE.substring(0,1)).equals("w")){
                        }

                        else if((attribtes_VALUE.substring(0,1)).equals("m")){
                            css_output.append("height: 97%;\n");
                        }
                        else {

                            System.out.println(attribtes_VALUE.substring(0,attribtes_VALUE.length()-2));
                            float m = Float.parseFloat(attribtes_VALUE.substring(0,attribtes_VALUE.length()-2));
                            String k = String.valueOf(m*100/730);
                            css_output.append("height: "+ k + "%;\n");
                        }
                    }



                    if (j==attSize-1){
                        if(background_flag==0){
                            css_output.append("--background: transparent"+";\n");

                        }

                        if(text.length()==0 && f==0){

                            css_output.append("left: "+ 87.32*bias + "%;\n");


                        }
                        else if (text.length()>0 && f==0){
                            left=(100-((52+text.length()*10)*100/410))*bias;
                            System.out.println((52+text.length()*10)+ "////////");
                            String k = String.valueOf(left);

                            css_output.append("left: "+ k + "%;\n");

                        }

                        css_output.append("position: fixed;\n");
                        css_output.append("\n}\n");
                    }




                }}
            ///////////////////3333333333333333

            else if (methodName.equals("EditText")) {
                output.append("\n<ion-item");

                int background_flag =0;
                String text ="";
                double width = 1 ;
                double bias = 0.2;
                int f=0;
                double left = 1 ;

                for(int j=0 ; j<attSize ; j++) {
                    String attribtes_NAME = ctx.element(i).attribute(j).Name().getText();
                    String attribtes_VALUE = ctx.element(i).attribute(j).STRING().getText();
                    attribtes_VALUE = attribtes_VALUE.substring(1, attribtes_VALUE.length() - 1);
                    //System.out.println(attribtes_NAME);
                    //System.out.println(attribtes_VALUE + "9999999999999")

                    if (attribtes_NAME.equals("android:id")) {

                        output.append(" class=\"" + attribtes_VALUE.substring(5) + "\">");
                        css_output.append("."+attribtes_VALUE.substring(5)+" {\n");
                    }


                    if (attribtes_NAME.equals("android:hint")) {

                        output.append("\n<ion-label>" + attribtes_VALUE + "</ion-label>");
                    }


                    if (attribtes_NAME.equals("android:inputType")) {
                        output.append("\n<ion-input ");

                        output.append("type=\"" + attribtes_VALUE + "\"");
                    }

                    //STYLING AREA
                    if (attribtes_NAME.equals("android:textColor")) {


                        css_output.append("color: " +attribtes_VALUE+ ";\n");
                    }


                    if (attribtes_NAME.equals("app:layout_constraintVertical_bias")) {

                        System.out.println(attribtes_VALUE);
                        float m = Float.parseFloat(attribtes_VALUE);
                        String k = String.valueOf(m*100);
                        css_output.append("top: "+ k + "%;\n");
                    }
                    if (attribtes_NAME.equals("app:layout_constraintHorizontal_bias")) {
                        bias = Float.parseFloat(attribtes_VALUE);
                        left=(100-width)*bias;
                        String k = String.valueOf(left);
                        css_output.append("left: "+ k + "%;\n");
                    }
                    if (attribtes_NAME.equals("android:background")) {
                        background_flag =1;

                        if((attribtes_VALUE.substring(0,1)).equals("#")){
                            css_output.append("--background: "+attribtes_VALUE+ ";\n");
                        }
                        else {
                            System.out.println(attribtes_VALUE.substring(0,1));
                            css_output.append("--background: "+attribtes_VALUE.split("/")[1]+ ";\n");
                        }
                    }
                    if (attribtes_NAME.equals("android:layout_width")) {

                        if((attribtes_VALUE.substring(0,1)).equals("w")){
                            width=52+10*150;
                        }

                        else if((attribtes_VALUE.substring(0,1)).equals("m")){
                            css_output.append("width: 97%;\n");
                            width=97;
                        }
                        else {
                            f=1;
                            System.out.println(attribtes_VALUE.substring(0,attribtes_VALUE.length()-2));
                            width = Float.parseFloat(attribtes_VALUE.substring(0,attribtes_VALUE.length()-2));
                            String k = String.valueOf(width*100/410);
                            css_output.append("width: "+ k + "%;\n");
                            width=width*100/410;
                        }
                    }

                    if (attribtes_NAME.equals("android:layout_height")) {

                        if((attribtes_VALUE.substring(0,1)).equals("w")){
                        }

                        else if((attribtes_VALUE.substring(0,1)).equals("m")){
                            css_output.append("height: 97%;\n");
                        }
                        else {

                            System.out.println(attribtes_VALUE.substring(0,attribtes_VALUE.length()-2));
                            float m = Float.parseFloat(attribtes_VALUE.substring(0,attribtes_VALUE.length()-2));
                            String k = String.valueOf(m*100/730);
                            css_output.append("height: "+ k + "%;\n");
                        }
                    }
                    if (j==attSize-1){
                        if(background_flag==0){
                            css_output.append("--background: transparent"+";\n");

                        }

                        if(text.length()==0 && f==0){

                            css_output.append("left: "+ 87.32*bias + "%;\n");

                        }
                        else if (text.length()>0 && f==0){
                            left=(100-((52+text.length()*10)*100/410))*bias;
                            System.out.println((52+text.length()*10)+ "////////");
                            String k = String.valueOf(left);

                            css_output.append("left: "+ k + "%;\n");

                        }

                        css_output.append("position: fixed;\n");
                        css_output.append("\n}\n");
                    }

                }
                output.append("> ");
                output.append("\n</ion-input>");
                output.append("\n</ion-item>\n\n");


            }

            ///////////////////44444444444444

            else if (methodName.equals("CheckBox")) {
                output.append("\n<ion-item");
                int background_flag =0;
                String text ="";
                double width = 1 ;
                double bias = 0.2;
                int f=0;
                double left = 1 ;
                for(int j=0 ; j<attSize ; j++) {
                    String attribtes_NAME = ctx.element(i).attribute(j).Name().getText();
                    String attribtes_VALUE = ctx.element(i).attribute(j).STRING().getText();
                    attribtes_VALUE = attribtes_VALUE.substring(1, attribtes_VALUE.length() - 1);
                    //System.out.println(attribtes_NAME);
                    //System.out.println(attribtes_VALUE + "9999999999999");

                    if (attribtes_NAME.equals("android:id")) {

                        output.append(" class=\"" + attribtes_VALUE.substring(5) + "\">");
                        css_output.append("."+attribtes_VALUE.substring(5)+" {\n");

                    }

                    if (attribtes_NAME.equals("android:text")) {

                        output.append("\n<ion-label>" + attribtes_VALUE + "</ion-label>");
                    }

                    //STYLING AREA

                    if (attribtes_NAME.equals("android:textColor")) {


                        css_output.append("color: " +attribtes_VALUE+ ";\n");
                    }


                    if (attribtes_NAME.equals("app:layout_constraintVertical_bias")) {

                        System.out.println(attribtes_VALUE);
                        float m = Float.parseFloat(attribtes_VALUE);
                        String k = String.valueOf(m*100);
                        css_output.append("top: "+ k + "%;\n");
                    }
                    if (attribtes_NAME.equals("app:layout_constraintHorizontal_bias")) {

                        bias = Float.parseFloat(attribtes_VALUE);
                        left=(100-width)*bias;
                        String k = String.valueOf(left);
                        css_output.append("left: "+ k + "%;\n");
                    }
                    if (attribtes_NAME.equals("android:background")) {
                        background_flag =1;

                        if((attribtes_VALUE.substring(0,1)).equals("#")){
                            css_output.append("--background: "+attribtes_VALUE+ ";\n");
                        }
                        else {
                            System.out.println(attribtes_VALUE.substring(0,1));
                            css_output.append("--background: "+attribtes_VALUE.split("/")[1]+ ";\n");
                        }
                    }

                    if (attribtes_NAME.equals("android:layout_width")) {

                        if((attribtes_VALUE.substring(0,1)).equals("w")){
                            width=52+10*150;
                        }

                        else if((attribtes_VALUE.substring(0,1)).equals("m")){
                            css_output.append("width: 97%;\n");
                            width=97;
                        }
                        else {
                            f=1;
                            System.out.println(attribtes_VALUE.substring(0,attribtes_VALUE.length()-2));
                            width = Float.parseFloat(attribtes_VALUE.substring(0,attribtes_VALUE.length()-2));
                            String k = String.valueOf(width*100/410);
                            css_output.append("width: "+ k + "%;\n");
                            width=width*100/410;
                        }
                    }

                    if (attribtes_NAME.equals("android:layout_height")) {

                        if((attribtes_VALUE.substring(0,1)).equals("w")){
                        }

                        else if((attribtes_VALUE.substring(0,1)).equals("m")){
                            css_output.append("height: 97%;\n");
                        }
                        else {

                            System.out.println(attribtes_VALUE.substring(0,attribtes_VALUE.length()-2));
                            float m = Float.parseFloat(attribtes_VALUE.substring(0,attribtes_VALUE.length()-2));
                            String k = String.valueOf(m*100/730);
                            css_output.append("height: "+ k + "%;\n");
                        }
                    }



                    if (j==attSize-1){
                        if(background_flag==0){
                            css_output.append("--background: transparent"+";\n");

                        }
                        if(text.length()==0 && f==0){

                            css_output.append("left: "+ 87.32*bias + "%;\n");


                        }
                        else if (text.length()>0 && f==0){
                            left=(100-((52+text.length()*10)*100/410))*bias;
                            System.out.println((52+text.length()*10)+ "////////");
                            String k = String.valueOf(left);

                            css_output.append("left: "+ k + "%;\n");

                        }
                        css_output.append("position: fixed;\n");
                        css_output.append("\n}\n");



                    }

                }
                output.append("\n<ion-checkbox slot=\"start\">");
                output.append("</ion-checkbox>");
                output.append("\n</ion-item>\n\n");


            }

            ///////////////////55555555555555

            else if (methodName.equals("ImageView")) {
                output.append("\n\n<ion-img ");
                int n=0;
                int background_flag =0;
                String text ="";
                double width = 1 ;
                double bias = 0.2;
                int f=0;
                double left = 1 ;

                for(int j=0 ; j<attSize ; j++) {
                    String attribtes_NAME = ctx.element(i).attribute(j).Name().getText();
                    String attribtes_VALUE = ctx.element(i).attribute(j).STRING().getText();
                    attribtes_VALUE = attribtes_VALUE.substring(1, attribtes_VALUE.length() - 1);
                    //System.out.println(attribtes_NAME);
                    //System.out.println(attribtes_VALUE + "9999999999999");

                    if (attribtes_NAME.equals("android:id")) {

                        output.append(" class=\"" + attribtes_VALUE.substring(5) + "\" ");
                        css_output.append("."+attribtes_VALUE.substring(5)+" {\n");

                    }

                    if (attribtes_NAME.equals("android:layout_width")) {

                        if((attribtes_VALUE.substring(0,1)).equals("w")){
                            width=52+10*150;
                        }

                        else if((attribtes_VALUE.substring(0,1)).equals("m")){
                            css_output.append("width: 97%;\n");
                            width=97;
                        }
                        else {
                            f=1;
                            System.out.println(attribtes_VALUE.substring(0,attribtes_VALUE.length()-2));
                            width = Float.parseFloat(attribtes_VALUE.substring(0,attribtes_VALUE.length()-2));
                            String k = String.valueOf(width*100/410);
                            css_output.append("width: "+ k + "%;\n");
                            width=width*100/410;
                        }
                    }

                    if (attribtes_NAME.equals("android:layout_height")) {

                        if((attribtes_VALUE.substring(0,1)).equals("w")){
                        }

                        else if((attribtes_VALUE.substring(0,1)).equals("m") ) {
                            css_output.append("height: 97%;\n");
                        }
                        else if((attribtes_VALUE.substring(0,1)).equals("f") ) {
                            css_output.append("height: 97%;\n");
                        }
                        else {

                            System.out.println(attribtes_VALUE.substring(0,attribtes_VALUE.length()-2));
                            float m = Float.parseFloat(attribtes_VALUE.substring(0,attribtes_VALUE.length()-2));
                            String k = String.valueOf(m*100/730);
                            css_output.append("height: "+ k + "%;\n");
                        }
                    }

                    if (attribtes_NAME.equals("app:srcCompat")) {
                        if (n==1) {
                            output.append("\" ");
                        }
                        output.append("src=\""+attribtes_VALUE+"\"");
                        output.append("> "+" </ion-img>"+"\n\n");
                    }



                    //STYLING AREA
                    if (attribtes_NAME.equals("android:textColor")) {


                        css_output.append("color: " +attribtes_VALUE+ ";\n");
                    }

                    if (attribtes_NAME.equals("app:layout_constraintVertical_bias")) {

                        System.out.println(attribtes_VALUE);
                        float m = Float.parseFloat(attribtes_VALUE);
                        String k = String.valueOf(m*100);
                        css_output.append("top: "+ k + "%;\n");
                    }
                    if (attribtes_NAME.equals("app:layout_constraintHorizontal_bias")) {
                        bias = Float.parseFloat(attribtes_VALUE);
                        left=(100-width)*bias;
                        String k = String.valueOf(left);
                        css_output.append("left: "+ k + "%;\n");
                    }
                    if (attribtes_NAME.equals("app:backgroundTint")) {
                        background_flag =1;

                        if((attribtes_VALUE.substring(0,1)).equals("#")){
                            css_output.append("--background: "+attribtes_VALUE+ ";\n");
                        }
                        else {
                            System.out.println(attribtes_VALUE.substring(0,1));
                            css_output.append("--background: "+attribtes_VALUE.split("/")[1]+ ";\n");
                        }
                    }




                    if (j==attSize-1){

                        if(background_flag==0){
                            css_output.append("--background: transparent"+";\n");

                        }

                        if(text.length()==0 && f==0){

                            css_output.append("left: "+ 87.32*bias + "%;\n");

                        }
                        else if (text.length()>0 && f==0){
                            left=(100-((52+text.length()*10)*100/410))*bias;
                            System.out.println((52+text.length()*10)+ "////////");
                            String k = String.valueOf(left);

                            css_output.append("left: "+ k + "%;\n");

                        }

                        css_output.append("position: fixed;\n");
                        css_output.append("\n}\n");




                    }}}
            //////////////////66666666666666

            else if (methodName.equals("ListView")) {
                int background_flag =0;
                String text ="";
                double width = 1 ;
                double bias = 0.2;
                int f=0;
                double left = 1 ;
                output.append("<ion-list");
                int n=0;
                for(int j=0 ; j<attSize ; j++) {
                    String attribtes_NAME = ctx.element(i).attribute(j).Name().getText();
                    String attribtes_VALUE = ctx.element(i).attribute(j).STRING().getText();
                    attribtes_VALUE = attribtes_VALUE.substring(1, attribtes_VALUE.length() - 1);
                    //System.out.println(attribtes_NAME);
                    //System.out.println(attribtes_VALUE + "9999999999999");
                    if (attribtes_NAME.equals("android:background")) {
                        if (n==0) {
                          //  output.append("style=\"");
                            n=1;
                        }
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
                    if (attribtes_NAME.equals("android:id")) {

                        output.append(" class=\"" + attribtes_VALUE.substring(5) + "\"+> \n");
                        css_output.append("." + attribtes_VALUE.substring(5) + " {\n");
                    }

                        if (attribtes_NAME.equals("android:entries")) {

                       // System.out.println(xmlString.indexOf(attribtes_VALUE.substring(7))+"hshshshsshhsshhshshshshshshshshshs");
                        String xmlString2 = xmlString.substring(xmlString.indexOf(attribtes_VALUE.substring(7))+attribtes_VALUE.substring(7).length()+2);
                        System.out.println(xmlString.indexOf("</string-array>"));
//                        System.out.println(xmlString2+"iiiiiiiiiiiiiiiiiiiiiiiiiiiiiii");
                        xmlString2 =xmlString2.substring(0, xmlString2.indexOf("</string-array>"));
                        System.out.println(xmlString2);

                        String str = xmlString2;
                        String findStr = "<item>";
                        int lastIndex = 0;
                        int count = 0;

                        while(lastIndex != -1){

                            lastIndex = str.indexOf(findStr,lastIndex);

                            if(lastIndex != -1){
                                count ++;
                                lastIndex += findStr.length();
                            }
                        }
                        System.out.println(count+"hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh");
                        for(int k=0 ; k< count ; k++) {
                            output.append("<ion-item lines=\"none\">\n");
                            output.append("\n<ion-label>"+xmlString2.substring(xmlString2.indexOf("<item>")+6,xmlString2.indexOf("</item>"))+"</ion-label>\n");
                            output.append("</ion-item>\n");

                            xmlString2=xmlString2.substring(xmlString2.indexOf("</item>")+7);


                        }

                }


                    //STYLING AREA
                    if (attribtes_NAME.equals("android:textColor")) {


                        css_output.append("color: " +attribtes_VALUE+ ";\n");
                    }

                    if (attribtes_NAME.equals("app:layout_constraintVertical_bias")) {

                        System.out.println(attribtes_VALUE);
                        float m = Float.parseFloat(attribtes_VALUE);
                        String k = String.valueOf(m*100);
                        css_output.append("top: "+ k + "%;\n");
                    }
                    if (attribtes_NAME.equals("app:layout_constraintHorizontal_bias")) {
                        bias = Float.parseFloat(attribtes_VALUE);
                        left=(100-width)*bias;
                        String k = String.valueOf(left);
                        css_output.append("left: "+ k + "%;\n");
                    }
                    if (attribtes_NAME.equals("app:backgroundTint")) {
                        background_flag =1;

                        if((attribtes_VALUE.substring(0,1)).equals("#")){
                            css_output.append("--background: "+attribtes_VALUE+ ";\n");
                        }
                        else {
                            System.out.println(attribtes_VALUE.substring(0,1));
                            css_output.append("--background: "+attribtes_VALUE.split("/")[1]+ ";\n");
                        }
                    }

                    if (attribtes_NAME.equals("android:layout_width")) {

                        if((attribtes_VALUE.substring(0,1)).equals("w")){
                            width=52+10*150;
                        }

                        else if((attribtes_VALUE.substring(0,1)).equals("m")){
                            css_output.append("width: 97%;\n");
                            width=97;
                        }
                        else {
                            f=1;
                            System.out.println(attribtes_VALUE.substring(0,attribtes_VALUE.length()-2));
                            width = Float.parseFloat(attribtes_VALUE.substring(0,attribtes_VALUE.length()-2));
                            String k = String.valueOf(width*100/410);
                            css_output.append("width: "+ k + "%;\n");
                            width=width*100/410;
                        }
                    }

                    if (attribtes_NAME.equals("android:layout_height")) {

                        if((attribtes_VALUE.substring(0,1)).equals("w")){
                        }

                        else if((attribtes_VALUE.substring(0,1)).equals("m") ) {
                            css_output.append("height: 97%;\n");
                        }
                        else if((attribtes_VALUE.substring(0,1)).equals("f") ) {
                            css_output.append("height: 97%;\n");
                        }
                        else {

                            System.out.println(attribtes_VALUE.substring(0,attribtes_VALUE.length()-2));
                            float m = Float.parseFloat(attribtes_VALUE.substring(0,attribtes_VALUE.length()-2));
                            String k = String.valueOf(m*100/730);
                            css_output.append("height: "+ k + "%;\n");
                        }
                    }


                    if (j==attSize-1){

                        if(background_flag==0){
                            css_output.append("--background: transparent"+";\n");

                        }

                        if(text.length()==0 && f==0){

                            css_output.append("left: "+ 87.32*bias + "%;\n");

                        }
                        else if (text.length()>0 && f==0){
                            left=(100-((52+text.length()*10)*100/410))*bias;
                            System.out.println((52+text.length()*10)+ "////////");
                            String k = String.valueOf(left);

                            css_output.append("left: "+ k + "%;\n");

                        }

                        css_output.append("position: fixed;\n");
                        css_output.append("\n}\n");

                    }
            }
                output.append("\n</ion-list> \n");
            }
            //////////////////7777777777777

            else if (methodName.equals("Spinner")) {

                output.append("\n<ion-select ");
                int background_flag =0;
                String text ="";
                double width = 1 ;
                double bias = 0.2;
                int f=0;
                double left = 1 ;
                int n=0;

                for(int j=0 ; j<attSize ; j++) {
                    String attribtes_NAME = ctx.element(i).attribute(j).Name().getText();
                    String attribtes_VALUE = ctx.element(i).attribute(j).STRING().getText();
                    attribtes_VALUE = attribtes_VALUE.substring(1, attribtes_VALUE.length() - 1);
                    //System.out.println(attribtes_NAME);
                    //System.out.println(attribtes_VALUE + "9999999999999");
                    if (attribtes_NAME.equals("android:background")) {
                        if (n==0) {
                          //  output.append("style=\"");
                            n=1;
                        }
                    }

                    if (n==1){
                     //   output.append("\" >"+"\n");
                        n=2;
                    }
                    else if(n==0 &&j==attSize-1 ){

                        output.append(">"+"\n");
                    }


                    if (attribtes_NAME.equals("tools:listheader")) {



                        output.append("\n<ion-list-header >" + attribtes_VALUE + "</ion-list-header>");
                    }
                    if (attribtes_NAME.equals("android:id")) {

                        output.append(" class=\"" + attribtes_VALUE.substring(5) + "\"> \n");
                        css_output.append("." + attribtes_VALUE.substring(5) + " {\n");
                    }

                    if (attribtes_NAME.equals("android:entries")) {

                        // System.out.println(xmlString.indexOf(attribtes_VALUE.substring(7))+"hshshshsshhsshhshshshshshshshshshs");
                        String xmlString2 = xmlString.substring(xmlString.indexOf(attribtes_VALUE.substring(7))+attribtes_VALUE.substring(7).length()+2);
                        System.out.println(xmlString.indexOf("</string-array>"));
//                        System.out.println(xmlString2+"iiiiiiiiiiiiiiiiiiiiiiiiiiiiiii");
                        xmlString2 =xmlString2.substring(0, xmlString2.indexOf("</string-array>"));
                        System.out.println(xmlString2);

                        String str = xmlString2;
                        String findStr = "<item>";
                        int lastIndex = 0;
                        int count = 0;

                        while(lastIndex != -1){

                            lastIndex = str.indexOf(findStr,lastIndex);

                            if(lastIndex != -1){
                                count ++;
                                lastIndex += findStr.length();
                            }
                        }
                        System.out.println(count+"hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh");
                        for(int k=0 ; k< count ; k++) {
                            output.append("\n<ion-select-option>"+xmlString2.substring(xmlString2.indexOf("<item>")+6,xmlString2.indexOf("</item>"))+"</ion-select-option>\n");

                            xmlString2=xmlString2.substring(xmlString2.indexOf("</item>")+7);


                        }

                    }


                    //STYLING AREA
                    if (attribtes_NAME.equals("android:textColor")) {


                        css_output.append("color: " +attribtes_VALUE+ ";\n");
                    }

                    if (attribtes_NAME.equals("app:layout_constraintVertical_bias")) {

                        System.out.println(attribtes_VALUE);
                        float m = Float.parseFloat(attribtes_VALUE);
                        String k = String.valueOf(m*100);
                        css_output.append("top: "+ k + "%;\n");
                    }
                    if (attribtes_NAME.equals("app:layout_constraintHorizontal_bias")) {
                        bias = Float.parseFloat(attribtes_VALUE);
                        left=(100-width)*bias;
                        String k = String.valueOf(left);
                        css_output.append("left: "+ k + "%;\n");
                    }
                    if (attribtes_NAME.equals("app:backgroundTint")) {
                        background_flag =1;

                        if((attribtes_VALUE.substring(0,1)).equals("#")){
                            css_output.append("--background: "+attribtes_VALUE+ ";\n");
                        }
                        else {
                            System.out.println(attribtes_VALUE.substring(0,1));
                            css_output.append("--background: "+attribtes_VALUE.split("/")[1]+ ";\n");
                        }
                    }

                    if (attribtes_NAME.equals("android:layout_width")) {

                        if((attribtes_VALUE.substring(0,1)).equals("w")){
                            width=52+10*150;
                        }

                        else if((attribtes_VALUE.substring(0,1)).equals("m")){
                            css_output.append("width: 97%;\n");
                            width=97;
                        }
                        else {
                            f=1;
                            System.out.println(attribtes_VALUE.substring(0,attribtes_VALUE.length()-2));
                            width = Float.parseFloat(attribtes_VALUE.substring(0,attribtes_VALUE.length()-2));
                            String k = String.valueOf(width*100/410);
                            css_output.append("width: "+ k + "%;\n");
                            width=width*100/410;
                        }
                    }

                    if (attribtes_NAME.equals("android:layout_height")) {

                        if((attribtes_VALUE.substring(0,1)).equals("w")){
                        }

                        else if((attribtes_VALUE.substring(0,1)).equals("m") ) {
                            css_output.append("height: 97%;\n");
                        }
                        else if((attribtes_VALUE.substring(0,1)).equals("f") ) {
                            css_output.append("height: 97%;\n");
                        }
                        else {

                            System.out.println(attribtes_VALUE.substring(0,attribtes_VALUE.length()-2));
                            float m = Float.parseFloat(attribtes_VALUE.substring(0,attribtes_VALUE.length()-2));
                            String k = String.valueOf(m*100/730);
                            css_output.append("height: "+ k + "%;\n");
                        }
                    }


                    if (j==attSize-1){

                        if(background_flag==0){
                            css_output.append("--background: transparent"+";\n");

                        }

                        if(text.length()==0 && f==0){

                            css_output.append("left: "+ 87.32*bias + "%;\n");

                        }
                        else if (text.length()>0 && f==0){
                            left=(100-((52+text.length()*10)*100/410))*bias;
                            System.out.println((52+text.length()*10)+ "////////");
                            String k = String.valueOf(left);

                            css_output.append("left: "+ k + "%;\n");

                        }

                        css_output.append("position: fixed;\n");
                        css_output.append("\n}\n");

                    }
                }

                output.append("</ion-select>");
            }

            ///////////////////88888888888

            else if (methodName.equals("RadioButton")) {
                output.append("\n<ion-item");
                int background_flag =0;
                String text ="";
                double width = 1 ;
                double bias = 0.2;
                int f=0;
                double left = 1 ;
                for(int j=0 ; j<attSize ; j++) {
                    String attribtes_NAME = ctx.element(i).attribute(j).Name().getText();
                    String attribtes_VALUE = ctx.element(i).attribute(j).STRING().getText();
                    attribtes_VALUE = attribtes_VALUE.substring(1, attribtes_VALUE.length() - 1);
                    //System.out.println(attribtes_NAME);
                    //System.out.println(attribtes_VALUE + "9999999999999");

                    if (attribtes_NAME.equals("android:id")) {

                        output.append(" class=\"" + attribtes_VALUE.substring(5) + "\">");
                        css_output.append("."+attribtes_VALUE.substring(5)+" {\n");

                    }

                    if (attribtes_NAME.equals("android:text")) {

                        output.append("\n<ion-label>" + attribtes_VALUE + "</ion-label>");
                        output.append("\n<ion-radio slot=\"start\" value=\""+attribtes_VALUE.toLowerCase()+ "\">");

                    }

                    //STYLING AREA

                    if (attribtes_NAME.equals("android:textColor")) {


                        css_output.append("color: " +attribtes_VALUE+ ";\n");
                    }


                    if (attribtes_NAME.equals("app:layout_constraintVertical_bias")) {

                        System.out.println(attribtes_VALUE);
                        float m = Float.parseFloat(attribtes_VALUE);
                        String k = String.valueOf(m*100);
                        css_output.append("top: "+ k + "%;\n");
                    }
                    if (attribtes_NAME.equals("app:layout_constraintHorizontal_bias")) {

                        bias = Float.parseFloat(attribtes_VALUE);
                        left=(100-width)*bias;
                        String k = String.valueOf(left);
                        css_output.append("left: "+ k + "%;\n");
                    }
                    if (attribtes_NAME.equals("android:background")) {
                        background_flag =1;

                        if((attribtes_VALUE.substring(0,1)).equals("#")){
                            css_output.append("--background: "+attribtes_VALUE+ ";\n");
                        }
                        else {
                            System.out.println(attribtes_VALUE.substring(0,1));
                            css_output.append("--background: "+attribtes_VALUE.split("/")[1]+ ";\n");
                        }
                    }

                    if (attribtes_NAME.equals("android:layout_width")) {

                        if((attribtes_VALUE.substring(0,1)).equals("w")){
                            width=52+10*150;
                        }

                        else if((attribtes_VALUE.substring(0,1)).equals("m")){
                            css_output.append("width: 97%;\n");
                            width=97;
                        }
                        else {
                            f=1;
                            System.out.println(attribtes_VALUE.substring(0,attribtes_VALUE.length()-2));
                            width = Float.parseFloat(attribtes_VALUE.substring(0,attribtes_VALUE.length()-2));
                            String k = String.valueOf(width*100/410);
                            css_output.append("width: "+ k + "%;\n");
                            width=width*100/410;
                        }
                    }

                    if (attribtes_NAME.equals("android:layout_height")) {

                        if((attribtes_VALUE.substring(0,1)).equals("w")){
                        }

                        else if((attribtes_VALUE.substring(0,1)).equals("m")){
                            css_output.append("height: 97%;\n");
                        }
                        else {

                            System.out.println(attribtes_VALUE.substring(0,attribtes_VALUE.length()-2));
                            float m = Float.parseFloat(attribtes_VALUE.substring(0,attribtes_VALUE.length()-2));
                            String k = String.valueOf(m*100/730);
                            css_output.append("height: "+ k + "%;\n");
                        }
                    }



                    if (j==attSize-1){
                        if(background_flag==0){
                            css_output.append("--background: transparent"+";\n");

                        }
                        if(text.length()==0 && f==0){

                            css_output.append("left: "+ 87.32*bias + "%;\n");


                        }
                        else if (text.length()>0 && f==0){
                            left=(100-((52+text.length()*10)*100/410))*bias;
                            System.out.println((52+text.length()*10)+ "////////");
                            String k = String.valueOf(left);

                            css_output.append("left: "+ k + "%;\n");

                        }
                        css_output.append("position: fixed;\n");
                        css_output.append("\n}\n");



                    }

                }
                output.append("</ion-radio>");
                output.append("\n</ion-item>\n\n");


            }


         ///////////////////99999999999999999999
            else if (methodName.equals("Switch")) {
                output.append("\n<ion-item");
                int background_flag =0;
                String text ="";
                double width = 1 ;
                double bias = 0.2;
                int f=0;
                double left = 1 ;
                for(int j=0 ; j<attSize ; j++) {
                    String attribtes_NAME = ctx.element(i).attribute(j).Name().getText();
                    String attribtes_VALUE = ctx.element(i).attribute(j).STRING().getText();
                    attribtes_VALUE = attribtes_VALUE.substring(1, attribtes_VALUE.length() - 1);
                    //System.out.println(attribtes_NAME);
                    //System.out.println(attribtes_VALUE + "9999999999999");

                    if (attribtes_NAME.equals("android:id")) {

                        output.append(" class=\"" + attribtes_VALUE.substring(5) + "\">");
                        css_output.append("."+attribtes_VALUE.substring(5)+" {\n");

                    }

                    if (attribtes_NAME.equals("android:text")) {

                        output.append("\n<ion-label>" + attribtes_VALUE + "</ion-label>");
                        output.append("\n<ion-toggle slot=\"start\" value=\""+attribtes_VALUE.toLowerCase()+ "\">");

                    }

                    //STYLING AREA

                    if (attribtes_NAME.equals("android:textColor")) {


                        css_output.append("color: " +attribtes_VALUE+ ";\n");
                    }


                    if (attribtes_NAME.equals("app:layout_constraintVertical_bias")) {

                        System.out.println(attribtes_VALUE);
                        float m = Float.parseFloat(attribtes_VALUE);
                        String k = String.valueOf(m*100);
                        css_output.append("top: "+ k + "%;\n");
                    }
                    if (attribtes_NAME.equals("app:layout_constraintHorizontal_bias")) {

                        bias = Float.parseFloat(attribtes_VALUE);
                        left=(100-width)*bias;
                        String k = String.valueOf(left);
                        css_output.append("left: "+ k + "%;\n");
                    }
                    if (attribtes_NAME.equals("android:background")) {
                        background_flag =1;

                        if((attribtes_VALUE.substring(0,1)).equals("#")){
                            css_output.append("--background: "+attribtes_VALUE+ ";\n");
                        }
                        else {
                            System.out.println(attribtes_VALUE.substring(0,1));
                            css_output.append("--background: "+attribtes_VALUE.split("/")[1]+ ";\n");
                        }
                    }

                    if (attribtes_NAME.equals("android:layout_width")) {

                        if((attribtes_VALUE.substring(0,1)).equals("w")){
                            width=52+10*150;
                        }

                        else if((attribtes_VALUE.substring(0,1)).equals("m")){
                            css_output.append("width: 97%;\n");
                            width=97;
                        }
                        else {
                            f=1;
                            System.out.println(attribtes_VALUE.substring(0,attribtes_VALUE.length()-2));
                            width = Float.parseFloat(attribtes_VALUE.substring(0,attribtes_VALUE.length()-2));
                            String k = String.valueOf(width*100/410);
                            css_output.append("width: "+ k + "%;\n");
                            width=width*100/410;
                        }
                    }

                    if (attribtes_NAME.equals("android:layout_height")) {

                        if((attribtes_VALUE.substring(0,1)).equals("w")){
                        }

                        else if((attribtes_VALUE.substring(0,1)).equals("m")){
                            css_output.append("height: 97%;\n");
                        }
                        else {

                            System.out.println(attribtes_VALUE.substring(0,attribtes_VALUE.length()-2));
                            float m = Float.parseFloat(attribtes_VALUE.substring(0,attribtes_VALUE.length()-2));
                            String k = String.valueOf(m*100/730);
                            css_output.append("height: "+ k + "%;\n");
                        }
                    }



                    if (j==attSize-1){
                        if(background_flag==0){
                            css_output.append("--background: transparent"+";\n");

                        }
                        if(text.length()==0 && f==0){

                            css_output.append("left: "+ 87.32*bias + "%;\n");


                        }
                        else if (text.length()>0 && f==0){
                            left=(100-((52+text.length()*10)*100/410))*bias;
                            System.out.println((52+text.length()*10)+ "////////");
                            String k = String.valueOf(left);

                            css_output.append("left: "+ k + "%;\n");

                        }
                        css_output.append("position: fixed;\n");
                        css_output.append("\n}\n");



                    }

                }
                output.append("</ion-toggle>");
                output.append("\n</ion-item>\n\n");


            }

            ///////////////////10101010101010101010101010101010
            else if (methodName.equals("SeekBar")) {
                output.append("\n<ion-item");
                int background_flag =0;
                String text ="";
                double width = 1 ;
                double bias = 0.2;
                int f=0;
                double left = 1 ;
                for(int j=0 ; j<attSize ; j++) {
                    String attribtes_NAME = ctx.element(i).attribute(j).Name().getText();
                    String attribtes_VALUE = ctx.element(i).attribute(j).STRING().getText();
                    attribtes_VALUE = attribtes_VALUE.substring(1, attribtes_VALUE.length() - 1);
                    //System.out.println(attribtes_NAME);
                    //System.out.println(attribtes_VALUE + "9999999999999");


                    if (attribtes_NAME.equals("android:id")) {

                        output.append(" class=\"" + attribtes_VALUE.substring(5) + "\">");
                        output.append("\n<ion-range min=\"0\"");
                        css_output.append("."+attribtes_VALUE.substring(5)+" {\n");

                    }

                    if (attribtes_NAME.equals("android:max")) {

                        output.append(" max=\""+attribtes_VALUE+"\"");

                    }
                    if (attribtes_NAME.equals("android:stepSize")) {

                        output.append(" step=\""+attribtes_VALUE+"\"");

                    }

                    //STYLING AREA

                    if (attribtes_NAME.equals("android:textColor")) {


                        css_output.append("color: " +attribtes_VALUE+ ";\n");
                    }


                    if (attribtes_NAME.equals("app:layout_constraintVertical_bias")) {

                        System.out.println(attribtes_VALUE);
                        float m = Float.parseFloat(attribtes_VALUE);
                        String k = String.valueOf(m*100);
                        css_output.append("top: "+ k + "%;\n");
                    }
                    if (attribtes_NAME.equals("app:layout_constraintHorizontal_bias")) {

                        bias = Float.parseFloat(attribtes_VALUE);
                        left=(100-width)*bias;
                        String k = String.valueOf(left);
                        css_output.append("left: "+ k + "%;\n");
                    }
                    if (attribtes_NAME.equals("android:background")) {
                        background_flag =1;

                        if((attribtes_VALUE.substring(0,1)).equals("#")){
                            css_output.append("--background: "+attribtes_VALUE+ ";\n");
                        }
                        else {
                            System.out.println(attribtes_VALUE.substring(0,1));
                            css_output.append("--background: "+attribtes_VALUE.split("/")[1]+ ";\n");
                        }
                    }

                    if (attribtes_NAME.equals("android:layout_width")) {

                        if((attribtes_VALUE.substring(0,1)).equals("w")){
                            width=52+10*150;
                        }

                        else if((attribtes_VALUE.substring(0,1)).equals("m")){
                            css_output.append("width: 97%;\n");
                            width=97;
                        }
                        else {
                            f=1;
                            System.out.println(attribtes_VALUE.substring(0,attribtes_VALUE.length()-2));
                            width = Float.parseFloat(attribtes_VALUE.substring(0,attribtes_VALUE.length()-2));
                            String k = String.valueOf(width*100/410);
                            css_output.append("width: "+ k + "%;\n");
                            width=width*100/410;
                        }
                    }

                    if (attribtes_NAME.equals("android:layout_height")) {

                        if((attribtes_VALUE.substring(0,1)).equals("w")){
                        }

                        else if((attribtes_VALUE.substring(0,1)).equals("m")){
                            css_output.append("height: 97%;\n");
                        }
                        else {

                            System.out.println(attribtes_VALUE.substring(0,attribtes_VALUE.length()-2));
                            float m = Float.parseFloat(attribtes_VALUE.substring(0,attribtes_VALUE.length()-2));
                            String k = String.valueOf(m*100/730);
                            css_output.append("height: "+ k + "%;\n");
                        }
                    }



                    if (j==attSize-1){
                        if(background_flag==0){
                            css_output.append("--background: transparent"+";\n");

                        }
                        if(text.length()==0 && f==0){

                            css_output.append("left: "+ 87.32*bias + "%;\n");


                        }
                        else if (text.length()>0 && f==0){
                            left=(100-((52+text.length()*10)*100/410))*bias;
                            System.out.println((52+text.length()*10)+ "////////");
                            String k = String.valueOf(left);

                            css_output.append("left: "+ k + "%;\n");

                        }
                        css_output.append("position: fixed;\n");
                        css_output.append("\n}\n");



                    }

                }
                output.append(">");
                output.append("</ion-range>");
                output.append("\n</ion-item>\n\n");


            }



        }
        if (output.toString().contains("</ion-content>")){

        }
        else {
            output.append("\n\n</ion-content>\n\n\n");
        }
        try {
            FileWriter outputFile;
            outputFile = new FileWriter(file.getName()+".html");
            outputFile.write(output.toString());
            outputFile.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        try {
            FileWriter outputFile2;
            outputFile2 = new FileWriter(file.getName()+".scss");
            outputFile2.write(css_output.toString());
            outputFile2.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    @Override
    public void enterElement(XMLParser.ElementContext ctx) {
    }
}