package com.example.translator.service;
import com.example.translator.JavaScriptParser;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.antlr.v4.runtime.tree.ParseTree;

public class AppbarHandler implements  UIElementHandler
{
    private JavaScriptParser.HtmlContentContext contentCtx;
    private String ElementName;
    private Map<String,String>Mapper;
    private List<JavaScriptParser.HtmlAttributeContext> Atributes;
    private List<String> AtrributeValues;
    private String ConvertedCode;

    public  AppbarHandler()
    {
      ConvertedCode="";
      Mapper = new HashMap<>();
      Mapper.put("style","class");
      Mapper.put("onPress", "(click)");
    }
  @Override
  public void   setHtmlElementContext(JavaScriptParser.HtmlElementContext ctx)
    {

        ElementName = ctx.htmlTagStartName().get(0).getText();
        Atributes   = ctx.htmlAttribute();
        contentCtx = ctx.htmlContent();
    }
    private boolean isSupported(String AttributeName)
    {
        return Mapper.containsKey(AttributeName);
    }
    private String convertAtrribute(JavaScriptParser.HtmlAttributeContext ctx)
    {
        String ConvertedAtrributes="";
        String AttributeName= ctx.htmlAttributeName().getText();
        String AttributeValue = convertAtrributeValue(AttributeName,ctx.htmlAttributeValue().getText());
        if(isSupported(AttributeName))
            {
                ConvertedAtrributes+= "\n"+Mapper.get(AttributeName)+ctx.Assign().getText()+AttributeValue;
            }
        return ConvertedAtrributes;
    }
    private  String convertAtrributeValue(String AtrributeName,String AtrributeValue)
    {
        String atrributeValue = AtrributeValue;
        if(AtrributeName.equals("style"))
        {
           atrributeValue = atrributeValue.replace("this","").replace("{","");
           atrributeValue = atrributeValue.replace("}","");
           atrributeValue = atrributeValue.replace("styles","");
           atrributeValue = atrributeValue.replace(".","");
           atrributeValue = '"'+atrributeValue+'"';
        }
        return atrributeValue;
    }
    protected   String convertattributes()
    {
        String ConvertedCode="";
        for(JavaScriptParser.HtmlAttributeContext ctx:Atributes)
        {
            ConvertedCode+= convertAtrribute(ctx);
        }
        ConvertedCode+=">\n";
        return ConvertedCode;
    }
    private String convertContent()
    {
        String Output="";
        if(contentCtx!=null)
        {
            if(contentCtx.htmlChardata()!=null)
            {
                List<ParseTree> Data= contentCtx.htmlChardata().get(0).children;
               for(ParseTree ctx:Data)
               {
                 Output+=ctx.getText()+"  ";
               }
            }
        }
        Output+="\n";
        return  Output;
    }

    @Override
    public String convertCode()
    {
        ConvertedCode= "<ion-header "+"class = "+'"'+"Appbar"+'"'+">"+"\n";
        ConvertedCode+="<ion-toolbar ";
        ConvertedCode+=convertattributes();
        ConvertedCode+=convertContent();
        ConvertedCode+="</ion-toolbar>\n";
        ConvertedCode+="</ion-header>\n";
        return ConvertedCode;
    }
}

