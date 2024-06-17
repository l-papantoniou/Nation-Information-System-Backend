package com.example.nations.domain;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;
import lombok.*;

import java.math.BigDecimal;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Table(name = "country_stats")
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class CountryStats {

    @EmbeddedId
    private CountryStatsId id;

    @OneToOne
    @MapsId
    @JoinColumn(name = "country_id", nullable = false)
    private Country country;

    @Column(nullable = false)
    private int year;

    @Column(precision = 15, scale = 0)
    private long population;

    private BigDecimal gdp;


}