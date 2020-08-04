package com.example.demo;


import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;



@Repository
public interface IntOTService extends CrudRepository<OT, Integer>{
	

}
