package com.example.demo.table;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Transient;

import org.springframework.format.annotation.DateTimeFormat;

@Entity
@Table(name="accidente")
public class Accidente {
    
    @Id
    @SequenceGenerator(name="seq",sequenceName="SEQUENCEACCIDENTE", allocationSize = 1)        
    @GeneratedValue(strategy=GenerationType.SEQUENCE, generator="seq")
    private int idaccidente;
    @Column(name="descripcion")
    private String descripsion;
    @DateTimeFormat(pattern="dd-MM-yyyy")
    private Date fechaaccidente;
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "clienterutcliente", nullable = false)
    private ClienteJPA clientejpa;
    @Transient
    private String nombrecliente;
    
    public Accidente() {
    }

    public int getIdaccidente() {
        return idaccidente;
    }

    public void setIdaccidente(int idaccidente) {
        this.idaccidente = idaccidente;
    }

    public String getDescripsion() {
        return descripsion;
    }

    public void setDescripsion(String descripsion) {
        this.descripsion = descripsion;
    }

  

    public Date getFechaaccidente() {
        return fechaaccidente;
    }

    public void setFechaaccidente(Date fechaaccidente) {
        this.fechaaccidente = fechaaccidente;
    }

    public ClienteJPA getClientejpa() {
        return clientejpa;
    }

    public void setClientejpa(ClienteJPA clientejpa) {
        this.clientejpa = clientejpa;
    }

    public String getNombrecliente() {
        return nombrecliente;
    }

    public void setNombrecliente(String nombrecliente) {
        this.nombrecliente = nombrecliente;
    }
   
}
