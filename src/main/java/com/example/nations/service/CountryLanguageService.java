package com.example.nations.service;

import com.example.nations.domain.Language;
import com.example.nations.repository.CountryLanguageRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CountryLanguageService {

    private final Logger log = LoggerFactory.getLogger(CountryLanguageService.class);

    private final CountryLanguageRepository countryLanguageRepository;

    public CountryLanguageService(CountryLanguageRepository countryLanguageRepository) {
        this.countryLanguageRepository = countryLanguageRepository;
    }

    public List<Language> findLanguagesByCountryId(Long countryId) {
        log.debug("Rest request to get all Languages by country id : {}", countryId);
        return countryLanguageRepository.findLanguagesByCountry(countryId);
    }
}
