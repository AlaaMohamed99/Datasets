package com.example.translator.dto;

import java.io.File;
import java.util.List;

public class KotlinDTO {
	private List <File> kotlinFiles;
	private String folderPath;
	public List<File> getkotlinFiles() {
		return kotlinFiles;
	}
	public void setkotlinFiles(List<File> kotlinFiles) {
		this.kotlinFiles = kotlinFiles;
	}
	public String getFolderPath() {
		return folderPath;
	}
	public void setFolderPath(String folderPath) {
		this.folderPath = folderPath;
	}

}
