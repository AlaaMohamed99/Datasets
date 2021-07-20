package com.example.translator.handlers;

import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.example.translator.dto.Constants;
import com.example.translator.dto.JavaDTO;
import com.example.translator.utils.FileUtils;

public class JavaHandler {
	public static JavaDTO prepareFiles(String uploadedFileName) {
		JavaDTO  javaDTO =new JavaDTO();

		List<File> javaFiles = new ArrayList<>();
		File uploadedDirectory = FileUtils.getUploadedFile(Constants.UPLOAD_PATH_URL, uploadedFileName);
		if (uploadedDirectory.isDirectory()) {
			File[] files = uploadedDirectory.listFiles();
			files = Arrays.stream(files).filter(
					x -> x.getName().toLowerCase().contains(".java"))
					.toArray(File[]::new);
			for (int i = 0; i < files.length; i++) {
				if (files[i].getName().toLowerCase().endsWith(".java")) {
					javaFiles.add(files[i]);
				}
			}
		}
		
		javaDTO.setjavaFiles(javaFiles);
		javaDTO.setFolderPath(uploadedDirectory.getPath());
		return javaDTO;
	}
}
