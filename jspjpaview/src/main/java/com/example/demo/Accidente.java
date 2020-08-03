package com.example.demo;

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

@Entity
@Table(name="accidente")
public class Accidente {
    
    @Id
//    @SequenceGenerator(name="seq",sequenceName="sequenceaccidente")        
//    @GeneratedValue(strategy=GenerationType.SEQUENCE, generator="seq")
    private int idaccidente;
    @Column(name="descripcion")
    private String descripsion;
    private String fechaaccidente;
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

  

    public String getFechaaccidente() {
        return fechaaccidente;
    }

    public void setFechaaccidente(String fechaaccidente) {
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
