package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MapCont {
    
    List<Cliente> listcli;
    
    @Autowired
    private ClienteDao clidao;
    
    @RequestMapping(value="/ingresocliente")
    public String linkIngresoClientes(Model m) {
	System.out.println("se metio al ingreso link");
	m.addAttribute("cliente", new Cliente());
	return "ingresoclientes";
    }
    
    @GetMapping(value = "/ingcliente")
    public String ingresoCliente(@ModelAttribute("cliente") Cliente cliente) {
	
	clidao.ingresar(cliente);
	 
	return "redirect:consultacliente";
    }
    
    @RequestMapping(value = "/consultacliente")
    public String consultaCliente(Model m) {
	listcli = clidao.consultarcliente();
	m.addAttribute("listcli", listcli);
	
	return "resultadocliente";
    }
}
