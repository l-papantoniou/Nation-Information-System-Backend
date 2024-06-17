package com.example.nations.web;

import com.example.nations.domain.Region;
import com.example.nations.service.RegionService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/regions")
public class RegionController {
    private final RegionService regionService;

    public RegionController(RegionService regionService) {
        this.regionService = regionService;
    }

    /**
     * Get a list of all regions
     *
     * @return a list of all Regions
     */
    @GetMapping("")
    public List<Region> getAllRegions() {
        return regionService.getAllRegions();
    }
}