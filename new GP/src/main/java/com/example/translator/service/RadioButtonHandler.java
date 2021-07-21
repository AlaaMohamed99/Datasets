package com.example.translator.service;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import com.example.translator.JavaScriptParser;

public class RadioButtonHandler implements  UIElementHandler
{
    private JavaScriptParser.HtmlContentContext contentCtx;
    private String ElementName;
    private Map<String,String> Mapper;
    private List<JavaScriptParser.HtmlAttributeContext> Atributes;
    private List<String> AtrributeValues;
    private String ConvertedCode;

    public RadioButtonHandler()
    {
      ConvertedCode="";
      Mapper = new HashMap<>();
      Mapper.put("style","class");
      Mapper.put("onPress","(click)");
      Mapper.put("value","[(ngModel)]");
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
                ConvertedAtrributes+= Mapper.get(AttributeName)+ctx.Assign().getText()+AttributeValue;
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
        else if(AtrributeName.equals("onPress"))
        {
           atrributeValue = atrributeValue.replace("this","").replace("{","");
           atrributeValue = atrributeValue.replace("}","");
           atrributeValue = atrributeValue.replace("styles","");
           atrributeValue = atrributeValue.replace(".","");
           atrributeValue = '"'+atrributeValue+"()"+'"';
        }
        else if(AtrributeName.equals("value"))
        {
            atrributeValue = '"'+atrributeValue.replace("{","").replace("}","")+'"';
        }
        return atrributeValue;
    }
    protected   String convertattributes()
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
        ConvertedCode= "<ion-radio-group>\n";
        ConvertedCode+="<ion-radio slot="+'"'+"start"+'"';
        ConvertedCode+=convertattributes();
        ConvertedCode+="</ion-radio>\n";
        ConvertedCode+="</ion-radio-group>\n";
        return ConvertedCode;
    }
}
