import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

/**
 * React_Native2HtmlConverter
 */
public class ReactNatie2HtmlConverter extends  JavaScriptParserBaseListener
{
    private File file;
    private FileWriter OutputFile;
    private AppbarHandler appbarhandler;
    private  ButtonHandler buttonHandler;
    private  TextInputHandler textInputHandler;
    private  RadioButtonHandler radioButtonHandler;
    private  ViewHandler viewHandler;
    private  TextHandler textHandler;
    private  CheckBoxHandler checkBoxHandler;
    private  TouchableOpacityHandler touchableOpacityHandler;

    public  ReactNatie2HtmlConverter()
    {

    }
   private void  setOutputFile()
    {
        if(!file.getName().isEmpty())
        {
              System.out.println("File Name is: "+file.getName());
            try
            {
                OutputFile = new FileWriter(file.getName(),true);
            }
            catch (Exception e)
            {
                System.out.println("Something Went Wrong!");
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
        //System.out.println(ElementName);

        if(ElementName.equals("Appbar"))
        {
            appbarhandler = new AppbarHandler();
            appbarhandler.setHtmlElementContext(ctx);
            writeInOutputFile(appbarhandler.convertCode());
        }
        else if(ElementName.equals("Button"))
        {
            buttonHandler = new ButtonHandler();
            buttonHandler.setHtmlElementContext(ctx);
            writeInOutputFile(buttonHandler.convertCode());
        }
        else if(ElementName.equals("TextInput"))
        {
            textInputHandler = new TextInputHandler();
            textInputHandler.setHtmlElementContext(ctx);
            writeInOutputFile(textInputHandler.convertCode());
        }
        else if(ElementName.equals("RadioButton"))
        {
            radioButtonHandler = new RadioButtonHandler();
            radioButtonHandler.setHtmlElementContext(ctx);
            writeInOutputFile(radioButtonHandler.convertCode());
        }
        else if(ElementName.equals("View"))
        {
            viewHandler = new ViewHandler();
            viewHandler.setHtmlElementContext(ctx);
            writeInOutputFile(viewHandler.convertCode());
        }
        else if(ElementName.equals("Text"))
        {
            textHandler = new TextHandler();
            textHandler.setHtmlElementContext(ctx);
            writeInOutputFile(textHandler.convertCode());
        }
        else if(ElementName.equals("CheckBox"))
        {
            checkBoxHandler = new CheckBoxHandler();
            checkBoxHandler.setHtmlElementContext(ctx);
            writeInOutputFile(checkBoxHandler.convertCode());
        }
        else if(ElementName.equals("TouchableOpacity"))
        {
            touchableOpacityHandler = new TouchableOpacityHandler();
            touchableOpacityHandler.setHtmlElementContext(ctx);
            writeInOutputFile(touchableOpacityHandler.convertCode());
        }
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
     if(ElementName.equals("View"))
     {
         writeInOutputFile(viewHandler.endofElement());
     }
     else if(ElementName.equals("TouchableOpacity"))
     {
         writeInOutputFile(touchableOpacityHandler.endofElement());
     }

}
	@Override public void exitHtmlElements(JavaScriptParser.HtmlElementsContext ctx)
    {
        writeInOutputFile("</ion-content>\n");
    }
    	public ParseTree convert(String  uploadedFileName) throws IOException
    {
	    CharStream charStream= CharStreams.fromFileName(uploadedFileName);
        JavaScriptLexer lexer = new JavaScriptLexer(charStream);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        JavaScriptParser parser = new JavaScriptParser(tokens);
        parser.setBuildParseTree(true);
        ParseTree tree = parser.program();
        return tree;
	}

	//@Override
	public void setFileName(String fileName)
    {
		file=new File(fileName);
	}

	//@Override
	public File getFile()
    {
		return file;
	}
}

