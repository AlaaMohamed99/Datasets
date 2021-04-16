package com.example.translator.handlers;


import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.example.translator.dto.Constants;
import com.example.translator.dto.FlutterDTO;
import com.example.translator.dto.React_NativeDTO;
import com.example.translator.dto.XmlDTO;
import com.example.translator.utils.FileUtils;


public class XmlHandler {
	public static XmlDTO prepareFiles(String uploadedFileName) {
		XmlDTO  xmlDTO =new XmlDTO();

		List<File> xmlFiles = new ArrayList<>();
		File uploadedDirectory = FileUtils.getUploadedFile(Constants.UPLOAD_PATH_URL, uploadedFileName);
		if (uploadedDirectory.isDirectory()) {
			File[] files = uploadedDirectory.listFiles();
			files = Arrays.stream(files).filter(
					x -> x.getName().toLowerCase().contains(".xml"))
					.toArray(File[]::new);
			for (int i = 0; i < files.length; i++) {
				if (files[i].getName().toLowerCase().endsWith(".xml")) {
					xmlFiles.add(files[i]);
				}
			}
		}
		
		xmlDTO.setxmlFiles(xmlFiles);
		xmlDTO.setFolderPath(uploadedDirectory.getPath());
		return xmlDTO;
	}
}
