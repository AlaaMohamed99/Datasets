package com.example.translator.service;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;
//import com.example.translator.antlr4.*;

import com.example.translator.JavaScriptLexer;
import com.example.translator.JavaScriptParser;
import com.example.translator.JavaScriptParserBaseListener;

@Component("React_Native2HtmlConverter")
public class React_Native2HtmlConverter extends JavaScriptParserBaseListener implements CodeConverter {

	    private File file;
	    private  Map <String, String> Jsx2ionicMap;
	    private String ElementName;
	    private  boolean has_closing_tag;
	    private  String AttributeName;
	    private  boolean has_attribute;
	    private  FileWriter OutputFile;
	    private boolean put_label;
	    private String Label;

	    public React_Native2HtmlConverter() throws IOException {
	        super();
	        Jsx2ionicMap = new HashMap<>();
	        ElementName="";
	        AttributeName="";
	        has_attribute=false;
	        has_closing_tag = false;
	        put_label = false;
	        Label="";
	        Jsx2ionicMap.put("Button", "ion-button");
	        Jsx2ionicMap.put("Appbar", "ion-toolbar");
	        Jsx2ionicMap.put("label","");
	        Jsx2ionicMap.put("Text", "ion-text");
	        Jsx2ionicMap.put("View", "div");
	        Jsx2ionicMap.put("</TextInput>", "</ion-input>");
	        Jsx2ionicMap.put("</Button>","</ion-button>");
	        Jsx2ionicMap.put("onPress", "(Click)");
	        Jsx2ionicMap.put("TextInput","ion-input");
	        Jsx2ionicMap.put("value","value");
	        Jsx2ionicMap.put("onChangeText","(ionChange)");
	        Jsx2ionicMap.put("color","color");
	        Jsx2ionicMap.put("style","class");
	        Jsx2ionicMap.put("title","label");
	        Jsx2ionicMap.put("FlatList","ion-list");
	        Jsx2ionicMap.put("ul","ul");
	        Jsx2ionicMap.put("li","li");
	        Jsx2ionicMap.put("ol","ol");
	        Jsx2ionicMap.put("div","div");
	        Jsx2ionicMap.put("backgroundColor","background-color");
	        Jsx2ionicMap.put("TouchableOpacity","ion-button");
	        Jsx2ionicMap.put("</CheckBox>","</ion-checkbox>");
	        Jsx2ionicMap.put("CheckBox","ion-checkbox");
	        Jsx2ionicMap.put("onValueChange","(ionChange)");
	        Jsx2ionicMap.put("placeholder","placeholder");
	        Jsx2ionicMap.put("value","[(ngModel)]");
	        Jsx2ionicMap.put("secureTextEntry","type");

	    }

	  /*  public void CreateFile() {
	        try {
	            if (file.createNewFile()) {
	                System.out.println("File created: " + file.getName());
	            } else {
	                System.out.println("File already exists.");
	            }
	            OutputFile = new FileWriter(file.getName(), true);
	            OutputFile.write("<ion-content>" + "\n");
	            OutputFile.close();
	        } catch (IOException e) {
	            System.out.println("An error occurred.");
	            e.printStackTrace();
	        }
	    }*/
	    @Override public void enterHtmlElements(JavaScriptParser.HtmlElementsContext ctx)
	    {
	        FileWriter OutputFile = null;
	        try {
	            OutputFile = new FileWriter(file.getName(),true);
	            OutputFile.write("<ion-content>" + "\n");
	            OutputFile.close();
	        }
	        catch(IOException e)
	        {
	            e.printStackTrace();
	        }
	    }
	    @Override public void exitHtmlElements(JavaScriptParser.HtmlElementsContext ctx)
	    {
	        FileWriter OutputFile = null;
	        try {
	            OutputFile = new FileWriter(file.getName(),true);
	            OutputFile.write("</ion-content>"+"\n");
	            OutputFile.close();

	        }
	        catch(IOException e)
	        {
	            e.printStackTrace();
	        }
	    }
	    @Override public void enterHtmlElement(JavaScriptParser.HtmlElementContext ctx)
	    {
	       has_attribute=false;
	       has_closing_tag=false;
	    }

