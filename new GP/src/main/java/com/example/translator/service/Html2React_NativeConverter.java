package com.example.translator.service;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.springframework.stereotype.Component;

import com.example.translator.HTMLLexer;
import com.example.translator.HTMLParser;
import com.example.translator.HTMLParserBaseListener;
import com.example.translator.dto.Constants;

import org.springframework.beans.factory.annotation.Autowired;

@Component("Html2React_NativeConverter")
public class Html2React_NativeConverter extends HTMLParserBaseListener implements CodeConverter {

	 
	
		public void setFile(File file) {
			this.file = file;
		}
		
		@Override
		public File getFile() {
			// TODO Auto-generated method stub
			return file;
		}
		
		 	Map <String,String> closingTagElemnts;
		    Map <String,String> notClosingTagElemnts;
		    Map <String,String>attribute;
		    Map <String,String>attributeValue;
		    Map <String,String>events ;
		    Map <String,String>html_element;
		    Map <String,String>post_styles ;

	    
		    private  File file;

	

	

		public Html2React_NativeConverter() throws IOException {

			post_styles = new HashMap<>();

	        events = new HashMap<String,String>();
	        events.put("click","onPress");
	        events.put("ionchange","onChangetext");

	        attributeValue = new HashMap<String,String>();
	        attribute =new HashMap<String,String>();
	        attribute.put("class","style");
	        attribute.put("id","style");
	        attribute.put("color","color");
	        attribute.put("size","size");
	        attribute.put("disabled","disabled");
	        attribute.put("max","maximumValue");
	        attribute.put("min","minimumValue");
	        attribute.put("placeholder","placeholder");
	        attribute.put("name","name");
	        attribute.put("autofocus","autofocus");


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

	        html_element = new HashMap<String,String>();
	        html_element.put("ion-list","ul");


	        notClosingTagElemnts = new HashMap<String,String>();
	        notClosingTagElemnts.put("ion-img","Image");
	        notClosingTagElemnts.put("img","Image");
	        notClosingTagElemnts.put("ion-icon","Icon");
	        notClosingTagElemnts.put("ion-input","TextInput");
	        notClosingTagElemnts.put("ion-range","Slider");
	    
	    }

	    @Override
	    public void enterHtmlDocument(HTMLParser.HtmlDocumentContext ctx) {
	    	String initial_import = "import React from 'react'; \n"
	                + "import {StyleSheet} from 'react-native' ;";
	        try {
	            FileWriter outputfile = new FileWriter(file.getName());
	            outputfile.write(initial_import+"\n"+"export default class "+ file.getName().split("\\.")[0].split("\\(")[0] +"extends React.Component {\n" +
	            		 " render (){\n\t"+
		                    " return (\n" +
		                    " \t<View style={{display:'blcok'}}> \n ");
	            outputfile.close();
	        } catch (Exception e) {
	            e.printStackTrace();        }

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

//	   

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
	        try {
//	            File file = new File("ionic2react.js");
	            int count =0;
	            /* count the number of lines in the file*/
	            Scanner sc = new Scanner(file);
	            while (sc.hasNextLine()){
	                sc.nextLine();
	                count++;
	            }
	            // number of lines inside the file
	            int lastline_index = count ;
	            System.out.println("Number of lines in the file are :"+lastline_index);
	        }
	        catch (Exception e){
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
//	            short index_of_redner1= (short)content.indexOf("(){");
	            short index_of_redner2= (short)content.indexOf("return");


//	            /* get all style predefined */
	            String styles="";
	            for (String cons_styles : post_styles.values()){

	                styles = styles + cons_styles+"\n";
	            }
	            content = content.substring(0,index_of_redner2)
	                    + styles + content.substring(index_of_redner2);
	            FileOutputStream fos = new FileOutputStream(file.getName());
	            fos.write(content.getBytes());
	            fos.flush();
	        }
	        catch (Exception e){
	            e.printStackTrace();
	        }
	    }

	    /*{"View","Text","Button","Image","Input","Icon","Slider"};*/

