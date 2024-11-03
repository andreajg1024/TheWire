package com.example.thewire.model;

import jakarta.persistence.*;

@Entity
public class Episode {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String title;
    private String description;
    private int episodeNumber;

    @Lob
    private byte[] image;

    private double rating;

    @ManyToOne
    @JoinColumn(name = "season_id")
    private Season season;

    // Getters y setters
}
