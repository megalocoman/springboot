package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class LinkController {

    @RequestMapping("/ingresocliente")
    public String linkIngresoClientes() {
	System.out.println("se metio al ingreso link");
	return "ingresoclientes";
    }
}
