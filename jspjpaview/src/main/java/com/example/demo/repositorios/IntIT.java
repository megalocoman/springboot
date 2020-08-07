package com.example.demo.repositorios;

import com.example.demo.table.IT;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface IntIT extends JpaRepository<IT, Integer>{

}
