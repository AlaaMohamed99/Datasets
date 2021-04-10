package com.example.translator.handlers;

import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.example.translator.dto.Constants;
import com.example.translator.dto.React_NativeDTO;
import com.example.translator.utils.FileUtils;

public class React_NativeHandler {

	
	public static React_NativeDTO prepareFiles(String uploadedFileName) {
		React_NativeDTO  react_NativeDTO =new React_NativeDTO();

		List<File> javaScriptFiles = new ArrayList<>();
		File uploadedDirectory = FileUtils.getUploadedFile(Constants.UPLOAD_PATH_URL, uploadedFileName);
		if (uploadedDirectory.isDirectory()) {
			File[] files = uploadedDirectory.listFiles();
			files = Arrays.stream(files).filter(
					x -> x.getName().toLowerCase().contains(".js"))
					.toArray(File[]::new);
			for (int i = 0; i < files.length; i++) {
				if (files[i].getName().toLowerCase().endsWith(".js")) {
					javaScriptFiles.add(files[i]);
				}
			}
		}
		
		react_NativeDTO.setJavascriptFiles(javaScriptFiles);
		react_NativeDTO.setFolderPath(uploadedDirectory.getPath());
		return react_NativeDTO;
	}
}
