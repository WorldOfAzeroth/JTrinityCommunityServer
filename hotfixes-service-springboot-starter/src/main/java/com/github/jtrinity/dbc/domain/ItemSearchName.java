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
@Table(name = "item_search_name")
@Db2File(name = "ItemSearchName.db2", layoutHash = 0x2D4B72FA, indexField = 2)
public class ItemSearchName implements DbcEntity {

    @Column(name = "AllowableRace")
    @Db2Field(fieldIndex = 0, type = Db2Type.LONG, signed = true)
    private Long allowableRace;


    @Column(name = "Display")
    @Db2Field(fieldIndex = 1, type = Db2Type.STRING)
    private LocalizedString display;

    @Id
    @ColumnDefault("'0'")
    @Column(name = "ID", columnDefinition = "int UNSIGNED not null")
    @Db2Field(fieldIndex = 2, type = Db2Type.INT)
    private Integer id;


    @Column(name = "Flags1")
    @Db2Field(fieldIndex = 3, type = Db2Type.INT, signed = true)
    private Integer flags1;


    @Column(name = "Flags2")
    @Db2Field(fieldIndex = 4, type = Db2Type.INT, signed = true)
    private Integer flags2;


    @Column(name = "Flags3")
    @Db2Field(fieldIndex = 5, type = Db2Type.INT, signed = true)
    private Integer flags3;


    @Column(name = "ItemLevel")
    @Db2Field(fieldIndex = 6, type = Db2Type.SHORT)
    private Short itemLevel;


    @Column(name = "OverallQualityID")
    @Db2Field(fieldIndex = 7, type = Db2Type.BYTE)
    private Byte overallQualityID;


    @Column(name = "ExpansionID")
    @Db2Field(fieldIndex = 8, type = Db2Type.BYTE)
    private Byte expansionID;


    @Column(name = "RequiredLevel")
    @Db2Field(fieldIndex = 9, type = Db2Type.BYTE, signed = true)
    private Byte requiredLevel;


    @Column(name = "MinFactionID")
    @Db2Field(fieldIndex = 10, type = Db2Type.SHORT)
    private Short minFactionID;


    @Column(name = "MinReputation")
    @Db2Field(fieldIndex = 11, type = Db2Type.BYTE)
    private Byte minReputation;


    @Column(name = "AllowableClass")
    @Db2Field(fieldIndex = 12, type = Db2Type.INT, signed = true)
    private Integer allowableClass;


    @Column(name = "RequiredSkill")
    @Db2Field(fieldIndex = 13, type = Db2Type.SHORT)
    private Short requiredSkill;


    @Column(name = "RequiredSkillRank")
    @Db2Field(fieldIndex = 14, type = Db2Type.SHORT)
    private Short requiredSkillRank;


    @Column(name = "RequiredAbility")
    @Db2Field(fieldIndex = 15, type = Db2Type.INT)
    private Integer requiredAbility;

    @Id
    @ColumnDefault("0")
    @Column(name = "VerifiedBuild", nullable = false)
    private Integer verifiedBuild;


}
