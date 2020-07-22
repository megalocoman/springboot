package com.example.demo;

import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MapCont {
    
    List<Cliente> listcli;
    
    private static final Logger logger = LogManager.getLogger(ClienteDao.class);
    
    @Autowired
    private ClienteDao clidao;
    
    //envia a pagina ingresoclientes.html desde pagina principal
    
    @RequestMapping(value="/ingresocliente")
    public String linkIngresoClientes(Model m) {
	System.out.println("se metio al ingreso link");
	m.addAttribute("cliente", new Cliente());
	logger.info("Se ingresa a pagina ingreso cliente.");
	return "ingresoclientes";
    }
    
    // ingresa cliente a base de datos y redirecciona a consulta de cliente
    @GetMapping(value = "/ingcliente")
    public String ingresoCliente(@ModelAttribute("cliente") Cliente cliente) {
	
	clidao.ingresar(cliente);
	 
	return "redirect:/consultacliente";
    }
    
    // extrae consulta de tabla y pasa a una lista de objetos, enviandola a resultadocliente.html
    @RequestMapping(value = "/consultacliente")
    public String consultaCliente(Model m) {
	listcli = clidao.consultarcliente();
	m.addAttribute("listcli", listcli);
	
	return "resultadocliente";
    }
    
    // busca fila correspindiente a rut para enviar a actualizarcleinte.html
    @RequestMapping(value="/actualizarcliente/{rutcliente}")
    public String buscaClienteRut(@PathVariable(name="rutcliente") String rutcliente, Model m) {
	Cliente cliente = clidao.consultaclienteID(rutcliente);
	m.addAttribute("cliente", cliente);
	return "actualizarcliente";
    }
    
    //actualiza fila segun lo ingresado en la pagina de actulizacion, redireciona a consultacliente.html
    @GetMapping(value="/actcliente")
    public String actualizaCliente(@ModelAttribute("cliente") Cliente cliente) {
	clidao.actualizarClienteID(cliente);
	return "redirect:/consultacliente";
    }
    
    // elimina fila segun rut, redirecciona a consultacliente.html
    @RequestMapping(value="/eliminarcliente/{rutcliente}")
    public String eliminarCiente(@PathVariable(name="rutcliente") String rutcliente) {
	clidao.eliminarPorID(rutcliente);
	return "redirect:/consultacliente";
    }
    
    
}
