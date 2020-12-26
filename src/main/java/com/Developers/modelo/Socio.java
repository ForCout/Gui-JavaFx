package com.Developers.modelo;



import javax.persistence.Column;
import javax.persistence.Entity;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity

public class Socio  {
	
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	private String nombre;
	
	private String apellidos;
	
	private String direccion;

	private String email;
	
	private String tipoCuota;
	
	private String fecha_ingreso;
	
	//Constructor
	
	public Socio( String nombre, String apellidos, String direccion, String email, String tipoCuota,
			String fecha_ingreso) {
	
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.direccion = direccion;
		this.email = email;
		this.tipoCuota = tipoCuota;
		this.fecha_ingreso = fecha_ingreso;
	}
	
	public Socio () {
		
	}
	
	//Metodos Accesadores

	public Long getId() {
		return id;
	}

	public String getNombre() {
		return nombre;
	}

	public String getApellidos() {
		return apellidos;
	}

	public String getDireccion() {
		return direccion;
	}

	public String getEmail() {
		return email;
	}

	public String getTipoCuota() {
		return tipoCuota;
	}

	public String getFecha_ingreso() {
		return fecha_ingreso;
	}

	public void setId(Long id) {
	     this.id = id;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public void setTipoCuota(String tipoCuota) {
		this.tipoCuota = tipoCuota;
	}

	public void setFecha_ingreso(String fecha_ingreso) {
		this.fecha_ingreso = fecha_ingreso;
	}

	@Override
	public String toString() {
		return "Socio [Id = " + id + ",nombre = " + nombre + ", apellidos = " + apellidos + ", direccion = " + direccion
				+ ", email = " + email + ", tipoCuota = " + tipoCuota + ", fecha_ingreso = " + fecha_ingreso + "]";
	}
	
	
	
}

