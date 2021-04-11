package com.example.translator;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;

import com.example.translator.controller.CodeConversionController;

@SpringBootApplication
public class SpringBootTomcatApplication extends SpringBootServletInitializer {
	
	  @Override
	    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
	        return application.sources(SpringBootTomcatApplication.class);
	    }

	    public static void main(String[] args) throws Exception {
	        SpringApplication.run(SpringBootTomcatApplication.class, args);
	    }
	
}
