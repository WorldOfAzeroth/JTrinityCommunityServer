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
@Table(name = "trait_cond")
public class TraitCond {
    @Id
    @ColumnDefault("'0'")
    @Column(name = "ID", columnDefinition = "int UNSIGNED not null")
    private Long id;

    @Id
    @ColumnDefault("0")
    @Column(name = "VerifiedBuild", nullable = false)
    private Integer verifiedBuild;

    @ColumnDefault("0")
    @Column(name = "CondType", nullable = false)
    private Integer condType;

    @ColumnDefault("'0'")
    @Column(name = "TraitTreeID", columnDefinition = "int UNSIGNED not null")
    private Long traitTreeID;

    @ColumnDefault("0")
    @Column(name = "GrantedRanks", nullable = false)
    private Integer grantedRanks;

    @ColumnDefault("0")
    @Column(name = "QuestID", nullable = false)
    private Integer questID;

    @ColumnDefault("0")
    @Column(name = "AchievementID", nullable = false)
    private Integer achievementID;

    @ColumnDefault("0")
    @Column(name = "SpecSetID", nullable = false)
    private Integer specSetID;

    @ColumnDefault("0")
    @Column(name = "TraitNodeGroupID", nullable = false)
    private Integer traitNodeGroupID;

    @ColumnDefault("0")
    @Column(name = "TraitNodeID", nullable = false)
    private Integer traitNodeID;

    @ColumnDefault("0")
    @Column(name = "TraitCurrencyID", nullable = false)
    private Integer traitCurrencyID;

    @ColumnDefault("0")
    @Column(name = "SpentAmountRequired", nullable = false)
    private Integer spentAmountRequired;

    @ColumnDefault("0")
    @Column(name = "Flags", nullable = false)
    private Integer flags;

    @ColumnDefault("0")
    @Column(name = "RequiredLevel", nullable = false)
    private Integer requiredLevel;

    @ColumnDefault("0")
    @Column(name = "FreeSharedStringID", nullable = false)
    private Integer freeSharedStringID;

    @ColumnDefault("0")
    @Column(name = "SpendMoreSharedStringID", nullable = false)
    private Integer spendMoreSharedStringID;

}