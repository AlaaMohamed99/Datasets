package com.example.translator.dto;

import java.io.File;
import java.util.List;

public class IonicDTO {
	
	private List <File> htmlFiles;
	private List <File> sccsFiles;
	private String folderPath;
	
	

	public String getFolderPath() {
		return folderPath;
	}
	public void setFolderPath(String folderPath) {
		this.folderPath = folderPath;
	}
	public List<File> getHtmlFiles() {
		return htmlFiles;
	}
	public void setHtmlFiles(List<File> htmlFiles) {
		this.htmlFiles = htmlFiles;
	}
	public List<File> getSccsFiles() {
		return sccsFiles;
	}
	public void setSccsFiles(List<File> sccsFiles) {
		this.sccsFiles = sccsFiles;
	}
}
