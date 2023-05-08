package com.Music.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Contact;
import io.swagger.v3.oas.annotations.info.Info;

@SpringBootApplication
@OpenAPIDefinition(
		info=@Info(
				title="Music Artist Database",
				version="1.1.2",
				description="Artist Details and Project",
				contact=@Contact(
						name="Synthiya Evangeline",
						email="synthiyasuresh1414@gmail.com"
						)
				)	
		)

public class MusicApplication {

	public static void main(String[] args) {
		SpringApplication.run(MusicApplication.class, args);
	}

}
