package com.test.sic.persistence;

import com.test.sic.entitys.Tramite;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TramiteSIC extends JpaRepository<Tramite,Long> {
}
