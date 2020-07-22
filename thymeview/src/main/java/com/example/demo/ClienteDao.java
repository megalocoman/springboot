package com.example.demo;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.namedparam.BeanPropertySqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.core.simple.SimpleJdbcInsert;
import org.springframework.stereotype.Repository;

@Repository
public class ClienteDao {
    

    @Autowired
    private JdbcTemplate plantilla;

    public ClienteDao(JdbcTemplate plantilla) {
	this.plantilla = plantilla;
    }

    // retorna una lista de objetos de tabla de clientes 
    public List<Cliente> consultarcliente() {
	
	return plantilla.query("SELECT * FROM cliente", new ClienteMapper());
    }

    // ingresa una objeto cliente a la base de datos cliente
    public void ingresar(Cliente cliente) {
	SimpleJdbcInsert insertcliente = new SimpleJdbcInsert(plantilla);
	insertcliente.withTableName("cliente").usingColumns("nombrecliente", 
		"rutcliente", "telefono", "contacto", "correo", "direccion");
	BeanPropertySqlParameterSource param = new BeanPropertySqlParameterSource(cliente);
	insertcliente.execute(param);
    }

    // retorna un objeto de cliente ingresando rut de cliente
    public Cliente consultaclienteID(String rutcliente) {
	String sql = "SELECT * FROM cliente WHERE rutcliente = ?";
	Object[] args = { rutcliente };
	Cliente cliente = plantilla.queryForObject(sql, args, new ClienteMapper());
	return cliente;
    }

    // actualiza tabla clientes ingresando un onjeto cliente
    public void actualizarClienteID(Cliente cliente) {
	String sql = "UPDATE cliente SET nombrecliente=:nombrecliente, telefono=:telefono, contacto=:contacto, correo=:correo, direccion=:direccion WHERE rutcliente=:rutcliente  ";
	BeanPropertySqlParameterSource param = new BeanPropertySqlParameterSource(cliente);
	NamedParameterJdbcTemplate template = new NamedParameterJdbcTemplate(plantilla);
	template.update(sql, param);
    }
    
    // elimina registros de tabla cliente indicando rut respectivo
    public void eliminarPorID(String rutcliente) {
	String sql = "DELETE FROM cliente WHERE rutcliente = ?";
	plantilla.update(sql, rutcliente);
    }
}