	    Boolean flag_Text=false;
	    Boolean flag_Slider=false;
	    Boolean flag_Appbar=false;
	    Boolean flag_View=false;
	    Boolean flag_Button=false;
	    Boolean flag_Image=false;
	    Boolean flag_Input=false;
	    Boolean flag_Icon=false;

	    String globalAtrributevalue="";


	    /*  Label of an Input instead of ion-label */
//	    String labelOfInput = "";
//	    Boolean labelFlag=false;

	    /* Flag to indicate that there is ion-item inside ion-list and handle it with ion-label*/
	    Boolean flagOfList=false;

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


//	        if(oldElement.equals("ion-content")){
//	            final_ui= "View className="+"content";
//	        }


	        /* ion-input inside ion-item */
//	        if (oldElement.equals("ion-item")){
////	            if (ctx.getRuleContext().getText().contains("ion-label")&&
////	                ctx.getRuleContext().getText().contains("ion-input")){
////	                labelFlag = true;
////	            }
//	        }
//	        if (oldElement.equals("ion-label") && labelFlag){
//	            labelOfInput = ctx.htmlContent().getText();
//	        }

	        /* handle ion-items inside ion-list */
	        if (oldElement.equals("ion-list")){
	            closingTagElemnts.replace("ion-item","li");
	            flagOfList= true;
	        }

	            /* Ionic to react  closing tags */
//	        if (converted_ui_closing_tag != null && converted_ui_noClosing_tag == null) {
	        if(closingTagElemnts.containsKey(oldElement)){
	            final_ui = (String) closingTagElemnts.get(oldElement);
	            finalOutput = opentag + final_ui + " ";

	            /* ion-label after ion-list or  handle ion-label inside ion-item with ion-input */
	            if (oldElement.equals("ion-label") && (flagOfList)  ){
	                finalOutput = "";
	            }

	            /* if ui is li  ==>  should be no bullets at start of li in reactnative */
	            /* some default styles to make it close to ionic*/
//	            if (final_ui.equals("Text")){
//	                globalAtrributevalue = "Text_style";
//	                post_styles.put(oldElement,"const Text_style ={"
//	                        + "color:'white'"+
//	                        "} ");
//	                System.out.println("where"+final_ui);
//	            }
	            if(oldElement.equals("ion-title")){
	                globalAtrributevalue = "Tilte_style";
	                post_styles.put(oldElement,"const Tilte_style ={"
	                        + "color:'white',minHeight:23,width:'100%',paddingLeft:20,paddingReight:20"+
	                        "} ");
	            }
	            /* ion-item should be before li*/
	            if(oldElement.equals("ion-item")){
	                globalAtrributevalue = "ionItem_style";
	                post_styles.put(oldElement,"const ionItem_style=" +
	                        "{borderBottomWidth:1,marginLeft:20," +
	                        " alignSelf:'stretch',alignItems:'center'," +
	                        "flexDirection:'row',justifyContent:'center'," +
	                        "minHeight:48,minWidth:'fit-content'  }");
	            }
	            if(final_ui.equals("li")){
	                globalAtrributevalue = "li_style";
	                post_styles.put(oldElement,"const li_style ={"
	                        + "marginTop:10 , marginRight:8,marginBottom:10  ,paddingLeft:20"+
	                        "} ");
	            }
	            if(final_ui.equals("Appbar")){
	                globalAtrributevalue = "Appbar_style";
	                post_styles.put(oldElement,"const Appbar_style={\n" +
	                        "backgroundColor:\"white\"," +
	                        "height:38," +
	                        "maxHeigth:100," +
	                        "width:'100%',textAlign:'center'," +
	                        "backgroundColor:'#3880ff'," +
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
	                        + "fontSize:22,margin:0,fontWeight:\"bold\",paddingLeft:20"+
	                        "} ");

	            }if(oldElement.equals("ion-content")){
	                globalAtrributevalue = "content_100vh";
	                post_styles.put(oldElement,"const content_100vh = {" +
	                        "height:'100vh'," +"} ");
	            }

	            if(!globalAtrributevalue.isEmpty()&&( (!ctx.htmlAttribute().contains("style")
	                    && !ctx.htmlAttribute().contains("class") && !ctx.htmlAttribute().contains("id"))
	                    ||ctx.htmlAttribute().isEmpty() ) ){
	                System.out.println("is empty or no style"+ctx.htmlAttribute());
	                System.out.println(ctx.getText());
	                finalOutput =  opentag + final_ui + " style={"+globalAtrributevalue +"}" + " ";
	            }
	            try {
	                FileWriter outputfile = new FileWriter(file.getName(), true);
	                outputfile.write(finalOutput);
	                outputfile.close();
	            } catch (Exception e) {
	                e.printStackTrace();
	            }
	        }


