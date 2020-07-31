package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class AuthController {
    
    @RequestMapping(value="/login")
    public String loginPage() {
	
	return "login";
    }
    
    @RequestMapping("/")
    public String irWelcome() {
	
	return "welcome";
    }
    
    @RequestMapping("/ingresosistema")
    public String irIngresoSistema() {
	
	return "ingresosistema";
    }

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
    
    @RequestMapping(value="/logout-success")
    public String logoutPage() {
	
	return "logout";
    }
}
