package com.example.demo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClienteJPADAO extends CrudRepository<ClienteJPA, String>{

}
