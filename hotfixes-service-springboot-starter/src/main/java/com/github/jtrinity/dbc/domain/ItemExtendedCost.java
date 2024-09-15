package com.github.jtrinity.dbc.domain;

import com.github.jtrinity.cache.DbcEntity;
import com.github.jtrinity.dbc.db2.Db2Field;
import com.github.jtrinity.dbc.db2.Db2File;
import com.github.jtrinity.dbc.db2.Db2Type;

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
@Db2File(name = "ItemExtendedCost.db2", layoutHash = 0xF4D91D1F)
public class ItemExtendedCost implements DbcEntity {
    @Id
    @ColumnDefault("'0'")
    @Column(name = "ID", columnDefinition = "int UNSIGNED not null")
    @Db2Field(fieldIndex = 0, type = Db2Type.INT)
    private Integer id;

    @Id
    @ColumnDefault("0")
    @Column(name = "VerifiedBuild", nullable = false)
    private Integer verifiedBuild;

    @ColumnDefault("'0'")
    @Column(name = "RequiredArenaRating", columnDefinition = "smallint UNSIGNED not null")
    @Db2Field(fieldIndex = 1, type = Db2Type.SHORT)
    private Integer requiredArenaRating;

    @ColumnDefault("0")
    @Column(name = "ArenaBracket", nullable = false)
    @Db2Field(fieldIndex = 2, type = Db2Type.BYTE, signed = true)
    private Byte arenaBracket;

    @ColumnDefault("'0'")
    @Column(name = "Flags", columnDefinition = "tinyint UNSIGNED not null")
    @Db2Field(fieldIndex = 3, type = Db2Type.BYTE)
    private Short flags;

    @ColumnDefault("'0'")
    @Column(name = "MinFactionID", columnDefinition = "tinyint UNSIGNED not null")
    @Db2Field(fieldIndex = 4, type = Db2Type.BYTE)
    private Short minFactionID;

    @ColumnDefault("0")
    @Column(name = "MinReputation", nullable = false)
    @Db2Field(fieldIndex = 5, type = Db2Type.INT, signed = true)
    private Integer minReputation;

    @ColumnDefault("'0'")
    @Column(name = "RequiredAchievement", columnDefinition = "tinyint UNSIGNED not null")
    @Db2Field(fieldIndex = 6, type = Db2Type.BYTE)
    private Short requiredAchievement;

    @ColumnDefault("0")
    @Column(name = "ItemID1", nullable = false)
    @Db2Field(fieldIndex = 7, type = Db2Type.INT, signed = true)
    private Integer itemID1;

    @ColumnDefault("0")
    @Column(name = "ItemID2", nullable = false)
    @Db2Field(fieldIndex = 8, type = Db2Type.INT, signed = true)
    private Integer itemID2;

    @ColumnDefault("0")
    @Column(name = "ItemID3", nullable = false)
    @Db2Field(fieldIndex = 9, type = Db2Type.INT, signed = true)
    private Integer itemID3;

    @ColumnDefault("0")
    @Column(name = "ItemID4", nullable = false)
    @Db2Field(fieldIndex = 10, type = Db2Type.INT, signed = true)
    private Integer itemID4;

    @ColumnDefault("0")
    @Column(name = "ItemID5", nullable = false)
    @Db2Field(fieldIndex = 11, type = Db2Type.INT, signed = true)
    private Integer itemID5;

    @ColumnDefault("'0'")
    @Column(name = "ItemCount1", columnDefinition = "smallint UNSIGNED not null")
    @Db2Field(fieldIndex = 12, type = Db2Type.SHORT)
    private Integer itemCount1;

    @ColumnDefault("'0'")
    @Column(name = "ItemCount2", columnDefinition = "smallint UNSIGNED not null")
    @Db2Field(fieldIndex = 13, type = Db2Type.SHORT)
    private Integer itemCount2;

    @ColumnDefault("'0'")
    @Column(name = "ItemCount3", columnDefinition = "smallint UNSIGNED not null")
    @Db2Field(fieldIndex = 14, type = Db2Type.SHORT)
    private Integer itemCount3;

    @ColumnDefault("'0'")
    @Column(name = "ItemCount4", columnDefinition = "smallint UNSIGNED not null")
    @Db2Field(fieldIndex = 15, type = Db2Type.SHORT)
    private Integer itemCount4;

    @ColumnDefault("'0'")
    @Column(name = "ItemCount5", columnDefinition = "smallint UNSIGNED not null")
    @Db2Field(fieldIndex = 16, type = Db2Type.SHORT)
    private Integer itemCount5;

    @ColumnDefault("'0'")
    @Column(name = "CurrencyID1", columnDefinition = "smallint UNSIGNED not null")
    @Db2Field(fieldIndex = 17, type = Db2Type.SHORT)
    private Integer currencyID1;

    @ColumnDefault("'0'")
    @Column(name = "CurrencyID2", columnDefinition = "smallint UNSIGNED not null")
    @Db2Field(fieldIndex = 18, type = Db2Type.SHORT)
    private Integer currencyID2;

    @ColumnDefault("'0'")
    @Column(name = "CurrencyID3", columnDefinition = "smallint UNSIGNED not null")
    @Db2Field(fieldIndex = 19, type = Db2Type.SHORT)
    private Integer currencyID3;

    @ColumnDefault("'0'")
    @Column(name = "CurrencyID4", columnDefinition = "smallint UNSIGNED not null")
    @Db2Field(fieldIndex = 20, type = Db2Type.SHORT)
    private Integer currencyID4;

    @ColumnDefault("'0'")
    @Column(name = "CurrencyID5", columnDefinition = "smallint UNSIGNED not null")
    @Db2Field(fieldIndex = 21, type = Db2Type.SHORT)
    private Integer currencyID5;

    @ColumnDefault("'0'")
    @Column(name = "CurrencyCount1", columnDefinition = "int UNSIGNED not null")
    @Db2Field(fieldIndex = 22, type = Db2Type.INT)
    private Long currencyCount1;

    @ColumnDefault("'0'")
    @Column(name = "CurrencyCount2", columnDefinition = "int UNSIGNED not null")
    @Db2Field(fieldIndex = 23, type = Db2Type.INT)
    private Long currencyCount2;

    @ColumnDefault("'0'")
    @Column(name = "CurrencyCount3", columnDefinition = "int UNSIGNED not null")
    @Db2Field(fieldIndex = 24, type = Db2Type.INT)
    private Long currencyCount3;

    @ColumnDefault("'0'")
    @Column(name = "CurrencyCount4", columnDefinition = "int UNSIGNED not null")
    @Db2Field(fieldIndex = 25, type = Db2Type.INT)
    private Long currencyCount4;

    @ColumnDefault("'0'")
    @Column(name = "CurrencyCount5", columnDefinition = "int UNSIGNED not null")
    @Db2Field(fieldIndex = 26, type = Db2Type.INT)
    private Long currencyCount5;

}