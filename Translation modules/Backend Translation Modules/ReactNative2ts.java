import com.sun.org.apache.xpath.internal.Arg;
import com.sun.tracing.dtrace.FunctionName;
import jdk.nashorn.internal.ir.FunctionNode;
import javax.security.sasl.SaslServer;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Stack;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.RuleContext;
import org.antlr.v4.runtime.tree.ParseTree;


public class ReactNative2ts extends JavaScriptParserBaseListener
{
    private File file;
    /**
     *
     */
    private ImportStatementHandler importstatementhandler;
    private  boolean in_class;
    private boolean hasSetstate;
    private boolean hasState;
    private  boolean in_class_element;
    private  boolean in_render;
    private  boolean inVarDeclaration;
    private boolean hasElse;
    private boolean inStyles;
    private FileWriter OutputFile;
    private String Else;
    private boolean in_return_statement;
    private boolean inForStatement;

    public ReactNative2ts()
    {
        super();
        Else="";
        hasElse=false;
        inStyles=false;
        inVarDeclaration=false;
        hasSetstate=false;
        hasState=false;
        in_class_element=false;
        in_render=false;
        in_class=false;
    }
    private void setOutputFile()
    {
        if(!file.getName().isEmpty())
        {
            try
            {
             OutputFile = new FileWriter(file.getName(),true);
            }
            catch (Exception e)
            {
                e.printStackTrace();
            }

        }
    }
    private void writeInOutputFile(String output)
    {
        try
          {
              setOutputFile();
              OutputFile.write(output);
              OutputFile.close();
          }
          catch (Exception e )
          {
              e.printStackTrace();
          }
    }
    public void onStartTranslation()
    {
        OnStartTranslationHandler handler = new OnStartTranslationHandler();
        writeInOutputFile(handler.onStartTranslation());
    }
	@Override public void enterImportFromBlock(JavaScriptParser.ImportFromBlockContext ctx)
    {
        importstatementhandler = new ImportStatementHandler();
        importstatementhandler.setContext(ctx);
        writeInOutputFile(importstatementhandler.convertLibrary());
    }
    @Override public void enterExpressionStatement(JavaScriptParser.ExpressionStatementContext ctx)
    {

    }
	@Override public void exitExpressionStatement(JavaScriptParser.ExpressionStatementContext ctx)
    {
        String SemiColon="";
        if(ctx.eos().SemiColon()!=null)
        {
            SemiColon+=ctx.eos().SemiColon().getText();
        }
        if(!inStyles&&in_render)
        {
            writeInOutputFile(SemiColon+"\n");
        }
    }
	@Override public void enterExportDefaultDeclaration(JavaScriptParser.ExportDefaultDeclarationContext ctx)
    {
        if(ctx.getText().contains("StyleSheet.create"))
        {
            inStyles=true;
        }
        else
        {
            onStartTranslation();
        }
    }
    @Override public void enterClassExpression(JavaScriptParser.ClassExpressionContext ctx)
    {
        writeInOutputFile("export "+ctx.Class().getText()+" "+ctx.identifier().getText()+"\n");
    }
    @Override public void enterClassTail(JavaScriptParser.ClassTailContext ctx)
    {
         writeInOutputFile(ctx.OpenBrace().getText()+"\n");
    }
	@Override public void exitClassTail(JavaScriptParser.ClassTailContext ctx)
    {
        writeInOutputFile(ctx.CloseBrace().getText()+"\n");
    }
    @Override public void enterClassElement(JavaScriptParser.ClassElementContext ctx)
    {
        in_class_element=true;
        if(ctx.getChildCount()>1)
        {
            String propertyName;
            String Attributes="";
            if (ctx.propertyName() != null)
            {
                propertyName = ctx.propertyName().getText();
                if(ctx.propertyName().getText().equals("state"))
                {
                  Attributes=ctx.getChild(ctx.getChildCount()-1).getText()+";\n";
                }
            }
            else
            {
                propertyName = ctx.assignable().identifier().getText();
            }
            writeInOutputFile(propertyName+ctx.Assign().getText()+"\n"+Attributes);
        }
    }
    @Override public void exitClassElement(JavaScriptParser.ClassElementContext ctx)
    {
        hasState=false;
        hasSetstate=false;
        in_render=false;
        in_class_element=false;
    }
    @Override public void enterMethodDefinition(JavaScriptParser.MethodDefinitionContext ctx)
    {
     if(ctx.propertyName().getText().equals("render"))
     {
         in_render=true;
     }
     else
     {
      if(!in_render&&!inStyles)
      {
          String parameters="";
      if(ctx.formalParameterList()!=null)
      {
          parameters=ctx.formalParameterList().getText();
      }
      String OutputCode=ctx.propertyName().getText()+ctx.OpenParen().getText()+parameters+ctx.CloseParen().getText()+"\n"+ctx.OpenBrace()+"\n";
      writeInOutputFile(OutputCode);
      }
     }
    }
	@Override public void exitMethodDefinition(JavaScriptParser.MethodDefinitionContext ctx)
    {
       boolean combination = !in_render&&!inStyles;
       if(combination)
       {
           String OutputCode = ctx.CloseBrace().getText()+"\n";
           writeInOutputFile(OutputCode);
       }
    }
    @Override public void enterAdditiveExpression(JavaScriptParser.AdditiveExpressionContext ctx)
    {

    }
    @Override public void enterLiteralExpression(JavaScriptParser.LiteralExpressionContext ctx)
    {
        RuleContext Ctx = ctx.parent;
        ctx.literal().getText();
    }


