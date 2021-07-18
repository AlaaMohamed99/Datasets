import java.util.HashMap;
import java.util.Map;

public class ArgumentsHandler
{
    private String FunctionName;
    private Map<String,String> ArgumentsMapper;
    ArgumentsHandler()
    {
        ArgumentsMapper = new HashMap<>();
        ArgumentsMapper.put("this.setState","this.state.");
        ArgumentsMapper.put("call","this.callNumber.call");
    }
    public void setArguments(JavaScriptParser.ArgumentsExpressionContext ctx)
    {
        if(ctx.getChildCount()>0)
        {
            FunctionName = ctx.getChild(0).getText();
        }
    }
    public boolean isinStyling()
    {
      return FunctionName.contains("StyleSheet.create");
    }
    private boolean isSupported()
    {
        return ArgumentsMapper.containsKey(FunctionName);
    }
    public String convertFunction()
    {
        if(isSupported())
        {
          return ArgumentsMapper.get(FunctionName);
        }
        return "";
    }
}
