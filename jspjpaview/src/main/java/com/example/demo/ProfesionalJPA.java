package com.example.demo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="profesional")
public class ProfesionalJPA {

    @Id
    @Column(name="rutprofesional")
    private String rutprofesional;
    private String nombre;
    private String telefono;
    private String correo;
    
    public ProfesionalJPA() {
    }
    
    public ProfesionalJPA(String rutprofesional, String nombre, String telefono, String correo) {
	this.rutprofesional = rutprofesional;
	this.nombre = nombre;
	this.telefono = telefono;
	this.correo = correo;
    }

    public String getRutprofesional() {
        return rutprofesional;
    }
    public void setRutprofesional(String rutprofesional) {
        this.rutprofesional = rutprofesional;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
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
    @Override
    public String toString() {
	return "ProfesionalJPA [rutprofesional=" + rutprofesional + ", nombre=" + nombre + ", telefono=" + telefono
		+ ", correo=" + correo + "]";
    }
    
    
    
}
