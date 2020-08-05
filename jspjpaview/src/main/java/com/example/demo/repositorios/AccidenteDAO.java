package com.example.demo.repositorios;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.table.Accidente;

@Repository
public interface AccidenteDAO extends CrudRepository<Accidente, Integer> {

}
