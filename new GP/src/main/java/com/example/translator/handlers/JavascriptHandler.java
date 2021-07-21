package com.example.translator.handlers;

import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.example.translator.dto.Constants;
import com.example.translator.dto.JavascriptDTO;
import com.example.translator.utils.FileUtils;

public class JavascriptHandler {
	public static JavascriptDTO prepareFiles(String uploadedFileName) {
		JavascriptDTO  javascriptDTO =new JavascriptDTO();

		List<File> javascriptFiles = new ArrayList<>();
		File uploadedDirectory = FileUtils.getUploadedFile(Constants.UPLOAD_PATH_URL, uploadedFileName);
		if (uploadedDirectory.isDirectory()) {
			File[] files = uploadedDirectory.listFiles();
			files = Arrays.stream(files).filter(
					x -> x.getName().toLowerCase().contains(".js"))
					.toArray(File[]::new);
			for (int i = 0; i < files.length; i++) {
				if (files[i].getName().toLowerCase().endsWith(".js")) {
					javascriptFiles.add(files[i]);
				}
			}
		}
		
		javascriptDTO.setjavascriptFiles(javascriptFiles);
		javascriptDTO.setFolderPath(uploadedDirectory.getPath());
		return javascriptDTO;
	}
}
