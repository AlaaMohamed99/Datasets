package com.example.translator.dto;

import java.io.File;
import java.util.List;

public class JavascriptDTO {
	private List <File> javascriptFiles;
	private String folderPath;
	public List<File> getjavascriptFiles() {
		return javascriptFiles;
	}
	public void setjavascriptFiles(List<File> javascriptFiles) {
		this.javascriptFiles = javascriptFiles;
	}
	public String getFolderPath() {
		return folderPath;
	}
	public void setFolderPath(String folderPath) {
		this.folderPath = folderPath;
	}

}
