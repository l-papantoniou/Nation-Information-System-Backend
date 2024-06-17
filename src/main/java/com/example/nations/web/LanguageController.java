package com.example.nations.web;

import com.example.nations.domain.Language;
import com.example.nations.service.LanguageService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/languages")
public class LanguageController {
    private final LanguageService languageService;

    public LanguageController(LanguageService languageService) {
        this.languageService = languageService;
    }

    /**
     * Get a list of all languages
     *
     * @return a list of all languages
     */
    @GetMapping("")
    public List<Language> getAllLanguages() {
        return languageService.getAllLanguages();
    }
}