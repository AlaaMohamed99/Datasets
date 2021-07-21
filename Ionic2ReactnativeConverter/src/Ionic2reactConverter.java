import java.io.*;

import java.util.*;


public class Ionic2reactConverter extends HTMLParserBaseListener{


    File file = new File("ionic2react.js");


    Map <String,String> closingTagElemnts;
    Map <String,String> notClosingTagElemnts;
    Map <String,String>attribute;
    Map <String,String>attributeValue;
    Map <String,String>events ;
    Map <String,String>html_element;
    Map <String,String>post_styles ;


    Boolean flag_Text=false; // to indicate if Text component is added
    Boolean flag_checkbox=false;
    Boolean flag_Picker=false;
    Boolean flag_radiobutton=false;
    Boolean flag_Slider=false;
    Boolean flag_Appbar=false;
    Boolean flag_View=false;
    Boolean flag_Button=false;
    Boolean flag_Image=false;
    Boolean flag_Input=false;
    Boolean flag_Icon=false;
    Boolean flagOfList=false;
    Boolean checkbox_flag =false;

    String globalAtrributevalue="";
    String label_of_Picker="";
    String checkbox_title="";
    String radio_group_value="";
    Boolean checkTextImport = false;
    ArrayList <String> finalStyle=  new ArrayList<>();
    ArrayList<String> ngModel_to_state_with_func = new ArrayList<String>();
    ArrayList<String> ngModel_to_state_without_func = new ArrayList<String>();
    ArrayList<String> propBinding_to_state = new ArrayList<String>();
    ArrayList<String> class_binding = new ArrayList<String>();


