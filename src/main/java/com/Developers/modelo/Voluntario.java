package com.Developers.modelo;



import javax.persistence.Entity;
import java.io.Serializable;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Voluntario implements Serializable {
	 @Id
	 @GeneratedValue(strategy = GenerationType.AUTO)
	 private Long id;
	 
	  private String nombre;
	  private  String apellidos;
	  private String direccion;
      private String fechaIngreso;
	  private String correoElectronico;
	  private String  pais;
	  private String tipoDeVoluntario;
	  
	// CONSTRUCTOR
	  
	public Voluntario(String nombre, String apellidos, String direccion, String fechaIngreso,
			String correoElectronico, String pais, String tipoDeVoluntario) {
		
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.direccion = direccion;
		this.fechaIngreso = fechaIngreso;
		this.correoElectronico = correoElectronico;
		this.pais = pais;
		this.tipoDeVoluntario = tipoDeVoluntario;
	}
	
	public Voluntario() {
		
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

	public String getFechaIngreso() {
		return fechaIngreso;
	}

	public String getCorreoElectronico() {
		return correoElectronico;
	}

	public String getPais() {
		return pais;
	}

	public String getTipoDeVoluntario() {
		return tipoDeVoluntario;
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

	public void setFechaIngreso(String fechaIngreso) {
		this.fechaIngreso = fechaIngreso;
	}

	public void setCorreoElectronico(String correoElectronico) {
		this.correoElectronico = correoElectronico;
	}

	public void setPais(String pais) {
		this.pais = pais;
	}

	public void setTipoDeVoluntario(String tipoDeVoluntario) {
		this.tipoDeVoluntario = tipoDeVoluntario;
	}

	@Override
	public String toString() {
		return  id+" -"+nombre+ " "+ apellidos+" - "+ direccion+" - " + fechaIngreso+" - " +  correoElectronico+" - " +tipoDeVoluntario ;
	}
	
	
	
	


}
	  
	  