	@Override public void exitAdditiveExpression(JavaScriptParser.AdditiveExpressionContext ctx)
    {

    }
    	@Override public void enterMultiplicativeExpression(JavaScriptParser.MultiplicativeExpressionContext ctx)
        {
         boolean comparison= !in_render&&!inStyles;
         if(comparison)
         {
             String sign;
             if (ctx.Multiply() != null)
             {
                 sign = ctx.Multiply().getText();
             }
             else if (ctx.Divide() != null)
             {
                 sign = ctx.Multiply().getText();
             }
             else
             {
                 sign = ctx.Modulus().getText();
             }
         }
        }

	@Override public void enterArgumentsExpression(JavaScriptParser.ArgumentsExpressionContext ctx)
    {
        ArgumentsHandler argumentshandler = new ArgumentsHandler();
        argumentshandler.setArguments(ctx);
        inStyles = argumentshandler.isinStyling();
        if(!inStyles&&!in_render&&!in_return_statement)
        {
            if (ctx.getChild(0).getText().contains("this.setState"))
            {
                hasSetstate = true;
            }
            String OutputCode= argumentshandler.convertFunction();
            if (!inVarDeclaration&&!OutputCode.isEmpty())
            {
                writeInOutputFile(OutputCode);
            }
        }
    }
    @Override public void exitArgumentsExpression(JavaScriptParser.ArgumentsExpressionContext ctx)
    {
        inStyles=false;
        hasSetstate=false;
         if(!in_render&&!inStyles)
        {
            writeInOutputFile(";\n");
        }
    }



	//start of an argument expressio
	@Override public void enterArguments(JavaScriptParser.ArgumentsContext ctx)
    {
        String FunctionName="";
        if(ctx.parent.getChild(0)!=null)
        {
             FunctionName = ctx.parent.getChild(0).getText();
        }
        if(!inStyles&&!in_render&&!in_return_statement)
        {
            //so as not to print an extra ")" for childcount < 3
            String ArgumentContainer = "";
            if(ctx.getChildCount()<3)
            {
                ArgumentContainer="";
            }
            else
            {
                ArgumentContainer = ctx.getChild(1).getText();
            }
            String OpenParenthes = ctx.OpenParen().getText();
            boolean Condition = !inVarDeclaration;
            if (FunctionName.equals("this.setState"))
            {
                ArgumentContainer = ArgumentContainer.replace("{", "").replace("}", "").replace(":", "=");
                OpenParenthes = "";
            }
            if(Condition)
            {
              writeInOutputFile(OpenParenthes+ArgumentContainer);
            }
        }
    }


