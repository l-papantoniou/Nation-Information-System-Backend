package com.example.nations.service;

import com.example.nations.domain.CountryStats;
import com.example.nations.repository.CountryStatsRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CountryStatsService {
    private final CountryStatsRepository countryStatsRepository;

    public CountryStatsService(CountryStatsRepository countryStatsRepository) {
        this.countryStatsRepository = countryStatsRepository;
    }

    public List<CountryStats> getAllCountryStats() {
        return countryStatsRepository.findAll();
    }


    /**
     * Get countryStats by country id
     *
     * @param countryId the id of the country
     * @return a list of countryStats
     */
    public List<CountryStats> getCountryStatsByCountryId(Long countryId) {
        return countryStatsRepository.getByCountryId(countryId);
    }
}