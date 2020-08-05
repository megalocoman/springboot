package com.example.demo.repositorios;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.table.ProfesionalJPA;

@Repository
public interface ProfesionalJPADAO extends CrudRepository<ProfesionalJPA, String>{
    

}


    