    //end of an argument expression
	@Override public void exitArguments(JavaScriptParser.ArgumentsContext ctx)
    {
        String FunctionName = ctx.parent.getChild(0).getText();
        if(!in_render&&!inStyles)
        {
            String CloseParenthes = ctx.CloseParen().getText();
        if(FunctionName.contains("this.setState")||inVarDeclaration||in_return_statement)
        {
            CloseParenthes="";
        }
          writeInOutputFile(CloseParenthes);
        }
    }


    @Override public void exitArrowFunctionParameters(JavaScriptParser.ArrowFunctionParametersContext ctx)
    {
        boolean conditionCombination = !(in_render||inStyles);
        String Parameters="";
      if(ctx.getChildCount()>1)
      {
          if (conditionCombination)
          {
              if (ctx.formalParameterList() != null)
              {
                  Parameters = ctx.formalParameterList().getText();
              }
              else
              {
                  Parameters = "";
              }
               String OutputCode=ctx.OpenParen().getText() + Parameters + ctx.CloseParen().getText() + "=>"+"\n";
               writeInOutputFile(OutputCode);
          }
      }
      else
      {
          String OutputCode=ctx.identifier().getText()+"=>"+"\n";
          writeInOutputFile(OutputCode);
      }
    }
    @Override public void enterArrowFunctionBody(JavaScriptParser.ArrowFunctionBodyContext ctx)
    {
      boolean combination = !inStyles&&!in_render;
      if(combination)
      {
          String OpenBrace = "{";
          OpenBrace+="\n";
          writeInOutputFile(OpenBrace);
      }
    }

	@Override public void exitArrowFunctionBody(JavaScriptParser.ArrowFunctionBodyContext ctx)
    {
       boolean conditionCombination = !in_render&&!inStyles;
      if(conditionCombination)
      {
          String OutputCode = "}\n";
          writeInOutputFile(OutputCode);
      }
    }
	@Override public void enterVariableStatement(JavaScriptParser.VariableStatementContext ctx)
    {
        inVarDeclaration=true;
    }

	@Override public void exitVariableStatement(JavaScriptParser.VariableStatementContext ctx)
    {
            setOutputFile();
        if(!inStyles&&!in_render)
            {
                String semiColon = "";
                if(ctx.eos().SemiColon()!=null)
                {
                    semiColon=ctx.eos().SemiColon().getText();
                }
            semiColon+="\n";
            writeInOutputFile(semiColon);
            }
        inVarDeclaration=false;
    }
	@Override public void enterVariableDeclarationList(JavaScriptParser.VariableDeclarationListContext ctx)
    {
        if(ctx.getChild(1).getText().contains("StyleSheet.create"))
        {
            inStyles=true;
        }
        boolean conditionCombination = !(in_render||inStyles);
        if (conditionCombination)
        {
            if (ctx.varModifier() != null)
            {
                String OutputCode= ctx.varModifier().getText()+" ";
                writeInOutputFile(OutputCode);
            }
        }
    }

	@Override public void enterVariableDeclaration(JavaScriptParser.VariableDeclarationContext ctx)
    {
        boolean condition=!(in_render||inStyles);
        if(condition)
        {
            String Value = ctx.getChild(2).getText();
            if(inForStatement)
                {
                    Value+=";";
                }
                String OutputCode= ctx.assignable().getText() + " " + ctx.Assign().getText() + " " + Value;
                writeInOutputFile(OutputCode);
        }
    }

	@Override public void enterIfStatement(JavaScriptParser.IfStatementContext ctx)
    {
        boolean conditionCombination = !(in_render||inStyles);
        if(conditionCombination)
        {
           if(hasElse)
          {
            writeInOutputFile("else ");
            hasElse=false;
          }
            String OutputCode=ctx.If().getText()+" "+ctx.OpenParen().getText()+ctx.getChild(2).getText()+ctx.CloseParen().getText()+"\n";
            writeInOutputFile(OutputCode);
            if(ctx.Else()!=null)
            {
                hasElse=true;
            }
            if(!ctx.getChild(ctx.getChildCount()-1).getText().contains("if"))
            {
                Else="else";
            }
        }
    }

