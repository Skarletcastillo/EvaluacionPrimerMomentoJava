package com.cesde.banco_app.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import com.cesde.banco_app.Cliente;

public interface ClienteRepository extends JpaRepository<Cliente, Long> {
    
}




