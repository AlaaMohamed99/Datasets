
import jdk.swing.interop.SwingInterOpUtils;

import java.io.File;
import java.io.FileWriter;
import java.util.HashMap;
import java.util.Map;

public class Scss2ReactnativeConverter extends ScssParserBaseListener {

    Map elements ;

    Scss2ReactnativeConverter() {
        elements =new HashMap<String,String>();
        elements.put("ion-text","Text");
        elements.put("ion-list-header","h2");
        elements.put("ion-content","View");
        elements.put("h1","h1");
        elements.put("h2","h2");
        elements.put("h3","h3");
        elements.put("h4","h4");
        elements.put("h5","h5");
        elements.put("h6","h6");
        elements.put("ion-header","View");
        elements.put("ion-footer","View");
        elements.put("ion-toolbar","View");
        elements.put("ion-range","slider");
        elements.put("ion-label","Text");
        elements.put("div","View");
        elements.put("ion-item","View");
        elements.put("p","Text");
        elements.put("ion-title","Text");
        elements.put("ion-img","Image");
        elements.put("ion-list","Flatlist");
        elements.put("ion-button","Button");
        elements.put("ion-icon","Icon");
        elements.put("ion-input","Input");


        File file = new File("ionic2react.js");
        try {
            if (file.createNewFile()) {
                System.out.println("New file is created " + file.getName());
            } else {
                System.out.println("File already exists.");
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public boolean isInteger( String input ) {
        try {
            Integer.parseInt( input );
            return true;
        }
        catch( Exception e ) {
            return false;
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
                FileWriter outputfile = new FileWriter("ionic2react.js",true);
                outputfile.write("const Styles = StyleSheet.create({" + "\n");
                outputfile.close();
            } catch (Exception e) {
                e.printStackTrace();
            }

        }

        @Override public void exitStylesheet (ScssParser.StylesheetContext ctx){
            try {
                FileWriter outputfile = new FileWriter("ionic2react.js",true);
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

            if (elements.containsKey(selector)){
                selector = (String) elements.get(selector);
            }
            try {
                FileWriter outputfile = new FileWriter("ionic2react.js",true);
                outputfile.write(selector + ":" +"{\n");
                outputfile.close();
            } catch (Exception e) {
                e.printStackTrace();
            }

        }
//        System.out.println("size"+selcetor_number);
    }

    @Override public void exitRuleset(ScssParser.RulesetContext ctx) {
            try {
                FileWriter outputfile = new FileWriter("ionic2react.js",true);
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
                System.out.println("c"+property);
            }
            else {
                property =property;
            }
            try {
                FileWriter outputfile = new FileWriter("ionic2react.js",true);
                outputfile.write(property+":");
                outputfile.close();
            } catch (Exception e) {
                e.printStackTrace();
            }

            /* this part for the property values */
            property_value = ctx.values().commandStatement().get(0).expression().get(0).getText();
            property_value = "'" + property_value + "'";
            String un="";
            if(ctx.values().commandStatement().size()==1){
                ScssParser.MeasurementContext unit = ctx.values().commandStatement().get(0).expression().get(0).measurement();
                if(isNullOrEmpty(unit)) {
                }
                //
                else {
                    property_value = ctx.values().commandStatement().get(0).expression().get(0).measurement().Number().getText();

                }

                try {
                    FileWriter outputfile = new FileWriter("ionic2react.js",true);
                    outputfile.write(property_value);
                    outputfile.close();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            System.out.println(property_value);
        }
    }
        @Override public void exitProperty(ScssParser.PropertyContext ctx) {
            try {
                FileWriter outputfile = new FileWriter("ionic2react.js",true);
                outputfile.write(",\n");
                outputfile.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

    @Override public void enterValues(ScssParser.ValuesContext ctx) {
        if(ctx.COMMA().isEmpty()){

        }
        else{

        }
    }

    @Override public void exitValues(ScssParser.ValuesContext ctx) { }
}
