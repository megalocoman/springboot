package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ThymeviewApplication {

    public static void main(String[] args) {
	System.getProperties().put("server.port", 8183);
	SpringApplication.run(ThymeviewApplication.class, args);
    }

}
