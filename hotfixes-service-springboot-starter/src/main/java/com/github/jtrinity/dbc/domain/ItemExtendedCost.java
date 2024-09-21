package com.github.jtrinity.dbc.domain;

import com.github.jtrinity.common.LocalizedString;
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
@ToString
@IdClass(DB2Id.class)
@Entity
@Table(name = "item_extended_cost")
@Db2File(name = "ItemExtendedCost.db2", layoutHash = 0xC31F4DEF)
public class ItemExtendedCost implements DbcEntity {
    @Id
    @ColumnDefault("'0'")
    @Column(name = "ID", columnDefinition = "int UNSIGNED not null")
    @Db2Field(fieldIndex = 0, type = Db2Type.INT)
    private Integer id;


    @Column(name = "ItemID1")
    @Db2Field(fieldIndex = 1, type = Db2Type.INT, signed = true)
    private Integer itemID1;


    @Column(name = "ItemID2")
    @Db2Field(fieldIndex = 2, type = Db2Type.INT, signed = true)
    private Integer itemID2;


    @Column(name = "ItemID3")
    @Db2Field(fieldIndex = 3, type = Db2Type.INT, signed = true)
    private Integer itemID3;


    @Column(name = "ItemID4")
    @Db2Field(fieldIndex = 4, type = Db2Type.INT, signed = true)
    private Integer itemID4;


    @Column(name = "ItemID5")
    @Db2Field(fieldIndex = 5, type = Db2Type.INT, signed = true)
    private Integer itemID5;


    @Column(name = "CurrencyCount1")
    @Db2Field(fieldIndex = 6, type = Db2Type.INT)
    private Integer currencyCount1;


    @Column(name = "CurrencyCount2")
    @Db2Field(fieldIndex = 7, type = Db2Type.INT)
    private Integer currencyCount2;


    @Column(name = "CurrencyCount3")
    @Db2Field(fieldIndex = 8, type = Db2Type.INT)
    private Integer currencyCount3;


    @Column(name = "CurrencyCount4")
    @Db2Field(fieldIndex = 9, type = Db2Type.INT)
    private Integer currencyCount4;


    @Column(name = "CurrencyCount5")
    @Db2Field(fieldIndex = 10, type = Db2Type.INT)
    private Integer currencyCount5;


    @Column(name = "ItemCount1")
    @Db2Field(fieldIndex = 11, type = Db2Type.SHORT)
    private Short itemCount1;


    @Column(name = "ItemCount2")
    @Db2Field(fieldIndex = 12, type = Db2Type.SHORT)
    private Short itemCount2;


    @Column(name = "ItemCount3")
    @Db2Field(fieldIndex = 13, type = Db2Type.SHORT)
    private Short itemCount3;


    @Column(name = "ItemCount4")
    @Db2Field(fieldIndex = 14, type = Db2Type.SHORT)
    private Short itemCount4;


    @Column(name = "ItemCount5")
    @Db2Field(fieldIndex = 15, type = Db2Type.SHORT)
    private Short itemCount5;


    @Column(name = "RequiredArenaRating")
    @Db2Field(fieldIndex = 16, type = Db2Type.SHORT)
    private Short requiredArenaRating;


    @Column(name = "CurrencyID1")
    @Db2Field(fieldIndex = 17, type = Db2Type.SHORT)
    private Short currencyID1;


    @Column(name = "CurrencyID2")
    @Db2Field(fieldIndex = 18, type = Db2Type.SHORT)
    private Short currencyID2;


    @Column(name = "CurrencyID3")
    @Db2Field(fieldIndex = 19, type = Db2Type.SHORT)
    private Short currencyID3;


    @Column(name = "CurrencyID4")
    @Db2Field(fieldIndex = 20, type = Db2Type.SHORT)
    private Short currencyID4;


    @Column(name = "CurrencyID5")
    @Db2Field(fieldIndex = 21, type = Db2Type.SHORT)
    private Short currencyID5;


    @Column(name = "ArenaBracket")
    @Db2Field(fieldIndex = 22, type = Db2Type.BYTE)
    private Byte arenaBracket;


    @Column(name = "MinFactionID")
    @Db2Field(fieldIndex = 23, type = Db2Type.BYTE)
    private Byte minFactionID;


    @Column(name = "MinReputation")
    @Db2Field(fieldIndex = 24, type = Db2Type.BYTE)
    private Byte minReputation;


    @Column(name = "Flags")
    @Db2Field(fieldIndex = 25, type = Db2Type.BYTE)
    private Byte flags;


    @Column(name = "RequiredAchievement")
    @Db2Field(fieldIndex = 26, type = Db2Type.BYTE)
    private Byte requiredAchievement;

    @Id
    @ColumnDefault("0")
    @Column(name = "VerifiedBuild", nullable = false)
    private Integer verifiedBuild;


}
