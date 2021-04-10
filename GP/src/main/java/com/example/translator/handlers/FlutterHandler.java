package com.example.translator.handlers;

import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.example.translator.dto.Constants;
import com.example.translator.dto.FlutterDTO;
import com.example.translator.dto.React_NativeDTO;
import com.example.translator.utils.FileUtils;

public class FlutterHandler {

	
	public static FlutterDTO prepareFiles(String uploadedFileName) {
		FlutterDTO  flutterDTO =new FlutterDTO();

		List<File> dartFiles = new ArrayList<>();
		File uploadedDirectory = FileUtils.getUploadedFile(Constants.UPLOAD_PATH_URL, uploadedFileName);
		if (uploadedDirectory.isDirectory()) {
			File[] files = uploadedDirectory.listFiles();
			files = Arrays.stream(files).filter(
					x -> x.getName().toLowerCase().contains(".dart"))
					.toArray(File[]::new);
			for (int i = 0; i < files.length; i++) {
				if (files[i].getName().toLowerCase().endsWith(".dart")) {
					dartFiles.add(files[i]);
				}
			}
		}
		
		flutterDTO.setDartFiles(dartFiles);
		flutterDTO.setFolderPath(uploadedDirectory.getPath());
		return flutterDTO;
	}
}
