package com.test.sic.persistence;

import com.test.sic.entitys.Persona;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonaSIC extends JpaRepository<Persona,Long> {
}
