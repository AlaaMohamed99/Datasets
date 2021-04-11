package com.example.translator.service;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.antlr.v4.runtime.tree.ParseTree;
import org.springframework.web.multipart.MultipartFile;

import com.example.translator.dto.Languages;



public interface CodeConversionService {
	
	public List <File> convertCode(MultipartFile file,Languages inputLanguage ,Languages outputLanguage) throws IOException;

}