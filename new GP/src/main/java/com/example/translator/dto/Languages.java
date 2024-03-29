package com.example.translator.dto;

public enum Languages {
	
	IONIC("Ionic"),
	JAVA_KOTLIN("Java_Kotlin"),
	JAVA_ANDROID("Java_Android"),
	FLUTTER("Flutter"),
	REACT_NATIVE("React_Native"),
	HTML("Html"),
	XML("Xml"),
	JAVA("Java"),
	KOTLIN("Kotlin"),
	TYPESCRIPT("Typescript"),
	DART("Dart"),
	JAVASCRIPT("Javascript");
	
	private String language;

	public String getLanguage() {
		return language;
	}

	private Languages(String language) {
		this.language = language;
	}
	
	
}