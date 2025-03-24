package com.cesde.banco_app.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import com.cesde.banco_app.Cuenta;

public interface CuentaRepository extends JpaRepository<Cuenta, Long> {
    
}


