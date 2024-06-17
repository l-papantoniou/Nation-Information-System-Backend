package com.example.nations.web;

import com.example.nations.domain.CountryStats;
import com.example.nations.service.CountryStatsService;
import org.springframework.web.bind.annotation.*;

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


    /**
     * Get country statistics with the maximum GDP per population ratio for each country.
     *
     * @return a list of country statistics with the maximum GDP per population ratio.
     */
    @GetMapping("/max-gdp-per-population")
    public List<CountryStats> getCountryStatsWithMaxGdpPerPopulation() {
        return countryStatsService.getCountryStatsWithMaxGdpPerPopulation();
    }


    /**
     * Get country statistics filtered by region and date range.
     *
     * @param regionId  the ID of the region (optional).
     * @param startDate the start year for filtering (optional).
     * @param endDate   the end year for filtering (optional).
     * @return a list of country statistics matching the filters.
     */
    @GetMapping("/filter")
    public List<CountryStats> getCountryStatsByFilters(
            @RequestParam(required = false) Long regionId,
            @RequestParam(required = false) Integer startDate,
            @RequestParam(required = false) Integer endDate) {
        return countryStatsService.getCountryStatsByFilters(regionId, startDate, endDate);
    }
}