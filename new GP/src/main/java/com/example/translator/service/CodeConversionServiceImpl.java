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
import com.example.translator.dto.KotlinDTO;
import com.example.translator.dto.JavaDTO;
import com.example.translator.dto.DartDTO;
import com.example.translator.dto.JavascriptDTO;
import com.example.translator.dto.TypescriptDTO;

import com.example.translator.dto.IonicDTO;
import com.example.translator.dto.Languages;
import com.example.translator.dto.React_NativeDTO;
import com.example.translator.handlers.FlutterHandler;
import com.example.translator.handlers.XmlHandler;
import com.example.translator.handlers.JavaHandler;
import com.example.translator.handlers.KotlinHandler;
import com.example.translator.handlers.DartHandler;
import com.example.translator.handlers.TypescriptHandler;
import com.example.translator.handlers.JavascriptHandler;

import com.example.translator.handlers.IonicHandler;
import com.example.translator.handlers.React_NativeHandler;
import com.example.translator.utils.FileUtils;


@Component
public class CodeConversionServiceImpl implements CodeConversionService  
{

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
			
//			System.out.println("typescript files"+ionicDTO.getTypescriptFiles());
//			System.out.println("html files"+ionicDTO.getHtmlFiles());

			for (short i=0;i<ionicDTO.getHtmlFiles().size();i++) {
				
				File f = ionicDTO.getHtmlFiles().get(i);
			

				CodeConverter requiredConverter = converters.get("Html" + "2" + outLanguage + "Converter");
				
				String filename = f.getName().split("\\.")[0].split("\\(")[0] ;
								
				requiredConverter.setFileName(f.getName().split("\\.")[0].split("\\(")[0] + ".js");
				
				
				ParseTree parsetree = requiredConverter
						.convert(ionicDTO.getFolderPath() + File.separator + f.getName());
				
				ParseTreeWalker walker = new ParseTreeWalker();
				
				walker.walk((ParseTreeListener) requiredConverter, parsetree);
				
				
				Html2React_NativeConverter conv_html =(Html2React_NativeConverter) requiredConverter;
				
				
				String typescriptfilename;
				File typescriptfile ;
				
//				System.out.println("size "+ionicDTO.getTypescriptFiles() );

				for (short i1 = 0 ; i1<ionicDTO.getTypescriptFiles().size();i1++) {
					
					typescriptfilename = ionicDTO.getTypescriptFiles().get(i).getName().split("\\.")[0].split("\\(")[0] ;
					

					System.out.println("fileName "+f);
					System.out.println("fileName "+ionicDTO.getTypescriptFiles().get(i1));
					System.out.println(conv_html.ngModel_to_state_with_func );
					/* */
					if (typescriptfilename.equals(filename)) {
						System.out.println(" yes test");
						
						typescriptfile = ionicDTO.getTypescriptFiles().get(i);
						

						CodeConverter requiredConverter_typescript = converters.get("Typescript" + "2" + "Javascript" + "Converter");
						
						System.out.println("fileName_typescript "+typescriptfilename);
						System.out.println("fileName "+filename);

						
						requiredConverter_typescript.setFileName(f.getName().split("\\.")[0].split("\\(")[0] + ".js");
						
						Typescript2JavascriptConverter conv_typescript =(Typescript2JavascriptConverter) requiredConverter_typescript;

						conv_typescript.states_ngModel = conv_html.ngModel_to_state_with_func ;
						conv_typescript.states_ngModel2  = conv_html.ngModel_to_state_without_func ;
						conv_typescript.states_propBinding= conv_html.propBinding_to_state ;
						conv_typescript.classBinding = conv_html.class_binding;


						conv_typescript.allstates.addAll(conv_typescript.states_ngModel);
						conv_typescript.allstates.addAll(conv_typescript.states_propBinding);
						conv_typescript.allstates.addAll(conv_typescript.states_ngModel2);
						
						
						/* adding :'' to ngModels to initialize the state's variables */
		                for(short j1 = 0; j1< conv_typescript.states_ngModel.size(); j1++){
		                	conv_typescript.newState.add(j1, conv_typescript.states_ngModel.get(j1)+": ''");
		                }

		                /* adding :'' to property_binding to initialize the state's variables */
		                for(short j2 = 0; j2< conv_typescript.states_propBinding.size(); j2++){
		                	conv_typescript.newState.add(i, conv_typescript.states_propBinding.get(i)+": ''");
		                }

		                /* adding :'' to ngModels2 to initialize the state's variables */
		                for(short j3 = 0; j3< conv_typescript.states_ngModel2.size(); j3++){
		                	conv_typescript.newState.add(i, conv_typescript.states_ngModel2.get(i)+": ''");
		                }

		                // handle change functions
		                for (short j4 = 0; j4< conv_typescript.states_ngModel.size(); j4++){
		                	conv_typescript.handleFunctions = conv_typescript.handleFunctions
		                                +"handleChangeOf"+ conv_typescript.states_ngModel.get(i)
		                                +"=(event)=>{\n"+"this.setState({"
		                                + conv_typescript.states_ngModel.get(i) +": event.target.value});"
		                                +"\n }\n";
		                }

						
//						ParseTree parsetree_typescript = requiredConverter
//								.convert(ionicDTO.getFolderPath() + File.separator + f.getName());
//						
//						ParseTreeWalker walker_typescript = new ParseTreeWalker();
//						
//						walker_typescript.walk((ParseTreeListener) requiredConverter_typescript, parsetree_typescript);
						
						System.out.println(conv_typescript.states_ngModel);
						/* remove it from  type script lists */
						break;
					}
				}
				
//				System.out.println("size "+ionicDTO.getTypescriptFiles());

				System.out.println("end loop");

				File generatedFile = requiredConverter.getFile();
				generateFiles.add(generatedFile);
				
			}

			
			
							
			for (short i=0;i<ionicDTO.getTypescriptFiles().size();i++) {
				
				File f = ionicDTO.getTypescriptFiles().get(i);
				CodeConverter requiredConverter = converters.get("Typescript" + "2" + "Javascript" + "Converter");
				
				
				requiredConverter.setFileName(f.getName().split("\\.")[0].split("\\(")[0] + ".js");
				System.out.println("fileName "+f.getName().split("\\.")[0].split("\\(")[0] );

				
				Typescript2JavascriptConverter conv1 =(Typescript2JavascriptConverter) requiredConverter;

				ParseTree parsetree = requiredConverter
						.convert(ionicDTO.getFolderPath() + File.separator + f.getName());
				
				ParseTreeWalker walker = new ParseTreeWalker();
				
				walker.walk((ParseTreeListener) requiredConverter, parsetree);

				File generatedFile = requiredConverter.getFile();
				generateFiles.add(generatedFile);
				
			}
			
			
//			
			for (File scssFile : ionicDTO.getSccsFiles()) {

				CodeConverter requiredConverter = converters.get("Scss" + "2" + outLanguage + "Converter");
				
				requiredConverter.setFileName(scssFile.getName().split("\\.")[0].split("\\(")[0] + ".js");
				
				ParseTree parsetree = requiredConverter
						.convert(ionicDTO.getFolderPath() + File.separator + scssFile.getName());
				
				System.out.println("parse tree"+parsetree);
				
				ParseTreeWalker walker = new ParseTreeWalker();
				
				walker.walk((ParseTreeListener) requiredConverter, parsetree);
				
				File generatedFile = requiredConverter.getFile();				
				generateFiles.add(generatedFile);
				
			}
		 }
	
		 
	 // React to Ionic part
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
			for (File javaScriptFile : react_NativeDTO.getJavascriptFiles()) 
			{
				CodeConverter requiredConverter = converters.get(inLanguage + "2" + "Scss" + "Converter");
				requiredConverter.setFileName(javaScriptFile.getName().split("\\.")[0].split("\\(")[0] + ".scss");
				ParseTree parsetree = requiredConverter
						.convert(react_NativeDTO.getFolderPath() + File.separator + javaScriptFile.getName());
				ParseTreeWalker walker = new ParseTreeWalker();
				walker.walk((ParseTreeListener) requiredConverter, parsetree);
				File generatedFile = requiredConverter.getFile();
				generateFiles.add(generatedFile);

			}
			
			for (File javaScriptFile : react_NativeDTO.getJavascriptFiles()) 
			{			
				CodeConverter requiredConverter = converters.get(inLanguage + "2" + "Typescript" + "Converter");
				
				requiredConverter.setFileName(javaScriptFile.getName().split("\\.")[0].split("\\(")[0] + ".ts");
				ParseTree parsetree = requiredConverter
						.convert(react_NativeDTO.getFolderPath() + File.separator + javaScriptFile.getName());
				ParseTreeWalker walker = new ParseTreeWalker();
				walker.walk((ParseTreeListener) requiredConverter, parsetree);
				File generatedFile = requiredConverter.getFile();
				generateFiles.add(generatedFile);
			 // Ionic to React part 
			}
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
			
			
			for (File dartFile : flutterDTO.getDartFiles()) 
			{
				CodeConverter requiredConverter = converters.get(inLanguage + "2" + "Typescript" + "Converter");
				
				requiredConverter.setFileName(dartFile.getName().split("\\.")[0].split("\\(")[0] + ".ts");
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

        	 
			 
			XmlDTO XmlDTO = XmlHandler.prepareFiles(uploadedFileName);
			for (File xmlFile : XmlDTO.getxmlFiles()) {
				CodeConverter requiredConverter = converters.get(inLanguage + "2" + "Html" + "Converter");
				
				requiredConverter.setFileName( "home.page.html");
				ParseTree parsetree = requiredConverter
						.convert(XmlDTO.getFolderPath() + File.separator + xmlFile.getName());
				ParseTreeWalker walker = new ParseTreeWalker();
				walker.walk((ParseTreeListener) requiredConverter, parsetree);
				File generatedFile = requiredConverter.getFile();
				generateFiles.add(generatedFile);

			 }	 
			for (File xmlFile : XmlDTO.getxmlFiles()) {
				CodeConverter requiredConverter = converters.get(inLanguage + "2" + "Scss" + "Converter");
				
				requiredConverter.setFileName("home.page.scss");
				ParseTree parsetree = requiredConverter
						.convert(XmlDTO.getFolderPath() + File.separator + xmlFile.getName());
				ParseTreeWalker walker = new ParseTreeWalker();
				walker.walk((ParseTreeListener) requiredConverter, parsetree);
				File generatedFile = requiredConverter.getFile();
				generateFiles.add(generatedFile);

			 }	 
		 }
		 
	 		// Java to typescript part
         else if(inLanguage.equals(Languages.JAVA.getLanguage()) && outLanguage.equals(Languages.TYPESCRIPT.getLanguage())) {

        	 
			 
			JavaDTO JavaDTO = JavaHandler.prepareFiles(uploadedFileName);
			for (File javaFile : JavaDTO.getjavaFiles()) {
				CodeConverter requiredConverter = converters.get(inLanguage + "2" + "Typescript" + "Converter");
				
				requiredConverter.setFileName( "home.page.ts");
				ParseTree parsetree = requiredConverter
						.convert(JavaDTO.getFolderPath() + File.separator + javaFile.getName());
				ParseTreeWalker walker = new ParseTreeWalker();
				walker.walk((ParseTreeListener) requiredConverter, parsetree);
				File generatedFile = requiredConverter.getFile();
				generateFiles.add(generatedFile);

			 }	 
		 }
		 
		// kotlin to typescript part
         else if(inLanguage.equals(Languages.KOTLIN.getLanguage()) && outLanguage.equals(Languages.TYPESCRIPT.getLanguage())) {

			 
			KotlinDTO KotlinDTO = KotlinHandler.prepareFiles(uploadedFileName);
			for (File kotlinFile : KotlinDTO.getkotlinFiles()) {
				CodeConverter requiredConverter = converters.get(inLanguage + "2" + "Typescript" + "Converter");
				
				requiredConverter.setFileName("home.page.ts");
				ParseTree parsetree = requiredConverter
						.convert(KotlinDTO.getFolderPath() + File.separator + kotlinFile.getName());
				ParseTreeWalker walker = new ParseTreeWalker();
				walker.walk((ParseTreeListener) requiredConverter, parsetree);
				File generatedFile = requiredConverter.getFile();
				generateFiles.add(generatedFile);

			 }	 
		 }
		 
			//  typescript to javascript part
         else if(inLanguage.equals(Languages.TYPESCRIPT.getLanguage()) && outLanguage.equals(Languages.JAVASCRIPT.getLanguage())) {

        	 
			TypescriptDTO TypescriptDTO = TypescriptHandler.prepareFiles(uploadedFileName);
			for (File typescriptFile : TypescriptDTO.gettypescriptFiles()) {
				CodeConverter requiredConverter = converters.get(inLanguage + "2" + "Javascript" + "Converter");
				
				requiredConverter.setFileName(typescriptFile.getName().split("\\.")[0].split("\\(")[0] + ".js");
				ParseTree parsetree = requiredConverter
						.convert(TypescriptDTO.getFolderPath() + File.separator + typescriptFile.getName());
				ParseTreeWalker walker = new ParseTreeWalker();
				walker.walk((ParseTreeListener) requiredConverter, parsetree);
				File generatedFile = requiredConverter.getFile();
				generateFiles.add(generatedFile);

			 }	 
		 }

		 
			// dart to typescript part
         else if(inLanguage.equals(Languages.DART.getLanguage()) && outLanguage.equals(Languages.TYPESCRIPT.getLanguage())) {

        	 
			 
        	 DartDTO DartDTO = DartHandler.prepareFiles(uploadedFileName);
			for (File dartFile : DartDTO.getdartFiles()) {
				CodeConverter requiredConverter = converters.get(inLanguage + "2" + "Typescript" + "Converter");
				
				requiredConverter.setFileName(dartFile.getName().split("\\.")[0].split("\\(")[0] + ".ts");
				ParseTree parsetree = requiredConverter
						.convert(DartDTO.getFolderPath() + File.separator + dartFile.getName());
				ParseTreeWalker walker = new ParseTreeWalker();
				walker.walk((ParseTreeListener) requiredConverter, parsetree);
				File generatedFile = requiredConverter.getFile();
				generateFiles.add(generatedFile);

			 }	 
		 }

		 
		 
			// javascript to typescript part
         else if(inLanguage.equals(Languages.JAVASCRIPT.getLanguage()) && outLanguage.equals(Languages.TYPESCRIPT.getLanguage())) {

        	 
			 
        	 JavascriptDTO JavascriptDTO = JavascriptHandler.prepareFiles(uploadedFileName);
			for (File javascriptFile : JavascriptDTO.getjavascriptFiles()) {
				CodeConverter requiredConverter = converters.get(inLanguage + "2" + "Typescript" + "Converter");
				
				requiredConverter.setFileName(javascriptFile.getName().split("\\.")[0].split("\\(")[0] + ".ts");
				ParseTree parsetree = requiredConverter
						.convert(JavascriptDTO.getFolderPath() + File.separator + javascriptFile.getName());
				ParseTreeWalker walker = new ParseTreeWalker();
				walker.walk((ParseTreeListener) requiredConverter, parsetree);
				File generatedFile = requiredConverter.getFile();
				generateFiles.add(generatedFile);

			 }	 
		 }





		return generateFiles;
		
		
	}




}
