package com.springjdbc01.ejemplo.servicio;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springjdbc01.ejemplo.dao.IPersonaDAO;
import com.springjdbc01.ejemplo.dao.PersonaDAO;
import com.springjdbc01.ejemplo.entidad.Persona;

@Service
public class PersonaServicio implements IPersonaServicio {
	
	@Autowired
	IPersonaDAO iPersonaDAO;

	@Override
	public void obtenerListaPersonas() {
		List<Persona> personas=iPersonaDAO.listaPersonas();
		
		for(Persona p:personas) {
			System.out.println(p);
		}
		
		
	}

	@Override
	public void obtenerPersonaInsertada() {
		Persona persona=new Persona();
		persona.setNombre_persona("Yovana");
		Integer i=iPersonaDAO.insertarPersona(persona);		
		System.out.println(i);
	}

	@Override
	public void obtenerPersonaPorId() {
		Integer id=4;
		Persona persona=iPersonaDAO.buscarPersona(id);
		System.out.println(persona);
	}

	@Override
	public void obtenerPersonaActualizada() {
		Persona persona=new Persona();
		persona.setId_persona(7);
		persona.setNombre_persona("CHRIS");
		Integer i=iPersonaDAO.actualizarPersona(persona);
		System.out.println(i);
	}

	@Override
	public void obtenerPersonaEliminada() {
		Integer id=8;
		Integer i=iPersonaDAO.eliminarPersona(id);
		System.out.println(i);
	}
	
}
