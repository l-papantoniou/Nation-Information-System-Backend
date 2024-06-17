package com.example.nations.web;

import com.example.nations.domain.Country;
import com.example.nations.service.CountryService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/countries")
public class CountryController {
    private final CountryService countryService;

    public CountryController(CountryService countryService) {
        this.countryService = countryService;
    }

    /**
     * Get a list of all countries
     *
     * @return a list of all countries
     */
    @GetMapping
    public List<Country> getAllCountries() {
        return countryService.getAllCountries();
    }

    /**
     * Get country by id
     *
     * @param id the id of the country
     * @return the country
     */
    @GetMapping("/{id}")
    public Country getCountryById(@PathVariable Long id) {
        return countryService.getCountryById(id);
    }
}