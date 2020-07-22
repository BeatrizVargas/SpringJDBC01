package com.springjdbc01.ejemplo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.springjdbc01.ejemplo.servicio.IPersonaServicio;

@SpringBootApplication
public class SpringJdbc01Application {

	@Autowired
	IPersonaServicio iPersonaServicio;

	
	public static void main(String[] args) {
		ApplicationContext app=SpringApplication.run(SpringJdbc01Application.class, args);
	
		IPersonaServicio iPersonaServicio=app.getBean(IPersonaServicio.class);
		
		iPersonaServicio.obtenerListaPersonas();
		
		iPersonaServicio.obtenerPersonaInsertada();
		
		iPersonaServicio.obtenerPersonaPorId();
		
		iPersonaServicio.obtenerPersonaActualizada();
		
		iPersonaServicio.obtenerPersonaEliminada();
	}
	

}
