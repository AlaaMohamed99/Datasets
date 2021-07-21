package com.example.translator.service;

import java.io.File;
import java.io.IOException;

import org.antlr.v4.runtime.tree.ParseTree;
import org.springframework.web.multipart.MultipartFile;

public interface CodeConverter {
	
	public ParseTree convert(String  uploadedFileName) throws IOException;
	
	public void setFileName(String fileName);
	public File getFile();
}
