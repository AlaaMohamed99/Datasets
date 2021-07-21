import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Stack;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.RuleContext;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;
import org.antlr.v4.runtime.tree.TerminalNode;

public class ImportStatementHandler
{
  private  List<String> importedItems;
  private Map<String,String> ImportFromMapper;
  private  Map<String,String> ImportMapper;
  private  String ImportedFrom;

  ImportStatementHandler()
  {
      ImportFromMapper= new HashMap<>();
      ImportMapper = new HashMap<>();
      ImportFromMapper.put("'"+"react-native-phone-call"+"'","'"+"@ionic-native/call-number/ngx"+"'");
      ImportMapper.put("call","CallNumber");
  }
  public  void setContext(JavaScriptParser.ImportFromBlockContext ctx)
  {
      String Imported="";
      if(ctx.moduleItems()!=null)
      {
           Imported = ctx.moduleItems().getText();
      }
      else
      {
          Imported = ctx.importNamespace().getText();
      }
      Imported = Imported.replace("{","").replace("}","");
      importedItems = new ArrayList<String>(Arrays.asList(Imported.split(",")));
      ImportedFrom = ctx.importFrom().getChild(ctx.importFrom().getChildCount()-1).getText();
  }
  boolean supportedItem(String Item)
  {
     return ImportMapper.containsKey(Item);
  }
  String convertLibrary()
  {
      String Output="";
      for (String Item:importedItems)
      {
          if(supportedItem(Item))
          {
              if(!Output.isEmpty())
              {
                  Output+=",";
              }

              Output+=ImportMapper.get(Item);
          }
      }
      if(!Output.isEmpty())
      {
          Output="import "+"{"+Output+"}"+ "from "+ ImportFromMapper.get(ImportedFrom)+";\n";
      }
      if (Output.isEmpty())
      {
          return "";
      }
      return Output;
  }

}
