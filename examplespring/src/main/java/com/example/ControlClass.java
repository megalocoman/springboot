package com.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class ControlClass {
	
	@Autowired
	public MejoraFormato mejoraformato;
	
	@RequestMapping(value="/ingresadatos", method = RequestMethod.POST)
	public String mostrarDatos(Model model, @RequestParam String name, @RequestParam String age) {
		
		String nombre = mejoraformato.mejorFormato(name);
		int edad =  mejoraformato.edadGato(Integer.parseInt(age));
		
		model.addAttribute("nombre", nombre);
		model.addAttribute("edad", edad);
		
		return "resultado";
	}
	
	

}
