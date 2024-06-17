package com.example.nations.service;

import com.example.nations.domain.Continent;
import com.example.nations.repository.ContinentRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ContinentService {

    private final Logger log = LoggerFactory.getLogger(ContinentService.class);

    private final ContinentRepository continentRepository;

    public ContinentService(ContinentRepository continentRepository) {
        this.continentRepository = continentRepository;
    }

    public List<Continent> getAllContinents() {
        log.debug("Request to get all continents ");
        return continentRepository.findAll();
    }
}