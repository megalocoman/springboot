package com.example.demo.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.repositorios.IntIT;
import com.example.demo.table.IT;



@RestController
@RequestMapping("it")
public class ITRest {
	
	@Autowired
	private IntIT intit;
	
	//Insercion a BD
	@PostMapping("/grabar")
	public void grabar(@RequestBody IT it) {
		intit.save(it);
	}
	
	//Consulta a BD
	@GetMapping("/listar")
	public List<IT> listar(){
		return intit.findAll();
	}
	
	//Eliminacion de BD
	@DeleteMapping("/eliminar/{numit}")
	public void eliminar(@PathVariable("numit") Integer numit) {
		intit.deleteById(numit);
	}
	
	//Actualizacion de BD
	@PutMapping("/actualizar")
	public void actualizar(@RequestBody IT it) {
		intit.save(it);
	}
}
