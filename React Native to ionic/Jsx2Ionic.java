import org.antlr.v4.codegen.model.OutputFile;

import javax.security.sasl.SaslServer;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Jsx2Ionic extends JavaScriptParserBaseListener {
    private Map Jsx2ionicMap;
    private String ElementName;
    private  boolean has_closing_tag;
    private  String AttributeName;
    private  boolean has_attribute;
    private boolean put_label;
    private  String Label;
    private ArrayList<String>outputfile;

    public Jsx2Ionic(){
        super();
        outputfile= new ArrayList<String>();
        Jsx2ionicMap = new HashMap<String, String>();
        ElementName="";
        AttributeName="";
        has_attribute=false;
        has_closing_tag = false;
        put_label = false;
        Jsx2ionicMap.put("Button", "ion-button");
        Jsx2ionicMap.put("label","");
        Jsx2ionicMap.put("Text", "ion-text");
        Jsx2ionicMap.put("View", "ion-item");
        Jsx2ionicMap.put("</TextInput>", "</ion-input>");
        Jsx2ionicMap.put("</Button>","</ion-button>");
        Jsx2ionicMap.put("onPress", "(Click)");
        Jsx2ionicMap.put("TextInput","ion-input type="+'"'+"text"+'"');
        Jsx2ionicMap.put("value","value");
        Jsx2ionicMap.put("onChangeText","(change)");
        Jsx2ionicMap.put("color","color");
        Jsx2ionicMap.put("style","style");
        Jsx2ionicMap.put("title","label");
        Jsx2ionicMap.put("FlatList","ion-list");
        Jsx2ionicMap.put("ul","ul");
        Jsx2ionicMap.put("li","li");
        Jsx2ionicMap.put("ol","ol");
        Jsx2ionicMap.put("div","div");


    }

    public void CreateFile() {
        try
        {
            File ionic = new File("ionic.text");
            if (ionic.createNewFile())
            {
                System.out.println("File created: " + ionic.getName());
            }
            else
            {
                System.out.println("File already exists.");
            }
            FileWriter myFile = new FileWriter("ionic.text",true);
            myFile.write("From React Native Ui to Ionic Ui");
            myFile.close();
        } catch (IOException e)
        {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
    @Override public void enterHtmlElements(JavaScriptParser.HtmlElementsContext ctx)
    {
        outputfile.add("<ion-content>" + "\n");
        System.out.println("<ion-content>");
    }
    @Override public void exitHtmlElements(JavaScriptParser.HtmlElementsContext ctx)
    {
        outputfile.add("</ion-content>"+"\n");
        System.out.print("</ion-content>");
    }
    @Override public void enterHtmlElement(JavaScriptParser.HtmlElementContext ctx)
    {
       has_attribute=false;
       has_closing_tag=false;
    }

    @Override
    public void exitHtmlElement(JavaScriptParser.HtmlElementContext ctx){

        if(!has_closing_tag)
        {
            System.out.println((String)Jsx2ionicMap.get("</"+ElementName+">"));
            outputfile.add((String) Jsx2ionicMap.get("</"+ElementName+">")+"\n");
        }
       has_closing_tag=false;
       if(put_label)
       {
           System.out.println("<ion-label position='fixed' >"+this.Label+"</ion-label>");
           outputfile.add("<ion-label position='fixed' >"+this.Label+"</ion-label>"+"\n");
       }
       put_label=false;
       Label="";
    }

    @Override
    public void enterHtmlContent(JavaScriptParser.HtmlContentContext ctx)
    {
        outputfile.add(">"+"\n");
        System.out.println(">");
        has_closing_tag=false;
    }


    @Override
    public void exitHtmlContent(JavaScriptParser.HtmlContentContext ctx)
    {

    }

    @Override
    public void enterHtmlTagStartName(JavaScriptParser.HtmlTagStartNameContext ctx)
    {
        has_closing_tag = true;
        outputfile.add("<" + Jsx2ionicMap.get(ctx.htmlTagName().getText()));
        System.out.print("<" + Jsx2ionicMap.get(ctx.htmlTagName().getText()));
    }
    @Override
    public void enterHtmlTagClosingName(JavaScriptParser.HtmlTagClosingNameContext ctx)
    {
        has_closing_tag=true;
        outputfile.add("</"+Jsx2ionicMap.get(ctx.htmlTagName().getText())+">"+"\n");
        System.out.println("</"+Jsx2ionicMap.get(ctx.htmlTagName().getText())+">");
    }


    @Override
    public void enterHtmlTagName(JavaScriptParser.HtmlTagNameContext ctx) {
       if(!has_closing_tag)
       {
           System.out.println("<" + Jsx2ionicMap.get(ctx.Identifier().getText()));
           outputfile.add("<" + Jsx2ionicMap.get(ctx.Identifier().getText())+"\n");
       }
       ElementName = ctx.Identifier().getText();
    }


    @Override
    public void exitHtmlTagName(JavaScriptParser.HtmlTagNameContext ctx) {

    }


    @Override
    public void enterHtmlAttribute(JavaScriptParser.HtmlAttributeContext ctx) {
        System.out.println();
        outputfile.add(" \n");
        this.AttributeName=ctx.htmlAttributeName().getText();
        has_attribute=true;
    }

    @Override
    public void exitHtmlAttribute(JavaScriptParser.HtmlAttributeContext ctx)
    {
        has_attribute=false;
    }


    @Override
    public void enterHtmlAttributeName(JavaScriptParser.HtmlAttributeNameContext ctx) {
       if(!ctx.getText().equals("label")&&!this.AttributeName.equals("title"))
       {
           System.out.print(Jsx2ionicMap.get(ctx.getText()));
           outputfile.add((String) Jsx2ionicMap.get(ctx.getText()));
       }
       else {
           put_label=true;
       }
    }

    @Override
    public void exitHtmlAttributeName(JavaScriptParser.HtmlAttributeNameContext ctx) {
       if(!this.AttributeName.equals("label")&&!this.AttributeName.equals("title"))
       {
           System.out.print("=");
           outputfile.add("=");
       }
    }

    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override
    public void enterHtmlChardata(JavaScriptParser.HtmlChardataContext ctx){
        String identifiers = ctx.children.toString();
       String[] ans= identifiers.split(",");
       ans[0]=ans[0].replace('[',' ');
       ans[ans.length-1]=ans[ans.length-1].replace(']',' ');
       String empty="";
       for(int i =0;i<ans.length;i++)
       {
           empty+=ans[i];
       }
       System.out.println(empty);
        outputfile.add(empty+"\n");

    }

    @Override
    public void exitHtmlChardata(JavaScriptParser.HtmlChardataContext ctx) {
    }


    @Override
    public void enterHtmlAttributeValue(JavaScriptParser.HtmlAttributeValueContext ctx) {
        String answer= ctx.getText();
        if(put_label&&(this.AttributeName.equals("label")||this.AttributeName.equals("title")))this.Label=answer;
        if(this.AttributeName.equals("onPress")||this.AttributeName.equals("onChangeText"))
        {
            answer ='"'+ answer.replace('{',' ').replace('}',' ').replace("this"," ").replace('.',' ').replace(" ","")+"()"+'"';
        }
        else if(this.AttributeName.equals("style"))
        {
            answer = '"'+answer.replace('{',' ').replace('}',' ').replace("this"," ").replace('.',' ').replace("styles","").replace(" ","")+'"';
        }
       if(!(this.AttributeName.equals("label")||this.AttributeName.equals("title")))
        {
            System.out.println(answer);
            outputfile.add(answer+"\n");
        }
    }

    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override
    public void exitHtmlAttributeValue(JavaScriptParser.HtmlAttributeValueContext ctx) {
        this.AttributeName="";
    }

   public void show_output()
   {
       FileWriter myFile = null;
       for (int i=0;i<this.outputfile.size();i++)
       {
           System.out.print(outputfile.get(i));
           try {
               myFile = new FileWriter("ionic.text",true);
               myFile.write(outputfile.get(i));
               myFile.close();
           } catch (IOException e) {
               e.printStackTrace();
           }
       }

   }

}
