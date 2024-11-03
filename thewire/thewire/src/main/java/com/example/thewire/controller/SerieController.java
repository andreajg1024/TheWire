package com.example.thewire.controller;

import com.example.thewire.model.Serie;
import com.example.thewire.service.SerieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/series")
public class SerieController {
    @Autowired
    private SerieService serieService;

    @GetMapping
    public List<Serie> getAllSeries() {
        return serieService.getAllSeries();
    }

    @GetMapping("/{id}")
    public Serie getSerieById(@PathVariable Long id) {
        return serieService.getSerieById(id)
                .orElseThrow(() -> new RuntimeException("Serie not found with id " + id));
    }
}
