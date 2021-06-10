import com.sun.org.apache.xpath.internal.Arg;

import javax.security.sasl.SaslServer;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.io.IOException;
import java.util.Stack;

import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.RuleContext;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;
import org.antlr.v4.runtime.tree.TerminalNode;

public class ReactNative2ts extends JavaScriptParserBaseListener
{
    private File file;
    private  boolean inArithmeticop;
    private  boolean in_class;
    private boolean hasSetstate;
    private boolean hasState;
    private  boolean in_class_element;
    private  boolean in_render;
    private boolean in_paren_exp;
    private boolean inImport;
    private  boolean inVarDeclaration;
    private Stack<String> signs;
    private boolean else_done;
    private boolean isLeftoperand;
    private  String TargetFileName;
    private String TargetClassName;
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
        signs = new Stack<String>();
        inArithmeticop=false;
        inVarDeclaration=false;
        hasSetstate=false;
        hasState=false;
        in_class_element=false;
        in_render=false;
        inImport=false;
        in_class=false;
        in_paren_exp=false;
    }
    public void setOutputFile()
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
    public void setTargetFileName(String FileName)
    {
        this.TargetFileName=FileName;
    }
    public void setTargetClassName(String class_name)
    {
        this.TargetClassName=class_name;
    }
    public void onStartTranslation()
    {
        try
        {
            setOutputFile();
            OutputFile.write("\nimport { Component} from '@angular/core';\n" +
                "@Component({\n" +
                "  selector:"+"'"+TargetFileName+"'"+",\n" +
                "  templateUrl: 'app.html',\n" +
                "  styleUrls: ['App.scss'],\n" +
                "})\n");
            OutputFile.close();
        }
        catch (Exception e)
        {
         e.printStackTrace();
        }

        System.out.println("import { Component} from '@angular/core';\n" +
                "@Component({\n" +
                "  selector:"+"'"+TargetFileName+"'"+",\n" +
                "  templateUrl: 'app.html',\n" +
                "  styleUrls: ['App.scss'],\n" +
                "})");
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
        if(!(inStyles||in_render))
        {
           System.out.println(ctx.eos().getText());
          try
          {
              setOutputFile();
              OutputFile.write(SemiColon+"\n");
              OutputFile.close();
          }
          catch (Exception e )
          {
              e.printStackTrace();
          }
        }
    }
	@Override public void enterExportDefaultDeclaration(JavaScriptParser.ExportDefaultDeclarationContext ctx)
    {
        if(ctx.getText().contains("StyleSheet.create"))
            {
                inStyles=true;
            }
    }
    @Override public void enterClassExpression(JavaScriptParser.ClassExpressionContext ctx)
    {
        System.out.println(ctx.Class().getText()+" "+TargetClassName);
        try
        {
          setOutputFile();
          OutputFile.write(ctx.Class().getText()+" "+ctx.identifier().getText()+"\n");
          OutputFile.close();
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }
    @Override public void enterClassTail(JavaScriptParser.ClassTailContext ctx)
    {
        try
        {
         setOutputFile();
         OutputFile.write(ctx.OpenBrace().getText()+"\n");
         OutputFile.close();
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
        System.out.println(ctx.OpenBrace().getText());
    }
	@Override public void exitClassTail(JavaScriptParser.ClassTailContext ctx)
    {
        try
        {
            setOutputFile();
            OutputFile.write(ctx.CloseBrace().getText()+"\n");
            OutputFile.close();
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
        System.out.println(ctx.CloseBrace().getText());
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
            try {
                setOutputFile();
                OutputFile.write(propertyName+ctx.Assign().getText()+"\n"+Attributes);
                OutputFile.close();
            }
            catch (Exception e)
            {
                e.printStackTrace();
            }
            System.out.println(propertyName+ctx.Assign().getText());
            System.out.print(Attributes);

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
      if(!(in_render||!inStyles))
      {
          String parameters="";
      if(ctx.formalParameterList()!=null)
      {
          parameters=ctx.formalParameterList().getText();
      }
      try
      {
       setOutputFile();
       OutputFile.write(ctx.propertyName().getText()+ctx.OpenParen().getText()+parameters+ctx.CloseParen().getText()+"\n"+ctx.OpenBrace()+"\n");
       OutputFile.close();
      }
      catch (Exception e)
      {
          e.printStackTrace();
      }
         System.out.println(ctx.propertyName().getText()+ctx.OpenParen().getText()+parameters+ctx.CloseParen().getText()+"\n"+ctx.OpenBrace());
      }
     }
    }
	@Override public void exitMethodDefinition(JavaScriptParser.MethodDefinitionContext ctx)
    {
        boolean combination = !(in_render||!inStyles);
       if(combination)
       {
           System.out.println(ctx.CloseBrace());
           try
           {
               setOutputFile();
               OutputFile.write(ctx.CloseBrace().getText()+"\n");
               OutputFile.close();
           }
           catch (Exception e)
           {
               e.printStackTrace();
           }
       }
    }
    @Override public void enterAdditiveExpression(JavaScriptParser.AdditiveExpressionContext ctx)
    {
          inArithmeticop=true;
          boolean combination= !(in_render|| inStyles);
          if (combination)
          {
              String sign;
              if(ctx.Plus()!=null)
            {
                sign=ctx.Plus().getText();
            }
            else
            {
                sign = ctx.Minus().getText();
            }
            signs.push(sign);
          }

    }

	@Override public void exitAdditiveExpression(JavaScriptParser.AdditiveExpressionContext ctx)
    {
        inArithmeticop=false;
    }
    	@Override public void enterMultiplicativeExpression(JavaScriptParser.MultiplicativeExpressionContext ctx)
        {
         inArithmeticop=true;
         boolean comparison= !(in_render||inStyles);
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
             signs.push(sign);
         }
        }
        @Override public void exitMultiplicativeExpression(JavaScriptParser.MultiplicativeExpressionContext ctx)
       {
         inArithmeticop=false;
       }

	@Override public void enterArgumentsExpression(JavaScriptParser.ArgumentsExpressionContext ctx)
    {
        String Argument="";
        boolean Condition = !inVarDeclaration;
        if(ctx.getChild(0).getText().contains("StyleSheet.create"))
        {
            inStyles=true;
        }
        //here we set all our entry conditions for this translation
        boolean combination = !(inStyles||in_render);
        if(combination)
        {
            if (ctx.getChildCount() > 0)
            {
                Argument = ctx.getChild(0).getText();
            }
            if (Argument.equals("this.setState"))
            {
                hasSetstate = true;
                Argument = Argument.replace("setState", "state.");
            }
            if (Condition)
            {
                try
                {
                    setOutputFile();
                    OutputFile.write(Argument);
                    OutputFile.close();
                }
                catch (Exception e)
                {
                    e.printStackTrace();
                }
                System.out.print(Argument);
            }
        }

    }
    @Override public void exitArgumentsExpression(JavaScriptParser.ArgumentsExpressionContext ctx)
    {
        inStyles=false;
        hasSetstate=false;
    }



	//start of an argument expressio
	@Override public void enterArguments(JavaScriptParser.ArgumentsContext ctx)
    {
        String ArgumentContainer="";
        boolean combination = !(in_render||inStyles);
        if(combination)
        {
            //so as not to print an extra ")" for childcount < 3
            if(ctx.getChildCount()<3)ArgumentContainer="";
            else
            {
                ArgumentContainer = ctx.getChild(1).getText();
            }
            String OpenParenthes = ctx.OpenParen().getText();
            boolean Condition = !inVarDeclaration;
            if (hasSetstate)
            {
                ArgumentContainer = ArgumentContainer.replace("{", "").replace("}", "").replace(":", "=");
                OpenParenthes = "";
            }
            if (Condition)
            {
                try
                {
                    setOutputFile();
                    OutputFile.write(OpenParenthes+ArgumentContainer);
                    OutputFile.close();
                }
                catch (Exception e)
                {
                    e.printStackTrace();
                }
                System.out.print(OpenParenthes + ArgumentContainer);
            }
        }
    }


    //end of an argument expression
	@Override public void exitArguments(JavaScriptParser.ArgumentsContext ctx)
    {
        boolean combination = !(in_render||inStyles);
        if(combination)
        {
        String CloseParenthes = ctx.CloseParen().getText();
        boolean Condition=hasSetstate||inVarDeclaration||in_return_statement;
        if(Condition)
        {
            CloseParenthes="";
        }
        try
        {
            setOutputFile();
            OutputFile.write(CloseParenthes);
            OutputFile.close();
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
         System.out.print(CloseParenthes);
        }
    }
    @Override public void enterMemberDotExpression(JavaScriptParser.MemberDotExpressionContext ctx)
    {
        if(!in_render)
        {
        boolean comparison=  in_class_element;
        if(comparison)
        {
        //     System.out.print(ctx.getText());
            if(!signs.isEmpty())
            {
       //         System.out.print(signs.pop());
            }
        }

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
              try
              {
                  setOutputFile();
                  OutputFile.write(ctx.OpenParen().getText() + Parameters + ctx.CloseParen().getText() + "=>"+"\n");
                  OutputFile.close();
              }
              catch (Exception e)
              {
                  e.printStackTrace();
              }
              System.out.println(ctx.OpenParen().getText() + Parameters + ctx.CloseParen().getText() + "=>");
          }
      }
      else
      {
          try
              {
                  setOutputFile();
                  OutputFile.write(ctx.identifier().getText()+"=>"+"\n");
                  OutputFile.close();
              }
              catch (Exception e)
              {
                  e.printStackTrace();
              }
          System.out.print(ctx.identifier().getText()+"=>");
      }
    }
    @Override public void enterArrowFunctionBody(JavaScriptParser.ArrowFunctionBodyContext ctx)
    {
      boolean combination = !(inStyles||in_render);
      if(combination)
      {

          try
          {
              setOutputFile();
              OutputFile.write("{\n");
              OutputFile.close();
          }
          catch (Exception e)
          {
              e.printStackTrace();
          }
          System.out.println("{");
      }
    }

	@Override public void exitArrowFunctionBody(JavaScriptParser.ArrowFunctionBodyContext ctx)
    {
        boolean conditionCombination = !(in_render||inStyles);
      if(conditionCombination)
      {
          try
          {
             setOutputFile();
             OutputFile.write("}\n");
             OutputFile.close();
          }
          catch (Exception e)
          {
              e.printStackTrace();
          }
          System.out.println("}");
      }
    }
	@Override public void enterVariableStatement(JavaScriptParser.VariableStatementContext ctx)
    {
        inVarDeclaration=true;
    }

	@Override public void exitVariableStatement(JavaScriptParser.VariableStatementContext ctx)
    {
        try
        {
            setOutputFile();
            OutputFile.write(ctx.eos().SemiColon().getText()+"\n");
            OutputFile.close();
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
        System.out.println(ctx.eos().getText());
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
                try
                {
                   setOutputFile();
                   OutputFile.write(ctx.varModifier().getText()+" ");
                   OutputFile.close();
                }
                catch (Exception e)
                {
                    e.printStackTrace();
                }
                System.out.print(ctx.varModifier().getText() + " ");
            }
           /* try
                {
                   setOutputFile();
                   OutputFile.write(ctx.getChild(1).getText());
                   OutputFile.close();
                }
                catch (Exception e)
                {
                    e.printStackTrace();
                }*/
            System.out.print(ctx.getChild(1).getText());
        }
    }
	@Override public void exitVariableDeclarationList(JavaScriptParser.VariableDeclarationListContext ctx) { }

	@Override public void enterVariableDeclaration(JavaScriptParser.VariableDeclarationContext ctx)
    {
        boolean condition=!(in_render||inStyles);
        if(condition)
        {
            String Value = "";
        //    if (!ctx.getChild(2).getText().contains("("))
        //    {
                Value = ctx.getChild(2).getText();
          //  }
            try
            {
                if(inForStatement)
                {
                    Value+=";";
                }
                setOutputFile();
                OutputFile.write(ctx.assignable().getText() + " " + ctx.Assign().getText() + " " + Value);
                OutputFile.close();
            }
            catch (Exception e)
            {
                e.printStackTrace();
            }
        }
    }

	@Override public void exitVariableDeclaration(JavaScriptParser.VariableDeclarationContext ctx) { }

	@Override public void enterIfStatement(JavaScriptParser.IfStatementContext ctx)
    {
        boolean conditionCombination = !(in_render||inStyles);

        if(conditionCombination)
        {
        if(hasElse)
        {
            System.out.print("else ");
            try
            {
                setOutputFile();
                OutputFile.write("else ");
                OutputFile.close();
            }
            catch (Exception e)
            {
                e.printStackTrace();
            }
            hasElse=false;
        }
        try
        {
         setOutputFile();
         OutputFile.write(ctx.If().getText()+" "+ctx.OpenParen().getText()+ctx.getChild(2).getText()+ctx.CloseParen().getText()+"\n");
         OutputFile.close();
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
        System.out.println(ctx.If().getText()+" "+ctx.OpenParen()+ctx.getChild(2).getText()+ctx.CloseParen());
        if(ctx.Else()!=null)
        {
            //System.out.print("else ");
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
            try
            {
                setOutputFile();
                OutputFile.write(Else+"\n");
                OutputFile.close();
            }
            catch (Exception e)
            {
                e.printStackTrace();
            }
        }
        System.out.println(ctx.OpenBrace());
        try
        {
           setOutputFile();
           OutputFile.write(ctx.OpenBrace().getText()+"\n");
           OutputFile.close();
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }
    @Override public void enterStatement(JavaScriptParser.StatementContext ctx)
    {
         boolean conditionCombination = !(in_render||inStyles);
         if(conditionCombination)
            {
                //System.out.print(ctx.getChild(0).getChild(0).getText());
            }

    }


	@Override public void exitBlock(JavaScriptParser.BlockContext ctx)
    {
	            System.out.println(ctx.CloseBrace());
	            try
                {
                    setOutputFile();
                    OutputFile.write(ctx.CloseBrace().getText());
                    OutputFile.close();
                }
	            catch (Exception e)
                {
                    e.printStackTrace();
                }
    }

    @Override public void enterAssignmentExpression(JavaScriptParser.AssignmentExpressionContext ctx)
    {
        String identifier = ctx.getChild(0).getText();
        String Assignn = ctx.Assign().getText();
        String Body = ctx.getChild(2).getText();
        if(Body.contains("{")||Body.contains("(")||Body.contains("=>"))
        {
            Body="";
        }
        try
        {
          setOutputFile();
          OutputFile.write(identifier+" "+Assignn+" "+Body);
          OutputFile.close();
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }

	@Override public void exitAssignmentExpression(JavaScriptParser.AssignmentExpressionContext ctx)
    {

    }
    @Override public void enterExportDeclaration(JavaScriptParser.ExportDeclarationContext ctx)
    {

    }

    @Override public void enterReturnStatement(JavaScriptParser.ReturnStatementContext ctx)
    {
        in_return_statement=true;
        if(in_render)
        {
            System.out.print("YES in render\n");
        }
        boolean condition = !(in_render||inStyles);
        if(condition)
        {
            try
            {
                setOutputFile();
                OutputFile.write(ctx.Return().getText() + " " + ctx.getChild(1).getText());
                OutputFile.close();
            }
            catch (Exception e)
            {
                e.printStackTrace();
            }
        }

    }
	@Override public void exitReturnStatement(JavaScriptParser.ReturnStatementContext ctx)
    {
        try
        {
              setOutputFile();
              OutputFile.write(ctx.eos().getText());
              OutputFile.close();
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }

    }

    @Override public void enterForStatement(JavaScriptParser.ForStatementContext ctx)
    {
        inForStatement=true;
       try
       {
           setOutputFile();
           OutputFile.write(ctx.For().getText()+ctx.OpenParen().getText());
           OutputFile.close();
       }
       catch (Exception e)
       {
           e.printStackTrace();
       }
    }

	@Override public void enterPostIncrementExpression(JavaScriptParser.PostIncrementExpressionContext ctx)
    {
       try
       {
           String Output = ctx.getText();
           if(inForStatement)
           {
               Output+=")";
           }
           setOutputFile();
           OutputFile.write(Output);
           OutputFile.close();

       }
       catch (Exception e)
       {
           e.printStackTrace();
       }
    }
    @Override public void enterRelationalExpression(JavaScriptParser.RelationalExpressionContext ctx)
    {
        boolean condition = inForStatement&&!(inVarDeclaration||inStyles||in_render||in_return_statement);
        if(condition)
        {
            try
            {
                String Output= ctx.getText();
                if(inForStatement)
                {
                  Output+=";";
                }
               setOutputFile();
               OutputFile.write(Output);
               OutputFile.close();
            }
            catch (Exception e)
            {
                e.printStackTrace();
            }
        }
    }

	@Override public void exitRelationalExpression(JavaScriptParser.RelationalExpressionContext ctx) { }


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



