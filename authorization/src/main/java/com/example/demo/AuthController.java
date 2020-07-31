package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class AuthController {
    
    @RequestMapping(value="/paratodos")
    public String irnoautorizado() {
	
	return "noautorizado";	
    }
    
    @RequestMapping(value="/admin")
    public String irSoloAdminitracion() {
	
	return "soloadministracion";
    }
    
    @RequestMapping(value="/prof")
    public String irSoloProfesional() {
	
	return "/soloprofesional";
    }
    
}
