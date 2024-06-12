package com.example.model;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "acteurs")
public class Acteur {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nom;
    private String prenom;

    @ManyToMany(mappedBy = "acteurs")
    private Set<Film> films;

    // Getters and setters
}
