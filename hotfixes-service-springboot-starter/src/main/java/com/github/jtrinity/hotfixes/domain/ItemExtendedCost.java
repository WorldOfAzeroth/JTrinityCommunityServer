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
@Table(name = "item_extended_cost")
public class ItemExtendedCost {
    @Id
    @ColumnDefault("'0'")
    @Column(name = "ID", columnDefinition = "int UNSIGNED not null")
    private Integer id;

    @Id
    @ColumnDefault("0")
    @Column(name = "VerifiedBuild", nullable = false)
    private Integer verifiedBuild;

    @ColumnDefault("'0'")
    @Column(name = "RequiredArenaRating", columnDefinition = "smallint UNSIGNED not null")
    private Integer requiredArenaRating;

    @ColumnDefault("0")
    @Column(name = "ArenaBracket", nullable = false)
    private Byte arenaBracket;

    @ColumnDefault("'0'")
    @Column(name = "Flags", columnDefinition = "tinyint UNSIGNED not null")
    private Short flags;

    @ColumnDefault("'0'")
    @Column(name = "MinFactionID", columnDefinition = "tinyint UNSIGNED not null")
    private Short minFactionID;

    @ColumnDefault("0")
    @Column(name = "MinReputation", nullable = false)
    private Integer minReputation;

    @ColumnDefault("'0'")
    @Column(name = "RequiredAchievement", columnDefinition = "tinyint UNSIGNED not null")
    private Short requiredAchievement;

    @ColumnDefault("0")
    @Column(name = "ItemID1", nullable = false)
    private Integer itemID1;

    @ColumnDefault("0")
    @Column(name = "ItemID2", nullable = false)
    private Integer itemID2;

    @ColumnDefault("0")
    @Column(name = "ItemID3", nullable = false)
    private Integer itemID3;

    @ColumnDefault("0")
    @Column(name = "ItemID4", nullable = false)
    private Integer itemID4;

    @ColumnDefault("0")
    @Column(name = "ItemID5", nullable = false)
    private Integer itemID5;

    @ColumnDefault("'0'")
    @Column(name = "ItemCount1", columnDefinition = "smallint UNSIGNED not null")
    private Integer itemCount1;

    @ColumnDefault("'0'")
    @Column(name = "ItemCount2", columnDefinition = "smallint UNSIGNED not null")
    private Integer itemCount2;

    @ColumnDefault("'0'")
    @Column(name = "ItemCount3", columnDefinition = "smallint UNSIGNED not null")
    private Integer itemCount3;

    @ColumnDefault("'0'")
    @Column(name = "ItemCount4", columnDefinition = "smallint UNSIGNED not null")
    private Integer itemCount4;

    @ColumnDefault("'0'")
    @Column(name = "ItemCount5", columnDefinition = "smallint UNSIGNED not null")
    private Integer itemCount5;

    @ColumnDefault("'0'")
    @Column(name = "CurrencyID1", columnDefinition = "smallint UNSIGNED not null")
    private Integer currencyID1;

    @ColumnDefault("'0'")
    @Column(name = "CurrencyID2", columnDefinition = "smallint UNSIGNED not null")
    private Integer currencyID2;

    @ColumnDefault("'0'")
    @Column(name = "CurrencyID3", columnDefinition = "smallint UNSIGNED not null")
    private Integer currencyID3;

    @ColumnDefault("'0'")
    @Column(name = "CurrencyID4", columnDefinition = "smallint UNSIGNED not null")
    private Integer currencyID4;

    @ColumnDefault("'0'")
    @Column(name = "CurrencyID5", columnDefinition = "smallint UNSIGNED not null")
    private Integer currencyID5;

    @ColumnDefault("'0'")
    @Column(name = "CurrencyCount1", columnDefinition = "int UNSIGNED not null")
    private Long currencyCount1;

    @ColumnDefault("'0'")
    @Column(name = "CurrencyCount2", columnDefinition = "int UNSIGNED not null")
    private Long currencyCount2;

    @ColumnDefault("'0'")
    @Column(name = "CurrencyCount3", columnDefinition = "int UNSIGNED not null")
    private Long currencyCount3;

    @ColumnDefault("'0'")
    @Column(name = "CurrencyCount4", columnDefinition = "int UNSIGNED not null")
    private Long currencyCount4;

    @ColumnDefault("'0'")
    @Column(name = "CurrencyCount5", columnDefinition = "int UNSIGNED not null")
    private Long currencyCount5;

}