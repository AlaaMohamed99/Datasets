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
import org.antlr.v4.runtime.tree.ParseTree;
import org.springframework.stereotype.Component;
//import com.example.translator.antlr4.*;

import com.example.translator.JavaScriptLexer;
import com.example.translator.JavaScriptParser;
import com.example.translator.JavaScriptParserBaseListener;

@Component("React_Native2ScssConverter")
public class React_Native2ScssConverter extends JavaScriptParserBaseListener implements CodeConverter {

    private File file;
    private FileWriter OutputFile;
    private String trigger;
    private ArrayList<String>outputs;
    private  int open_bruce_counter;
    private  int close_bruce_counter;
    private String baseElement;
    public React_Native2ScssConverter() 
    {
        super();
        open_bruce_counter=0;
        close_bruce_counter=0;
        outputs=new ArrayList<>();
    }

    public void  setOutputFile()
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
    private void writeOutputFile(String Output)
    {
        try
        {
            setOutputFile();
            OutputFile.write(Output);
            OutputFile.close();
        }
        catch(IOException e)
        {
            e.printStackTrace();
        }

    }
    /****
     *
    this function makes mapping between styles a lot more efficient
     the only difference between styling in ionic and React Native is simple
     replace every camel case with corresponding "-"
     */
    private String Transform(String input)
    {
        if("backgroundColor".equals(input))
        {
            return "--background";
        }
        String output = "";
        for(int i =0;i<input.length();i++)
        {
            if(Character.isUpperCase(input.charAt(i)))
            {
                output+="-";
            }
            output+=Character.toLowerCase(input.charAt(i));
        }
        return  output;
    }

    @Override public void enterArgumentsExpression(JavaScriptParser.ArgumentsExpressionContext ctx)
    {
        trigger=ctx.getChild(0).getText();
       if(trigger == null ||trigger.trim().isEmpty()) {trigger=""; }
    }


    @Override public void enterPropertyExpressionAssignment(JavaScriptParser.PropertyExpressionAssignmentContext ctx)
    {
        if(trigger == null ||trigger.trim().isEmpty()) {trigger=""; }
       if(trigger.contains("StyleSheet.create"))
       {
           String Resultant = "";
           if(!"{".equals(ctx.singleExpression().getChild(0).getChild(0).getText()))
        {
            String propertyName= ctx.propertyName().getText();
            String propertyValue= ctx.singleExpression().getChild(0).getChild(0).getText().replace("'","");
            propertyValue=propertyValue.replace('"',' ').replace(" ","");
            if("flexDirection".equals(propertyName))
            {
              Resultant+="display:flex;\n";
            }
            else if("alignContent".equals(propertyName))
            {
                 Resultant+="align-self:"+propertyValue+";\n";
            }
           Resultant+=Transform(propertyName)+":"+propertyValue+";\n";
            if("container".equals(baseElement))
            {
                outputs.add(Resultant);
            }
        }
        else
         {
             baseElement=ctx.propertyName().getText().toLowerCase();
             open_bruce_counter++;
            if("container".equals(ctx.propertyName().getText().toLowerCase()))
            {
                outputs.add("."+ctx.propertyName().getText()+ctx.singleExpression().getChild(0).getChild(0).getText()+"\n");
                Resultant="ion-content"+ctx.singleExpression().getChild(0).getChild(0).getText()+"\n";
            }
            else
            {
                    Resultant="."+ctx.propertyName().getText()+ctx.singleExpression().getChild(0).getChild(0).getText()+"\n";
            }
        }
        try
        {
           setOutputFile();
           OutputFile.write(Resultant);
           OutputFile.close();
        }
        catch (IOException e)
        {
           e.printStackTrace();
        }
       }
    }

    @Override public void exitObjectLiteral(JavaScriptParser.ObjectLiteralContext ctx)
   {
   if("StyleSheet.create".equals(trigger))
   {
       close_bruce_counter++;
       if(open_bruce_counter==close_bruce_counter)
       {
           writeOutputFile(ctx.getChild(ctx.getChildCount()-1).getText()+"\n");
       }
       else
        {
           for(String out:outputs)
           {

            writeOutputFile(out);
           }

        writeOutputFile("}");

       }
   }
   }
    
    @Override
	public ParseTree convert(String  uploadedFileName) throws IOException 
    {
    		setOutputFile();
		    CharStream charStream= CharStreams.fromFileName(uploadedFileName);
	        JavaScriptLexer lexer = new JavaScriptLexer(charStream);
	        CommonTokenStream tokens = new CommonTokenStream(lexer);
	        JavaScriptParser parser = new JavaScriptParser(tokens);
	        parser.setBuildParseTree(true);
	        ParseTree tree = parser.program();
	        return tree;
	}
		@Override
		public void setFileName(String fileName) 
		{
			file=new File(fileName);

		}
		
		@Override
		public File getFile() {
			// TODO Auto-generated method stub
			return file;
		}

}
