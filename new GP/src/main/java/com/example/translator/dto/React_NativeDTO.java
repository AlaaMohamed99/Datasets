package com.example.translator.dto;

import java.io.File;
import java.util.List;

public class React_NativeDTO {
	
	private List <File> javascriptFiles;
	private String folderPath;
	
	public List<File> getJavascriptFiles() {
		return javascriptFiles;
	}
	public void setJavascriptFiles(List<File> javascriptFiles) {
		this.javascriptFiles = javascriptFiles;
	}
	public String getFolderPath() {
		return folderPath;
	}
	public void setFolderPath(String folderPath) {
		this.folderPath = folderPath;
	}

	
}
