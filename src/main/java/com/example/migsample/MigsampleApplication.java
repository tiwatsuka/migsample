package com.example.migsample;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.MediaType;

@SpringBootApplication
public class MigsampleApplication {

	public static void main(String[] args) {
	    MediaType mt = MediaType.APPLICATION_JSON_UTF8;
	    
		SpringApplication.run(MigsampleApplication.class, args);
	}

}
