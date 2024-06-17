package com.example.nations.web;

import com.example.nations.domain.Language;
import com.example.nations.service.CountryLanguageService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/country-language")
public class CountryLanguageController {

    private final CountryLanguageService countryLanguageService;


    public CountryLanguageController(CountryLanguageService countryLanguageService) {
        this.countryLanguageService = countryLanguageService;
    }

    /**
     * Get all Languages by country id
     *
     * @param countryId the id of the desired country
     * @return a list of languages for the specific country
     */
    @GetMapping("/country/{countryId}")
    public List<Language> getAllLanguagesByCountry(
            @PathVariable(value = "countryId", required = false) final Long countryId) {
        return countryLanguageService.findLanguagesByCountryId(countryId);
    }

}
