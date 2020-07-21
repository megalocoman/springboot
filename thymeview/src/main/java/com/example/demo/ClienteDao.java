package com.example.demo;

import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.namedparam.BeanPropertySqlParameterSource;
import org.springframework.jdbc.core.simple.SimpleJdbcInsert;
import org.springframework.stereotype.Repository;

@Repository
public class ClienteDao {
    private static final Logger logger = LogManager.getLogger(ClienteDao.class);

    @Autowired
    private JdbcTemplate plantilla;

    public ClienteDao(JdbcTemplate plantilla) {
	this.plantilla = plantilla;
    }

    public List<Cliente> consultarcliente() {
	return plantilla.query("SELECT * FROM cliente", new ClienteMapper());
    }

    public void ingresar(Cliente cliente) {
	SimpleJdbcInsert insertcliente = new SimpleJdbcInsert(plantilla);
	insertcliente.withTableName("cliente").usingColumns("nombrecliente", "rutcliente", "telefono", "contacto", "correo", "direccion");
	BeanPropertySqlParameterSource param = new BeanPropertySqlParameterSource(cliente);
	insertcliente.execute(param);
    }
}
