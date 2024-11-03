package com.example.thewire.model;

import jakarta.persistence.*;

@Entity
public class Character {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String description;

    @Lob
    private byte[] image;

    // Getters y setters
}
