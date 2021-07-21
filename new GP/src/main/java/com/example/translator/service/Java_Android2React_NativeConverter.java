package com.example.translator.service;

import java.io.File;

import org.antlr.v4.runtime.tree.ParseTree;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

@Component("Java_Android2React_NativeConverter")
public class Java_Android2React_NativeConverter implements CodeConverter {


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
