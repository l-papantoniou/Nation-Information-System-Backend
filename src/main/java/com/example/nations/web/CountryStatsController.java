package com.example.nations.web;

import com.example.nations.domain.CountryStats;
import com.example.nations.service.CountryStatsService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
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

    /**
     * Retrieves the statistics for all countries.
     *
     * @return A list of CountryStats objects containing the statistics
     */
    @GetMapping("")
    public List<CountryStats> getAllCountryStats() {
        return countryStatsService.getAllCountryStats();
    }


    /**
     * Retrieves the statistics for a specific country based on the given country ID.
     *
     * @param countryId The ID of the country whose statistics are to be retrieved.
     * @return A list of CountryStats objects containing the statistics for the specified country.
     */
    @GetMapping("/country/{countryId}")
    public List<CountryStats> getCountryStatsByCountryId(@PathVariable Long countryId) {
        return countryStatsService.getCountryStatsByCountryId(countryId);
    }
}