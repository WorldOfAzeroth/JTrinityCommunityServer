package com.github.jtrinity.hotfixes.domain;

import com.github.jtrinity.hotfixes.db2.Db2Field;
import com.github.jtrinity.hotfixes.db2.Db2File;
import com.github.jtrinity.hotfixes.db2.Db2Type;

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
@Table(name = "item_search_name")
@Db2File(name = "ItemSearchName.db2", fileDataId = 1273408, layoutHash = 0xA0BCA534, indexField = 2)
public class ItemSearchName {
    @Id
    @ColumnDefault("'0'")
    @Column(name = "ID", columnDefinition = "int UNSIGNED not null")
    @Db2Field(fieldIndex = 2, type = Db2Type.INT)
    private Integer id;

    @Id
    @ColumnDefault("0")
    @Column(name = "VerifiedBuild", nullable = false)
    private Integer verifiedBuild;

    @ColumnDefault("0")
    @Column(name = "AllowableRace", nullable = false)
    @Db2Field(fieldIndex = 0, type = Db2Type.LONG, signed = true)
    private Long allowableRace;

    @Lob
    @Column(name = "Display")
    @Db2Field(fieldIndex = 1, type = Db2Type.STRING)
    private String display;

    @ColumnDefault("'0'")
    @Column(name = "OverallQualityID", columnDefinition = "tinyint UNSIGNED not null")
    @Db2Field(fieldIndex = 3, type = Db2Type.BYTE)
    private Short overallQualityID;

    @ColumnDefault("0")
    @Column(name = "ExpansionID", nullable = false)
    @Db2Field(fieldIndex = 4, type = Db2Type.BYTE, signed = true)
    private Byte expansionID;

    @ColumnDefault("'0'")
    @Column(name = "MinFactionID", columnDefinition = "smallint UNSIGNED not null")
    @Db2Field(fieldIndex = 5, type = Db2Type.SHORT)
    private Integer minFactionID;

    @ColumnDefault("0")
    @Column(name = "MinReputation", nullable = false)
    @Db2Field(fieldIndex = 6, type = Db2Type.INT, signed = true)
    private Integer minReputation;

    @ColumnDefault("0")
    @Column(name = "AllowableClass", nullable = false)
    @Db2Field(fieldIndex = 7, type = Db2Type.INT, signed = true)
    private Integer allowableClass;

    @ColumnDefault("0")
    @Column(name = "RequiredLevel", nullable = false)
    @Db2Field(fieldIndex = 8, type = Db2Type.BYTE, signed = true)
    private Byte requiredLevel;

    @ColumnDefault("'0'")
    @Column(name = "RequiredSkill", columnDefinition = "smallint UNSIGNED not null")
    @Db2Field(fieldIndex = 9, type = Db2Type.SHORT)
    private Integer requiredSkill;

    @ColumnDefault("'0'")
    @Column(name = "RequiredSkillRank", columnDefinition = "smallint UNSIGNED not null")
    @Db2Field(fieldIndex = 10, type = Db2Type.SHORT)
    private Integer requiredSkillRank;

    @ColumnDefault("'0'")
    @Column(name = "RequiredAbility", columnDefinition = "int UNSIGNED not null")
    @Db2Field(fieldIndex = 11, type = Db2Type.INT)
    private Long requiredAbility;

    @ColumnDefault("'0'")
    @Column(name = "ItemLevel", columnDefinition = "smallint UNSIGNED not null")
    @Db2Field(fieldIndex = 12, type = Db2Type.SHORT)
    private Integer itemLevel;

    @ColumnDefault("0")
    @Column(name = "Flags1", nullable = false)
    @Db2Field(fieldIndex = 13, type = Db2Type.INT, signed = true)
    private Integer flags1;

    @ColumnDefault("0")
    @Column(name = "Flags2", nullable = false)
    @Db2Field(fieldIndex = 14, type = Db2Type.INT, signed = true)
    private Integer flags2;

    @ColumnDefault("0")
    @Column(name = "Flags3", nullable = false)
    @Db2Field(fieldIndex = 15, type = Db2Type.INT, signed = true)
    private Integer flags3;

    @ColumnDefault("0")
    @Column(name = "Flags4", nullable = false)
    @Db2Field(fieldIndex = 16, type = Db2Type.INT, signed = true)
    private Integer flags4;

}