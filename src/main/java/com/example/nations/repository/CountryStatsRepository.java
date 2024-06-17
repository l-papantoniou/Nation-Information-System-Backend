package com.example.nations.repository;

import com.example.nations.domain.CountryStats;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CountryStatsRepository extends JpaRepository<CountryStats, Long> {
}