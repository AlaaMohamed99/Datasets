package com.example.translator.handlers;

import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.example.translator.dto.Constants;
import com.example.translator.dto.KotlinDTO;
import com.example.translator.utils.FileUtils;

public class KotlinHandler {
	public static KotlinDTO prepareFiles(String uploadedFileName) {
		KotlinDTO  kotlinDTO =new KotlinDTO();

		List<File> kotlinFiles = new ArrayList<>();
		File uploadedDirectory = FileUtils.getUploadedFile(Constants.UPLOAD_PATH_URL, uploadedFileName);
		if (uploadedDirectory.isDirectory()) {
			File[] files = uploadedDirectory.listFiles();
			files = Arrays.stream(files).filter(
					x -> x.getName().toLowerCase().contains(".kt"))
					.toArray(File[]::new);
			for (int i = 0; i < files.length; i++) {
				if (files[i].getName().toLowerCase().endsWith(".kt")) {
					kotlinFiles.add(files[i]);
				}
			}
		}
		
		kotlinDTO.setkotlinFiles(kotlinFiles);
		kotlinDTO.setFolderPath(uploadedDirectory.getPath());
		return kotlinDTO;
	}
}
