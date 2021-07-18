public class OnStartTranslationHandler
{
    private  String HtmlFileName;
    private  String TypescriptFileName;
    private  String ScssFileName;
    public OnStartTranslationHandler()
    {
        HtmlFileName="App.html";
        TypescriptFileName="App.ts";
        ScssFileName="App.scss";
    }

    public void setHtmlFileName(String htmlFileName)
    {
        HtmlFileName = htmlFileName;
    }
    public void setTypescriptFileName(String TypescriptFileName)
    {
        this.TypescriptFileName = TypescriptFileName;
    }
    public void setScssFileName(String ScssFileName)
    {
        this.ScssFileName=ScssFileName;
    }
    public String onStartTranslation()
    {
        String DefaultImport="import { Component} from '@angular/core';\n";
        String Selector = "selector:"+"'"+this.TypescriptFileName+"',\n";
        String TemplateUrl = "templateUrl:"+"'"+HtmlFileName+"',\n";
        String StyleUrls = "styleUrls:"+"['"+ScssFileName+"']\n";
        return DefaultImport+"@Component({\n"+Selector+TemplateUrl+StyleUrls+"})\n";
    }

}
