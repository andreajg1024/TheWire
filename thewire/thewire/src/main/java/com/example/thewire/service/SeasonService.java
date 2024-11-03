package com.example.thewire.service;

import com.example.thewire.model.Season;
import com.example.thewire.repository.SeasonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class SeasonService {

    private final SeasonRepository seasonRepository;

    @Autowired
    public SeasonService(SeasonRepository seasonRepository) {
        this.seasonRepository = seasonRepository;
    }

    public List<Season> getAllSeasons() {
        return seasonRepository.findAll();
    }

    public Optional<Season> getSeasonById(Long id) {
        return seasonRepository.findById(id);
    }

    public Season saveSeason(Season season) {
        return seasonRepository.save(season);
    }

    public void deleteSeason(Long id) {
        seasonRepository.deleteById(id);
    }
}
