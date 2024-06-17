package com.example.nations.web;

import com.example.nations.domain.Continent;
import com.example.nations.service.ContinentService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/continents")
public class ContinentController {

    private final ContinentService continentService;

    public ContinentController(ContinentService continentService) {
        this.continentService = continentService;
    }

    /**
     * {@code GET  /continents} : get all the continents.
     *
     * @return a list of all continents
     */
    @GetMapping("")
    public List<Continent> getAllContinents() {
        return continentService.getAllContinents();
    }
}