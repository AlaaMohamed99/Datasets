package com.example.translator.handlers;

import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.example.translator.dto.Constants;
import com.example.translator.dto.TypescriptDTO;
import com.example.translator.utils.FileUtils;

public class TypescriptHandler {
	public static TypescriptDTO prepareFiles(String uploadedFileName) {
		TypescriptDTO  typescriptDTO =new TypescriptDTO();

		List<File> typescriptFiles = new ArrayList<>();
		File uploadedDirectory = FileUtils.getUploadedFile(Constants.UPLOAD_PATH_URL, uploadedFileName);
		if (uploadedDirectory.isDirectory()) {
			File[] files = uploadedDirectory.listFiles();
			files = Arrays.stream(files).filter(
					x -> x.getName().toLowerCase().contains(".ts"))
					.toArray(File[]::new);
			for (int i = 0; i < files.length; i++) {
				if (files[i].getName().toLowerCase().endsWith(".ts")) {
					typescriptFiles.add(files[i]);
				}
			}
		}
		
		typescriptDTO.settypescriptFiles(typescriptFiles);
		typescriptDTO.setFolderPath(uploadedDirectory.getPath());
		return typescriptDTO;
	}

}
