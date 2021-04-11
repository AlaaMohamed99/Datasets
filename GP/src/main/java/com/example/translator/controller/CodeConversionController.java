package com.example.translator.controller;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import com.example.translator.dto.Languages;
import com.example.translator.service.CodeConversionService;



@Controller
public class CodeConversionController {
		
	
	@Autowired
	CodeConversionService codeConversionService;
	
	@RequestMapping(value = "/convert", method = RequestMethod.POST, headers = "Accept=application/json")
	public @ResponseBody List <File> convert(@RequestBody MultipartFile file,@RequestParam Languages inputLanguage ,@RequestParam Languages outputLanguage) throws IOException{
		
		
	return codeConversionService.convertCode(file, inputLanguage, outputLanguage); 
		

	}

}