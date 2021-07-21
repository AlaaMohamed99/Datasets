package com.example.translator.handlers;

import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.example.translator.dto.Constants;
import com.example.translator.dto.IonicDTO;
import com.example.translator.utils.FileUtils;

public class IonicHandler {
	
	public static IonicDTO prepareFiles(String uploadedFileName) {
		IonicDTO  ionicDTO =new IonicDTO();
	    List<File> htmlFiles = new ArrayList<>();
		List<File> scssFiles = new ArrayList<>();
		File uploadedDirectory = FileUtils.getUploadedFile(Constants.UPLOAD_PATH_URL, uploadedFileName);
		if (uploadedDirectory.isDirectory()) {
			File[] files = uploadedDirectory.listFiles();
			files = Arrays.stream(files).filter(
					x -> x.getName().toLowerCase().contains(".html") || x.getName().toLowerCase().contains(".scss"))
					.toArray(File[]::new);
			for (int i = 0; i < files.length; i++) {
				if (files[i].getName().toLowerCase().endsWith(".html")) {
					htmlFiles.add(files[i]);
				} else if (files[i].getName().toLowerCase().endsWith(".scss")) {
					scssFiles.add(files[i]);
				}
			}
		}
		
		ionicDTO.setHtmlFiles(htmlFiles);	
		ionicDTO.setSccsFiles(scssFiles);
		ionicDTO.setFolderPath(uploadedDirectory.getPath());
		return ionicDTO;
	}
	
	
	

}
