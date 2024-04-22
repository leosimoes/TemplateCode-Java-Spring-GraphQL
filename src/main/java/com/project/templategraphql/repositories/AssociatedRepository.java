package com.project.templategraphql.repositories;

import com.project.templategraphql.entities.AssociatedEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;
import java.util.UUID;

@Repository
public interface AssociatedRepository extends JpaRepository<AssociatedEntity, UUID> {

    Boolean existsByNameEqualsIgnoreCase(String name);

    Optional<AssociatedEntity> findByNameEqualsIgnoreCase(String name);

}
