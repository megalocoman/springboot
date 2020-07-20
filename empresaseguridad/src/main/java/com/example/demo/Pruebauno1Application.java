package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Pruebauno1Application {

    
    public static void main(String[] args) {
	
	System.getProperties().put("server.port", 8185);
	SpringApplication.run(Pruebauno1Application.class, args);
    }

}