	@Override public void exitIfStatement(JavaScriptParser.IfStatementContext ctx)
    {
        hasElse=false;
        Else="";
    }
	@Override public void enterBlock(JavaScriptParser.BlockContext ctx)
    {
        RuleContext contx = ctx.parent.parent;
        String lastChild = contx.getChild(contx.getChildCount()-1).getText();
        String Current = ctx.getText();
        if(!Else.isEmpty()&&lastChild.equals(Current))
        {
           writeInOutputFile(Else+"\n");
        }
        writeInOutputFile(ctx.OpenBrace().getText()+"\n");
    }

	@Override public void exitBlock(JavaScriptParser.BlockContext ctx)
    {
      if(!in_render&&!inStyles)
      {
        String OutputCode= ctx.CloseBrace().getText()+"\n";
        writeInOutputFile(OutputCode);
      }
    }

    @Override public void enterAssignmentExpression(JavaScriptParser.AssignmentExpressionContext ctx)
    {
        String identifier = ctx.getChild(0).getText();
        String Assign = ctx.Assign().getText();
        String Body = ctx.getChild(2).getText();
        if(Body.contains("{")||Body.contains("(")||Body.contains("=>"))
        {
           Body="";
        }
        writeInOutputFile(identifier+" "+Assign+" "+Body);
    }

    @Override public void enterReturnStatement(JavaScriptParser.ReturnStatementContext ctx)
    {
        in_return_statement=true;
        boolean condition = !in_render&&!inStyles;
        if(condition)
        {
            String Output = ctx.Return().getText() + " " + ctx.getChild(1).getText();
            writeInOutputFile(Output);
        }
    }
	@Override public void exitReturnStatement(JavaScriptParser.ReturnStatementContext ctx)
    {
        in_return_statement=false;
        if(!in_render&&!inStyles)
        {
            String semiColon = ctx.eos().getText();
            writeInOutputFile(semiColon+ "\n");
        }
    }

    @Override public void enterForStatement(JavaScriptParser.ForStatementContext ctx)
    {
        inForStatement=true;
        writeInOutputFile(ctx.For().getText()+ctx.OpenParen().getText());
    }

	@Override public void enterPostIncrementExpression(JavaScriptParser.PostIncrementExpressionContext ctx)
    {
           String Output = ctx.getText();
           if(inForStatement)
           {
               Output+=")";
           }
           writeInOutputFile(Output);
    }
    @Override public void enterPostDecreaseExpression(JavaScriptParser.PostDecreaseExpressionContext ctx)
    {
       String Output = ctx.getText();
       if(inForStatement)
         {
           Output+=")";
         }
        writeInOutputFile(Output);
    }
    @Override public void enterRelationalExpression(JavaScriptParser.RelationalExpressionContext ctx)
    {
        boolean condition = inForStatement&&!in_render&&!inStyles;
        if(condition)
        {
            String Output= ctx.getText();
            if(inForStatement)
            {
                Output+=";";
            }
            writeInOutputFile(Output);
        }
    }

    @Override public void exitForStatement(JavaScriptParser.ForStatementContext ctx)
    {
        inForStatement=false;
    }
    @Override public void enterHtmlElements(JavaScriptParser.HtmlElementsContext ctx)
    {
        in_render=true;
    }
	@Override public void exitHtmlElements(JavaScriptParser.HtmlElementsContext ctx)
    {
        in_render=false;
    }

    public ParseTree convert(String  uploadedFileName) throws IOException
    {
	    CharStream charStream= CharStreams.fromFileName(uploadedFileName);
        JavaScriptLexer lexer = new JavaScriptLexer(charStream);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        JavaScriptParser parser = new JavaScriptParser(tokens);
        parser.setBuildParseTree(true);
        ParseTree tree = parser.program();
        return tree;
	}

	//@Override
	public void setFileName(String fileName)
    {
		file=new File(fileName);
	}

	//@Override
	public File getFile()
    {
		// TODO Auto-generated method stub
		return file;
	}
}




