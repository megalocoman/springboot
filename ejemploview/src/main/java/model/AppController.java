package model;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AppController {

    @Autowired
    private DAO dao;

    @RequestMapping("/ingresocliente")
    public String ingresocli() {
	return "ingresocliente.jsp";
    }

    @RequestMapping(value = "/consultacli")
    public String consultaCliente(Model m) {
	System.out.println("entroconsulta");
	List<Cliente> list;
	list = dao.consultarcliente();

	m.addAttribute("list_cli", list);

	return "resultadoconsultacliente";

    }

}
