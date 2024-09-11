package com.github.jtrinity.hotfixes.domain;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.hibernate.annotations.ColumnDefault;

@Getter
@Setter
@ToString(onlyExplicitlyIncluded = true)
@IdClass(DB2LocaleId.class)
@Entity
@Table(name = "adventure_journal_locale")
public class AdventureJournalLocale {
    @Id
    @ColumnDefault("'0'")
    @Column(name = "ID", columnDefinition = "int UNSIGNED not null")
    private Integer id;

    @Id
    @Column(name = "locale", nullable = false, length = 4)
    private String locale;

    @Id
    @ColumnDefault("0")
    @Column(name = "VerifiedBuild", nullable = false)
    private Integer verifiedBuild;

    @Lob
    @Column(name = "Name_lang")
    private String nameLang;

    @Lob
    @Column(name = "Description_lang")
    private String descriptionLang;

    @Lob
    @Column(name = "ButtonText_lang")
    private String buttontextLang;

    @Lob
    @Column(name = "RewardDescription_lang")
    private String rewarddescriptionLang;

    @Lob
    @Column(name = "ContinueDescription_lang")
    private String continuedescriptionLang;

}