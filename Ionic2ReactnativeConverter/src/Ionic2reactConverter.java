import java.io.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;


public class Ionic2reactConverter extends HTMLParserBaseListener{
    Map closingTagElemnts;
    Map notClosingTagElemnts;
    Map attribute;


    Ionic2reactConverter() throws IOException {

        attribute =new HashMap<String,String>();
        attribute.put("class","style");
        attribute.put("id","style");
        attribute.put("color","color");
        attribute.put("size","size");
        attribute.put("click","onPress");
        attribute.put("disabled","disabled");
        attribute.put("ionChange","onChangeText");
        attribute.put("placeholder","placeholder");
        attribute.put("max","maximumValue");
        attribute.put("min","minimumValue");
        attribute.put("placeholder","placeholder");
        attribute.put("click","onPress");
        attribute.put("name","name");

        closingTagElemnts =new HashMap<String,String>();
        closingTagElemnts.put("ion-text","Text");
        closingTagElemnts.put("ion-list-header","h2");
        closingTagElemnts.put("ion-content","View");
        closingTagElemnts.put("h1","h1");
        closingTagElemnts.put("h2","h2");
        closingTagElemnts.put("h3","h3");
        closingTagElemnts.put("h4","h4");
        closingTagElemnts.put("h5","h5");
        closingTagElemnts.put("h6","h6");
        closingTagElemnts.put("ion-header","View");
        closingTagElemnts.put("ion-footer","View");
        closingTagElemnts.put("ion-toolbar","View");
        closingTagElemnts.put("ion-range","slider");
        closingTagElemnts.put("ion-label","Text");
        closingTagElemnts.put("div","View");
        closingTagElemnts.put("ion-item","View");
        closingTagElemnts.put("p","Text");
        closingTagElemnts.put("ion-title","Text");


        notClosingTagElemnts = new HashMap<String,String>();
        notClosingTagElemnts.put("ion-img","Image");
        notClosingTagElemnts.put("ion-list","Flatlist");
        notClosingTagElemnts.put("ion-button","Button");
        notClosingTagElemnts.put("ion-icon","Icon");
        notClosingTagElemnts.put("ion-input","Input");


        /*  Creating ionic2react.js translated file */
        File file = new File("ionic2react.js");
        try {
            if (file.createNewFile()) {
                System.out.println("New file is created " + file.getName());
                FileWriter outputfile = new FileWriter("ionic2react.js");
                outputfile.close();
            } else {
                System.out.println("File already exists.");
            }
        } catch (Exception e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }

    public boolean isInteger( String input ) {
        try {
            Integer.parseInt( input );
            return true;
        }
        catch( Exception e ) {
            return false;
        }
    }

    public static boolean isNullOrEmpty(String str) {
        if (str != null && !str.isEmpty())
            return false;
        return true;
    }

    public static boolean isStringOnlyAlphabet(String str) {
        return ((!str.equals(""))
                && (str != null)
                && (str.matches("^[a-zA-Z]*$")));
    }

    public short occurrenceNumber(char c , String attribute_value ){
        short counter=0;
        short i ;
        char someChar = ':';
        for ( i = 0; i < attribute_value.length(); i++) {
            if (attribute_value.charAt(i) == someChar) {
                counter++;
            }
        }
        return counter ;
    }

    public String handleProperty(String property){
        /* remove -- from property names*/
        property = property.replace("--","");
        if( property.indexOf("-",2) != -1) {
            short pos = (short) property.indexOf("-", 2);
            String before = property.substring(0, pos);
            String after = property.substring(pos + 1);
            after = after.substring(0, 1).toUpperCase(); // capitaliza first letter after (-)
            after = after.concat(property.substring(pos + 2));
            property = before + after;
            return property;
        }
        return  property;
    }

    @Override
    public void enterHtmlDocument(HTMLParser.HtmlDocumentContext ctx) {
        String initial_import = "import React from 'react'; \n"
                + "import {StyleSheet} from 'react-native' ;";

        try {
            FileWriter outputfile = new FileWriter("ionic2react.js");
            outputfile.write(initial_import+"\n"+"export default class App extends React.Component {\n" +
                    " render (){\n\t"+
                    " return (\n" +
                    " \t<View> \n ");
            outputfile.close();
        } catch (Exception e) {
            e.printStackTrace();        }

    }

    @Override
    public void exitHtmlDocument(HTMLParser.HtmlDocumentContext ctx) {
        try {
            FileWriter outputfile = new FileWriter("ionic2react.js", true);
            outputfile.write("\t</View>\n" +
                    "  );\n" +
                    "} \n"+
                    "}");
            outputfile.close();
        } catch (Exception e) {
            System.out.println("error exitHtmlDocumnet");
        }
        try {
            File file = new File("ionic2react.js");
            int count =0;
            /* count the number of lines in the file*/
            Scanner sc = new Scanner(file);
            while (sc.hasNextLine()){
                sc.nextLine();
                count++;
            }
            int lastline_index = count ;// number of lines inside the file
            System.out.println("Number of lines in the file are :"+lastline_index);
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }

    Boolean f=true;

    @Override
    public void enterHtmlElement(HTMLParser.HtmlElementContext ctx) {

        String opentag = ctx.TAG_OPEN().get(0).getText();
        String closetag = ctx.TAG_CLOSE().get(0).getText();

        /* ************getting ui_element Tag_name ********* */

        String oldElement = ctx.TAG_NAME().get(0).getText();
        String converted_ui_closing_tag = "";
        String converted_ui_noClosing_tag = "";

        String final_ui = "";
        converted_ui_closing_tag = (String) closingTagElemnts.get(oldElement);
        converted_ui_noClosing_tag = (String) notClosingTagElemnts.get(oldElement);

        if (converted_ui_closing_tag == null) final_ui = converted_ui_noClosing_tag;
        if (converted_ui_noClosing_tag == null) final_ui = converted_ui_closing_tag;

        if (oldElement.equals("ion-content")) {
            final_ui = "View style={styles.content}";
        }
        if (oldElement.equals("ion-header")) {
            final_ui = "View style={styles.header}";
        }
        if (oldElement.equals("ion-footer")) {
            final_ui = "View style={styles.footer}";
        } if (oldElement.equals("ion-toolbar")) {
            final_ui = "View style={styles.toolbar}";
        }

        String finalOutput = "";

        /* */
        if (converted_ui_closing_tag != null && converted_ui_noClosing_tag == null) {
            finalOutput = opentag + final_ui + " ";
            try {
                FileWriter outputfile = new FileWriter("ionic2react.js", true);
                outputfile.write(finalOutput);
                outputfile.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        boolean f=false;
        if (converted_ui_closing_tag == null && converted_ui_noClosing_tag != null) {
            f=true;
            finalOutput = opentag + final_ui + " ";
            try {
                FileWriter outputfile = new FileWriter("ionic2react.js", true);
                outputfile.write(finalOutput);
                outputfile.close();

            } catch (Exception e) {
                e.printStackTrace();
            }
            /* add the import statement for new react-native component if not exists */

        }

        /* */

        if (converted_ui_closing_tag == null && converted_ui_noClosing_tag == null) {
            try {
                FileWriter outputfile = new FileWriter("ionic2react.js", true);
                outputfile.write(opentag + oldElement + " ");
                outputfile.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        BufferedReader filescan;
        short count = 0;
        try {
            filescan = new BufferedReader(new FileReader("ionic2react.js"));
            String line = "";
            try {
                while ((line = filescan.readLine()) != null) {
                    count++;
                    if (line.contains("export")) {
                        System.out.print("count" + count);
                        filescan.close();
                        break;
                    }
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
            try {
                filescan = new BufferedReader(new FileReader("ionic2react.js"));
                int flag = 0;
                String ImportStmnt = "import {" + final_ui + "} from 'react-native'";
                for (int i = 0; i < count; i++) {
//                    System.out.println("Final_UI :"+final_ui);
//                    System.out.println(filescan.readLine());
//                    if (filescan.readLine() != null){
                        if (filescan.readLine().contains(final_ui)) {
                            System.out.println("Flag");
                            flag = 1;
                            break;
                        }
//                    }

                }
                System.out.println("Final_UI :"+final_ui);
                /*  flag = zero ==> adding the import statment*/

                if (flag ==0){
                    File mfile =new File("ionic2react.js");
                    FileReader file =new FileReader("ionic2react.js");
                    BufferedReader b = new BufferedReader(file);
                    String result = "";
                    String lin = "";
                    while( (lin = b.readLine()) != null){
                        result = result + lin+ "\n";
                    }
                    if (final_ui=="Icon"||final_ui=="Image"||final_ui=="Input"){
                        result = "import {" + final_ui + "} from 'react-native-elements' ;\n" + result;

                    }
                    else if (final_ui=="Button"||final_ui=="View"||final_ui=="Text"){
                        result = "import {" + final_ui + "} from 'react-native' ;\n" + result;
                    }

                    mfile.delete();
                    FileOutputStream fos = new FileOutputStream(mfile);
                    fos.write(result.getBytes());
                    fos.flush();
                }

            } catch (IOException e) {
                e.printStackTrace();
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

    }


    @Override
    public void exitHtmlElement(HTMLParser.HtmlElementContext ctx) {
        String opentag=ctx.TAG_OPEN().get(0).getText();
        String closetag=ctx.TAG_CLOSE().get(0).getText();

        //getting ui_element Tag_name
        String ion_ui_elemnt= ctx.TAG_NAME().get(0).getText() ;
        String converted_ui1 ="";
        String converted_ui2 ="";


        converted_ui1 = (String) closingTagElemnts.get(ion_ui_elemnt);
        converted_ui2 = (String) notClosingTagElemnts.get(ion_ui_elemnt);

        if (converted_ui1 != null && converted_ui2==null) {
            try {
                FileWriter outputfile = new FileWriter("ionic2react.js", true);
                outputfile.write(  opentag + "/" + converted_ui1 + " " + closetag + "\n");
                outputfile.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        if (converted_ui1 == null && converted_ui2 == null) {
            try {
                FileWriter outputfile = new FileWriter("ionic2react.js", true);
                outputfile.write(opentag + "/"+ion_ui_elemnt  + " "  + closetag + "\n");
                outputfile.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    @Override public void enterHtmlAttribute(HTMLParser.HtmlAttributeContext ctx) {

        String attributeName = "";
        String attributeValue = "";
        String newAttributeValue = "";
        String newAtrribute = "";
        Boolean flag_htmlattr = false;

        /* ********** check if there is attribute value and split it **************** */

        attributeName = ctx.TAG_NAME().getText();

        if (ctx.ATTVALUE_VALUE() != null) {
            attributeValue = ctx.ATTVALUE_VALUE().getText();
        }

        /* number of occurrences of (:) in attribute value = number of properties */

        short counter = occurrenceNumber(':', attributeValue);
        System.out.println("counter" + counter);

        /*  substring the attribute_values  */
        String property = "";
        String propertyValue = "";
        short len = (short) attributeValue.length();
        short pos2_initial = (short) attributeValue.indexOf(";", 0);
        short i = 1;


        /* **************  start attribute = style ****************** */

        if (attributeName.equals("style")) {
            System.out.println(counter);

            if (counter == 1) {
                System.out.println("1");
                short pos1 = (short) attributeValue.indexOf(":", i);
                property = attributeValue.substring(1, pos1);
                propertyValue = attributeValue.substring(pos1 + 1);
                propertyValue = propertyValue.replace(";", "");
                propertyValue = propertyValue.substring(0, propertyValue.length() - 1);
                property = handleProperty(property).trim();
                /* remove px */
                propertyValue=propertyValue.replace("px","");


                if (isInteger(propertyValue)){
                    propertyValue =  propertyValue ;
                }
                else {
                propertyValue = "'" + propertyValue + "'";
                }

                if (propertyValue.contains("%")){
                    propertyValue = "'"+propertyValue+"'";
                }


                newAttributeValue = property + ":" + propertyValue;
                System.out.println("property: " + property + propertyValue);
                System.out.println(newAttributeValue);
            }
            else if (counter > 1) {
                ArrayList<String> properties = new ArrayList<String>();
                ArrayList<String> propertiesvalues = new ArrayList<String>();

                // adding (;) at the end if it is not there

                if (attributeValue.indexOf(";", len - 2) < 0) {
                    attributeValue = attributeValue.substring(0, len - 1) + ";"
                            + attributeValue.substring(len - 1);
                }

                /* dividing the attribute value to get each property from it alone ******* */
                while (i < attributeValue.length()) {
                    short pos1 = (short) attributeValue.indexOf(":", i);
                    if (pos1 == -1) break;
                    short pos2 = (short) attributeValue.indexOf(";", pos1);
                    property = attributeValue.substring(i, pos1);
                    propertyValue = attributeValue.substring(pos1 + 1, pos2);
                    i = (short) (pos2 + 1);

                    property=handleProperty(property).trim();
                    propertyValue=propertyValue.replace("px","");

                    System.out.println("Value "+propertyValue);

                    /* */
                    if (propertyValue.indexOf("%") == -1) {
                        if (isInteger(propertyValue)){
                            propertyValue =  propertyValue ;

                        }
                        else {
                            propertyValue = "'" + propertyValue + "'";
                        }
                    }
                    /* if property value contains % */
                    if (propertyValue.contains("%")){
                        propertyValue = "'"+propertyValue+"'";
                    }

                    properties.add(property);
                    propertiesvalues.add(propertyValue);
                }

                // combining properties with their values after handling them
                for (short s = 0; s < properties.size(); s++) {
                    newAttributeValue += properties.get(s) + ":" + propertiesvalues.get(s)+"," ;
                }
                System.out.println("new attribute:"+newAttributeValue);

            }
            newAtrribute = "style={{" + newAttributeValue +"}}";
        }

        /* class and id in ionic = styles.class or styles.id */

        else if (attributeName.equals("class") || attributeName.equals("id")){
            attributeValue = attributeValue.substring(1,attributeValue.length()-1);
            newAtrribute = "style= {" + "Styles."+attributeValue+ "}";
        }
        /*         */
        else{
            if (attribute.containsKey(attributeName) ){
                if (ctx.ATTVALUE_VALUE() != null){
                    newAtrribute = (String) attribute.get(attributeName) + "= "
                            + attributeValue;
                }
                else{
                    newAtrribute = (String) attribute.get(attributeName);
                }
            }

        }

        try {
            FileWriter outputfile = new FileWriter("ionic2react.js", true);
            outputfile.write(   " "+newAtrribute+" " );
            outputfile.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override public void exitHtmlAttribute(HTMLParser.HtmlAttributeContext ctx) {

    }


    @Override public void enterEventbinding(HTMLParser.EventbindingContext ctx) {
        String event = (String) attribute.get(ctx.Property().getText());

        if (!ctx.getText().contains("$event")){
            String event_value = ctx.ATTVALUE_VALUE().getText();
            short i = (short) event_value.indexOf("(");
            event_value = event_value.substring(1,i) ;
            try {
                FileWriter outputfile = new FileWriter("ionic2react.js", true);
                outputfile.write( event + "= {"+event_value+"} ");
                outputfile.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    @Override public void exitEventbinding(HTMLParser.EventbindingContext ctx) {

    }

    @Override public void enterHtmlContent(HTMLParser.HtmlContentContext ctx) {
        short i_of_nl= (short) ctx.getParent().getText().indexOf(">");
        String b_check= ctx.getParent().getText().substring(0,i_of_nl+1);
//        System.out.println("content "+ctx.getText());
        if (!b_check.contains("button")){
            try{
                FileWriter outputfile =new FileWriter("ionic2react.js",true);
                if (b_check.contains("input")||b_check.contains("img")){
                    outputfile.write("/>\n");
                    outputfile.close();
                }
                else{
                outputfile.write(">\n");
                outputfile.close();
                }
            }
            catch (Exception e){
                e.printStackTrace();
            }
        }else{
            String title = ctx.htmlChardata().get(0).getText().trim();
            try{
                FileWriter outputfile =new FileWriter("ionic2react.js",true);
                outputfile.write("title =" +'"'+ title+'"' + "/>\n");
                outputfile.close();
            }
            catch (Exception e){
                e.printStackTrace();
            }
        }
    }
    @Override public void exitHtmlContent(HTMLParser.HtmlContentContext ctx) {

    }
    @Override public void enterHtmlChardata(HTMLParser.HtmlChardataContext ctx) {
        if(ctx.HTML_TEXT() !=null ){
            short i_of_nl= (short) ctx.getParent().getParent().getText().indexOf(">");
            String b_check= ctx.getParent().getParent().getText().substring(0,i_of_nl+1);

//            System.out.println("start "+b_check.trim()+"end");
//            System.out.println("content "+ctx.getText().trim()+"end");
//            System.out.println("NOT empty==>"+ctx.HTML_TEXT().getText().trim());

            if (!b_check.contains("button") ){
                String Text= ctx.HTML_TEXT().getText().trim();
                if (b_check.contains("label") || b_check.contains("text")||b_check.contains("p")
                        || b_check.contains("title")){
                    try {
                        FileWriter outputfile =new FileWriter("ionic2react.js",true);
                        outputfile.write( Text+"\n");
                        outputfile.close();
                    }
                    catch (Exception e){
                        e.printStackTrace();
                    }                }
                else{
                    try {
                        FileWriter outputfile =new FileWriter("ionic2react.js",true);
                        outputfile.write("<Text>"+ Text+"</Text>\n");
                        outputfile.close();
                    }
                    catch (Exception e){
                        e.printStackTrace();
                    }
                }
            }
        }
    }

    @Override public void exitHtmlChardata(HTMLParser.HtmlChardataContext ctx) {

    }
    @Override public void enterHtmlComment(HTMLParser.HtmlCommentContext ctx) {
        String comment = ctx.HTML_COMMENT().getText();
        try {
            FileWriter outputfile =new FileWriter("ionic2react.js",true);
            outputfile.write(comment+"\n");
            outputfile.close();
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }

    @Override public void exitHtmlComment(HTMLParser.HtmlCommentContext ctx) { }

}
