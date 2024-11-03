package com.example.thewire.repository;

import com.example.thewire.model.Serie;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SerieRepository extends JpaRepository<Serie, Long> {
    // Puedes agregar métodos personalizados si los necesitas
}
