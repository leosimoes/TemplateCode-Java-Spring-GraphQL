package com.project.templategraphql.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.UUID;

@Entity
@Table(name="MAINS")
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class MainEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

    @Column(unique = true)
    private String name;

    @Column
    private String description;

    @ManyToOne
    private AssociatedEntity associated;

}