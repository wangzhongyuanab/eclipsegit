package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
public class Movieboot1Application  extends SpringBootServletInitializer{

	
	@Override
	protected SpringApplicationBuilder configure(
			SpringApplicationBuilder builder) {
		return builder.sources(Movieboot1Application.class);
	}
	public static void main(String[] args) {
		SpringApplication.run(Movieboot1Application.class, args);
	}

}
