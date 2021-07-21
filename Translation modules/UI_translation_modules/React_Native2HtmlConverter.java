import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTree;

/**
 * React_Native2HtmlConverter
 */
public class React_Native2HtmlConverter extends JavaScriptParserBaseListener
{
	    private File file;
	    private  userInterfaceMapper userinterfacemapper;
	    private FileWriter OutputFile;
	    private boolean inHtmlContent;
	    private boolean RadioButton;
	    private String ElementName;
	    private  boolean has_closing_tag;
	    private  String AttributeName;
	    private  boolean has_attribute;
	    private boolean put_label;
	    private String Label;
	    private boolean hasStyling;
        private String Styling;

    public React_Native2HtmlConverter()
    {
        RadioButton=false;
        inHtmlContent=false;
        userinterfacemapper = new userInterfaceMapper();
        hasStyling=false;
        ElementName="";
        AttributeName="";
        has_attribute=false;
        has_closing_tag = false;
        put_label = false;
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
       String OutputCode = "<ion-content>"+"\n";
       writeInOutputFile(OutputCode);
    }
    @Override public void exitHtmlElements(JavaScriptParser.HtmlElementsContext ctx)
    {
       String OutputCode = "</ion-content>"+"\n";
       writeInOutputFile(OutputCode);
    }
    @Override public void enterHtmlElement(JavaScriptParser.HtmlElementContext ctx)
    {
       has_attribute=false;
       has_closing_tag=false;
    }

    @Override
    public void exitHtmlElement(JavaScriptParser.HtmlElementContext ctx)
    {

        String OutputCode="";
        if(ElementName.equals("Appbar"))
        {
            OutputCode +="</ion-toolbar>\n";
        }
        if(!has_closing_tag)
        {
            if(put_label)
            {
                OutputCode+= "\n<ion-label>"+Label+"</ion-label>\n";
            }
            OutputCode += userinterfacemapper.getTagMapping("</"+ElementName+">") +"\n";
           if(ElementName.equals("RadioButton"))
            {
                OutputCode+="</ion-radio-group>\n";
            }
           writeInOutputFile(OutputCode);
        }

       has_closing_tag=false;
       put_label=false;
       Label="";
       hasStyling=false;
    }

    @Override
    public void enterHtmlContent(JavaScriptParser.HtmlContentContext ctx)
    {
        inHtmlContent=true;
        String OutputCode="";
        OutputCode+=">"+"\n";
        if(ElementName.equals("Text")&&ctx.getChild(0).getText().contains("{"))
           {
               OutputCode+="{"+ctx.getChild(0).getText()+"}";
           }
        writeInOutputFile(OutputCode);
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
        String OutputCode="";
            if(ctx.htmlTagName().getText().equals("Appbar"))
            {
                OutputCode+="<ion-header class="+'"'+"Appbar"+'"'+">\n";
            }

              OutputCode+="<" + userinterfacemapper.getTagMapping(ctx.htmlTagName().getText());
              writeInOutputFile(OutputCode);
    }
    @Override
    public void enterHtmlTagClosingName(JavaScriptParser.HtmlTagClosingNameContext ctx)
    {
        has_closing_tag=true;
        String OutputCode="";
        OutputCode+="</"+userinterfacemapper.getTagMapping(ctx.htmlTagName().getText())+">"+"\n";
        if(ctx.htmlTagName().getText().equals("Appbar"))
        {
            OutputCode+="</"+"ion-header>\n";
        }
        writeInOutputFile(OutputCode);
    }



    @Override
    public void enterHtmlTagName(JavaScriptParser.HtmlTagNameContext ctx)
    {
        ElementName = ctx.Identifier().getText();
       if(!has_closing_tag)
       {
           String Outputcode="";
           if(ctx.Identifier().getText().equals("RadioButton"))
           {
              Outputcode+="<ion-radio-group>\n";
           }
            Outputcode+="<" + userinterfacemapper.getTagMapping(ctx.Identifier().getText());
            writeInOutputFile(Outputcode);
        }
    }


