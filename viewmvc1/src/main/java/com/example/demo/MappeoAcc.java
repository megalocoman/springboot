package com.example.demo;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class MappeoAcc implements RowMapper<Accidente> {

    public Accidente mapRow(ResultSet rs, int rowNum) throws SQLException {

	return new Accidente(rs.getInt("codigoactividad"), rs.getString("nombre"), rs.getString("descripcion"));
    }

}
