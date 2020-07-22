package com.springjdbc01.ejemplo.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.springjdbc01.ejemplo.entidad.Persona;


public interface IPersonaDAO {

	List<Persona> listaPersonas();
	Integer insertarPersona(Persona persona);
	Persona buscarPersona(Integer id);
	Integer actualizarPersona(Persona persona);
	Integer eliminarPersona(Integer id);
	
}
