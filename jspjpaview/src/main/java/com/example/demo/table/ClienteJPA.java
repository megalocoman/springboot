package com.example.demo.table;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="cliente")
public class ClienteJPA {
    
    @Id
    @Column(name="rutcliente")
    private String rutcliente;
    private String direccion;
    private String telefono;
    private String correo;
    private String contacto;
    private String nombrecliente;
    
    public ClienteJPA() {
    }

    public ClienteJPA(String rutcliente, String direccion, String telefono, String correo, String contacto,
	    String nombrecliente) {
	this.rutcliente = rutcliente;
	this.direccion = direccion;
	this.telefono = telefono;
	this.correo = correo;
	this.contacto = contacto;
	this.nombrecliente = nombrecliente;
    }

    public String getRutcliente() {
        return rutcliente;
    }

    public void setRutcliente(String rutcliente) {
        this.rutcliente = rutcliente;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getContacto() {
        return contacto;
    }

    public void setContacto(String contacto) {
        this.contacto = contacto;
    }

    public String getNombrecliente() {
        return nombrecliente;
    }

    public void setNombrecliente(String nombrecliente) {
        this.nombrecliente = nombrecliente;
    }
    
}
