import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.antlr.v4.runtime.tree.ParseTree;

public class ButtonHandler
{
    private  String Label;
    private JavaScriptParser.HtmlContentContext contentCtx;
    private String ElementName;
    private Map<String,String> Mapper;
    private List<JavaScriptParser.HtmlAttributeContext> Atributes;
    private List<String> AtrributeValues;
    private String ConvertedCode;

    public ButtonHandler()
    {
      ConvertedCode="";
      Label="";
      Mapper = new HashMap<>();
      Mapper.put("style","class");
      Mapper.put("onPress","(click)");
      Mapper.put("color","color");
      Mapper.put('"'+"green"+'"',"success");
      Mapper.put('"'+"yellow"+'"',"warning");
      Mapper.put('"'+"blue"+'"',"primary");
      Mapper.put('"'+"title"+'"',"title");
    }
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
        else if(AtrributeName.equals("color"))
        {
            if(Mapper.containsKey(atrributeValue))
            {
                atrributeValue='"'+Mapper.get(atrributeValue)+'"';
            }
            else
            {
                atrributeValue='"'+"dark"+'"';
            }
        }
        else if(AtrributeName.equals("title"))
        {
            Label=atrributeValue.substring(1,atrributeValue.length()-1)+"\n";
        }
        return atrributeValue;
    }
    private  String convertattributes()
    {
        String ConvertedCode="";
        for(JavaScriptParser.HtmlAttributeContext ctx:Atributes)
        {
            ConvertedCode+= "\n"+convertAtrribute(ctx);
        }
        ConvertedCode+=">\n";
        return ConvertedCode;
    }

   public String convertCode()
    {
        ConvertedCode= "<ion-button ";
        ConvertedCode+=convertattributes();
        ConvertedCode+=Label;
        ConvertedCode+="</ion-button>\n";
        return ConvertedCode;
    }
}
