package com.example.nations.repository;

import com.example.nations.domain.CountryLanguage;
import com.example.nations.domain.CountryLanguageId;
import com.example.nations.domain.Language;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CountryLanguageRepository extends JpaRepository<CountryLanguage, CountryLanguageId> {

    @Query("select countryLanguage.language from CountryLanguage countryLanguage " +
            "where countryLanguage.country.id =:countryId")
    List<Language> findLanguagesByCountry(Long countryId);
}
