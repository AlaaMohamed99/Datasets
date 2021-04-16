package com.example.translator.dto;


import java.io.File;
import java.util.List;


public class XmlDTO {
	private List <File> xmlFiles;
	private String folderPath;
	public List<File> getxmlFiles() {
		return xmlFiles;
	}
	public void setxmlFiles(List<File> xmlFiles) {
		this.xmlFiles = xmlFiles;
	}
	public String getFolderPath() {
		return folderPath;
	}
	public void setFolderPath(String folderPath) {
		this.folderPath = folderPath;
	}

}
