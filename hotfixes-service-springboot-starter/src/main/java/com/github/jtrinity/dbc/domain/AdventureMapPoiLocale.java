package com.github.jtrinity.dbc.domain;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.hibernate.annotations.ColumnDefault;

@Getter
@Setter
@ToString
@IdClass(DB2LocaleId.class)
@Entity
@Table(name = "adventure_map_poi_locale")
public class AdventureMapPoiLocale {
    @Id
    @ColumnDefault("'0'")
    @Column(name = "ID", columnDefinition = "int UNSIGNED not null")
    private Long id;

    @Id
    @Column(name = "locale", nullable = false, length = 4)
    private String locale;

    @Id
    @ColumnDefault("0")
    @Column(name = "VerifiedBuild", nullable = false)
    private Integer verifiedBuild;

    @Lob
    @Column(name = "Title_lang")
    private String titleLang;

    @Lob
    @Column(name = "Description_lang")
    private String descriptionLang;

}