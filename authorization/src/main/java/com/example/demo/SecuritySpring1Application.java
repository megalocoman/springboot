package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SecuritySpring1Application {

    public static void main(String[] args) {
	System.getProperties().put("server.port", 8182);
	SpringApplication.run(SecuritySpring1Application.class, args);
    }

}
