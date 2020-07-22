package com.springjdbc01.ejemplo.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import org.springframework.jdbc.core.RowMapper;
import com.springjdbc01.ejemplo.entidad.Persona;


public class PersonaToMapper implements RowMapper<Persona>{		

	@Override
	public Persona mapRow(ResultSet rs, int rowNum) throws SQLException {
		Persona persona=new Persona();	
		persona.setId_persona(rs.getInt("id_persona"));
		persona.setNombre_persona(rs.getString("nombre_persona"));
		return persona;
	}


}
