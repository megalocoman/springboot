package com.example.demo.table;

import javax.persistence.Entity;
import javax.persistence.Id;

import org.hibernate.annotations.Immutable;
import org.hibernate.annotations.Subselect;

@Entity
@Subselect("SELECT  c.nombre_cliente as nombrecliente, c.count_actividad as nactividad, c.total_valor as valortotal , c.total_pagado as valorpagado, a.accidente as naccidentes FROM ( SELECT c.nombrecliente AS nombre_cliente, COUNT(ot.fecha_actividad) AS count_actividad, SUM(ot.valor) AS total_valor, SUM(ot.pago) AS total_pagado FROM cliente c INNER JOIN ot ON c.rutcliente = ot.cliente_rut_cliente GROUP BY c.nombrecliente) c INNER JOIN (SELECT c.nombrecliente AS nombre_cliente, COUNT(a.idaccidente) AS accidente FROM cliente c INNER JOIN accidente a ON c.rutcliente=a.clienterutcliente GROUP BY c.nombrecliente) a on c.nombre_cliente=a.nombre_cliente")
@Immutable
public class ReporteCliente {
    
    @Id
    private String nombrecliente;
    private int nactividad;
    private int valortotal;
    private int valorpagado;
    private int naccidentes;
    
    public ReporteCliente() {
    }

    public ReporteCliente(String nombrecliente, int nactividad, int valortotal, int valorpagado, int naccidentes) {
	this.nombrecliente = nombrecliente;
	this.nactividad = nactividad;
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

    public int getNactividad() {
        return nactividad;
    }

    public void setNactividad(int nactividad) {
        this.nactividad = nactividad;
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
