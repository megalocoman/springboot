package model;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class LinkController {

    @RequestMapping("/ingresocliente")
    public String linkIngresoClientes() {
	return "ingresocliente";
    }
}
