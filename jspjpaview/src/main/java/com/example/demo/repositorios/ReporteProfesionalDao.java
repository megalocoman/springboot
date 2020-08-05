package com.example.demo.repositorios;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.table.ReporteProfesional;

@Repository
public interface ReporteProfesionalDao extends CrudRepository<ReporteProfesional, String> {
    
}
