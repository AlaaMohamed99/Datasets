package com.example.translator.dto;

import java.io.File;
import java.util.List;

public class JavaDTO {
	private List <File> javaFiles;
	private String folderPath;
	public List<File> getjavaFiles() {
		return javaFiles;
	}
	public void setjavaFiles(List<File> javaFiles) {
		this.javaFiles = javaFiles;
	}
	public String getFolderPath() {
		return folderPath;
	}
	public void setFolderPath(String folderPath) {
		this.folderPath = folderPath;
	}
}
