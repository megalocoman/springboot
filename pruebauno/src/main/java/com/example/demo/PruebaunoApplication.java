package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
public class PruebaunoApplication  {

//  
    public static void main(String[] args) {
	System.getProperties().put("server.port", 8183);
	SpringApplication.run(PruebaunoApplication.class, args);
    }

}