	        /* Ionic to react not closing tags */
//	      else if (converted_ui_closing_tag == null && converted_ui_noClosing_tag != null) {
	      else if(notClosingTagElemnts.containsKey(oldElement)){
	            final_ui = (String) notClosingTagElemnts.get(oldElement);
	            finalOutput = opentag + final_ui + " ";

	            /* handle ion-input and ion-label together inside ion-item*/
//	            if(oldElement.equals("ion-input") && labelFlag){
//	                finalOutput = finalOutput + " label="+'"'+labelOfInput+'"';
//	            }

	            /* handle TextInput predefined style */
	            if(final_ui.equals("TextInput")){
	                globalAtrributevalue = "TextInput_style";
	                post_styles.put(oldElement,"const TextInput_style={\n" +
	                        "    minHeight:38,width:'100%',\n" +
	                        "    display:'block'\n" +
	                        "    ,paddingTop:10,\n" +
	                        "    paddingBottom:10,\n" +
	                        "    paddingLeft:8\n" +
	                        "   }");
	            }

	            if(!globalAtrributevalue.isEmpty()&&( (!ctx.htmlAttribute().contains("style")
	                    && !ctx.htmlAttribute().contains("class") && !ctx.htmlAttribute().contains("id"))
	                    ||ctx.htmlAttribute().isEmpty() ) ){
	                finalOutput = opentag + final_ui + " style={" + globalAtrributevalue + "}" + " ";
	            }

	            try {
	                FileWriter outputfile = new FileWriter(file.getName(), true);
	                outputfile.write(finalOutput);
	                outputfile.close();

	            } catch (Exception e) {
	                e.printStackTrace();
	            }
	        }