	    @Override
	    public void exitHtmlElement(JavaScriptParser.HtmlElementContext ctx){

	        if(put_label)
	       {
	           FileWriter OutputFile=null;
	         try
	       {
	            OutputFile = new FileWriter(file.getName(),true);
	            OutputFile.write("</ion-content>"+"\n");
	            OutputFile.close();
	        }
	        catch(IOException e)
	        {
	            e.printStackTrace();
	        }
	       }
	        if(!has_closing_tag)
	        {
	             FileWriter OutputFile=null;
	         try
	       {
	            OutputFile = new FileWriter(file.getName(),true);
	            OutputFile.write(Jsx2ionicMap.get("</"+ElementName+">") +"\n");
	            OutputFile.write("</ion-item>\n");
	            OutputFile.close();
	        }
	        catch(IOException e)
	        {
	            e.printStackTrace();
	        }
	        }
	       has_closing_tag=false;
	       put_label=false;
	       Label="";
	    }

	    @Override
	    public void enterHtmlContent(JavaScriptParser.HtmlContentContext ctx)
	    {
	        FileWriter OutputFile = null;
	         try
	       {
	            OutputFile = new FileWriter(file.getName(),true);
	            OutputFile.write(">"+"\n");
	            OutputFile.close();
	        }
	        catch(IOException e)
	        {
	            e.printStackTrace();
	        }
	        has_closing_tag=false;
	    }


	    @Override
	    public void exitHtmlContent(JavaScriptParser.HtmlContentContext ctx)
	    {

	    }

	    @Override
	    public void enterHtmlTagStartName(JavaScriptParser.HtmlTagStartNameContext ctx)
	    {
	        has_closing_tag = true;
	        FileWriter OutputFile = null;
	         try
	       {
	            OutputFile = new FileWriter(file.getName(),true);
	            OutputFile.write("<" + Jsx2ionicMap.get(ctx.htmlTagName().getText()));
	            OutputFile.close();
	        }
	        catch(IOException e)
	        {
	            e.printStackTrace();
	        }
	    }
	    @Override
	    public void enterHtmlTagClosingName(JavaScriptParser.HtmlTagClosingNameContext ctx)
	    {
	        has_closing_tag=true;
	        FileWriter OutputFile = null;
	         try
	       {
	            OutputFile = new FileWriter(file.getName(),true);
	            OutputFile.write("</"+Jsx2ionicMap.get(ctx.htmlTagName().getText())+">"+"\n");
	            OutputFile.close();
	        }
	        catch(IOException e)
	        {
	            e.printStackTrace();
	        }
	    }


	    @Override
	    public void enterHtmlTagName(JavaScriptParser.HtmlTagNameContext ctx) {
	       if(!has_closing_tag)
	       {
	                   FileWriter OutputFile = null;
	         try
	       {
	            OutputFile = new FileWriter(file.getName(),true);
	            OutputFile.write("<ion-item>\n");
	            OutputFile.write("<" + Jsx2ionicMap.get(ctx.Identifier().getText()));
	            OutputFile.close();
	        }
	        catch(IOException e)
	        {
	            e.printStackTrace();
	        }
	       }
	       ElementName = ctx.Identifier().getText();
	    }


	    @Override
	    public void exitHtmlTagName(JavaScriptParser.HtmlTagNameContext ctx) {

	    }


	    @Override
	    public void enterHtmlAttribute(JavaScriptParser.HtmlAttributeContext ctx) {
	        FileWriter OutputFile = null;
	         try
	       {
	            OutputFile = new FileWriter(file.getName(),true);
	            OutputFile.write("  ");
	            OutputFile.close();
	        }
	        catch(IOException e)
	        {
	            e.printStackTrace();
	        }

	        AttributeName =ctx.htmlAttributeName().getText();
	        has_attribute=true;
	    }

	    @Override
	    public void exitHtmlAttribute(JavaScriptParser.HtmlAttributeContext ctx)
	    {
	        has_attribute=false;
	    }


	    @Override
	    public void enterHtmlAttributeName(JavaScriptParser.HtmlAttributeNameContext ctx) {
	        if(!Jsx2ionicMap.containsKey(AttributeName))return;
	       if(!ctx.getText().equals("label")&&!AttributeName.equals("title"))
	       {
	           FileWriter OutputFile = null;
	         try
	       {
	            OutputFile = new FileWriter(file.getName(),true);
	            OutputFile.write(Jsx2ionicMap.get(ctx.getText()));
	            OutputFile.close();
	        }
	        catch(IOException e)
	        {
	            e.printStackTrace();
	        }
	       }
	       else {
	           put_label=true;
	       }
	    }

