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
//import com.example.translator.antlr4.*;

import com.example.translator.*;

@Component("React_Native2HtmlConverter")
public class React_Native2HtmlConverter extends JavaScriptParserBaseListener implements CodeConverter {
    private File file;
    private FileWriter OutputFile;
    private  UIElementHandler uiElementHandler;

    public  React_Native2HtmlConverter()
    {

    }
   private void  setOutputFile()
    {
        if(!file.getName().isEmpty())
        {
            try
            {
                OutputFile = new FileWriter(file.getName(),true);
            }
            catch (Exception e)
            {
                e.printStackTrace();
            }
        }
    }
    private void writeInOutputFile(String output)
    {
        try
          {
              setOutputFile();
              OutputFile.write(output);
              OutputFile.close();
          }
          catch (Exception e)
          {
              e.printStackTrace();
          }
    }
   	@Override public void enterHtmlElements(JavaScriptParser.HtmlElementsContext ctx)
    {
        writeInOutputFile("<ion-content>\n");

    }
    @Override public void enterHtmlElement(JavaScriptParser.HtmlElementContext ctx)
    {
        String ElementName="";
        if(ctx.htmlTagName()!=null)
        {
            ElementName= ctx.htmlTagName().getText();
        }
        else
        {
            ElementName=ctx.htmlTagStartName().get(0).getText();
        }

        if("Appbar".equals(ElementName))
        {
            uiElementHandler = new AppbarHandler();
        }
        else if("Button".equals(ElementName))
        {
            uiElementHandler =  new ButtonHandler();
        }
        else if("TextInput".equals(ElementName))
        {
            uiElementHandler = new TextInputHandler();
        }
        else if("RadioButton".equals(ElementName))
        {
            uiElementHandler = new RadioButtonHandler();
        }
        else if("View".equals(ElementName)||"SafeAreaView".equals(ElementName))
        {
            uiElementHandler = new ViewHandler();
        }
        else if("Text".equals(ElementName))
        {
            uiElementHandler = new TextHandler();
        }
        else if("CheckBox".equals(ElementName))
        {
            uiElementHandler = new CheckBoxHandler();
        }
        else if("TouchableOpacity".equals(ElementName))
        {
            uiElementHandler = new TouchableOpacityHandler();
        }
        else if("Image".equals(ElementName))
        {
            uiElementHandler = new ImageHandler();
        }
        uiElementHandler.setHtmlElementContext(ctx);
        writeInOutputFile(uiElementHandler.convertCode());
    }
@Override public void exitHtmlElement(JavaScriptParser.HtmlElementContext ctx)
{
    String ElementName="";
        if(ctx.htmlTagName()!=null)
        {
            ElementName= ctx.htmlTagName().getText();
        }
        else
        {
            ElementName=ctx.htmlTagStartName().get(0).getText();
        }
     if("View".equals(ElementName))
     {
         writeInOutputFile("</div>\n");
     }
     else if("TouchableOpacity".equals(ElementName))
     {
         writeInOutputFile("<ion-button>\n");
     }

}
	@Override 
	public void exitHtmlElements(JavaScriptParser.HtmlElementsContext ctx)
    {
        writeInOutputFile("</ion-content>\n");
    }

	public ParseTree convert(String  uploadedFileName) throws IOException {
		setOutputFile();
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
