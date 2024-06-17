package com.example.nations.web;

import com.example.nations.domain.CountryStats;
import com.example.nations.service.CountryStatsService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/country-stats")
public class CountryStatsController {
    private final CountryStatsService countryStatsService;

    public CountryStatsController(CountryStatsService countryStatsService) {
        this.countryStatsService = countryStatsService;
    }

    @GetMapping("")
    public List<CountryStats> getAllCountryStats() {
        return countryStatsService.getAllCountryStats();
    }
}