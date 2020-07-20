package com.example.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.dao.ClienteDao;
import com.example.tabla.Cliente;

@Controller
public class AppController {
    
//    @Autowired
//    private ClienteDao cda;

//    @RequestMapping("/consultacliente")
//    public String consultarClientes(Model m) {
//	System.out.println("entroconsulta");
//	List<Cliente> listacliente= cda.lista();
//	m.addAttribute("listacliente", listacliente);
//	
//	return "resultadoconsultacliente.jsp";
//	
//    }
//    
    @RequestMapping("/prueba")
    public String verPrueba() {
	
	return "prueba";
    }
    
    
}
