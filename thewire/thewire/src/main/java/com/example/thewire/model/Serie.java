package com.example.thewire.model;

import jakarta.persistence.*;
import java.util.List;

@Entity
public class Serie {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String creator;
    private String rating;
    private String description;
    private int numberOfSeasons;
    private int year;

    @Lob
    private byte[] poster;

    @OneToMany(mappedBy = "serie", cascade = CascadeType.ALL)
    private List<Season> seasons;

    // Getters y setters
}
