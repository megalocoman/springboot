package com.example.demo;

import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MapCotroller {
    
    private static final Logger logger =LogManager.getLogger(MapCotroller.class);
   
//    @Autowired
//    private AccidenteDao acc;
    
    @Autowired 
    private ClienteDao cli;
    
    List<Accidente> listacc;
    List<Cliente> listcli;
   
    
//    @RequestMapping(value= "/consulta")
//    public String irPagina(Model m) {
//	logger.info("se metio al request mapping");
//	
//	listacc =acc.consultaaccidente();
//	
//	m.addAttribute("listacc", listacc);
//	return "hello";
//    }
    
    @RequestMapping(value="/consultacliente")
    public String irConsultaCliente(Model m) {
	logger.info("ingreso a consultacliente");
	
	listcli = cli.consultarcliente();
	
	m.addAttribute("listacliente", listcli);
	return "resultadoconsultacliente";
    }
}
