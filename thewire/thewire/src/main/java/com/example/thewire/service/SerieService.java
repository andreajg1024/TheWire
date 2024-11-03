package com.example.thewire.service;

import com.example.thewire.model.Serie;
import com.example.thewire.repository.SerieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class SerieService {

    private final SerieRepository serieRepository;

    @Autowired
    public SerieService(SerieRepository serieRepository) {
        this.serieRepository = serieRepository;
    }

    public List<Serie> getAllSeries() {
        return serieRepository.findAll();
    }

    public Optional<Serie> getSerieById(Long id) {
        return serieRepository.findById(id);
    }

    public Serie saveSerie(Serie serie) {
        return serieRepository.save(serie);
    }

    public void deleteSerie(Long id) {
        serieRepository.deleteById(id);
    }
}
