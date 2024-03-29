package com.example.translator.service;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;
import org.springframework.stereotype.Component;
//import com.example.translator.antlr4.*;
import org.springframework.web.multipart.MultipartFile;

import com.example.translator.ScssLexer;
import com.example.translator.ScssParser;
import com.example.translator.ScssParserBaseListener;
import com.example.translator.dto.Constants;

@Component("Scss2React_NativeConverter")
public class Scss2React_NativeConverter  extends ScssParserBaseListener implements CodeConverter {

	private  File file;
	
	@Override
	public void setFileName(String fileName) {
		file=new File("app.js");

	}

	@Override
	public File getFile() {
		// TODO Auto-generated method stub
		return file;
	}

	@Override
	public ParseTree convert(String  uploadedFileName) throws IOException {
		 /* SCSS Part*/
        CharStream charStream_scss= CharStreams.fromFileName(uploadedFileName);
        ScssLexer scsslexer = new ScssLexer(charStream_scss);
        CommonTokenStream scss_tokens = new CommonTokenStream(scsslexer);
        ScssParser scssparser=new ScssParser(scss_tokens);
        scssparser.setBuildParseTree(true); // not neccessary
        ParseTree scss_tree = scssparser.stylesheet();
    
		return scss_tree;
	}
	
	public void setFile(File file) {
		this.file = file;
	}



      /* Start Main Code */
	public boolean isInteger( String input ) {
        try {
            Integer.parseInt( input );
            return true;
        }
        catch( Exception e ) {
            return false;
        }
    }

    /* function to write in a file */
    public  static void writeToFile(File file,String content,boolean append){
            try {
                FileWriter outputfile = new FileWriter(file.getName(),append);
                outputfile.write(content);
                outputfile.close();
            } catch (Exception e) {
                e.printStackTrace();
            }

    }



    public static boolean isNullOrEmpty(ScssParser.MeasurementContext str) {
        if (str != null && !str.isEmpty())
            return false;
        return true;

    }

    public String handleProperty(String property){
        short pos = (short) property.indexOf("-",3);
        String before = property.substring(0,pos);
        String after = property.substring(pos+1);
        after = after.substring(0,1).toUpperCase() ; // capitaliza first letter after (-)
        after = after.concat(property.substring(pos+2));
        property = before + after ;
        return property ;
    }

        @Override public void enterStylesheet (ScssParser.StylesheetContext ctx){
            try {
                FileWriter outputfile = new FileWriter(file.getName(),true);
                outputfile.write("const Styles = StyleSheet.create({" + "\n");
                outputfile.close();
            } catch (Exception e) {
                e.printStackTrace();
            }

        }

        @Override public void exitStylesheet (ScssParser.StylesheetContext ctx){
            try {
                FileWriter outputfile = new FileWriter(file.getName(),true);
                outputfile.write("\n});");
                outputfile.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }


    @Override public void enterSelectors(ScssParser.SelectorsContext ctx) {
         short selcetor_number= (short) ctx.selector().size();
        if (selcetor_number ==1 ){
            String selector = ctx.selector().get(0).element().get(0).getText();
            selector=selector.replace(".","");
            selector=selector.replace("#","");

            if(selector.substring(2).contains("-")){
                selector=selector.replace("-","_");
            }


            try {
                FileWriter outputfile = new FileWriter(file.getName(),true);
                outputfile.write(selector + ":" +"{\n");
                outputfile.close();
            } catch (Exception e) {
                e.printStackTrace();
            }

        }
    }

    @Override public void exitRuleset(ScssParser.RulesetContext ctx) {
            try {
                FileWriter outputfile = new FileWriter(file.getName(),true);
                outputfile.write("},\n");
                outputfile.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
    }


        @Override public void enterProperty(ScssParser.PropertyContext ctx) {
            String property_value ="";
            String property="";

            /* Handel CSS variables*/
            if (ctx.Variable() != null){
                String css_variable = ctx.Variable().getText();
                property = css_variable.replace("--","");
            }
            else {
                property = ctx.identifier().getText();
            }
            /* this part only for the property  */
            if (property.substring(3).contains("-")) {
                property = handleProperty(property) ;
            }if (property.substring(3).contains("-")) {
                property = handleProperty(property) ;
            }
            else {
                property =property;
            }
            /* property = background should be backgroundColor*/
            if(property.equals("background")){
                property="backgroundColor";
            }
            try {
                FileWriter outputfile = new FileWriter(file.getName(),true);
                outputfile.write(property+":");
                outputfile.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
    }


    @Override public void enterExpression(ScssParser.ExpressionContext ctx) {
        String property_value ="";
        String exp = ctx.getText();
        String parent = ctx.parent.getText();
        String un="";

        /* identifiers */
        if(ctx.identifier() !=null && ctx.measurement()==null ){
            property_value = ctx.identifier().getText();
            property_value = "'" + property_value + "'";

        }

        /*Handle vh and vw  em rem */
         if( exp.contains("vh")
             || exp.contains("vw")  ){
            property_value = ctx.getText();
            String  vh_vw =ctx.identifier().getText();
            property_value = "'"+property_value+vh_vw+"'";

        }


        /* #4546 ==> hashes*/
         if(ctx.Color() != null){
            property_value = ctx.Color().getText();
            property_value = "'"+ property_value+"'";

         }
        /* rgb()*/
         if (exp.contains("rgb")){
            property_value = "'"+ctx.getText()+"'";

        }


        /* px  and %*/
         if(ctx.measurement() !=null && ctx.measurement().Unit()!=null) {
            property_value = ctx.measurement().Number().getText()+" ";
            /* handle percentage sign*/
            if( ctx.measurement().Unit() !=null
                    && ctx.measurement().Unit().getText().equals("%")  ){
                String percent = ctx.measurement().Unit().getText();
                property_value = "'"+property_value.trim()+percent+"'";
            }

         }
         // rem and em
        if(parent.contains("em") ||parent.contains("rem")){
            property_value = "'"+exp+"'";

        }

        try {
            FileWriter outputfile = new FileWriter(file.getName(),true);
            outputfile.write(property_value);
            outputfile.close();
        } catch (Exception e) {
            e.printStackTrace();
        }


    }

    @Override public void exitProperty(ScssParser.PropertyContext ctx) {
        try {
            FileWriter outputfile = new FileWriter(file.getName(),true);
            outputfile.write(",\n");
            outputfile.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override public void exitCommandStatement(ScssParser.CommandStatementContext ctx) {
        String num = "";

        // handle property value with no units
        if (ctx.expression().size() == 1 && !ctx.parent.parent.getText().contains("rgb")
                && ctx.expression(0).measurement() != null ) {
            if (ctx.expression(0).measurement().Number() != null
                    && ctx.expression(0).measurement().Unit() == null){
                num = ctx.expression(0).measurement().Number().getText();
                try {
                    FileWriter outputfile = new FileWriter(file.getName(),true);
                    outputfile.write("s"+num+"e");
                    outputfile.close();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }

        }
    }


  
	 /* ENd Main Code*/
  
	

}
