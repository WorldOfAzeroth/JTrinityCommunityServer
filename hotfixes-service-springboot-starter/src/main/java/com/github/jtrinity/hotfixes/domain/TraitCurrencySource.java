package com.github.jtrinity.hotfixes.domain;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.hibernate.annotations.ColumnDefault;

@Getter
@Setter
@ToString(onlyExplicitlyIncluded = true)
@IdClass(DB2Id.class)
@Entity
@Table(name = "trait_currency_source")
public class TraitCurrencySource {
    @Id
    @ColumnDefault("'0'")
    @Column(name = "ID", columnDefinition = "int UNSIGNED not null")
    private Long id;

    @Id
    @ColumnDefault("0")
    @Column(name = "VerifiedBuild", nullable = false)
    private Integer verifiedBuild;

    @Lob
    @Column(name = "Requirement")
    private String requirement;

    @ColumnDefault("'0'")
    @Column(name = "TraitCurrencyID", columnDefinition = "int UNSIGNED not null")
    private Long traitCurrencyID;

    @ColumnDefault("0")
    @Column(name = "Amount", nullable = false)
    private Integer amount;

    @ColumnDefault("0")
    @Column(name = "QuestID", nullable = false)
    private Integer questID;

    @ColumnDefault("0")
    @Column(name = "AchievementID", nullable = false)
    private Integer achievementID;

    @ColumnDefault("0")
    @Column(name = "PlayerLevel", nullable = false)
    private Integer playerLevel;

    @ColumnDefault("0")
    @Column(name = "TraitNodeEntryID", nullable = false)
    private Integer traitNodeEntryID;

    @ColumnDefault("0")
    @Column(name = "OrderIndex", nullable = false)
    private Integer orderIndex;

}