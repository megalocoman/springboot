package com.example.demo;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface ClienteJPADAO extends CrudRepository<ClienteJPA, String> {

    @Query("SELECT c from ClienteJPA c WHERE c.nombrecliente = :nombrecliente")
    public ClienteJPA findClienteJPAByNombrecliente(@Param("nombrecliente") String nombrecliente);
    
    @Query("SELECT nombrecliente FROM ClienteJPA c where c.rutcliente = :rutcliente")
    public  String findNombreclienteByRutcliente(String rutcliente);
   
}
