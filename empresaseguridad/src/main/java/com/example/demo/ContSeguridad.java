package com.example.demo;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class ContSeguridad {
    
    private Logger registroLog = Logger.getLogger(ContSeguridad.class);

    @GetMapping(value = "/ingresocliente")
    public String ingresarCliente(@RequestParam("rut_cliente") String rut, @RequestParam("nom_cliente") String nombre,
	    @RequestParam("direccion_cliente") String direccion, @RequestParam("fono_cliente") String fono,
	    @RequestParam("contacto_cliente") String contacto, Model m) {
	
	m.addAttribute("rut", rut);
	m.addAttribute("nombre", nombre);
	m.addAttribute("direccion", direccion);
	m.addAttribute("fono", fono);
	m.addAttribute("contacto", contacto);
	
	registroLog.info(" cliente ingresado");

	return "consultacliente";
    }

}
