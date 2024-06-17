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


    @Query("SELECT cs FROM CountryStats cs WHERE (cs.country.id, cs.gdp / cs.population) IN " +
            "(SELECT cs2.country.id, MAX(cs2.gdp / cs2.population) FROM CountryStats cs2 GROUP BY cs2.country.id)")
    List<CountryStats> findCountryStatsWithMaxGdpPerPopulation();

    @Query("SELECT cs FROM CountryStats cs WHERE " +
            "(:regionId IS NULL OR cs.country.region.id = :regionId) AND " +
            "(:startDate IS NULL OR cs.year >= :startDate) AND " +
            "(:endDate IS NULL OR cs.year <= :endDate)")
    List<CountryStats> findCountryStatsByFilters(Long regionId, Integer startDate, Integer endDate);
}