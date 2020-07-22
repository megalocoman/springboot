package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ViewController {
    
    @RequestMapping(value="/hola")
    public String irHola() {
	System.out.println("se metio al mapping");
	return "hola";
	
    }

}
