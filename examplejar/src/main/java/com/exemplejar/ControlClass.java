package com.exemplejar;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class ControlClass {
	
	
//	  @RequestMapping("/")
//	  public String index() {
//	  return "index"; 
//	  }
	 
	
	
	@Autowired
	private MejorarFormato mejorarformato;
	

	@RequestMapping(value="/ingresarDatos", method = RequestMethod.GET)
	public String ingresarDatos( @RequestParam String name, @RequestParam String age) {
		
		mejorarformato.setEdad(Integer.parseInt(age));
		mejorarformato.setNombre(name);
				
		return "index";
	}
	
	@RequestMapping("/mostrarDatos")
	public String mostrarDatos(Model model) {
		
		model.addAttribute("edad", mejorarformato.getEdad());
		model.addAttribute("edad", mejorarformato.getNombre());
		
		return "resultados";
	}
	
	
	
	
	

}
