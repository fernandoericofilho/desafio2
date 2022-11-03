package org.dock.repositories;

import org.dock.entities.ContaEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface ContaRepository extends JpaRepository<ContaEntity, Long> {
}
