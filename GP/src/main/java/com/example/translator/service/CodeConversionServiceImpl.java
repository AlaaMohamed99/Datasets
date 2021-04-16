package com.example.translator.service;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

import java.util.List;
import java.util.Map;

import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeListener;
import org.antlr.v4.runtime.tree.ParseTreeWalker;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.multipart.MultipartFile;

import com.example.translator.dto.Constants;
import com.example.translator.dto.FlutterDTO;
import com.example.translator.dto.XmlDTO;

import com.example.translator.dto.IonicDTO;
import com.example.translator.dto.Languages;
import com.example.translator.dto.React_NativeDTO;
import com.example.translator.handlers.FlutterHandler;
import com.example.translator.handlers.XmlHandler;

import com.example.translator.handlers.IonicHandler;
import com.example.translator.handlers.React_NativeHandler;
import com.example.translator.utils.FileUtils;


@Component
public class CodeConversionServiceImpl implements CodeConversionService  {

	@Autowired
	Map <String,CodeConverter> converters;
	
	public List <File> convertCode(MultipartFile file, Languages inputLanguage, Languages outputLanguage) throws IOException {
		
		String inLanguage=inputLanguage.getLanguage();
		String outLanguage=outputLanguage.getLanguage();
		
			
		String uploadPath = Constants.UPLOAD_PATH_URL;

		String uploadedFileName = null;
		try {
			uploadedFileName = FileUtils.upload(file, uploadPath);
		} catch (Exception exception) {

		}
        List<File> generateFiles=new ArrayList<>();
        // Ionic to React part
		 if(inLanguage.equals(Languages.IONIC.getLanguage()) && outLanguage.equals(Languages.REACT_NATIVE.getLanguage())) {
			IonicDTO ionicDTO = IonicHandler.prepareFiles(uploadedFileName);
			for (File htmlFile : ionicDTO.getHtmlFiles()) {

				CodeConverter requiredConverter = converters.get("Html" + "2" + outLanguage + "Converter");
				requiredConverter.setFileName(htmlFile.getName().split("\\.")[0].split("\\(")[0] + ".js");
				ParseTree parsetree = requiredConverter
						.convert(ionicDTO.getFolderPath() + File.separator + htmlFile.getName());
				ParseTreeWalker walker = new ParseTreeWalker();
				walker.walk((ParseTreeListener) requiredConverter, parsetree);
				File generatedFile = requiredConverter.getFile();
				generateFiles.add(generatedFile);
			}

			for (File scssFile : ionicDTO.getSccsFiles()) {

				CodeConverter requiredConverter = converters.get("Scss" + "2" + outLanguage + "Converter");
				requiredConverter.setFileName(scssFile.getName().split("\\.")[0].split("\\(")[0] + ".js");
				ParseTree parsetree = requiredConverter
						.convert(ionicDTO.getFolderPath() + File.separator + scssFile.getName());
				ParseTreeWalker walker = new ParseTreeWalker();
				walker.walk((ParseTreeListener) requiredConverter, parsetree);
				File generatedFile = requiredConverter.getFile();
				generateFiles.add(generatedFile);
			}
		 }
	 // Ionic to React part
		 else if(inLanguage.equals(Languages.REACT_NATIVE.getLanguage()) && outLanguage.equals(Languages.IONIC.getLanguage())) {

			React_NativeDTO react_NativeDTO = React_NativeHandler.prepareFiles(uploadedFileName);
			for (File javaScriptFile : react_NativeDTO.getJavascriptFiles()) {
				CodeConverter requiredConverter = converters.get(inLanguage + "2" + "Html" + "Converter");
				requiredConverter.setFileName(javaScriptFile.getName().split("\\.")[0].split("\\(")[0] + ".html");
				ParseTree parsetree = requiredConverter
						.convert(react_NativeDTO.getFolderPath() + File.separator + javaScriptFile.getName());
				ParseTreeWalker walker = new ParseTreeWalker();
				walker.walk((ParseTreeListener) requiredConverter, parsetree);
				File generatedFile = requiredConverter.getFile();
				generateFiles.add(generatedFile);

			}
			 // Ionic to React part 
		 }
		 
		// flutter to ionic part
         else if(inLanguage.equals(Languages.FLUTTER.getLanguage()) && outLanguage.equals(Languages.IONIC.getLanguage())) {
			 
			FlutterDTO flutterDTO = FlutterHandler.prepareFiles(uploadedFileName);
			for (File dartFile : flutterDTO.getDartFiles()) {
				CodeConverter requiredConverter = converters.get(inLanguage + "2" + "Html" + "Converter");
				
				requiredConverter.setFileName(dartFile.getName().split("\\.")[0].split("\\(")[0] + ".html");
				ParseTree parsetree = requiredConverter
						.convert(flutterDTO.getFolderPath() + File.separator + dartFile.getName());
				ParseTreeWalker walker = new ParseTreeWalker();
				walker.walk((ParseTreeListener) requiredConverter, parsetree);
				File generatedFile = requiredConverter.getFile();
				generateFiles.add(generatedFile);

			 }	 
			for (File dartFile : flutterDTO.getDartFiles()) {
				CodeConverter requiredConverter = converters.get(inLanguage + "2" + "Scss" + "Converter");
				
				requiredConverter.setFileName(dartFile.getName().split("\\.")[0].split("\\(")[0] + ".scss");
				ParseTree parsetree = requiredConverter
						.convert(flutterDTO.getFolderPath() + File.separator + dartFile.getName());
				ParseTreeWalker walker = new ParseTreeWalker();
				walker.walk((ParseTreeListener) requiredConverter, parsetree);
				File generatedFile = requiredConverter.getFile();
				generateFiles.add(generatedFile);

			 }	 
		 }
		 
			// flutter to ionic parts
		 
		 
		 		// xml to ionic part
         else if(inLanguage.equals(Languages.XML.getLanguage()) && outLanguage.equals(Languages.IONIC.getLanguage())) {
        	 System.out.print("hhasodkj;klsakdj");
        	 System.out.print("/////////////////////////");
        	 
			 
			XmlDTO XmlDTO = XmlHandler.prepareFiles(uploadedFileName);
			for (File xmlFile : XmlDTO.getxmlFiles()) {
				CodeConverter requiredConverter = converters.get(inLanguage + "2" + "Html" + "Converter");
				
				requiredConverter.setFileName(xmlFile.getName().split("\\.")[0].split("\\(")[0] + ".html");
				ParseTree parsetree = requiredConverter
						.convert(XmlDTO.getFolderPath() + File.separator + xmlFile.getName());
				ParseTreeWalker walker = new ParseTreeWalker();
				walker.walk((ParseTreeListener) requiredConverter, parsetree);
				File generatedFile = requiredConverter.getFile();
				generateFiles.add(generatedFile);

			 }	 
			for (File xmlFile : XmlDTO.getxmlFiles()) {
				CodeConverter requiredConverter = converters.get(inLanguage + "2" + "Scss" + "Converter");
				
				requiredConverter.setFileName(xmlFile.getName().split("\\.")[0].split("\\(")[0] + ".scss");
				ParseTree parsetree = requiredConverter
						.convert(XmlDTO.getFolderPath() + File.separator + xmlFile.getName());
				ParseTreeWalker walker = new ParseTreeWalker();
				walker.walk((ParseTreeListener) requiredConverter, parsetree);
				File generatedFile = requiredConverter.getFile();
				generateFiles.add(generatedFile);

			 }	 
		 }


		return generateFiles;
		
		
	}




}
