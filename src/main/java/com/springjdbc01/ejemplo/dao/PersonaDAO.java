package com.springjdbc01.ejemplo.dao;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.annotation.PostConstruct;
import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.support.JdbcDaoSupport;
import org.springframework.stereotype.Repository;

import com.springjdbc01.ejemplo.entidad.Persona;

@Repository
public class PersonaDAO extends JdbcDaoSupport implements IPersonaDAO {

	@Autowired
	DataSource dataSource;

	@PostConstruct
	private void initialize() {
		setDataSource(dataSource);
	}

	@Override
	public List<Persona> listaPersonas() {
		String sql = "SELECT * FROM persona";
		PersonaToMapper personaToMapper=new PersonaToMapper();
		List<Persona> personas=getJdbcTemplate().query(sql,personaToMapper);		
		return personas;		
	}

	@Override
	public Integer insertarPersona(Persona persona) {
		String sql= "INSERT INTO persona (nombre_persona) VALUES (?)";
		Integer i=getJdbcTemplate().update(sql, new Object[]{ persona.getNombre_persona() });
		
		return i;
	}

	@Override
	public Persona buscarPersona(Integer id) {
		String sql= "SELECT * FROM persona WHERE id_persona=?";
		PersonaToMapper personaToMapper=new PersonaToMapper();
		Persona persona=getJdbcTemplate().queryForObject(sql,new Object[] {id},personaToMapper);
		return persona;
	}

	@Override
	public Integer actualizarPersona(Persona persona) {
		String sql= "UPDATE persona SET nombre_persona=? WHERE id_persona=?";
		Integer i=getJdbcTemplate().update(sql,new Object[] {persona.getNombre_persona(),persona.getId_persona()});
		
		return i;
	}

	@Override
	public Integer eliminarPersona(Integer id) {
		String sql="DELETE FROM persona WHERE id_persona=?";
		Integer i=getJdbcTemplate().update(sql,new Object[] {id});
		return i;
	}

}
