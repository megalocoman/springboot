package com.example.demo;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.example.demo.repositorios.AccidenteDAO;
import com.example.demo.repositorios.ClienteJPADAO;
import com.example.demo.repositorios.IntACTIVIDADES;
import com.example.demo.repositorios.IntOTService;
import com.example.demo.repositorios.ProfesionalJPADAO;
import com.example.demo.repositorios.ReporteClienteDAO;
import com.example.demo.repositorios.ReporteProfesionalDao;
import com.example.demo.table.ACTIVIDADES;
import com.example.demo.table.Accidente;
import com.example.demo.table.ClienteJPA;
import com.example.demo.table.OT;
import com.example.demo.table.ProfesionalJPA;

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

    @Autowired
    IntOTService otservice;

    @Autowired
    IntACTIVIDADES actividadesservice;

    /*
     * controla login de vistas
     */

    @RequestMapping(value = "/login")
    public String loginPage() {

	return "accesos/login";
    }

    @RequestMapping("/")
    public String irWelcome() {

	return "accesos/welcome";
    }

    @RequestMapping("/ingresosistema")
    public String irIngresoSistema() {

	return "accesos/ingresosistema";
    }

    @RequestMapping(value = "/logout-success")
    public String logoutPage() {

	return "accesos/logout";
    }

    @RequestMapping(value = "/403")
    public String irAccesodenegado() {

	return "accesos/accesodenegado";
    }

    /* Controladores vistas tabla profesional */

    // Asigna un nuevo objeto ProfesionalJPA a "command" y envias este a ingreso
    // profesional.jsp

    @RequestMapping(value = "/paginaingresoprofesional")
    public ModelAndView vistaIngresoProfesional() {

	return new ModelAndView("profesional/ingresoprofesional", "command", new ProfesionalJPA());
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
	return "profesional/consultaprofesional";
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

	return "profesional/actualizarprofesional";
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
	return new ModelAndView("clientes/ingresocliente", "command", new ClienteJPA());

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
	return "clientes/consultacliente";
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
	return new ModelAndView("clientes/actualizarcliente", "command", cliDao.findById(rutcliente));
    }

    /* controladores de vistas tabla accidente */

    // Asigna un nuevo objeto Accidente a "command" y envias este a
    // ingresoaccidente.jsp

    @RequestMapping(value = "/paginaingresoaccidente")
    public ModelAndView vistaIngresoAccidente() {
	return new ModelAndView("accidente/ingresoaccidente", "command", new Accidente());
    }

    @GetMapping(value = "/ingraccidente")
    public String ingresarAccidente(@ModelAttribute("command") Accidente acc) {

	acc.setClientejpa(cliDao.findClienteJPAByNombrecliente(acc.getNombrecliente()));
	accdao.save(acc);
	return "redirect:/consultaacc";
    }

    @RequestMapping(value = "/consultaacc")
    public String consultarAccidente(Model m) {

	Iterable<Accidente> acc = accdao.findAll();
	for (Accidente acci : acc) {
	    acci.setNombrecliente(cliDao.findNombreclienteByRutcliente(acci.getClientejpa().getRutcliente()));
	}
	m.addAttribute("listacc", acc);

	return "accidente/consultaaccidente";
    }

    @RequestMapping(value = "elimaccidente/{idaccidente}")
    public String eliminarAccidenteById(@PathVariable int idaccidente) {

	accdao.deleteById(idaccidente);
	return "redirect:/consultaacc";
    }

    @RequestMapping(value = "/actaccidente/{idaccidente}")
    public ModelAndView IrPaginaActualizarcliente(@PathVariable int idaccidente, Model m) {

	Optional<Accidente> accidente = accdao.findById(idaccidente);
	accidente.get().setNombrecliente(
		cliDao.findNombreclienteByRutcliente(accidente.get().getClientejpa().getRutcliente()));
	return new ModelAndView("accidente/actualizaraccidente", "command", accidente);
    }

    /*
     * vistas generar informe
     */
    @RequestMapping(value = "/paginagenerarinforme")
    public String irGeneracionInforme() {

	return "informes/generacioninformes";
    }

    @RequestMapping(value = "/generarinformeprofesional")
    public String generarInformeProfesional(Model m) {

	m.addAttribute("informeprofesional", repprof.findAll());
	return "informes/informegestionprofesional";
    }

    @RequestMapping(value = "/generarinformecliente")
    public String generarInformeCliente(Model m) {

	m.addAttribute("informecliente", repcliente.findAll());
	return "informes/informegestioncliente";
    }

    // tabla ot

    @RequestMapping("/listar")
    public String listar(Model model) {

	model.addAttribute("ot", otservice.findAll());
	return "ot/menuot";
    }

    @RequestMapping("/new")
    public String agregar(Model model) {
	model.addAttribute("command", new OT());
	return "ot/formot";
    }

//    @RequestMapping(value="/save", method=RequestMethod.POST)
    @PostMapping(value = "/save")
    public String save(@ModelAttribute("command") OT o) {
	otservice.save(o);
	return "redirect:/listar";
    }

    @RequestMapping("/editar/{numot}")
    public String editar(@PathVariable Integer numot, Model model) {

	model.addAttribute("command", otservice.findById(numot));
	return "ot/formotact";
    }

    @RequestMapping(value = "/eliminar/{numot}")
    public String deleteOt(@PathVariable Integer numot) {
	otservice.deleteById(numot);

	return "redirect:/listar";
    }

    /*
     * tabla actividades
     */

    @GetMapping("/listarat")
    public String listarat(Model model) {
//		List<ACTIVIDADES> actividades = actividadesservice.findAll();
	model.addAttribute("actividades", actividadesservice.findAll());
	return "actividad/menuat";
    }

    @GetMapping("/newat")
    public String agregarat(Model model) {
	model.addAttribute("actividades", new ACTIVIDADES());
	return "actividad/format";
    }

    @PostMapping("/saveat")
    public String saveat(ACTIVIDADES a, Model model) {
	actividadesservice.save(a);
	return "redirect:/listarat";
    }

    @GetMapping("/editarat/{codact}")
    public String editarat(@PathVariable int codact, Model model) {
//		Optional<ACTIVIDADES> actividades=actividadesservice.findById(codact);
	model.addAttribute("actividades", actividadesservice.findById(codact));
	return "actividad/formatact";
    }

    @GetMapping("/eliminarat/{codact}")
    public String deleteat(Model model, @PathVariable int codact) {
	actividadesservice.deleteById(codact);
	return "redirect:/listarat";
    }

}
