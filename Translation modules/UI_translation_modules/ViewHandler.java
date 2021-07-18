import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.antlr.v4.runtime.tree.ParseTree;

public class ViewHandler
{
    private String ElementName;
    private Map<String,String> Mapper;
    private List<JavaScriptParser.HtmlAttributeContext> Atributes;
    private List<String> AtrributeValues;
    private String ConvertedCode;

    public ViewHandler()
    {
      ConvertedCode="";
      Mapper = new HashMap<>();
      Mapper.put("style","class");
      Mapper.put("onPress", "(click)");

    }
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
                ConvertedAtrributes+= " "+Mapper.get(AttributeName)+ctx.Assign().getText()+AttributeValue;
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
    private  String convertattributes()
    {
        String ConvertedCode="";
        for(JavaScriptParser.HtmlAttributeContext ctx:Atributes)
        {
            ConvertedCode+= convertAtrribute(ctx);
        }
        ConvertedCode+=">\n";
        return ConvertedCode;
    }
    public String endofElement()
    {
        return "</div>\n";
    }
    public String convertCode()
    {
        ConvertedCode= "<div ";
        ConvertedCode+=convertattributes();
        return ConvertedCode;
    }
}
