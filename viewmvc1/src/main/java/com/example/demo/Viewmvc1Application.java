package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Viewmvc1Application {

    public static void main(String[] args) {
	System.getProperties().put("server.port", 8182);
	SpringApplication.run(Viewmvc1Application.class, args);
    }

}
