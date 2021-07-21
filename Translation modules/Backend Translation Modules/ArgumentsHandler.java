import java.util.HashMap;
import java.util.Map;

public class ArgumentsHandler
{
    private String FunctionName;
    private String ArgumentContent;
    private Map<String,String> ArgumentsMapper;
    private JavaScriptParser.ArgumentsExpressionContext ctx;
    ArgumentsHandler()
    {
        ArgumentsMapper = new HashMap<>();
        ArgumentsMapper.put("this.setState","this.state.");
        ArgumentsMapper.put("call","this.callNumber.callNumber");
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
        return FunctionName;
    }

    public void setArguments(JavaScriptParser.ArgumentsExpressionContext ctx)
    {
        FunctionName = ctx.getChild(0).getText();
    }
}
