package com.example.translator.dto;

import java.io.File;
import java.util.List;

public class FlutterDTO {
	private List <File> dartFiles;
	private String folderPath;
	public List<File> getDartFiles() {
		return dartFiles;
	}
	public void setDartFiles(List<File> dartFiles) {
		this.dartFiles = dartFiles;
	}
	public String getFolderPath() {
		return folderPath;
	}
	public void setFolderPath(String folderPath) {
		this.folderPath = folderPath;
	}
	
}
