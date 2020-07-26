package com.example.demo;

import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<Seguridad, String> {

    Seguridad findByUsuario(String username);
}
