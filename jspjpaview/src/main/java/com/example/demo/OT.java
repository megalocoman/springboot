package com.example.demo;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import org.springframework.format.annotation.DateTimeFormat;


@Entity
@Table(name = "OT")
public class OT {
	@Id
	@SequenceGenerator(name="seq", sequenceName="SEQUENCE1", allocationSize = 1)
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator = "seq")
	@Basic(optional=false)
	@Column(name="NUMEROOT")
	private Integer numot;

//	@DateTimeFormat(pattern="dd-MM-yyyy")
	@Column(name="FECHA_ACTIVIDAD")
	private String fecact;
	
	@Column(name="VALOR")
	private Integer val;
	
	@Column(name="PAGO")
	private Integer pag;
	
	@Column(name="STATUSACTIVIDAD")
	private String statact;
	
	@Column(name="CLIENTE_RUT_CLIENTE")
	private String rutcli;
	
	@Column(name="PROFESIONAL_RUT_PROFESIONAL")
	private String rutprof;
	
	@Column(name="ACTIVIDADES_CODIGO_ACTIVIDAD")
	private Integer codact;
	
	public OT(Integer numot, String fecact, Integer val, Integer pag, String statact, String rutcli, String rutprof, Integer codact) {
		super();
		this.numot = numot;
		this.fecact = fecact;
		this.val = val;
		this.pag = pag;
		this.statact = statact;
		this.rutcli = rutcli;
		this.rutprof = rutprof;
		this.codact = codact;
	}

	public OT(String fecact, Integer val, Integer pag, String statact, String rutcli, String rutprof, Integer codact) {
		super();
		this.fecact = fecact;
		this.val = val;
		this.pag = pag;
		this.statact = statact;
		this.rutcli = rutcli;
		this.rutprof = rutprof;
		this.codact = codact;
	}

	public OT() {
		super();
	}

	public Integer getNumot() {
		return numot;
	}

	public void setNumot(Integer numot) {
		this.numot = numot;
	}

	public String getFecact() {
		return fecact;
	}

	public void setFecact(String fecact) {
		this.fecact = fecact;
	}

	public Integer getVal() {
		return val;
	}

	public void setVal(Integer val) {
		this.val = val;
	}

	public Integer getPag() {
		return pag;
	}

	public void setPag(Integer pag) {
		this.pag = pag;
	}

	public String getStatact() {
		return statact;
	}

	public void setStatact(String statact) {
		this.statact = statact;
	}

	public String getRutcli() {
		return rutcli;
	}

	public void setRutcli(String rutcli) {
		this.rutcli = rutcli;
	}

	public String getRutprof() {
		return rutprof;
	}

	public void setRutprof(String rutprof) {
		this.rutprof = rutprof;
	}

	public Integer getCodact() {
		return codact;
	}

	public void setCodact(Integer codact) {
		this.codact = codact;
	}
	
}
