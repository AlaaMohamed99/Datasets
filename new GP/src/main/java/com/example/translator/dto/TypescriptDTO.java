package com.example.translator.dto;

import java.io.File;
import java.util.List;

public class TypescriptDTO {
	private List <File> typescriptFiles;
	private String folderPath;
	public List<File> gettypescriptFiles() {
		return typescriptFiles;
	}
	public void settypescriptFiles(List<File> typescriptFiles) {
		this.typescriptFiles = typescriptFiles;
	}
	public String getFolderPath() {
		return folderPath;
	}
	public void setFolderPath(String folderPath) {
		this.folderPath = folderPath;
	}

}
