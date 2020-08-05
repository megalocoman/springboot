package com.example.demo.repositorios;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.table.ReporteCliente;

@Repository
public interface ReporteClienteDAO extends CrudRepository<ReporteCliente, String> {

}
