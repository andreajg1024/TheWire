package com.example.thewire.service;

import com.example.thewire.model.Episode;
import com.example.thewire.repository.EpisodeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EpisodeService {
    @Autowired
    private EpisodeRepository episodeRepository;

    // Método para obtener episodios por ID de temporada
    public List<Episode> getEpisodesBySeason(Long seasonId) {
        return episodeRepository.findBySeasonId(seasonId);
    }

    // Método para obtener un episodio por ID
    public Optional<Episode> getEpisodeById(Long id) {
        return episodeRepository.findById(id);
    }
}
