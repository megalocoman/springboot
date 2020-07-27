package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class SecuController {
 
    @RequestMapping(value="/login")
    public String loginPage() {
	
	return "login";
    }

    @RequestMapping(value="/logout-success")
    public String logoutPage() {
	
	return "logout";
    }
    
}
