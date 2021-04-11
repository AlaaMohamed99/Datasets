package com.example.translator.service;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

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

	 
	   private  Map <String,String> closingTagElemnts;
	   private  Map <String,String> notClosingTagElemnts;
	   private  Map <String,String> attribute;

	   private  Map <String,String> attribute_value;
	    
	   private  File file;

	

	public void setFile(File file) {
		this.file = file;
	}
	
	@Override
	public File getFile() {
		// TODO Auto-generated method stub
		return file;
	}

		public Html2React_NativeConverter() throws IOException {

	        attribute =new HashMap<String,String>();
	        attribute.put("class","style");
	        attribute.put("id","style");
	        attribute.put("style","style");
	        attribute.put("color","color");
	        attribute.put("size","size");
	        attribute.put("click","onPress");
	        attribute.put("disabled","disabled");
	        attribute.put("ionChange","onChangeText");
	        attribute.put("placeholder","placeholder");
	        attribute.put("max","maximumValue");
	        attribute.put("min","minimumValue");
	        attribute.put("placeholder","placeholder");
	        attribute.put("placeholder","placeholder");


	        closingTagElemnts =new HashMap<String,String>();
	        closingTagElemnts.put("ion-text","Text");
	        closingTagElemnts.put("ion-list-header","h2");
	        closingTagElemnts.put("ion-content","View");
	        closingTagElemnts.put("h1","Text h1");
	        closingTagElemnts.put("h2","Text h2");
	        closingTagElemnts.put("h3","Text h3");
	        closingTagElemnts.put("h4","Text h4");
	        closingTagElemnts.put("ion-header","View");
	        closingTagElemnts.put("ion-footer","View");
	        closingTagElemnts.put("ion-range","slider");
	        closingTagElemnts.put("ion-label","Text");
	        closingTagElemnts.put("div","View");


	        notClosingTagElemnts = new HashMap<String,String>();
	        notClosingTagElemnts.put("ion-img","Image");
	        notClosingTagElemnts.put("ion-list","Flatlist");
	        notClosingTagElemnts.put("ion-button","Button");
	        notClosingTagElemnts.put("ion-icon","Icon");
	        notClosingTagElemnts.put("ion-input","Input");


	    /*    
	        try {
	            if (file.createNewFile()) {
	                System.out.println("New file is created " + file.getName());
	                FileWriter outputfile = new FileWriter(file.getName());
	                outputfile.close();
	            } else {
	                System.out.println("File already exists.");
	            }
	        } catch (Exception e) {
	            System.out.println("An error occurred.");
	            e.printStackTrace();
	        }*/
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

	    @Override
	    public void enterHtmlDocument(HTMLParser.HtmlDocumentContext ctx) {
	        String initial_import = "import React from 'react'; " +
	                "\nimport { View } from 'react-native';";
	        try {
	            FileWriter outputfile = new FileWriter(file.getName());
	            outputfile.write(initial_import+"\n"+"export default class"+ file.getName().split("\\.")[0].split("\\(")[0] +"extends React.Component {\n" +
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
	            FileWriter outputfile = new FileWriter(file.getName(), true);
	            outputfile.write("\t</View>\n" +
	                    "  );\n" +
	                    "} \n"+
	                    "}");
	            outputfile.close();
	        } catch (Exception e) {
	            System.out.println("error exitHtmlDocumnet");
	        }

	        try {
	            //File file = new File("E:\\antlr_project\\ionic2react.js");
	            FileInputStream fis = new FileInputStream(file);
	            byte[] byteArray = new byte[(int)file.length()];
	            fis.read(byteArray);
	            String data = new String(byteArray);
	            String[] stringArray = data.split("\n");
	            int lastline_index = stringArray.length;
	            System.out.println("Number of lines in the file are :"+lastline_index);
	            fis.close();
	        }
	        catch (Exception e){
	            e.printStackTrace();
	        }

	    }

	    Boolean f=true;



	    @Override
	    public void enterHtmlElement(HTMLParser.HtmlElementContext ctx) {
	        String attribute_name = "";
	        String attribute_value = "";
	        Boolean flag_htmlattr = false;
	        String opentag = ctx.TAG_OPEN().get(0).getText();
	        String closetag = ctx.TAG_CLOSE().get(0).getText();
	        String event_binding = "";


	        //getting ui_element Tag_name
	        String ion_ui_elemnt = ctx.TAG_NAME().get(0).getText();
	        System.out.println("tag name:" + ion_ui_elemnt);
	        String converted_ui1 = "";
	        String converted_ui2 = "";


	        // check if there is any binding
	        if (!ctx.binding().isEmpty()) {
	            event_binding = ctx.binding().get(0).eventbinding().Property().getText();
	        }


	        //check if there is attribute value and split it
//	        if (!ctx.htmlAttribute().isEmpty()) {
//	            attribute_name = ctx.htmlAttribute().get(0).TAG_NAME().getText();
//	            attribute_value = ctx.htmlAttribute().get(0).ATTVALUE_VALUE().getText();
//	            flag_htmlattr = true;
	//
//	            // number of occurrences of (:) in attribute value = number of properties
//	            short counter = occurrenceNumber(':',attribute_value);
//	            String [] properties = new String[counter];
//	            System.out.println("counter"+counter);
	//
//	            // substring the attribute_values
//	            String property="";
//	            String property_value="";
//	            short len = (short) attribute_value.length();
//	            short pos2_initial = (short) attribute_value.indexOf(";",0);
	//
//	            short i =1;
	//
//	            if (counter == 1){
//	                short pos1 = (short) attribute_value.indexOf(":",i);
//	                property= attribute_value.substring(1,pos1 );
//	                property_value = attribute_value.substring(pos1+1 );
//	                property_value = property_value.replace(";","");
//	                property_value = property_value.substring(0,property_value.length()-1);
	//
//	                System.out.println("string: "+property + property_value);
//	            }
//	            else if (counter > 1) {
//	                // adding ; at the end if it is not there
//	                if (attribute_value.indexOf(";",len-2) < 0)
//	                {
//	                    attribute_value = attribute_value.substring(0,len-1) + ";"
//	                            +attribute_value.substring(len-1) ;
////	                    System.out.println("aa"+attribute_value);
	//
//	                }
//	                // dividing the attribute value to get each property alone
//	                while (i < attribute_value.length() ){
//	                    short pos1 = (short) attribute_value.indexOf(":",i);
//	                    if (pos1 == -1) break;
//	                    short pos2 = (short) attribute_value.indexOf(";",pos1);
//	                    property = attribute_value.substring(i,pos1 );
//	                    property_value = attribute_value.substring(pos1+1,pos2 );
//	                    i = (short) (pos2 +1);
//	                    System.out.println("pp"+property+property_value);
//	                }
//	            }
//	        }

	        String final_ui = "";
	        converted_ui1 = (String) closingTagElemnts.get(ion_ui_elemnt);
	        converted_ui2 = (String) notClosingTagElemnts.get(ion_ui_elemnt);

	        if (converted_ui1 == null) final_ui = converted_ui2;
	        if (converted_ui2 == null) final_ui = converted_ui1;

	        if (ion_ui_elemnt.equals("ion-content")) {
	            final_ui = "View className='content'";
	        }
	        if (ion_ui_elemnt.equals("ion-header")) {
	            final_ui = "View className='header'";
	        }
	        if (ion_ui_elemnt.equals("ion-footer")) {
	            final_ui = "View className='footer'";
	        }


	        if (converted_ui1 != null && converted_ui2 == null) {
	            try {
	                FileWriter outputfile = new FileWriter(file.getName(), true);
	                outputfile.write(opentag + final_ui  + closetag + "\n");
	                outputfile.close();
	            } catch (Exception e) {
	                e.printStackTrace();
	            }
	        }
	        if (converted_ui1 == null && converted_ui2 != null) {
	            try {
	                FileWriter outputfile = new FileWriter(file.getName(), true);
	                outputfile.write(opentag + final_ui + "/" + closetag + "\n");
	                outputfile.close();

	            } catch (Exception e) {
	                e.printStackTrace();
	            }

	        }
	        if (converted_ui1 == null && converted_ui2 == null) {
	            try {
	                FileWriter outputfile = new FileWriter(file.getName(), true);
	                outputfile.write(opentag + ion_ui_elemnt + " " + closetag + "\n");
	                outputfile.close();
	            } catch (Exception e) {
	                e.printStackTrace();
	            }
	        }

	        /* ************    handle Text or content    ***************** */

	        String charDataText = "";
	        System.out.println(ctx.htmlContent().htmlChardata().get(0).getText());
	        if ( ctx.htmlContent().htmlChardata().get(0).getText()!= null && ctx.htmlContent().htmlChardata().get(0).HTML_TEXT() != null) {
	            charDataText = ctx.htmlContent().htmlChardata().get(0).HTML_TEXT().getText().trim();

	            if (final_ui == "Text") {
	                System.out.println("ion-text yes");
	                try {
	                    FileWriter outputfile = new FileWriter(file.getName(), true);
	                    outputfile.write( charDataText + "\n");
	                    outputfile.close();
	                } catch (Exception e) {
	                    e.printStackTrace();
	                }
	            } else {
	                try {
	                    FileWriter outputfile = new FileWriter(file.getName(), true);
	                    outputfile.write("<Text>" + charDataText + "</Text>" + "\n");
	                    outputfile.close();
	                } catch (Exception e) {
	                    e.printStackTrace();
	                }
	            }
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
	                System.out.println("test try");
	                FileWriter outputfile = new FileWriter(file.getName(), true);
	                System.out.println("test");
	                outputfile.write(  opentag + "/" + converted_ui1 + " " + closetag + "\n");
	                outputfile.close();
	            } catch (Exception e) {
	                e.printStackTrace();
	            }
	        }
	        if (converted_ui1 == null && converted_ui2 == null) {
	            try {
	                System.out.println("test try");
	                FileWriter outputfile = new FileWriter(file.getName(), true);
	                System.out.println("test");
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
	        String property="";
	        String propertyValue="";

	        if(ctx.ATTVALUE_VALUE() != null) {
	            attributeValue = ctx.ATTVALUE_VALUE().getText();
	        }
	        else attributeValue ="null";
	        attributeName = ctx.TAG_NAME().getText();
	        System.out.println("from attribute" + attributeName + attributeValue);


	        short counter = occurrenceNumber(':',attributeValue);
	        String [] properties = new String[counter];
	        System.out.println("counter fromattt"+counter);

	        // substring the attribute_values

	        short len = (short) attributeValue.length();
	        short pos2_initial = (short) attributeValue.indexOf(";",0);

	        short i =1;
	        if (counter ==0)
	        {
	            propertyValue="";
	            property="";
	            System.out.println("non");

	        }

	        if (counter == 1){
	            short pos1 = (short) attributeValue.indexOf(":",i);
	            property= attributeValue.substring(1,pos1 );
	            propertyValue = attributeValue.substring(pos1+1 );
	            propertyValue = propertyValue.replace(";","");
	            propertyValue = propertyValue.substring(0,propertyValue.length()-1);

	            System.out.println("string: fromattt "+property + propertyValue);
	        }
	        else if (counter > 1) {
	            // adding ; at the end if it is not there
	            if (attributeValue.indexOf(";",len-2) < 0)
	            {
	                attributeValue = attributeValue.substring(0,len-1) + ";"
	                        +attributeValue.substring(len-1) ;
	            }
	            // dividing the attribute value to get each property alone
	            while (i < attributeValue.length() ){
	                short pos1 = (short) attributeValue.indexOf(":",i);
	                if (pos1 == -1) break;
	                short pos2 = (short) attributeValue.indexOf(";",pos1);
	                property = attributeValue.substring(i,pos1 );
	                propertyValue = attributeValue.substring(pos1+1,pos2 );
	                i = (short) (pos2 +1);
	                System.out.println("pp fromattt"+property+propertyValue);
	            }
	        }
	        String newAttributeName = "";
	        if (!attributeName.isEmpty()){
	            System.out.println("yes" );
	            if(attribute.get(attributeName) != null ){
	                newAttributeName = (String) attribute.get(attributeName);
	                System.out.println("new"+newAttributeName);

	            }
	        }



	    }

	    @Override public void exitHtmlAttribute(HTMLParser.HtmlAttributeContext ctx) {

	    }



	    @Override
	    public void enterHtmlContent(HTMLParser.HtmlContentContext ctx) {
	    }

	    @Override
	    public void exitHtmlContent(HTMLParser.HtmlContentContext ctx) {
	    }


	    @Override
	    public void enterHtmlChardata(HTMLParser.HtmlChardataContext ctx) {
	    }

	    @Override
	    public void exitHtmlChardata(HTMLParser.HtmlChardataContext ctx)
	    { }


		@Override
		public ParseTree convert(String  uploadedFileName) throws IOException {
					
	        CharStream charStream= CharStreams.fromFileName(uploadedFileName);
	        HTMLLexer ionic_html_lexer = new HTMLLexer(charStream);
	        CommonTokenStream ionic_html_tokens = new CommonTokenStream(ionic_html_lexer);
	        
	        HTMLParser ionic_html_parser=new HTMLParser(ionic_html_tokens);
	        ionic_html_parser.setBuildParseTree(true); 
	        ParseTree tree = ionic_html_parser.htmlDocument();
	      
	      
	 
	      //  Ionic2reactConverter mylistner = new Ionic2reactConverter( );
	       
	      //  walker.walk(mylistner,tree);
			return tree;
		}

		@Override
		public void setFileName(String fileName) {
			file=new File(fileName);
			
		}

}
