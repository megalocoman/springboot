package com.example.demo;

import java.util.Optional;

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

    @Autowired
    ClienteJPADAO cliDao;
    
    @Autowired
    AccidenteDAO accdao;
    
    @Autowired
    ReporteProfesionalDao repprof;
    
    @Autowired
    ReporteClienteDAO repcliente;

    /* Controladores vistas tabla profesional */

    // Asigna un nuevo objeto ProfesionalJPA a "command" y envias este a ingreso
    // profesional.jsp

    @RequestMapping(value = "/paginaingresoprofesional")
    public ModelAndView vistaIngresoProfesional() {

	return new ModelAndView("ingresoprofesional", "command", new ProfesionalJPA());
    }

    // recibe objeto ProfesionalJPA y lo ingresa en la base de datos
    @GetMapping(value = "/ingprofesional")
    public String ingresarProfesional(@ModelAttribute("command") ProfesionalJPA pro) {

	profDao.save(pro);
	return "redirect:/consultaprofesional";
    }

    // realiza consulta SELECT * FROM profesional y lo guarda en un iterable, para
    // ser mostrado en consultaprofesional.jsp
    @RequestMapping(value = "/consultaprofesional")
    public String consultarProfesional(Model m) {
//	
	Iterable<ProfesionalJPA> listprof = profDao.findAll();
	m.addAttribute("listprof", listprof);
	return "consultaprofesional";
    }

    // elimina registros en base de datos sugun rut indicado, y redireciona a
    // consultaprofesional.jsp
    @RequestMapping(value = "/eliminarprofesional/{rutprofesional}")
    public String eliminarProfesionalbyRut(@PathVariable String rutprofesional) {

	profDao.deleteById(rutprofesional);

	return "redirect:/consultaprofesional";
    }

    // busca registro segun rut entregado y redirecciona a vista
    // consultaprofesional.jsp
    @RequestMapping(value = "/actualizarprofesional/{rutprofesional}")
    public String irActualizarProfesional(@PathVariable String rutprofesional, Model m) {

	
	m.addAttribute("command", profDao.findById(rutprofesional));

	return "redirect:/consultaprofesional";
    }

    // actualiza registro segun rut indicado, redirecciona a a vista
    // consultaprofesional.jsp
    @GetMapping(value = "/actprofesional")
    public String actualizarprofesional(@ModelAttribute("command") ProfesionalJPA pro) {
	profDao.save(pro);
	return "redirect:/consultaprofesional";
    }

    /* controladores de vistas tabla clientes */

    // Asigna un nuevo objeto cliente JPA a "command" y envias este a
    // ingresocliente.jsp

    @RequestMapping(value = "/paginaingresocliente")
    public ModelAndView vistaIngresoCliente() {
	System.out.println("entro mapping ingresocliente");
	return new ModelAndView("ingresocliente", "command", new ClienteJPA());

    }

    // recibe objeto ClienteJPA y lo ingresa en la base de datos, tanto para
    // registros nuevos como actualizacion
    @GetMapping(value = "/ingrcliente")
    public String IngresarCliente(@ModelAttribute("command") ClienteJPA cli) {

	cliDao.save(cli);
	return "redirect:/consultacliente";
    }

    // realiza consulta SELECT * FROM cliente y lo guarda en un iterable, para
    // ser mostrado en consultacliente.jsp
    @GetMapping(value = "/consultacliente")
    public String consultarClientes(Model m) {

	m.addAttribute("listcli", cliDao.findAll());
	return "consultacliente";
    }

    // elimina registros de clientes en base de datos segun rut indicado, y
    // redireciona a consultacliente.jsp
    @RequestMapping(value = "/eliminarcliente/{rutcliente}")
    public String eliminarClientebyRut(@PathVariable String rutcliente) {

	cliDao.deleteById(rutcliente);
	
	return "redirect:/consultacliente";
    }

    // busca registro segun rut entregado y redirecciona a vista
    // consultacliente.jsp
    @RequestMapping(value = "/actualizarcliente/{rutcliente}")
    public ModelAndView irActualizarCliente(@PathVariable String rutcliente, Model m) {
	System.out.println("entro mapping actualizar cliente");
	return new ModelAndView("actualizarcliente", "command", cliDao.findById(rutcliente));
    }
    
    /* controladores de vistas tabla clientes */
    
 // Asigna un nuevo objeto Accidente a "command" y envias este a
    // ingresoaccidente.jsp

    @RequestMapping(value="/paginaingresoaccidente")
    public ModelAndView vistaIngresoAccidente() {
	return new ModelAndView("ingresoaccidente", "command", new Accidente());
    }
    
    @GetMapping(value="/ingraccidente")
    public String ingresarAccidente(@ModelAttribute("command") Accidente acc) {
	System.out.println("entro a ingreso de accidente");
	
	acc.setClientejpa(cliDao.findClienteJPAByNombrecliente(acc.getNombrecliente()));
	
	accdao.save(acc);
	
	
	return "redirect:/consultaacc";
    }
    
    @RequestMapping(value="/consultaacc")
    public String consultarAccidente(Model m) {
	
	System.out.println("llena objeto accidente");
	Iterable<Accidente> acc = accdao.findAll();
	System.out.println("reemplaza rut por nombre");
	
	for(Accidente acci: acc) {
	    acci.setNombrecliente(cliDao.findNombreclienteByRutcliente(acci.getClientejpa().getRutcliente()));    
	}
	m.addAttribute("listacc", acc);
	
	return "consultaaccidente";
    }
    
    @RequestMapping(value="elimaccidente/{idaccidente}")
    public String eliminarAccidenteById(@PathVariable int idaccidente) {
	
	accdao.deleteById(idaccidente);
	return "redirect:/consultaacc";
    }
    
    @RequestMapping(value="/actaccidente/{idaccidente}")
    public ModelAndView IrPaginaActualizarcliente(@PathVariable int idaccidente, Model m) {
	
	Optional<Accidente> accidente = accdao.findById(idaccidente);
	accidente.get().setNombrecliente(cliDao.findNombreclienteByRutcliente(accidente.get().getClientejpa().getRutcliente()));
	return new ModelAndView("actualizaraccidente", "command", accidente);
    }
    
    @RequestMapping(value="/paginagenerarinforme")
    public String irGeneracionInforme() {
	
	return  "generacioninformes";
    }
    
    @RequestMapping(value="/generarinformeprofesional")
    public String generarInformeProfesional(Model m) {
	
	m.addAttribute("informeprofesional", repprof.findAll());
	return "informegestionprofesional";
    }
    
    @RequestMapping(value="/generarinformecliente")
    public String generarInformeCliente(Model m) {
	
	m.addAttribute("informecliente", repcliente.findAll());
	return "informegestioncliente";
    }
}
