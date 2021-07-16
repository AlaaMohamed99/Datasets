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

import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

public class React_Native2ScssConverter extends JavaScriptParserBaseListener
{
    private File file;
    private FileWriter OutputFile;
    private String trigger;
    private ArrayList<String>outputs;
    private  Map<String,String>Styling;
    private  int open_bruce_counter;
    private  int close_bruce_counter;
    private String baseElement;
    public React_Native2ScssConverter() throws IOException
    {
        super();

        open_bruce_counter=0;
        close_bruce_counter=0;
        outputs=new ArrayList<>();
        Styling = new HashMap<>();

    }

    public void  setOutputFile()
    {
        if(!file.getName().isEmpty())
        {
            System.out.println("File Name is: "+file.getName());
            try
            {
                OutputFile = new FileWriter(file.getName(),true);
            }
            catch (Exception e)
            {
                System.out.println("Something Went Wrong!");
                e.printStackTrace();
            }
        }
    }
    private String Transform(String input)
    {
        if(input.equals("backgroundColor"))
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
    public void CreateFile() {
        FileWriter OutputFile= null;
        try
        {
            if (file.createNewFile())
            {
                System.out.println("File created: " + file.getName());
            }
            else
            {
                System.out.println("File already exists.");
            }
            OutputFile = new FileWriter(file.getName(), true);
            OutputFile.close();
        } catch (IOException e)
        {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }


    @Override public void enterArgumentsExpression(JavaScriptParser.ArgumentsExpressionContext ctx)
    {
        trigger=ctx.getChild(0).getText();
       if(trigger == null ||trigger.trim().isEmpty()) {trigger=""; }
    }


    @Override public void enterPropertyExpressionAssignment(JavaScriptParser.PropertyExpressionAssignmentContext ctx)
    {
        String Resultant="";
       if(trigger == null ||trigger.trim().isEmpty()) {trigger=""; }
       if(trigger.contains("StyleSheet.create"))
       {
        if(!ctx.singleExpression().getChild(0).getChild(0).getText().equals("{"))
        {
            String propertyName= ctx.propertyName().getText();
            String propertyValue= ctx.singleExpression().getChild(0).getChild(0).getText().replace("'","");
            propertyValue=propertyValue.replace('"',' ').replace(" ","");
            if(propertyName.equals("flexDirection"))
            {
              Resultant+="display:flex;\n";
            }
            else if(propertyName.equals("alignContent"))
            {
                 Resultant+="align-self:"+propertyValue+"\n";
            }
           Resultant+=Transform(propertyName)+":"+propertyValue+";\n";
            if(baseElement.equals("container"))
            {
                outputs.add(Resultant);
            }
        }
        else
         {
             baseElement=ctx.propertyName().getText().toLowerCase();
             open_bruce_counter++;
            if(ctx.propertyName().getText().toLowerCase().equals("container"))
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
    @Override public void exitPropertyExpressionAssignment(JavaScriptParser.PropertyExpressionAssignmentContext ctx) {

    }
    @Override public void enterAssignable(JavaScriptParser.AssignableContext ctx) { }

    @Override public void exitAssignable(JavaScriptParser.AssignableContext ctx) { }
    
   @Override public void exitObjectLiteral(JavaScriptParser.ObjectLiteralContext ctx)
   {
   if("StyleSheet.create".equals(trigger))
   {
       close_bruce_counter++;
       if(open_bruce_counter==close_bruce_counter)
       {
       try
       {
          setOutputFile();
          OutputFile.write(ctx.getChild(ctx.getChildCount()-1).getText()+"\n");
          OutputFile.close();
       }
       catch(IOException e)
       {
          e.printStackTrace();
       }
   }
       else
       {
           for(String out:outputs)
           {

           try
       {
          setOutputFile();
          OutputFile.write(out);
          OutputFile.close();
       }
       catch(IOException e)
       {
          e.printStackTrace();
       }
           }

        try
       {
          setOutputFile();
          OutputFile.write("}");
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
