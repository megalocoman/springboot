package com.example.demo.repositorios;


import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.table.ACTIVIDADES;


@Repository
public interface IntACTIVIDADES extends CrudRepository<ACTIVIDADES, Integer>{

}
