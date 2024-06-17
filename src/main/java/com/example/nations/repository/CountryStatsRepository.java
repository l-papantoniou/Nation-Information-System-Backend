package com.example.nations.repository;

import com.example.nations.domain.CountryStats;
import com.example.nations.domain.CountryStatsId;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CountryStatsRepository extends JpaRepository<CountryStats, CountryStatsId> {

    @Query("select countryStats from CountryStats  countryStats " +
            "where countryStats.country.id =:countryId")
    List<CountryStats> getByCountryId(Long countryId);
}