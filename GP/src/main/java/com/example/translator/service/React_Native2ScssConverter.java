package com.example.translator.service;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;
//import com.example.translator.antlr4.*;

import com.example.translator.JavaScriptLexer;
import com.example.translator.JavaScriptParser;
import com.example.translator.JavaScriptParserBaseListener;

@Component("React_Native2ScssConverter")
public class React_Native2ScssConverter extends JavaScriptParserBaseListener implements CodeConverter {

	    private File file;
	    private String trigger;
	    private  Map<String,String>Styling;
	    private  int open_bruce_counter;
	    private  int close_bruce_counter;

	    public React_Native2ScssConverter() throws IOException {
	        super();
	        open_bruce_counter=0;
	        close_bruce_counter=0;
	        Styling = new HashMap<String,String>();
	        Styling.put("backgroundColor","--background");
	    }
	    private String Transform(String input)
	    {
	        String output = "";
	        if(Styling.containsKey(input))

	        return Styling.get(input);

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
	    }

	    @Override public void exitArgumentsExpression(JavaScriptParser.ArgumentsExpressionContext ctx) {

	    }

	    @Override public void enterPropertyExpressionAssignment(JavaScriptParser.PropertyExpressionAssignmentContext ctx)
	    {
	        String Resultant;
	        if(trigger.equals("StyleSheet.create"))
	       {
	        if(!ctx.singleExpression().getChild(0).getChild(0).getText().equals("{"))
	        {

	           Resultant=Transform(ctx.propertyName().getText())+":"+ctx.singleExpression().getChild(0).getChild(0).getText().replace("'","")+";\n";
	        }
	        else
	         {
	             open_bruce_counter++;
	            if(ctx.propertyName().getText().toLowerCase().equals("container"))
	            {
	                Resultant="ion-content"+ctx.singleExpression().getChild(0).getChild(0).getText()+"\n";
	            }
	            else
	            {
	                    Resultant="."+ctx.propertyName().getText()+ctx.singleExpression().getChild(0).getChild(0).getText()+"\n";
	            }
	        }
	        FileWriter OutputFile = null;
	        try
	        {
	            System.out.print(Resultant);
	           OutputFile = new FileWriter(file.getName(), true);
	           OutputFile.write(Resultant);
	           OutputFile.close();
	        }
	        catch (IOException e)
	        {
	           e.printStackTrace();
	        }
	       }
	    }
	    @Override public void exitPropertyExpressionAssignment(JavaScriptParser.PropertyExpressionAssignmentContext ctx) {

	    }
	    @Override public void enterAssignable(JavaScriptParser.AssignableContext ctx) { }

	    @Override public void exitAssignable(JavaScriptParser.AssignableContext ctx) { }
	    
	   @Override public void exitObjectLiteral(JavaScriptParser.ObjectLiteralContext ctx)
	   {
	   if(trigger.equals("StyleSheet.create"))
	   {
	       close_bruce_counter++;
	       if(open_bruce_counter==close_bruce_counter)
	       {
	       System.out.print(ctx.getChild(ctx.getChildCount()-1).getText()+"\n");
	       FileWriter OutputFile = null;
	       try
	       {
	          OutputFile = new FileWriter(file.getName(),true);
	          OutputFile.write(ctx.getChild(ctx.getChildCount()-1).getText()+"\n");
	          OutputFile.close();
	       }
	       catch(IOException e)
	       {
	          e.printStackTrace();
	       }
	   }
	   }
	   }
		public ParseTree convert(String  uploadedFileName) throws IOException {
			  FileWriter OutputFile = new FileWriter(file.getName(), true);
	           OutputFile.write("<ion-content>" + "\n");
	           OutputFile.close();
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
