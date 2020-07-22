package com.springjdbc01.ejemplo.entidad;

import org.springframework.stereotype.Component;


public class Persona {
	private Integer id_persona;
	private String nombre_persona;
	public Integer getId_persona() {
		return id_persona;
	}
	public void setId_persona(Integer id_persona) {
		this.id_persona = id_persona;
	}
	public String getNombre_persona() {
		return nombre_persona;
	}
	public void setNombre_persona(String nombre_persona) {
		this.nombre_persona = nombre_persona;
	}
	@Override
	public String toString() {
		return "Persona [id_persona=" + id_persona + ", nombre_persona=" + nombre_persona + "]";
	}

	
	
}
