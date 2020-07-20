package com.example.dao;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import com.example.tabla.Cliente;

@Repository
@Transactional
public class ClienteDao {
    
    @Autowired
    private JdbcTemplate jdbcTemplate;
    
    public List<Cliente> lista() {
	
	String sql = " SELECT * FROM cliente";
	List<Cliente> consulta = jdbcTemplate.query(sql,
	            BeanPropertyRowMapper.newInstance(Cliente.class));
        return consulta;
    }
  
    public void ingresarNuevo(Cliente cliente) {
    }
  
    public Cliente consultaIndividual(int id) {
        return null;
    }
  
    public void actualizar(Cliente cliente) {
    }
  
    public void delete(int id) {
    }

}
