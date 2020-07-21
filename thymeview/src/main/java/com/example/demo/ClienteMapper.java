package com.example.demo;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class ClienteMapper implements RowMapper<Cliente> {
    public Cliente mapRow(ResultSet rs, int rowNum) throws SQLException{
	return new Cliente(rs.getString("rutcliente"), 
		rs.getString("direccion"), 
		rs.getString("telefono"), 
		rs.getString("correo"),
		rs.getString("contacto"), 
		rs.getString("nombrecliente"));
    }   
}
