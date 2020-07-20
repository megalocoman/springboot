package com.example.demo;

import org.springframework.stereotype.Component;

@Component
public class Accidente {
    
    private int codigoactividad;
    private String nombre;
    private String descripcion;
    
    public Accidente() {
    }

    public Accidente(int codigoactividad, String nombre, String descripcion) {
	this.codigoactividad = codigoactividad;
	this.nombre = nombre;
	this.descripcion = descripcion;
    }

    public int getCodigoactividad() {
        return codigoactividad;
    }

    public void setCodigoactividad(int codigoactividad) {
        this.codigoactividad = codigoactividad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    
}
