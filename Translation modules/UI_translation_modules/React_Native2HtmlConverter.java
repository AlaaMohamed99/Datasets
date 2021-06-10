import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Map;
import java.util.HashMap;
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
	    private FileWriter OutputFile;
	    private boolean inHtmlContent;
	    private boolean RadioButton;
	    private  Map <String, String> Jsx2ionicMap;
	    private String ElementName;
	    private  boolean has_closing_tag;
	    private  String AttributeName;
	    private  boolean has_attribute;
	    private boolean put_label;
	    private String Label;
	    private boolean hasStyling;
        private String Styling;
    private boolean has_style;

    public React_Native2HtmlConverter(){
        RadioButton=false;
        inHtmlContent=false;
        Jsx2ionicMap = new HashMap<>();
        hasStyling=false;
        has_style=false;
        ElementName="";
        AttributeName="";
        has_attribute=false;
        has_closing_tag = false;
        put_label = false;
        Jsx2ionicMap.put("Button", "ion-button");
        Jsx2ionicMap.put("Appbar", "ion-toolbar");
        Jsx2ionicMap.put("label","");
        Jsx2ionicMap.put("Text", "ion-text");
        Jsx2ionicMap.put("View", "div");
        Jsx2ionicMap.put("</TextInput>", "</ion-input>");
        Jsx2ionicMap.put("</Button>","</ion-button>");
        Jsx2ionicMap.put("onPress", "(click)");
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
        Jsx2ionicMap.put("</RadioButton>","</ion-radio>");
        Jsx2ionicMap.put("CheckBox","ion-checkbox");
        Jsx2ionicMap.put("onValueChange","(ionChange)");
        Jsx2ionicMap.put("placeholder","placeholder");
        Jsx2ionicMap.put("value","[(ngModel)]");
        Jsx2ionicMap.put("secureTextEntry","type");
        Jsx2ionicMap.put("RadioButton","ion-radio slot="+'"'+"start"+'"');
        Jsx2ionicMap.put("NavigationContainer","");
    }
    public void CreateFile()
    {
        try
        {
             file = new File("ionic.html");
            if (file.createNewFile())
            {
                System.out.println("File created: " + file.getName());
            }
            else
            {
                System.out.println("File already exists.");
            }
            FileWriter myFile = new FileWriter(file.getName(), true);
            myFile.close();
        } catch (IOException e)
        {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }

    public void  setOutputFile()
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
    @Override public void enterHtmlElements(JavaScriptParser.HtmlElementsContext ctx)
    {
        try
        {
            setOutputFile();
            OutputFile.write("<ion-content>"+"\n");
            OutputFile.close();
        }
        catch(IOException e)
        {
            e.printStackTrace();
        }
    }
    @Override public void exitHtmlElements(JavaScriptParser.HtmlElementsContext ctx)
    {
        try
        {
            setOutputFile();
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


        if(ElementName.equals("Appbar"))
        {
            try
            {
                setOutputFile();
                OutputFile.write("</ion-toolbar>\n");
            }
            catch (IOException e)
            {
                e.fillInStackTrace();
            }
        }


        if(!has_closing_tag)
        {
         try
       {
            setOutputFile();
            if(put_label)
       {
            OutputFile.write("\n<ion-label>"+Label+"</ion-label>\n");
       }

            OutputFile.write(Jsx2ionicMap.get("</"+ElementName+">") +"\n");
           if(ElementName.equals("RadioButton"))
            {
                OutputFile.write("</ion-radio-group>\n");
            }
           if(ElementName.equals("TextInput")) OutputFile.write("</ion-item>\n");
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
       hasStyling=false;

    }

    @Override
    public void enterHtmlContent(JavaScriptParser.HtmlContentContext ctx)
    {
        inHtmlContent=true;
         try
       {
            setOutputFile();
            OutputFile.write(">"+"\n");
           if(ElementName.equals("Text")&&ctx.getChild(0).getText().contains("{"))
           {
               OutputFile.write("{"+ctx.getChild(0).getText()+"}");
           }
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
         try
       {
            if(ctx.htmlTagName().getText().equals("Appbar"))
            {
                setOutputFile();
                OutputFile.write("<ion-header class="+'"'+"Appbar"+'"'+">\n");
            }
            else
            {
                OutputFile = new FileWriter(file.getName(),true);
            }

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
         try
       {

            setOutputFile();
            OutputFile.write("</"+Jsx2ionicMap.get(ctx.htmlTagName().getText())+">"+"\n");
            if(ctx.htmlTagName().getText().equals("Appbar"))
            {
                OutputFile.write("</"+"ion-header>\n");
            }
            OutputFile.close();
        }
        catch(IOException e)
        {
            e.printStackTrace();
        }
    }



    @Override
    public void enterHtmlTagName(JavaScriptParser.HtmlTagNameContext ctx) {
               ElementName = ctx.Identifier().getText();
       if(!has_closing_tag)
       {
         try
       {
            setOutputFile();
           if(ctx.Identifier().getText().equals("TextInput"))
           {
               OutputFile.write("<ion-item");
               OutputFile.write("  class =" + '"' + "container" + '"' + ">\n");
           }
           if(ctx.Identifier().getText().equals("RadioButton"))
           {
               OutputFile.write("<ion-radio-group>\n");
           }
            OutputFile.write("<" + Jsx2ionicMap.get(ctx.Identifier().getText()));
            OutputFile.close();
        }
        catch(IOException e)
        {
            e.printStackTrace();
        }

       }
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
         try
       {
            setOutputFile();
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
         try
       {
            setOutputFile();
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
       String empty="";
       for(int i =0;i<ans.length;i++)
       {
           empty+=ans[i];
       }
       System.out.println(empty);
         try
       {
            setOutputFile();
            empty=empty.substring(1,empty.length()-1);
            if(ElementName.equals("Appbar"))
            {
                OutputFile.write("<ion-title>"+empty+"</ion-title>\n");
            }
            else
            {
                OutputFile.write(empty);
            }
            OutputFile.close();
        }
        catch(IOException e)
        {
            e.printStackTrace();
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
        if(!Jsx2ionicMap.containsKey(AttributeName))return;
        answer=answer.replace("{","").replace("}","").replace(";","");
        if(AttributeName.equals("secureTextEntry"))
        {
            answer='"'+"password"+'"';
        }
        if(put_label&&(AttributeName.equals("label")|| AttributeName.equals("title"))) Label =answer.substring(1,answer.length()-1);
        if(AttributeName.equals("value"))
        {
            answer='"'+answer+'"';
        }
        if(AttributeName.equals("onPress")|| AttributeName.equals("onChangeText")|| AttributeName.equals("onValueChange"))
        {

            answer ='"'+ answer.replace("this","").replace(".","");
            if(!answer.contains("(")&&!answer.contains(")"))answer+="()";
            answer+='"';
        }
        else if(AttributeName.equals("style"))
        {
            answer = '"'+answer.replace("this"," ").replace('.',' ').replace("styles","").replace(" ","")+'"';
            if(ElementName.equals("View"))
            {
            hasStyling=true;
            Styling=answer;
            //answer="container";
            }
            if(ElementName.equals("TextInput")||ElementName.equals("Button")&&AttributeName.equals("style"))
            {
                has_style = true;
            }
        }

       if(!(AttributeName.equals("label")|| AttributeName.equals("title")))
        {
         try
       {
            setOutputFile();
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

    @Override public void enterObjectExpressionSequence(JavaScriptParser.ObjectExpressionSequenceContext ctx)
    {
        if(inHtmlContent)
        {

        }
    }

	@Override public void exitObjectExpressionSequence(JavaScriptParser.ObjectExpressionSequenceContext ctx)
    {

    }

	public ParseTree convert(String  uploadedFileName) throws IOException {
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
