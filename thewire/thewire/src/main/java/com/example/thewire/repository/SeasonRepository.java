package com.example.thewire.repository;

import com.example.thewire.model.Season;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SeasonRepository extends JpaRepository<Season, Long> {
    // Métodos personalizados
}
