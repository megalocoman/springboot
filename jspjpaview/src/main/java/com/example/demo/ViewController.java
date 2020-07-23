package com.example.demo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ViewController {

    @Autowired
    ProfesionalJPADAO profDao;

    @GetMapping(value = "/ingprofesional")
    public String ingresarProfesional(@ModelAttribute("command") ProfesionalJPA pro) {

	profDao.save(pro);
	System.out.println("entro al ingreso de profesionales");

	return "redirect:/consultaprofesional";

    }

    @RequestMapping(value = "/paginaingresoprofesional")
    public ModelAndView vistaIngresoProfesional() {

	return new ModelAndView("ingresoprofesional", "command", new ProfesionalJPA());
    }

    @RequestMapping(value = "/consultaprofesional")
    public String consultarProfesional(Model m) {
//	
	 Iterable<ProfesionalJPA> listprof =  profDao.findAll();
	 m.addAttribute("listprof", listprof);
	return "consultaprofesional";
    }
    
    @RequestMapping(value="/eliminarprofesional/{rutprofesional}")
    public String eliminarProfesionalbyRut(@PathVariable String rutprofesional) {
	
	profDao.deleteById(rutprofesional);	
	
	return "redirect:/consultaprofesional";
    }
    
    @RequestMapping(value="/actualizarprofesional/{rutprofesional}")
    public String iractualizarProfesional(@PathVariable String rutprofesional, Model m) {
	
	m.addAttribute("command", profDao.findById(rutprofesional));
		
	return "actualizarprofesional";
    }
    
    @GetMapping(value="/actprofesional")
    public String actualizarprofesional(@ModelAttribute("command") ProfesionalJPA pro) {
	profDao.save(pro);
	return "redirect:/consultaprofesional";
    }
    
}
