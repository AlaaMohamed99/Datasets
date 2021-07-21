package com.example.translator.service;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import com.example.translator.JavaScriptParser;
import java.util.List;
import java.util.Map;

public class TouchableOpacityHandler implements UIElementHandler
{
    private String ElementName;
    private Map<String,String> Mapper;
    private List<JavaScriptParser.HtmlAttributeContext> Atributes;
    private List<String> AtrributeValues;
    private String ConvertedCode;

  public TouchableOpacityHandler()
    {
      ConvertedCode="";
      Mapper = new HashMap<>();
      Mapper.put("style","class");
      Mapper.put("onPress","(click)");
    }
      @Override
      public void setHtmlElementContext(JavaScriptParser.HtmlElementContext ctx)
    {
        ElementName = ctx.htmlTagStartName().get(0).getText();
        Atributes   = ctx.htmlAttribute();
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
        return atrributeValue;
    }
    protected  String convertattributes()
    {
        String ConvertedCode="";
        for(JavaScriptParser.HtmlAttributeContext ctx:Atributes)
        {
            ConvertedCode+= "  "+convertAtrribute(ctx);
        }
        ConvertedCode+=">\n";
        return ConvertedCode;
    }

    public String endofElement()
    {
        return "</ion-button>\n";
    }

       @Override
       public String convertCode()
    {
        ConvertedCode+="<ion-button ";
        ConvertedCode+=convertattributes();
        return ConvertedCode;
    }
}
