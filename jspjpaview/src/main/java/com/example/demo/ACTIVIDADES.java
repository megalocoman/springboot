package com.example.demo;



import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

	@Entity
	@Table(name = "ACTIVIDADES")
	public class ACTIVIDADES {
		@Id
		@SequenceGenerator(name="seqat", sequenceName="ACTIVIDADES_SEQ", allocationSize = 1)
		@GeneratedValue(strategy=GenerationType.SEQUENCE, generator = "seqat")
		@Basic(optional=false)
		@Column(name="CODIGOACTIVIDAD")
		private Integer codact;

		@Column(name="NOMBRE")
		private String nomact;
		
		@Column(name="DESCRIPCION")
		private String descact;
		
		public ACTIVIDADES() {
			super();
		}

		public ACTIVIDADES(Integer codact, String nomact, String descact) {
			super();
			this.codact = codact;
			this.nomact = nomact;
			this.descact = descact;
		}

		public ACTIVIDADES(String nomact, String descact) {
			super();
			this.nomact = nomact;
			this.descact = descact;
		}

		public Integer getCodact() {
			return codact;
		}

		public void setCodact(Integer codact) {
			this.codact = codact;
		}

		public String getNomact() {
			return nomact;
		}

		public void setNomact(String nomact) {
			this.nomact = nomact;
		}

		public String getDescact() {
			return descact;
		}

		public void setDescact(String descact) {
			this.descact = descact;
		}

		
}