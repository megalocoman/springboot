package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ViewController {

    @Autowired
    ProfesionalJPADAO profDao;

//    @RequestMapping(value="/ingresoprof")
//    public String irIngresoProfesional(Model m) {
//	System.out.println("ingreso a mapping");
//	m.addAttribute("prof", new ProfesionalJPA());
//	return "ingresoprofesional";
//    }

//    @GetMapping(value="/ingrprofesional")
//    public String ingresarProfesional(@ModelAttribute("prof")  ProfesionalJPA pro ) {
//	
//	profDao.save(pro);
//	System.out.println("entro al ingreso de profesionales");
//	
//	return "redirect:/ingresoprofesional";
//	
//    }

//    @GetMapping(value = "/ingrprofesional")
//    public String ingresarProfesional(@ModelAttribute("prof") ProfesionalJPA pro, Model m) {
//
//	m.addAttribute("profjpa", pro);
//	System.out.println("entro al ingreso de profesionales");
//	return "redirect:/ingresoprofesional";
//    }

    @RequestMapping(value = "/ingrprofesional")
    public ModelAndView vistaIngresoProfesional() {

	return new ModelAndView("ingresoprofesional", "command", new ProfesionalJPA());
    }
    
    @GetMapping(value = "/ingresoprofesional")
    public String ingresarProfesional(@ModelAttribute("command") ProfesionalJPA proj, Model m ) {
	
	m.addAttribute("profesional", proj);
	return "consultaprofesional";
    }
    

}
