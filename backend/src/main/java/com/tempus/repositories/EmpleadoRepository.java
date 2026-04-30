package com.tempus.repositories;

import com.tempus.models.Empleado;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmpleadoRepository extends JpaRepository<Empleado, Long> {
    // No necesitas escribir nada aquí, JpaRepository hace toda la magia
}