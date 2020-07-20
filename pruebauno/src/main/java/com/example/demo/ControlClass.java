package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class ControlClass {

	

	
	@RequestMapping("/hola")
	public String mostrarPagina() {
			
		return "hello";
		
	}
	
	@GetMapping(value="/info")
	public String enviarInfo(@RequestParam("info") String info, Model m) {
		
		m.addAttribute("info", info);		
		return "infopage";
	}
	
}
