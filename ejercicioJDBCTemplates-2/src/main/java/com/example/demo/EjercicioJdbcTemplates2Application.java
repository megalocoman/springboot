package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class EjercicioJdbcTemplates2Application {

    public static void main(String[] args) {
	System.getProperties().put("server.port", 8184);
	SpringApplication.run(EjercicioJdbcTemplates2Application.class, args);
    }

}
