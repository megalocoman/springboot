package com.example.demo.table;

import javax.persistence.Entity;
import javax.persistence.Id;

import org.hibernate.annotations.Immutable;
import org.hibernate.annotations.Subselect;

@Entity
@Subselect("SELECT p.nombre as nombrecliente , COUNT(c.nombrecliente) as numeroactividades, COUNT(a.nombre) as naccidentes, SUM(ot.valor) as valortotal, SUM(ot.valor - ot.pago) as valorpagado FROM profesional p JOIN ot ON p.rutprofesional = ot.profesional_rut_profesional INNER JOIN actividades a ON a.codigoactividad=ot.actividades_codigo_actividad INNER JOIN cliente c ON c.rutcliente=ot.cliente_rut_cliente GROUP BY p.nombre")
@Immutable
public class ReporteProfesional {

    @Id
    private String nombrecliente;
    private int numeroactividades;
    private int valortotal;
    private int valorpagado;
    private int naccidentes;
    
    public ReporteProfesional() {
    }

    public ReporteProfesional(String nombrecliente, int numeroactividades, int valortotal, int valorpagado,
	    int naccidentes) {
	this.nombrecliente = nombrecliente;
	this.numeroactividades = numeroactividades;
	this.valortotal = valortotal;
	this.valorpagado = valorpagado;
	this.naccidentes = naccidentes;
    }

    public String getNombrecliente() {
        return nombrecliente;
    }

    public void setNombrecliente(String nombrecliente) {
        this.nombrecliente = nombrecliente;
    }

    public int getNumeroactividades() {
        return numeroactividades;
    }

    public void setNumeroactividades(int numeroactividades) {
        this.numeroactividades = numeroactividades;
    }

    public int getValortotal() {
        return valortotal;
    }

    public void setValortotal(int valortotal) {
        this.valortotal = valortotal;
    }

    public int getValorpagado() {
        return valorpagado;
    }

    public void setValorpagado(int valorpagado) {
        this.valorpagado = valorpagado;
    }

    public int getNaccidentes() {
        return naccidentes;
    }

    public void setNaccidentes(int naccidentes) {
        this.naccidentes = naccidentes;
    }
        
}
