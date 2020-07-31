package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class AuthController {

    @RequestMapping("/sinautorizado")
    public String irPaginauno() {
	
	return "paginauno";
    }
    
    @RequestMapping("/prof")
    public String irProfesional() {
	
	return "profesional";
    }
    
    @RequestMapping("/admin")
    public String irAministrador() {
	
	return "administrador";
    }
}