	    @Override
	    public void exitHtmlAttributeName(JavaScriptParser.HtmlAttributeNameContext ctx) {
	        if(!Jsx2ionicMap.containsKey(AttributeName))return;
	       if(!AttributeName.equals("label")&&!AttributeName.equals("title"))
	       {
	          FileWriter OutputFile = null;
	         try
	       {
	            OutputFile = new FileWriter(file.getName(),true);
	            OutputFile.write("=");
	            OutputFile.close();
	        }
	        catch(IOException e)
	        {
	            e.printStackTrace();
	        }
	       }
	    }

	    /**
	     * {@inheritDoc}
	     *
	     * <p>The default implementation does nothing.</p>
	     */
	    @Override
	    public void enterHtmlChardata(JavaScriptParser.HtmlChardataContext ctx){
	        String identifiers = ctx.children.toString();
	        System.out.println(identifiers);
	       String[] ans= identifiers.split(",");
	       ans[0]=ans[0].replace('[',' ');
	       ans[ans.length-1]=ans[ans.length-1].replace(']',' ');
	       String empty="";
	       for(int i =0;i<ans.length;i++)
	       {
	           empty+=ans[i];
	       }
	       System.out.println(empty);
	        FileWriter OutputFile = null;
	         try
	       {
	            OutputFile = new FileWriter(file.getName(),true);
	            OutputFile.write(empty.replace('"',' ').replace(" ","")+"\n");
	            OutputFile.close();
	        }
	        catch(IOException e)
	        {
	            e.printStackTrace();
	        }

	    }

	    @Override
	    public void exitHtmlChardata(JavaScriptParser.HtmlChardataContext ctx) {
	    }


	    @Override
	    public void enterHtmlAttributeValue(JavaScriptParser.HtmlAttributeValueContext ctx) {
	        String answer= ctx.getText();
	        if(!Jsx2ionicMap.containsKey(AttributeName))return;
	        answer=answer.replace("{","").replace("}","").replace(";","");
	        if(AttributeName.equals("secureTextEntry"))
	        {
	            answer='"'+"password"+'"';
	        }
	        if(put_label&&(AttributeName.equals("label")|| AttributeName.equals("title"))) Label =answer.replace('"',' ').replace(" ","");
	        if(AttributeName.equals("onPress")|| AttributeName.equals("onChangeText")|| AttributeName.equals("onValueChange"))
	        {

	            answer ='"'+ answer.replace("this","").replace(".","");
	            int id=-1;
	            if(!answer.contains("("))answer+="()";
	            else
	            {
	                id = answer.indexOf("=>");
	                answer = '"'+answer.substring(id+2,answer.length());
	            }
	            answer+='"';
	        }
	        else if(AttributeName.equals("style"))
	        {
	            answer = '"'+answer.replace("this"," ").replace('.',' ').replace("styles","").replace(" ","")+'"';
	        }

	       if(!(AttributeName.equals("label")|| AttributeName.equals("title")))
	        {
	            FileWriter OutputFile = null;
	         try
	       {
	            OutputFile = new FileWriter(file.getName(),true);
	            OutputFile.write(answer);
	            OutputFile.close();
	        }
	        catch(IOException e)
	        {
	            e.printStackTrace();
	        }

	        }
	    }

	    /**
	     * {@inheritDoc}
	     *
	     * <p>The default implementation does nothing.</p>
	     */
	    @Override
	    public void exitHtmlAttributeValue(JavaScriptParser.HtmlAttributeValueContext ctx) {
	        AttributeName ="";
	    }

	public ParseTree convert(String  uploadedFileName) throws IOException {
		   OutputFile = new FileWriter(file.getName(), true);
           OutputFile.write("<ion-content>" + "\n");
           OutputFile.close();
	    CharStream charStream= CharStreams.fromFileName(uploadedFileName);
        JavaScriptLexer lexer = new JavaScriptLexer(charStream);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        JavaScriptParser parser = new JavaScriptParser(tokens);
        parser.setBuildParseTree(true);
        ParseTree tree = parser.program();
     
        return tree;
	}

	@Override
	public void setFileName(String fileName) {
		file=new File(fileName);
		
	}

	@Override
	public File getFile() {
		// TODO Auto-generated method stub
		return file;
	}

}
