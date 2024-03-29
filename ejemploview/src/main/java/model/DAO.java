package model;

import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class DAO {
    private static final Logger logger =LogManager.getLogger(DAO.class);
    
    @Autowired
    private JdbcTemplate plantilla;
    public DAO(JdbcTemplate plantilla) {
	this.plantilla = plantilla;
    }
    
    public List<Cliente> consultarcliente(){
	return plantilla.query("select * from countries", new ClienteMapper());
    }
}
