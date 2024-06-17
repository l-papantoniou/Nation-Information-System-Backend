package com.example.nations.service;

import com.example.nations.domain.Country;
import com.example.nations.repository.CountryRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CountryService {
    private final CountryRepository countryRepository;

    private final Logger log = LoggerFactory.getLogger(CountryService.class);

    public CountryService(CountryRepository countryRepository) {
        this.countryRepository = countryRepository;
    }

    public List<Country> getAllCountries() {
        return countryRepository.findAll();
    }


    /**
     * Get country by id
     *
     * @param id the id of the country
     * @return the country with the specific id
     */
    public Country getCountryById(Long id) {
        log.debug("Rest request to get a country by its id ");
        Optional<Country> country = countryRepository.findById(id);
        if (country.isEmpty()) {
            throw new RuntimeException("Country not found with id ");
        }
        return country.get();
    }
}