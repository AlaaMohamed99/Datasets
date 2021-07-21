package com.example.translator.service;
import com.example.translator.JavaScriptParser;

public interface UIElementHandler 
{
    String convertCode();
   void setHtmlElementContext(JavaScriptParser.HtmlElementContext ctx);

}
