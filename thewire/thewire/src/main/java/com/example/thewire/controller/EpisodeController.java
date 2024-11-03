package com.example.thewire.controller;

import com.example.thewire.model.Episode;
import com.example.thewire.service.EpisodeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/episodes")
public class EpisodeController {
    @Autowired
    private EpisodeService episodeService;

    @GetMapping("/season/{seasonId}")
    public List<Episode> getEpisodesBySeason(@PathVariable Long seasonId) {
        return episodeService.getEpisodesBySeason(seasonId);
    }

    @GetMapping("/{id}")
    public Episode getEpisodeById(@PathVariable Long id) {
        return episodeService.getEpisodeById(id)
                .orElseThrow(() -> new RuntimeException("Episode not found with id " + id));
    }
}
