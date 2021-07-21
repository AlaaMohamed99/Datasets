package com.example.translator.service;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import com.example.translator.JavaScriptParser;
import java.util.List;
import java.util.Map;

public class TextInputHandler implements UIElementHandler
{
    private JavaScriptParser.HtmlContentContext contentCtx;
    private String ElementName;
    private  String Label;
    private Map<String,String> Mapper;
    private List<JavaScriptParser.HtmlAttributeContext> Atributes;
    private List<String> AtrributeValues;
    private String ConvertedCode;

    public TextInputHandler()
    {
      Label="";
      ConvertedCode="";
      Mapper = new HashMap<>();
      Mapper.put("style","class");
      Mapper.put("onChangeText","(ionChange)");
      Mapper.put("placeholder","placeholder");
      Mapper.put("value","[(ngModel)]");
      Mapper.put("secureTextEntry","type");
      Mapper.put("label","label");
    }
  @Override
  public void setHtmlElementContext(JavaScriptParser.HtmlElementContext ctx)
    {
        ElementName = ctx.htmlTagName().getText();
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
                ConvertedAtrributes+= Mapper.get(AttributeName)+ctx.Assign().getText()+AttributeValue+"\n";
            }
        return ConvertedAtrributes;
    }
    private  String convertAtrributeValue(String AtrributeName,String AtrributeValue)
    {
        String atrributeValue = AtrributeValue;
        atrributeValue = atrributeValue.replace("{","");
        atrributeValue = atrributeValue.replace("}","");
        if("style".equals(AtrributeName))
        {
           atrributeValue = atrributeValue.replace("this","");
           atrributeValue = atrributeValue.replace("styles","");
           atrributeValue = atrributeValue.replace(".","");
           atrributeValue = '"'+atrributeValue+'"';
        }
        else if("onChangeText".equals(AtrributeName))
        {
           atrributeValue = '"'+atrributeValue.replace("this.","")+"()"+'"';
        }

        else if("secureTextEntry".equals(AtrributeName))
        {
            atrributeValue = '"'+"password"+'"';
        }
        else if("label".equals(AtrributeName))
        {
            Label="<ion-label position="+'"'+"fixed"+'"'+">"+atrributeValue.substring(1,atrributeValue.length()-1)+"</ion-label>";
        }
        else if("value".equals(AtrributeName))
        {
            atrributeValue='"'+atrributeValue+'"';
        }
        return atrributeValue;
    }

    protected  String convertattributes()
    {
        String ConvertedCode="";
        for(JavaScriptParser.HtmlAttributeContext ctx:Atributes)
        {
            ConvertedCode+= "\n"+convertAtrribute(ctx);
        }
        ConvertedCode+=">\n";
        return ConvertedCode;
    }


    @Override
    public String convertCode()
    {
        ConvertedCode+=Label;
        ConvertedCode= "<ion-input ";
        ConvertedCode+=convertattributes();
        ConvertedCode+="</ion-input>\n";
        return ConvertedCode;
    }
}