	        /* for Html elements */
//	       else if (converted_ui_closing_tag == null && converted_ui_noClosing_tag == null) {
	         else if (html_element.containsKey(oldElement)) {
	            final_ui = (String) html_element.get(oldElement);
	            finalOutput = opentag + final_ui + " ";

	            /* if ui is li  ==>  should be no bullets at start of li in reactnative */
	            /* some default styles to make it close to ionic*/
	            if(final_ui.equals("ul")){
	                globalAtrributevalue = "ul_style";
	                post_styles.put(oldElement,"const ul_style ={"
	                        + "margin:0 , padding:0 ,listStyle:'none'"+
	                        "} ");

	            }

	        /* add predfined style prop if attribute is empty or with no style prop */
	            if ((ctx.htmlAttribute().isEmpty()  || !ctx.htmlAttribute().contains("style"))
	                    && !globalAtrributevalue.isEmpty()){
	                finalOutput =  opentag + final_ui + " style={"+globalAtrributevalue +"}" + " ";
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

	        /* add the import statement for new react-native component if not exists */


	        BufferedReader filescan;
	        short count = 0;

	        try {
	            try {
	                filescan = new BufferedReader(new FileReader(file.getName()));
//	                int flag = 0;
	                String ImportStmnt1 = "import {" + final_ui + "} from 'react-native'\n";
	                String ImportStmnt2 = "import {" + final_ui + "} from 'react-native-elements'\n";
	                String ImportStmnt3 = "import {" + final_ui + "} from 'react-native-paper'\n";


	                /*  flag = zero ==> adding the import statment*/
	                File mfile =new File(file.getName());
//	                FileReader file =new FileReader("ionic2react.js");
	                BufferedReader b = new BufferedReader(new FileReader(file.getName()));
	                String result = "";
	                String lin = "";
	                while( (lin = b.readLine()) != null){
	                    result = result + lin+ "\n";
	                }

	                if (final_ui != null) {
	                    if(!flag_Text  && final_ui.equals("Text")){
	                        result = ImportStmnt1 + result;
	                        flag_Text = true;
	                    }
	                    if(!flag_View  && final_ui.equals("View")){
	                        result = ImportStmnt1 + result;
	                        System.out.println("View View");
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

//	        if(oldElement.equals("ion-input")){
//	            labelFlag = false;
//	            labelOfInput="";
//	        }

	        /* handle ion-label inside ion-list and replace again ion-item with View */
	        if (oldElement.equals("ion-list")){
	            closingTagElemnts.replace("ion-item","View");
	            flagOfList = false;
	        }

	        String opentag="<";
	        String closetag=">";

//	        String ion_ui_elemnt= ctx.TAG_NAME().get(0).getText() ;
//	        String converted_ui1 ="";
//	        String converted_ui2 ="";

//	        converted_ui1 = (String) closingTagElemnts.get(ion_ui_elemnt);
//	        converted_ui2 = (String) notClosingTagElemnts.get(ion_ui_elemnt);

	        /* Ionic to react closing tag element */
//	        if (converted_ui1 != null && converted_ui2 == null)
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

	        /* html element */
//	        else if (converted_ui1 == null && converted_ui2 == null) {
	        else if ( html_element.containsKey(oldElement)){
	            String html = (String) html_element.get(oldElement);
	            try {
	                FileWriter outputfile = new FileWriter(file.getName(), true);
	                outputfile.write(opentag + "/"+html  + " "  + closetag + "\n");
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

//	        System.out.println("parent"+parent+index1+index2+tagName);


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
	                    if(property.equals("background")){
	                        property="backgroundColor";
	                    }
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
	            newAtrribute = "style={{" + newAttributeValue +"}}";

	            /* handle post_styles */
	            if (!globalAtrributevalue.isEmpty()){
	                if(html_element.containsKey(tagName)){
	                    String style = (String) post_styles.get(tagName);
	                    style= style.substring(0,style.lastIndexOf("}"))
	                       +", " + newAttributeValue +"}";
	                    post_styles.replace(tagName,style);

	                    // make it write nothing in the file
	                    newAtrribute="";

	                }else{
	                    newAtrribute = "style={["+globalAtrributevalue+","
	                            +"{" + newAttributeValue +"}]}";
	                }
	            }
	            // no post_styles
	            else{
	                // do nothing
	            }
	        }

	        /* class and id in ionic = styles.class or styles.id */
	        else if (attributeName.equals("class") || attributeName.equals("id")){
	            attributeValue = attributeValue.substring(1,attributeValue.length()-1);
	            /* check if attribute value  has - and replace it with _ */
	            attributeValue = attributeValue.replace("-","_");
	            newAtrribute = "style= {[" + "Styles."+attributeValue +"]}";

	            /* handle post_styles */
	            /* html elements shouldnt take style.styleName
	            * it defined inside const and applied like this {styleName}
	            * */
	            if (!globalAtrributevalue.isEmpty()){
	                if(html_element.containsKey(tagName)){
	                    newAtrribute = "style={"+globalAtrributevalue+"}";
	                } else{
	                newAtrribute = "style={["+globalAtrributevalue+","
	                        +"Styles."+attributeValue+"]}";
	                }
	            }
	            // no post_styles
	            else{
	                // do nothing
	            }
	        }
	        /*    attributes are not style or class or Id   */
	        else{
	            /* attributes are inside the list of attributes which is predefined */
	            if (attribute.containsKey(attributeName) ){
	                if (ctx.ATTVALUE_VALUE() != null){
	                    newAtrribute = (String) attribute.get(attributeName) + "= "
	                            + attributeValue;
	                }
	                else{
	                    newAtrribute = (String) attribute.get(attributeName);
	                }
	            }

	            /* for Input if it was password */
	            if (parent.contains("ion-input") && attributeName.equals("type") && attributeValue.contains("password")){
	                newAtrribute =newAtrribute + "secureTextEntry";
	            }
	        }
	        try {
	            FileWriter outputfile = new FileWriter(file.getName(), true);
	            outputfile.write(   " "+newAtrribute+" " );
	            outputfile.close();
	        } catch (Exception e) {
	            e.printStackTrace();
	        }
	    }

	    @Override public void exitHtmlAttribute(HTMLParser.HtmlAttributeContext ctx) {
	        /* global attribute value */
	        globalAtrributevalue="";
	    }


	    @Override public void enterEventbinding(HTMLParser.EventbindingContext ctx) {
	        String event = (String) attribute.get(ctx.Property().getText());

	        if (!ctx.getText().contains("$event")){
	            String event_value = ctx.ATTVALUE_VALUE().getText();
	            short i = (short) event_value.indexOf("(");
	            event_value = event_value.substring(1,i) ;
	            try {
	                FileWriter outputfile = new FileWriter(file.getName(), true);
	                outputfile.write( event + "= {"+event_value+"} ");
	                outputfile.close();
	            } catch (Exception e) {
	                e.printStackTrace();
	            }
	        }
	    }


	    @Override public void enterHtmlContent(HTMLParser.HtmlContentContext ctx) {
	        /* global attribute value */
	        globalAtrributevalue="";

	        short i_of_nl= (short) ctx.getParent().getText().indexOf(">");
	        String b_check= ctx.getParent().getText().substring(0,i_of_nl+1);
	        System.out.println(b_check);
	        if (!b_check.contains("TouchableOpacity")){
	            try{
	                FileWriter outputfile =new FileWriter(file.getName(),true);
	                if(b_check.contains("input")||b_check.contains("img")
	                    ||b_check.contains("range")||b_check.contains("icon") ){
	                    outputfile.write("/>\n");
	                    outputfile.close();
	                }
	                else{
	                    String finalOutput = ">\n";

	                    /* handle ion-label inside ion-list or ion-label inside ion-item with ion-input*/
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
	        }else{
	            String title = ctx.htmlChardata().get(0).getText().trim();
	            try{
	                FileWriter outputfile =new FileWriter(file.getName(),true);
	                outputfile.write("title =" +'"'+ title+'"' + "/>\n");
	                outputfile.close();
	            }
	            catch (Exception e){
	                e.printStackTrace();
	            }
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
	            if (!b_check.contains("TouchableOpacity") ){
	                String Text= ctx.HTML_TEXT().getText().trim();
	                if (b_check.contains("label") || b_check.contains("text")||b_check.contains("p")
	                    || b_check.contains("title") || b_check.contains("h1")
	                    || b_check.contains("h2")||b_check.contains("h3") ){

	                    /* handle ion-label content inside ion-item with ion-input*/
//	                    if (labelFlag){
//	                            // don't write anything
//	                    }
//	                    else {
	                        try {
	                            FileWriter outputfile =new FileWriter(file.getName(),true);
	                            outputfile.write( Text+"\n");
	                            outputfile.close();
	                        }
	                        catch (Exception e){
	                            e.printStackTrace();
	                        }
//	                    }
	                }
	                else{
	                    try {
	                        FileWriter outputfile =new FileWriter(file.getName(),true);
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
	            FileWriter outputfile =new FileWriter(file.getName(),true);
	            outputfile.write(comment+"\n");
	            outputfile.close();
	        }
	        catch (Exception e){
	            e.printStackTrace();
	        }
	    }



		@Override
		public ParseTree convert(String  uploadedFileName) throws IOException {
					
	        CharStream charStream= CharStreams.fromFileName(uploadedFileName);
	        HTMLLexer ionic_html_lexer = new HTMLLexer(charStream);
	        CommonTokenStream ionic_html_tokens = new CommonTokenStream(ionic_html_lexer);
	        
	        HTMLParser ionic_html_parser=new HTMLParser(ionic_html_tokens);
	        ionic_html_parser.setBuildParseTree(true); 
	        ParseTree tree = ionic_html_parser.htmlDocument();
	      
	      
		       
			return tree;
		}

		@Override
		public void setFileName(String fileName) {
			file=new File(fileName);
			
		}

}
