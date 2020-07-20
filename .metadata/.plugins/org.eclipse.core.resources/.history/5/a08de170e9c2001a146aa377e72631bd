package com.exemplejar;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackageClasses = ControlClass.class)
public class Application {

	public static void main(String[] args) {
		System.getProperties().put( "server.port", 8181 );
		SpringApplication.run(Application.class, args);
	}
}
