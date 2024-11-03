package com.example.thewire.model;

import jakarta.persistence.*;
import java.util.List;

@Entity
public class Season {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private int seasonNumber;
    private int year;

    @ManyToOne
    @JoinColumn(name = "serie_id")
    private Serie serie;

    @OneToMany(mappedBy = "season", cascade = CascadeType.ALL)
    private List<Episode> episodes;

    // Getters y setters
}