    Ionic2reactConverter() throws IOException {
        post_styles = new HashMap<>();

        events = new HashMap<String,String>();
        events.put("click","onPress");
        events.put("ionChange","onChange");

        attributeValue = new HashMap<String,String>();
        attribute =new HashMap<String,String>();
        attribute.put("class","style");
        attribute.put("id","style");
        attribute.put("value","value");
        attribute.put("color","color");
        attribute.put("size","size");
        attribute.put("disabled","disabled");
        attribute.put("max","maximumValue");
        attribute.put("min","minimumValue");
        attribute.put("placeholder","placeholder");
        attribute.put("name","name");
        attribute.put("autofocus","autofocus");
        attribute.put("src","source");


        closingTagElemnts =new HashMap<String,String>();
        closingTagElemnts.put("ion-text","Text");
        closingTagElemnts.put("ion-content","View");
        closingTagElemnts.put("ion-header","View");
        closingTagElemnts.put("ion-footer","View");
        closingTagElemnts.put("ion-toolbar","Appbar");
        closingTagElemnts.put("ion-label","Text");
        closingTagElemnts.put("div","View");
        closingTagElemnts.put("ion-item","View");
        closingTagElemnts.put("p","Text");
        closingTagElemnts.put("ion-button","TouchableOpacity");
        closingTagElemnts.put("ion-title","Text");
        closingTagElemnts.put("ion-list-header","Text");
        closingTagElemnts.put("h1","Text");
        closingTagElemnts.put("h2","Text");
        closingTagElemnts.put("h3","Text");
        closingTagElemnts.put("h4","Text");
        closingTagElemnts.put("h5","Text");
        closingTagElemnts.put("h6","Text");
        closingTagElemnts.put("ion-list","ul");
        closingTagElemnts.put("ion-radio-group","View");
        closingTagElemnts.put("ion-select","Picker");
        closingTagElemnts.put("ion-select-option","Picker.Item");


        html_element = new HashMap<String,String>();

        html_element.put("ion-list","ul");
        html_element.put("ion-item","li");


        notClosingTagElemnts = new HashMap<String,String>();
        notClosingTagElemnts.put("ion-img","Image");
        notClosingTagElemnts.put("img","Image");
        notClosingTagElemnts.put("ion-icon","Icon");
        notClosingTagElemnts.put("ion-input","TextInput");
        notClosingTagElemnts.put("ion-range","Slider");
        notClosingTagElemnts.put("ion-checkbox","CheckBox");
        notClosingTagElemnts.put("ion-radio","RadioButton");




        /*  Creating ionic2react.js translated file */
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

    //function to write text in a file takes the file and the content
    public void WriteContent(File file , String content  ){
        try {
            FileWriter outputfile = new FileWriter(file.getName());
            outputfile.write(content);
            outputfile.close();
        } catch (Exception e) {
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
        if (str != null && !str.isEmpty()) {
            return false;
        }
        return true;
    }

    public static boolean isStringOnlyAlphabet(String str) {
        return ((!str.equals(""))
                && (str != null)
                && (str.matches("^[a-zA-Z]*$")));
    }

    public static short occurrenceNumber(char c , String attribute_value ){
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
            FileWriter outputfile = new FileWriter(file.getName());
            outputfile.write(initial_import+"\n"+"export default class App extends React.Component {\n" +
                    " render (){\n\t"+
                    " return (\n" +
                    " \t<View style={{display:'blcok'}}> \n ");
            outputfile.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    @Override
    public void exitHtmlDocument(HTMLParser.HtmlDocumentContext ctx) {
        try {
            FileWriter outputfile = new FileWriter(file.getName(), true);
            outputfile.write("\t</View>\n" +
                    "  );\n" +
                    "} \n"+
                    "}");
            outputfile.close();
        } catch (Exception e) {
            e.printStackTrace();
        }


        /* add the styles */
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
            short index_of_return= (short)content.indexOf("return");


               /* get all style predefined */
            String styles="";
            for (String cons_styles : post_styles.values()){
                styles = styles + cons_styles+"\n";
//                System.out.println("styles "+styles);
            }
            // add styles
            content = content.substring(0,index_of_return)
                    + styles + content.substring(index_of_return);
            FileOutputStream fos = new FileOutputStream(file.getName());
            fos.write(content.getBytes());
            fos.flush();
        }
        catch (Exception e){
            e.printStackTrace();
        }

        try {
            int count =0;
            /* count the number of lines in the file*/
            Scanner sc = new Scanner(file);
            while (sc.hasNextLine()){
                sc.nextLine();
                count++;
            }
            // number of lines inside the file
            int lastline_index = count ;
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }


    @Override
    public void enterHtmlElement(HTMLParser.HtmlElementContext ctx) {

        String opentag = "<";
        String closetag = ">";
        String final_ui = "";
        String finalOutput = "";

        /* ************getting ui_element Tag_name ********* */

        String oldElement = ctx.TAG_NAME().get(0).getText();
        String converted_ui_closing_tag = "";
        String converted_ui_noClosing_tag = "";

        converted_ui_closing_tag = (String) closingTagElemnts.get(oldElement);
        converted_ui_noClosing_tag = (String) notClosingTagElemnts.get(oldElement);

        if (converted_ui_closing_tag == null) final_ui = converted_ui_noClosing_tag;
        if (converted_ui_noClosing_tag == null) final_ui = converted_ui_closing_tag;


        /* handle ion-items inside ion-list */
        if (oldElement.equals("ion-list")){
            closingTagElemnts.replace("ion-item","li ");
            flagOfList= true;
        }
        if (oldElement.equals("ion-select-option")){
           label_of_Picker = ctx.htmlContent().getText();
            System.out.println("label "+label_of_Picker);
        }

        // handle ion-label inside ion-item with checkbox
        if (oldElement.equals("ion-item")  ){

            if ( ctx.htmlContent().getText().contains("ion-label") && ctx.htmlContent().getText().contains("ion-checkbox") ){
                closingTagElemnts.remove("ion-label");
                checkbox_flag= true;

                /* getting content of ion-label inside*/
                String content = ctx.htmlContent().getText();
                content = content.substring(content.indexOf("ion-label"));
                content = content.substring(content.indexOf(">")+1,content.indexOf("<"));
                checkbox_title = content;
            }

        }

        // to make ion-radio inline with text inside the view
        if (oldElement.equals("ion-item") &&  ctx.htmlContent().getText().contains("ion-radio")){

            String ion_item_with_ion_radio_style = "flexDirection:row";
        }



        /* Ionic to react  closing tags */
        if(closingTagElemnts.containsKey(oldElement)){
            final_ui = (String) closingTagElemnts.get(oldElement);
            finalOutput = opentag + final_ui + " ";

//            if (final_ui.equals("li")) {
//                finalOutput = opentag + final_ui + " asd";
//            }

            if (oldElement.equals("ion-select-option")){
                finalOutput = opentag + final_ui + " label = '"+label_of_Picker +"' ";
            }

            /* ion-label after ion-list or  handle ion-label inside ion-item with ion-input */
            if (oldElement.equals("ion-label") && (flagOfList)  ){
                finalOutput = "";
            }



            /** some pre defined default styles to make it close to ionic in view **/


             if(oldElement.equals("ion-item") && !ctx.parent.getText().contains("ion-list") && !ctx.htmlContent().getText().contains("ion-radio")){

                globalAtrributevalue = "ionItem_style";
                post_styles.put(oldElement,"const ionItem_style=" +
                        "{borderBottomWidth:1,paddingRight:20,paddingLeft:20," +
                        " alignSelf:'stretch',alignItems:'center'," +
                        "flexDirection:'row',justifyContent:'center'," +
                        "minHeight:48,minWidth:'fit-content'  }");
            }
             if(oldElement.equals("ion-item") && ctx.htmlContent().getText().contains("ion-radio")){

                 globalAtrributevalue = "radio_btn_style";
                 post_styles.put(oldElement+" ","const radio_btn_style ={"
                         +   "flexDirection:'row'"+
                         "}");
             }

            else{
                 if(oldElement.equals("ion-title")){
                     globalAtrributevalue = "Title_style";
                     post_styles.put(oldElement,"const Title_style ={"
                             + "fontSize:20,fontWeight:500,minHeight:23,width:'100%',paddingLeft:20,paddingReight:20"+
                             "} ");
                 }
                 /* ion-item should be before li*/


                 if(final_ui.equals("Appbar")){
                     globalAtrributevalue = "Appbar_style";
                     post_styles.put(oldElement,"const Appbar_style={" +
                             "height:56,maxHeigth:100,width:'100%'"+
                             "}");
                 }
                 if(final_ui.equals("TouchableOpacity")){
                     globalAtrributevalue = "TouchableOpacity_style";
                     post_styles.put(oldElement,"const TouchableOpacity_style = {" +
                             "alignItems:'center'," +
                             "borderRadius:6," +
                             "display:'inline-block'," +
                             "padding: 10," +
                             "backgroundColor:'#3880ff'," +
                             "minHeigth:36,minWidth:92,maxWidth:'fit-content'," +
                             "textTransform:'uppercase'," +
                             "letterSpacing:1," +
                             "paddingRight:15," +
                             "paddingLeft:15," +
                             "overflow:'hidden'," +
                             "textAlign:'center'," +
                             "marginTop:4," +
                             "marginBottom:4," +
                             "marginLeft:2," +
                             "marginRight:2," +
                             "  " +
                             "}");
                 }
                 if(oldElement.equals("ion-list-header")){
                     globalAtrributevalue = "ion_list_style";
                     post_styles.put(oldElement,"const ion_list_style ={"
                             + "fontSize:22,margin:0"+
                             "} ");

                 }if(oldElement.equals("ion-content")){
                     globalAtrributevalue = "content_100vh";
                     post_styles.put(oldElement,"const content_100vh = {" +
                             "height:'100vh'," +"} ");
                 }

                 /* if ui is li  ==>  should be no bullets at start of li in reactnative */
                 /* some default styles to make it close to ionic*/
                 if(final_ui.equals("ul")){
                     finalStyle.add("{"
                             + "fontSize:22,margin:0 , paddingLeft:16, paddingTop:8 ,listStyle:'none'"+
                             "}");
                 }
             }

            short addGlobalAttribute=0;

            try {
                FileWriter outputfile = new FileWriter(file.getName(), true);
                outputfile.write(finalOutput);
                outputfile.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        /* Ionic to react not closing tags */
      else if(notClosingTagElemnts.containsKey(oldElement)){
            final_ui = (String) notClosingTagElemnts.get(oldElement);
            finalOutput = opentag + final_ui + " ";

            // write title attr with checkbox
            if (checkbox_flag && oldElement.equals("ion-checkbox" )){
                finalOutput = opentag + final_ui + " "+"title="+"'"+checkbox_title.trim() +"'";

            }



            /* handle ion-input and ion-label together inside ion-item*/
//            if(oldElement.equals("ion-input") && labelFlag){
//                finalOutput = finalOutput + " label="+'"'+labelOfInput+'"';
//            }

            /* handle TextInput predefined style */
            if(final_ui.equals("TextInput")){
                globalAtrributevalue = "TextInput_style";
                post_styles.put(oldElement,"const TextInput_style={ " +
                        "minHeight:38,width:'100%'," +
                        "display:'block'," +
                        "paddingTop:10," +
                        "paddingBottom:10," +
                        "paddingLeft:8" +
                        " }");
            }
            if(final_ui.equals("Image")){
                globalAtrributevalue = "Image_size_style";
                post_styles.put(oldElement,"const Image_size_style={" +
                        "width:200,height:200" +
                        " }");
            }

            for (short i=0;i<ctx.htmlAttribute().size();i++){
                if (!globalAtrributevalue.isEmpty()){
                    String htmlatt= ctx.htmlAttribute(i).getText();
                    if (htmlatt.contains("class")
                        && htmlatt.contains("style")&&htmlatt.contains("id")){
                        finalOutput = opentag + final_ui + " style={" + globalAtrributevalue + "}" + " ";
                    }
                    else{
                        finalOutput = opentag + final_ui;
                    }
                }
            }

            try {
                FileWriter outputfile = new FileWriter(file.getName(), true);
                outputfile.write(finalOutput);
                outputfile.close();

            } catch (Exception e) {
                e.printStackTrace();
            }
        }



       else {
           //nothing
        }

       /** add global style if no attribute or no style or class or id **/
       if(!globalAtrributevalue.isEmpty() && ctx.htmlAttribute(0) == null){

               finalStyle.add(globalAtrributevalue);
       }

       if(ctx.htmlAttribute()!=null ){
           short flag=0;
           for(short i=0; i < ctx.htmlAttribute().size();i++){
               String attr= ctx.htmlAttribute(i).getText();
               if(attr.equals("class") || attr.equals("style") || attr.equals("id")){
                   flag++;
               }
           }
           if(flag == 0 && !globalAtrributevalue.isEmpty()){
               finalStyle.add(globalAtrributevalue);
           }
       }


        /* add the import statement for new react-native component if not exists */

        BufferedReader filescan;
        short count = 0;

        try {
            try {
                filescan = new BufferedReader(new FileReader(file.getName()));
//                int flag = 0;
                String ImportStmnt1 = "import {" + final_ui + "} from 'react-native'\n";
                String ImportStmnt2 = "import {" + final_ui + "} from 'react-native-elements'\n";
                String ImportStmnt3 = "import {" + final_ui + "} from 'react-native-paper'\n";


                /*  flag = zero ==> adding the import statment*/
                File mfile =new File(file.getName());
//                FileReader file =new FileReader("ionic2react.js");
                BufferedReader b = new BufferedReader(new FileReader(file.getName()));
                String result = "";
                String lin = "";
                while( (lin = b.readLine()) != null){
                    result = result + lin+ "\n";
                }

                if (final_ui != null) {
                    if((!flag_Text ) && (final_ui.equals("Text") )){
                        result = ImportStmnt1 + result;
                        flag_Text = true;
                    }

                    if((!flag_Picker ) && (final_ui.equals("Picker") )){
                        result = ImportStmnt1 + result;
                        flag_Picker = true;
                    }

                    if((!flag_radiobutton ) && (final_ui.equals("RadioButton") )){
                        result = ImportStmnt3 + result;
                        flag_radiobutton = true;
                    }

                    if((!flag_checkbox ) && (final_ui.equals("CheckBox") )){
                        result = ImportStmnt2 + result;
                        flag_checkbox = true;
                    }

                    if(!flag_View  && final_ui.equals("View")){
                        result = ImportStmnt1 + result;
                        flag_View = true;
                    }
                    if(!flag_Button  && final_ui.equals("TouchableOpacity")){
                        result = ImportStmnt1 + result;
                        flag_Button = true;
                    }
                    if(!flag_Input && final_ui.equals("TextInput")){
                        result = ImportStmnt1 + result;
                        flag_Input = true;
                    }
                    if(!flag_Icon  && final_ui.equals("Icon")){
                        result = ImportStmnt2 + result;
                        flag_Icon = true;
                    }
                    if(!flag_Image  && final_ui.equals("Image")){
                        result = ImportStmnt2 + result;
                        flag_Image = true;
                    }
                    if(!flag_Slider  && final_ui.equals("Slider")){
                        result = ImportStmnt2 + result;
                        flag_Slider = true;
                    }if(!flag_Appbar  && final_ui.equals("Appbar")){
                        result = ImportStmnt3 + result;
                        flag_Slider = true;
                    }
                }

                /* write back to the file after adding import stmnts */
                mfile.delete();
                FileOutputStream fos = new FileOutputStream(mfile);
                fos.write(result.getBytes());
                fos.flush();
            } catch (IOException e) {
                e.printStackTrace();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }





    }


    @Override
    public void exitHtmlElement(HTMLParser.HtmlElementContext ctx) {
        String oldElement = ctx.TAG_NAME().get(0).getText();

        // clear label_of_Picker every exit
        if (oldElement.equals("ion-select-option")){
            label_of_Picker = "";
        }

        // clear radio_group_value
        if(ctx.TAG_NAME(0).equals("ion-radio-group")){
            radio_group_value="";
            System.out.println("radio_group_value"+radio_group_value);
        }


        // handle ion-label inside ion-item with checkbox
        if (oldElement.equals("ion-item") && ctx.htmlContent().getText().contains("ion-checkbox")){
            closingTagElemnts.put("ion-label","Text");
            checkbox_flag= false;
        }

        /* handle ion-label inside ion-list and replace again ion-item with View */
        if (oldElement.equals("ion-list")){
            closingTagElemnts.replace("ion-item","View");
            flagOfList = false;
        }

        String opentag="<";
        String closetag=">";

        /* Ionic to react closing tag element */

        if (closingTagElemnts.containsKey(oldElement))
        {
            String Ionic_closed_tag = (String) closingTagElemnts.get(oldElement);
            String output = opentag + "/" + Ionic_closed_tag + " " + closetag + "\n";


                /* handle ion-label inside ion-list or handle ion-label inside ion-item with ion-input*/
            if (oldElement.equals("ion-label") && (flagOfList )){
                output = "";
            }

            try {
            FileWriter outputfile = new FileWriter(file.getName(), true);
            outputfile.write(  output);
            outputfile.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }


        else{
            // do nothing
        }

        /* global attribute value */
        globalAtrributevalue="";



    }

    @Override public void enterHtmlAttribute(HTMLParser.HtmlAttributeContext ctx) {

        String attributeName = "";
        String attributeValue = "";
        String newAttributeValue = "";
        String newAtrribute = "";

        /* get the Tag Name */
        String parent = ctx.getParent().getText();
        short index1; //last index of /
        short index2;//last index of >
        index1= (short) parent.trim().lastIndexOf("/");
        index2= (short) parent.trim().lastIndexOf(">");
        String tagName= parent.substring(index1+1,index2);



        /* ********** check if there is attribute value and split it **************** */

        attributeName = ctx.TAG_NAME().getText();

        if (ctx.ATTVALUE_VALUE() != null) {
            attributeValue = ctx.ATTVALUE_VALUE().getText();
        }

        /* number of occurrences of (:) in attribute value = number of properties */

        short counter = occurrenceNumber(':', attributeValue);

        /*  substring the attribute_values  */
        String property = "";
        String propertyValue = "";
        short len = (short) attributeValue.length();
        short pos2_initial = (short) attributeValue.indexOf(";",0);
        short i = 1;


        /* **************  start attribute = style ****************** */

        if (attributeName.equals("style")) {

            // inline style with one property
            if (counter == 1) {
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
                /* property = background should be backgroundColor*/
                if(property.equals("background")){
                    property="backgroundColor";
                }
                newAttributeValue = property + ":" + propertyValue;

            }
            // inline style with more than 1 property
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

                    /* property = background should be backgroundColor*/
//                    if(property.equals("background")){
//                        property="backgroundColor";
//                    }

                    propertyValue=propertyValue.replace("px","");

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
            }
            newAtrribute = "style={" + newAttributeValue +"}";

            /* handle post_styles */
            if (!globalAtrributevalue.isEmpty()){
                if(html_element.containsKey(tagName)){
                    String style = (String) post_styles.get(tagName);
                    style= style.substring(0,style.lastIndexOf("}"))
                       +", " + newAttributeValue +"}";
                    post_styles.replace(tagName,style);

                    // make it write nothing in the file
                    newAtrribute="";

                }
                else{
                    newAtrribute = "style={["+globalAtrributevalue+","
                            +"{" + newAttributeValue +"}]}";
                    finalStyle.add(globalAtrributevalue);
                    finalStyle.add("{"+ newAttributeValue+"}");
                }
            }
        }

        /* class and id in ionic = styles.class or styles.id */
        else if (attributeName.equals("class") || attributeName.equals("id")){
            attributeValue = attributeValue.substring(1,attributeValue.length()-1);

            String handleFinlaStyle="";

            /* handle post_styles */
            /* html elements should not take style.styleName
            * it defined inside const and applied like this {styleName}
            * */
            if (!globalAtrributevalue.isEmpty()){
                if(html_element.containsKey(tagName)){
                    newAtrribute = "style={"+globalAtrributevalue+"}";
                    finalStyle.add(globalAtrributevalue);
                }
                else{
                newAtrribute = "style={["+globalAtrributevalue+","
                        +"Styles."+attributeValue+"]}";
                    finalStyle.add(globalAtrributevalue);
                    finalStyle.add("Styles."+attributeValue);

                }
            }
            // no post_styles
            else{
                /* check if attribute value  has - and replace it with _ */
                attributeValue = attributeValue.replace("-","_");
                newAtrribute = "style= {[" + "Styles."+attributeValue +"]}";

                finalStyle.add("Styles."+attributeValue);
            }

        }

        /*   attributes are not style or class or Id   */
        else{

            /* attributes are inside the list of attributes which is predefined */
            if (attribute.containsKey(attributeName) ){
                if (ctx.ATTVALUE_VALUE() != null){
                    newAtrribute = (String) attribute.get(attributeName) + "= "
                            + attributeValue;


                    if(ctx.getParent().getText().contains("ion-radio-group")){

                            radio_group_value = attributeValue.replace("\"","");
//                            System.out.println("contains radio "+ radio_group_value.replace("\"",""));
                            ngModel_to_state_without_func.add(radio_group_value);
//                            System.out.println(ngModel_to_state_without_func);

                    }
                    if(flag_radiobutton && ctx.getParent().getText().contains("ion-radio")){

                        newAtrribute = newAtrribute+ " \nonPress={()=> this.setState({"+radio_group_value+":"+attributeValue+ "})}" +
                                "\nstatus ={this.state."+radio_group_value +"== "+attributeValue +" ? 'checked':'unchecked'}"+" ";
                    }


                }
                else{
                    newAtrribute = (String) attribute.get(attributeName);
                }
            }

            else{
                // TODO
            }

            /** handle Image source**/

            if (attributeName.equals("src")){
                // incase of online source
                if(attributeValue.contains("http")){
                    newAtrribute = (String) attribute.get(attributeName)
                            +"= {require("+attributeValue+")}";
                }

                /**incase of local or relative source it path
                 * should be ./assets/img.png **/
                else{
                    short lastIndexOfSlash = (short) attributeValue.lastIndexOf("/");
                    String imgPartOnly = attributeValue.substring(lastIndexOfSlash);
                    newAtrribute= (String) attribute.get(attributeName)
                            + "={require(\""+"./assets"+imgPartOnly +")}";
                }
            }

            /* for Input if it was password */
            if (parent.contains("ion-input") && attributeName.equals("type") && attributeValue.contains("password")){
                newAtrribute =newAtrribute + "secureTextEntry";
            }



            try {
                FileWriter outputfile = new FileWriter(file.getName(), true);
                outputfile.write(newAtrribute);
                outputfile.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    @Override public void exitHtmlAttribute(HTMLParser.HtmlAttributeContext ctx) {
        if(ctx.getParent().getChild(1).getText().equals("ion-checkbox")){
//            System.out.println("contain ");
        }

    }

    @Override public void enterHtmlContent(HTMLParser.HtmlContentContext ctx) {

        /* global attribute value */
        globalAtrributevalue="";


        /**handle the style will be written **/
        Set <String> style = new LinkedHashSet<>(finalStyle);
        finalStyle =  new ArrayList<>(style);
        String finalStyleOut = "";
        for(short i=0;i<finalStyle.size();i++){
            finalStyleOut = finalStyleOut + finalStyle.get(i)+",";
        }

        /* handle final style that contains all style */
        if(!finalStyle.isEmpty()) {
            try {
                FileWriter outputfile = new FileWriter(file.getName(), true);


                outputfile.write(" style = {[ "+ finalStyleOut+" ]} ");
                outputfile.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        finalStyle.clear();
        /** end handle style **/


        /* handle  the closing > of the element*/
        short i_of_nl= (short) ctx.getParent().getText().indexOf(">");
        String b_check= ctx.getParent().getText().substring(0,i_of_nl+1);

        try{
            FileWriter outputfile =new FileWriter(file.getName(),true);
            String par =ctx.getParent().getChild(1).getText();
            if(par.equals("ion-checkbox") ||par.equals("ion-input")||par.equals("ion-img")||par.equals("ion-icon")||par.equals("ion-range")
                    ||par.equals("ion-radio") ){
                outputfile.write("/>\n");
                outputfile.close();
            }
//            if(b_check.contains("input")||b_check.contains("img")
//                ||b_check.contains("range")||b_check.contains("icon")
//                    ){
//                outputfile.write("/>\n");
//                outputfile.close();
//
//            }

            else{
                String finalOutput = ">\n";

                /* handle ion-label inside ion-list
                or ion-label inside ion-item with ion-input*/
                if ((flagOfList  ) && b_check.contains("ion-label")){
                    finalOutput="";
                }
                outputfile.write(finalOutput);
                outputfile.close();
            }
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }
    @Override public void exitHtmlContent(HTMLParser.HtmlContentContext ctx) {
        /* global attribute value */
        globalAtrributevalue="";
    }
    @Override public void enterHtmlChardata(HTMLParser.HtmlChardataContext ctx) {
        String parent=ctx.getParent().getParent().getText() ;
        String [] no_Text_tag ={"label","title","h1","text","h2","h3","h4","h5","h6"};
        if(ctx.HTML_TEXT() !=null ){
            short i_of_nl= (short) ctx.getParent().getParent().getText().indexOf(">");
            String b_check= ctx.getParent().getParent().getText().substring(0,i_of_nl+1);

            String Text= ctx.HTML_TEXT().getText().trim();
            if ((b_check.contains("label") || b_check.contains("text")||b_check.contains("p")
                || b_check.contains("title") || b_check.contains("h1")
                || b_check.contains("h2")||b_check.contains("h3") )&& !b_check.contains("select") ){
//                if(b_check.contains("button")){
//                    System.out.println("btn");
//                }
                try {
                    FileWriter outputfile =new FileWriter(file.getName(),true);
                    outputfile.write( Text+"\n");
                    outputfile.close();
                }
                catch (Exception e){
                    e.printStackTrace();
                }
            }
            // with ion-slect we don't write any content instead will be label attribute
            else if( b_check.contains("select")){
                // write nothing
            }
            else{
                try {
                    FileWriter outputfile =new FileWriter(file.getName(),true);

                    outputfile.write("<Text>"+ Text+"</Text>\n");
                    outputfile.close();
                    checkTextImport = true;
                }
                catch (Exception e){
                    e.printStackTrace();
                }
            }

        }
    }

    @Override public void enterHtmlComment(HTMLParser.HtmlCommentContext ctx) {
        String comment = ctx.HTML_COMMENT().getText();
        comment = comment.replace("<!--","{/*");
        comment = comment.replace("-->","*/}");
        try {
            FileWriter outputfile =new FileWriter(file.getName(),true);
            outputfile.write(comment+"\n");
            outputfile.close();
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }

    @Override public void enterEventbinding(HTMLParser.EventbindingContext ctx) {
        String event = (String) events.get(ctx.Property().getText());
        String value = ctx.ATTVALUE_VALUE().getText();
        String between_brackets = value.substring(value.indexOf("(")+1,value.indexOf(")"));

        /** convert it to arrow function form because come functionalities
         *  will be easy to handle it with arrow function
         **/
        // does not contain $event arg or any arguments at all
        if(between_brackets.isEmpty()){
            String event_value = ctx.ATTVALUE_VALUE().getText();
            short i = (short) event_value.indexOf("(");
            event_value = event_value.substring(1,i) ;
            try {
                FileWriter outputfile = new FileWriter(file.getName(), true);
                outputfile.write( event + "= {this."+event_value+"} ");
                outputfile.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        // contain arguments
        else{
            // contains $event = this
             if (between_brackets.contains("$event")){
                String func=ctx.ATTVALUE_VALUE().getText();
                func = func.replace("\"","");
                func = func.substring(0,func.indexOf("(")).trim();
                String out = event +  "= {(ev)=>"+"this."+ func+"("
                        + between_brackets.replace("$event","ev")+ ")}";
                try {
                    FileWriter outputfile = new FileWriter(file.getName(), true);
                    outputfile.write( out);
                    outputfile.close();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
             // contains normal arguments
            else{
                String func=ctx.ATTVALUE_VALUE().getText();
                func = func.replace("\"","");
                String out = event +  "= {"+"()=> this."+
                        func.substring(0,func.indexOf("(")).trim()+"("
                        + func.substring(func.indexOf("(")+1,func.indexOf(")"))+")" +"}";
                try {
                    FileWriter outputfile = new FileWriter(file.getName(), true);
                    outputfile.write( out);
                    outputfile.close();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }
    }




    @Override public void enterInterpolation(HTMLParser.InterpolationContext ctx) {
        String interpolation = ctx.Interpolation_inside().getText();
        String out="";

        out="{"+"this."+interpolation.trim()+"}\n";

        if(ngModel_to_state_with_func.contains(interpolation) || ngModel_to_state_without_func.contains(interpolation)){
            out="{"+"this.state."+interpolation.trim()+"}\n";

        }
        try {
            FileWriter outputfile =new FileWriter(file.getName(),true);
            outputfile.write(out);
            outputfile.close();
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }

    @Override public void enterPropertybinding(HTMLParser.PropertybindingContext ctx) {
        String prop1= ctx.Property().getText();

        String prop_value=ctx.ATTVALUE_VALUE().getText().replace("\"","").replace("-","_").trim();
        String prop2 = prop1.substring(prop1.indexOf(".")+1);

        // style binding
        if(prop1.contains("style")) {
            prop2 = handleProperty(prop2);

            if(prop2.equals("background")){
                prop2 = "backgroundColor";
            }
            propBinding_to_state.add(prop_value);
            finalStyle.add("{"+prop2+":this.state."+prop_value+"} ");
        }

        /** ngStyle **/
        else if(prop1.equals("ngStyle")){
            prop2 = handleProperty(prop2);
            finalStyle.add("{"+"this.state."+prop_value+"} ");

        }

        // class binding
        else if (prop1.equals("class") ||prop1.equals("id") ){
            class_binding.add(prop_value);
            finalStyle.add("this."+prop_value);

        }
        // add class if boolean is true
        else if (prop1.contains("class.")){
            if (prop_value.equals("true") || prop_value.equals("!false")){
                finalStyle.add("this."+prop2);
            }
            else if(prop_value.equals("false") || prop_value.equals("!true")){
                // nothing boolean was false
            }

            // binding by variable
            else{
                // TODO
            }
        }
        // other binding with different attribute
        else{
            // ex ==> [disabled]="var" or [disabled]={{true}}
            if(attribute.containsKey(prop1)){
               if(prop_value.equals("true")){
                   try {
                       String out= attribute.get(prop1)+" ";
                       FileWriter outputfile = new FileWriter(file.getName(), true);
                       outputfile.write(out);
                       outputfile.close();
                   } catch (Exception e) {
                       e.printStackTrace();
                   }
               }
               // ex ==> [disabled]="false"
               else if(prop_value.equals("false")){
                   // do not write it
               }
               // ex ==> [disabled]="variableNmae"
               else{
                   try {
                       String out=  attribute.get(prop1)+" = "
                               + "{this."+prop_value+"? " +"true:false} ";
                       FileWriter outputfile = new FileWriter(file.getName(), true);
                       outputfile.write(out);
                       outputfile.close();
                   } catch (Exception e) {
                       e.printStackTrace();
                   }
               }
            }
        }

    }
    /* all ngModel will be stored in a list global list then */
    @Override public void enterTwowaybining(HTMLParser.TwowaybiningContext ctx) {
        String out = "";
        String parent = ctx.parent.getParent().getText();
        String variableName = ctx.ATTVALUE_VALUE().getText().replace("\"","").trim();

        if (ctx.getParent().getParent().getText().contains("ion-checkbox")){
         ngModel_to_state_without_func.add(variableName);
        }
        else{

            ngModel_to_state_with_func.add(variableName);
        }

        System.out.println("model1 "+ ngModel_to_state_with_func);
        System.out.println("model2 "+ ngModel_to_state_without_func);

        /* parent is ion-input*/
        if (parent.contains("ion-input")){
            String value = "value={"+ "this.state."+variableName+"}";
            String onchangetext= "onChange={"+
                    "(event)=>this.handleChangeOf"+variableName+"(event)"+"}";
            out =value + "\n"+onchangetext;
        }

        if(checkbox_flag && ctx.getParent().getParent().getText().contains("ion-checkbox")){
            out = " checked={this.state."+variableName+"}  " +
                    "\n "+ " onPress={()=>this.setState({"+variableName+":!this.state."+variableName+"})" +"}" ;

        }

        try {
            FileWriter outputfile = new FileWriter(file.getName(), true);
            outputfile.write(out);
            outputfile.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
