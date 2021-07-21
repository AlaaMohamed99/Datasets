package com.example.translator.service;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.RuleContext;
import org.antlr.v4.runtime.tree.ParseTree;
import org.springframework.stereotype.Component;
//import com.example.translator.antlr4.*;

import com.example.translator.JavaScriptLexer;
import com.example.translator.JavaScriptParser;
import com.example.translator.JavaScriptParserBaseListener;

@Component("React_Native2Typescript")
public class React_Native2Typescript extends JavaScriptParserBaseListener implements CodeConverter
{
    private File file;
    private  boolean in_render;
    private  boolean inVarDeclaration;
    private boolean inStyles;
    private FileWriter OutputFile;
    private boolean in_return_statement;
    private boolean inForStatement;

    public React_Native2Typescript()
    {
        super();
        inStyles=false;
        inVarDeclaration=false;
        in_render=false;
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
	@Override public void enterImportFromBlock(JavaScriptParser.ImportFromBlockContext ctx)
    {
		ImportStatementHandler importstatementhandler = new ImportStatementHandler();
		importstatementhandler.setContext(ctx);
        writeInOutputFile(importstatementhandler.convertLibrary());
    }

	@Override public void exitExpressionStatement(JavaScriptParser.ExpressionStatementContext ctx)
    {
        if(!inStyles&&in_render)
        {
            writeInOutputFile("\n");
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
        	OnStartTranslationHandler onStartTranslationHandler = new OnStartTranslationHandler();
            writeInOutputFile(onStartTranslationHandler.onStartTranslation());
        }
    }
    @Override public void enterClassExpression(JavaScriptParser.ClassExpressionContext ctx)
    {
        writeInOutputFile("export "+ctx.Class().getText()+" "+"HomePage"+"\n");
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
        if(ctx.getChildCount()>1)
        {
            String propertyName = ctx.getChild(0).getText();
            String Assign = ctx.getChild(1).getText();
            String Attributes = ctx.getChild(2).getText();
            if(!propertyName.equals("state"))
            {
                Attributes="";
            }
            writeInOutputFile(propertyName+Assign+Attributes+"\n");
        }
    }
    @Override public void exitClassElement(JavaScriptParser.ClassElementContext ctx)
    {
        in_render=false;
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
            if (FunctionName.equals("this.setState"))
            {
                ArgumentContainer = ArgumentContainer.replace("{", "").replace("}", "").replace(":", "=");
                OpenParenthes = "";
            }
            if(!inVarDeclaration)
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
          String OutputCode="() =>"+"\n";
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
        boolean conditionCombination = !in_render&&!inStyles;
        if(conditionCombination)
        {
            RuleContext context = ctx.parent.parent;
            if(context.getChildCount()>1)
            {
                boolean isChildonRight = ctx.getText().equals(context.getChild(context.getChildCount()-1).getText());
                boolean hasChildElse = context.getChild(context.getChildCount()-2).getText().equals("else");
                if(isChildonRight&&hasChildElse)
                {
                    writeInOutputFile("else ");
                }
            }
            writeInOutputFile(ctx.If().getText()+ctx.OpenParen()+ctx.getChild(2).getText()+ctx.CloseParen());
        }
    }

	@Override public void exitIfStatement(JavaScriptParser.IfStatementContext ctx)
    {

    }
	@Override public void enterBlock(JavaScriptParser.BlockContext ctx)
    {
            RuleContext context = ctx.parent.parent;
            if(context.getChildCount()>1)
            {
                boolean isChildonRight = ctx.getText().equals(context.getChild(context.getChildCount()-1).getText());
                boolean hasChildElse = context.getChild(context.getChildCount()-2).getText().equals("else");
                if(isChildonRight&&hasChildElse)
                {
                    writeInOutputFile("else\n");
                }
            }
            String OpenBrace = ctx.OpenBrace().getText();
            if(in_render)
            {
                OpenBrace="";
            }
        writeInOutputFile(OpenBrace+"\n");
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
    @Override public  void exitAssignmentExpression(JavaScriptParser.AssignmentExpressionContext ctx)
    {
        writeInOutputFile("\n");
    }

    @Override public void enterReturnStatement(JavaScriptParser.ReturnStatementContext ctx)
    {
        in_return_statement=true;
        boolean condition = !in_render&&!inStyles;
        if(condition)
        {
            String Output = ctx.Return().getText() + " " + ctx.getChild(1).getText();
            Output+=ctx.eos().getText();
            writeInOutputFile(Output);
        }
    }
	@Override public void exitReturnStatement(JavaScriptParser.ReturnStatementContext ctx)
    {
        in_return_statement=false;

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

	@Override
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



