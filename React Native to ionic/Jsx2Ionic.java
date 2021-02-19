import org.antlr.v4.codegen.model.OutputFile;

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
    private  File ionic;
    private String ElementName;
    private  boolean has_closing_tag;
    private  String AttributeName;
    private  boolean has_attribute;
    private  FileWriter OutputFile;


    public Jsx2Ionic() throws IOException {
        super();
        Jsx2ionicMap = new HashMap<String, String>();
        ElementName="";
        AttributeName="";
        has_attribute=false;
        has_closing_tag = false;
        Jsx2ionicMap.put("Button", "ion-button");
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

    }

    public void CreateFile() {
        try {
            if (ionic.createNewFile()) {
                System.out.println("File created: " + ionic.getName());
            } else {
                System.out.println("File already exists.");
            }
            OutputFile = new FileWriter("Ionic.html", true);
            OutputFile.write("<ion-content>" + "\n");
            OutputFile.close();
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
    @Override public void enterHtmlElements(JavaScriptParser.HtmlElementsContext ctx)
    {
        System.out.println("<ion-content>");
    }
    @Override public void exitHtmlElements(JavaScriptParser.HtmlElementsContext ctx)
    {
        System.out.print("</ion-content>");
    }
    @Override public void enterHtmlElement(JavaScriptParser.HtmlElementContext ctx) {
       has_attribute=false;
       has_closing_tag=false;

    }

    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override
    public void exitHtmlElement(JavaScriptParser.HtmlElementContext ctx){
       if(!has_closing_tag)System.out.println(Jsx2ionicMap.get("</"+ElementName+">"));
       has_closing_tag=false;
    }

    @Override
    public void enterHtmlContent(JavaScriptParser.HtmlContentContext ctx) {
     System.out.println(">");
     has_closing_tag=false;
    }

    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override
    public void exitHtmlContent(JavaScriptParser.HtmlContentContext ctx)
    {

    }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override
    public void enterHtmlTagStartName(JavaScriptParser.HtmlTagStartNameContext ctx) {
        has_closing_tag = true;
        System.out.print("<" + Jsx2ionicMap.get(ctx.htmlTagName().getText()));
    }
    @Override
    public void enterHtmlTagClosingName(JavaScriptParser.HtmlTagClosingNameContext ctx) {
        has_closing_tag=true;
        System.out.println("</"+Jsx2ionicMap.get(ctx.htmlTagName().getText())+">");
    }


    @Override
    public void enterHtmlTagName(JavaScriptParser.HtmlTagNameContext ctx) {
       if(!has_closing_tag) System.out.println("<"+Jsx2ionicMap.get(ctx.Identifier().getText()));
       ElementName = ctx.Identifier().getText();
    }


    @Override
    public void exitHtmlTagName(JavaScriptParser.HtmlTagNameContext ctx) {
    }


    @Override
    public void enterHtmlAttribute(JavaScriptParser.HtmlAttributeContext ctx) {
        System.out.println();
        this.AttributeName=ctx.htmlAttributeName().getText();
        has_attribute=true;
    }

    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override
    public void exitHtmlAttribute(JavaScriptParser.HtmlAttributeContext ctx) {
        has_attribute=false;
    }


    @Override
    public void enterHtmlAttributeName(JavaScriptParser.HtmlAttributeNameContext ctx) {
        System.out.print(Jsx2ionicMap.get(ctx.getText()));
    }

    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override
    public void exitHtmlAttributeName(JavaScriptParser.HtmlAttributeNameContext ctx) {
        System.out.print("=");
    }

    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override
    public void enterHtmlChardata(JavaScriptParser.HtmlChardataContext ctx)
    {
        String identifiers = ctx.children.toString();
       String[] ans= identifiers.split(",");
       ans[0]=ans[0].replace('[',' ');
       ans[ans.length-1]=ans[ans.length-1].replace(']',' ');
       for(int i =0;i<ans.length;i++)
        System.out.print(ans[i]+"");
       System.out.println();
    }

    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override
    public void exitHtmlChardata(JavaScriptParser.HtmlChardataContext ctx) {
    }

    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override
    public void enterHtmlAttributeValue(JavaScriptParser.HtmlAttributeValueContext ctx) {
        String answer= ctx.getText();
        if(this.AttributeName.equals("onPress")||this.AttributeName.equals("onChangeText"))
        {
            //System.out.println(ans.replace('{','"').replace('}','(')+""+")"+'"');
            answer = answer.replace('{',' ').replace('}',' ').replace("this"," ").replace('.',' ');
            System.out.println("'"+answer.replace(" ","")+"()"+'"');
        }
        else{
            System.out.println(ctx.getText());
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


}