    @Override
    public void exitHtmlTagName(JavaScriptParser.HtmlTagNameContext ctx)
    {

    }

    @Override
    public void enterHtmlAttribute(JavaScriptParser.HtmlAttributeContext ctx)
    {
        writeInOutputFile(" ");
        AttributeName =ctx.htmlAttributeName().getText();
        has_attribute=true;
    }

    @Override
    public void exitHtmlAttribute(JavaScriptParser.HtmlAttributeContext ctx)
    {
        has_attribute=false;
    }


    @Override
    public void enterHtmlAttributeName(JavaScriptParser.HtmlAttributeNameContext ctx)
    {
        if(!userinterfacemapper.ContainsMapping(AttributeName))
        {
            return;
        }
       if(ctx.getText().equals("label")||AttributeName.equals("title"))
       {
           put_label=true;
       }
       else
        {
           String OutputCode="";
           OutputCode+=userinterfacemapper.getTagMapping(ctx.getText());
           writeInOutputFile(OutputCode);
        }
    }

    @Override
    public void exitHtmlAttributeName(JavaScriptParser.HtmlAttributeNameContext ctx)
    {
        if(!userinterfacemapper.ContainsMapping(AttributeName))
        {
            return;
        }
       if(!AttributeName.equals("label")&&!AttributeName.equals("title"))
       {
           String OutputCode="";
           OutputCode+="=";
           writeInOutputFile(OutputCode);
       }
    }

    @Override
    public void enterHtmlChardata(JavaScriptParser.HtmlChardataContext ctx)
    {
        String identifiers = ctx.children.toString();
        String[] ans= identifiers.split(",");
       String empty="";
        for (String an : ans)
        {
            empty += an;
        }
            empty=empty.substring(1,empty.length()-1);
            if(ElementName.equals("Appbar"))
            {
                writeInOutputFile("<ion-title>"+empty+"</ion-title>\n");
            }
            else
            {
                writeInOutputFile(empty);
            }
    }

    @Override
    public void enterHtmlAttributeValue(JavaScriptParser.HtmlAttributeValueContext ctx)
    {
        String answer= ctx.getText();
        if(AttributeName.equals("color")&&ElementName.equals("Button"))
        {
            answer="primary";
        }
        if(!userinterfacemapper.ContainsMapping(AttributeName))
        {
            return;
        }
        answer=answer.replace("{","").replace("}","").replace(";","");

        if(AttributeName.equals("secureTextEntry"))
        {
            answer='"'+"password"+'"';
        }
        if(put_label&&(AttributeName.equals("label")|| AttributeName.equals("title")))
        {
            Label =answer.substring(1,answer.length()-1);
        }
        if(AttributeName.equals("value"))
        {
            answer='"'+answer+'"';
        }
        if(AttributeName.equals("onPress")|| AttributeName.equals("onChangeText")|| AttributeName.equals("onValueChange"))
        {

            answer ='"'+ answer.replace("this","").replace(".","");
            if(!answer.contains("(")&&!answer.contains(")"))
            {
                answer+="()";
            }
            answer+='"';
        }
        else if(AttributeName.equals("style"))
        {
            answer = '"'+answer.replace("this"," ").replace('.',' ').replace("styles","").replace(" ","")+'"';
            if(ElementName.equals("View"))
            {
            hasStyling=true;
            Styling=answer;
            }
        }

       if(!(AttributeName.equals("label")|| AttributeName.equals("title")))
        {
         writeInOutputFile(answer);
        }
    }


    @Override
    public void exitHtmlAttributeValue(JavaScriptParser.HtmlAttributeValueContext ctx)
    {
        AttributeName ="";
    }


	@Override public void exitObjectExpressionSequence(JavaScriptParser.ObjectExpressionSequenceContext ctx)
    {

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
		// TODO Auto-generated method stub
		return file;
	}


}
