package com.example.translator.service;

import java.io.File;
import java.io.IOException;

import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import com.example.translator.TypeScriptParserBaseListener;
import com.example.translator.KotlinLexer;
import com.example.translator.KotlinParser;

@Scope("prototype")
@Component("Typescript2JavascriptConverter")

public class Typescript2JavascriptConverter extends TypeScriptParserBaseListener  implements CodeConverter{
	
	
	public ParseTree convert(String  uploadedFileName) {
		
		return null;
	}

	@Override
	public void setFileName(String fileName) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public File getFile() {
		// TODO Auto-generated method stub
		return null;
	}

}
