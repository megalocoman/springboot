package com.example.demo;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Seguridad {

    @Id
    private String rut;
    private String usuario;
    private String clave;
    private String puesto;
    
    
    public Seguridad() {
    }


    public String getRut() {
        return rut;
    }


    public void setRut(String rut) {
        this.rut = rut;
    }


    public String getUsuario() {
        return usuario;
    }


    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }


    public String getClave() {
        return clave;
    }


    public void setClave(String clave) {
        this.clave = clave;
    }


    public String getPuesto() {
        return puesto;
    }


    public void setPuesto(String puesto) {
        this.puesto = puesto;
    }  
}
