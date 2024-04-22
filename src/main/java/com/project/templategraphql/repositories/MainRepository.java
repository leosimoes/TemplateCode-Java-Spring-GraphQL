package com.project.templategraphql.repositories;

import com.project.templategraphql.entities.MainEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Repository
public interface MainRepository extends JpaRepository<MainEntity, UUID> {

    Boolean existsByNameEqualsIgnoreCase(String name);

    Optional<MainEntity> findByNameEqualsIgnoreCase(String name);

    List<MainEntity> findByDescriptionIsLikeIgnoreCase(String description);

    List<MainEntity> findByAssociated_Name(String associated_name);

}
