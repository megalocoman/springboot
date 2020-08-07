package com.example.demo.table;

//import java.sql.Date;
import java.util.Date;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;


import org.springframework.format.annotation.DateTimeFormat;

@Entity
public class IT {
	@Id
//	@SequenceGenerator(name="seqit", sequenceName="SEC_IT2", allocationSize = 1)
//	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator = "seqit")
	@Basic(optional=false)
	@Column(name="NUMEROIT")
	private Integer NUMEROIT;

	@Basic(optional=false)
	@Column(name="TAREA_REALIZADA")
	private String TAREA_REALIZADA;
	
	@Basic(optional=false)
	@Column(name="FECHA_TAREA")
	@DateTimeFormat(pattern="dd-MM-yyyy")
	private Date FECHA_TAREA;
	
	@Basic(optional=false)
	@Column(name="OT_NUMEROOT")
	private Integer OT_NUMEROOT;

	public IT() {
		super();
	}

	public IT(Integer nUMEROIT, String tAREA_REALIZADA, Date fECHA_TAREA, Integer oT_NUMEROOT) {
		super();
		NUMEROIT = nUMEROIT;
		TAREA_REALIZADA = tAREA_REALIZADA;
		FECHA_TAREA = fECHA_TAREA;
		OT_NUMEROOT = oT_NUMEROOT;
	}
	
	public IT(String tAREA_REALIZADA, Date fECHA_TAREA, Integer oT_NUMEROOT) {
		super();
		TAREA_REALIZADA = tAREA_REALIZADA;
		FECHA_TAREA = fECHA_TAREA;
		OT_NUMEROOT = oT_NUMEROOT;
	}

	public Integer getNUMEROIT() {
		return NUMEROIT;
	}

	public void setNUMEROIT(Integer nUMEROIT) {
		NUMEROIT = nUMEROIT;
	}

	public String getTAREA_REALIZADA() {
		return TAREA_REALIZADA;
	}

	public void setTAREA_REALIZADA(String tAREA_REALIZADA) {
		TAREA_REALIZADA = tAREA_REALIZADA;
	}

	public Date getFECHA_TAREA() {
		return FECHA_TAREA;
	}

	public void setFECHA_TAREA(Date fECHA_TAREA) {
		FECHA_TAREA = fECHA_TAREA;
	}

	public Integer getOT_NUMEROOT() {
		return OT_NUMEROOT;
	}

	public void setOT_NUMEROOT(Integer oT_NUMEROOT) {
		OT_NUMEROOT = oT_NUMEROOT;
	}
	
}
