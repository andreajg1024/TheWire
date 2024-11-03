package com.example.thewire.repository;

import com.example.thewire.model.Episode;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface EpisodeRepository extends JpaRepository<Episode, Long> {
    List<Episode> findBySeasonId(Long seasonId); // Ejemplo de método personalizado
}
