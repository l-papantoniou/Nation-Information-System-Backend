package com.example.nations.domain;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "country_languages")
public class CountryLanguage {

    @EmbeddedId
    private CountryLanguageId id;

    @ManyToOne
    @MapsId("countryId")
    @JoinColumn(name = "country_id", nullable = false)
    private Country country;

    @ManyToOne
    @MapsId("languageId")
    @JoinColumn(name = "language_id", nullable = false)
    private Language language;

    @Column(nullable = false)
    private boolean official;

}
