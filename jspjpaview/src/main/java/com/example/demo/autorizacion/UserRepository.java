package com.example.demo.autorizacion;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.table.User;

public interface UserRepository extends JpaRepository<User, String>{
    
    Optional<User> findByUsername(String username);
    

}
