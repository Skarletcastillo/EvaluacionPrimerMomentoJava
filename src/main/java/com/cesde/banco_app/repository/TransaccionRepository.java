package com.cesde.banco_app.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import com.cesde.banco_app.Transaccion;

public interface TransaccionRepository extends JpaRepository<Transaccion, Long> {
    
}


