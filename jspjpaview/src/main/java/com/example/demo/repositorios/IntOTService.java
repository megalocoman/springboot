package com.example.demo.repositorios;


import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.table.OT;



@Repository
public interface IntOTService extends CrudRepository<OT, Integer>{
	

}
