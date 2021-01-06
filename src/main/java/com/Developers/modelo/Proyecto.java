package com.Developers.modelo;


import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;




@Entity

public class Proyecto implements Serializable  {
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	private String nombreProyecto;
	private String pais;
	private String localizacion;
	private String fechaInicio;
	private String fechaFinalizacion;
	private String socioLocal;
	private String financiador;
	private Integer financiacionAportada;
	
	
	

	// CONSTRUCTOR
	
	public Proyecto(String nombreProyecto, String pais, String localizacion, String fechaInicio,
			String fechaFinalizacion, String socioLocal, String financiador, Integer financiacionAportada) {
		
		
		this.nombreProyecto = nombreProyecto;
		this.pais = pais;
		this.localizacion = localizacion;
		this.fechaInicio = fechaInicio;
		this.fechaFinalizacion = fechaFinalizacion;
		this.socioLocal = socioLocal;
		this.financiador = financiador;
		this.financiacionAportada = financiacionAportada;
	}

	public Proyecto() {

	}
	
	// METODOS ACCESORES

	public Long getCodigoProyecto() {
		return id;
	}

	public String getNombreProyecto() {
		return nombreProyecto;
	}

	public String getPais() {
		return pais;
	}

	public String getLocalizacion() {
		return localizacion;
	}

	public String getFechaInicio() {
		return fechaInicio;
	}

	public String getFechaFinalizacion() {
		return fechaFinalizacion;
	}

	public String getSocioLocal() {
		return socioLocal;
	}

	public String getFinanciador() {
		return financiador;
	}

	public int getFinanciacionAportada() {
		return financiacionAportada;
	}

	public void setCodigoProyecto(Long codigoProyecto) {
		this.id= codigoProyecto;
	}

	public void setNombreProyecto(String nombreProyecto) {
		this.nombreProyecto = nombreProyecto;
	}

	public void setPais(String pais) {
		this.pais = pais;
	}

	public void setLocalizacion(String localizacion) {
		this.localizacion = localizacion;
	}

	public void setFechaInicio(String fechaInicio) {
		this.fechaInicio = fechaInicio;
	}

	public void setFechaFinalizacion(String fechaFinalizacion) {
		this.fechaFinalizacion = fechaFinalizacion;
	}

	public void setSocioLocal(String socioLocal) {
		this.socioLocal = socioLocal;
	}

	public void setFinanciador(String financiador) {
		this.financiador = financiador;
	}

	public void setFinanciacionAportada(Integer financiacionAportada) {
		this.financiacionAportada = financiacionAportada;
	}

	@Override
	public String toString() {
		return " "+ id + "  - "+ nombreProyecto + " - " + pais + " - "+ localizacion + " - "+fechaInicio +" - " + fechaFinalizacion
				+ "  - "  +socioLocal + " - " + financiador + " - "+ financiacionAportada ;
	}

	
	
	
	
	
}
	
	