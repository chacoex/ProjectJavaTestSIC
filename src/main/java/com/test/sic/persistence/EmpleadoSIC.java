package com.test.sic.persistence;

import com.test.sic.entitys.Empleado;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmpleadoSIC extends JpaRepository<Empleado,Long> {
}
