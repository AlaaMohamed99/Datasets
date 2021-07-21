import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ImageHandler implements  UIElementHandler
{
    private JavaScriptParser.HtmlContentContext contentCtx;
    private String ElementName;
    private Map<String,String> Mapper;
    private List<JavaScriptParser.HtmlAttributeContext> Atributes;
    private List<String> AtrributeValues;
    private String ConvertedCode;
    public ImageHandler()
    {
      ConvertedCode="";
      Mapper = new HashMap<>();
      Mapper.put("style","class");
      Mapper.put("source","src");
    }
       @Override
       public void setHtmlElementContext(JavaScriptParser.HtmlElementContext ctx)
    {
        ElementName = ctx.htmlTagName().getText();
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
                ConvertedAtrributes+= " "+Mapper.get(AttributeName)+ctx.Assign().getText()+AttributeValue;
            }
        return ConvertedAtrributes;
    }
    private  String convertAtrributeValue(String AtrributeName,String AtrributeValue)
    {
        String atrributeValue = AtrributeValue;
        if("style".equals(AtrributeName))
        {
           atrributeValue = atrributeValue.replace("this","").replace("{","");
           atrributeValue = atrributeValue.replace("}","");
           atrributeValue = atrributeValue.replace("styles","");
           atrributeValue = atrributeValue.replace(".","");
           atrributeValue = '"'+atrributeValue+'"';
        }
        else if("source".equals(AtrributeName))
        {
            atrributeValue = atrributeValue.replace("{","");
            atrributeValue = atrributeValue.replace("}","");
            atrributeValue='"'+atrributeValue+'"';
        }
        return atrributeValue;
    }
    protected  String convertattributes()
    {
        String ConvertedCode="";
        for(JavaScriptParser.HtmlAttributeContext ctx:Atributes)
        {
            ConvertedCode+= convertAtrribute(ctx);
        }
        ConvertedCode+=">\n";
        return ConvertedCode;
    }
    @Override
    public String convertCode()
    {
        ConvertedCode= "<ion-img ";
        ConvertedCode+=convertattributes();
        ConvertedCode+="</ion-img>\n";
        return ConvertedCode;
    }
}
