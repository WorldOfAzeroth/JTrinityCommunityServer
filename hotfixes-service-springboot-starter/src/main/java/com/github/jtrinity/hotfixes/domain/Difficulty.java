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
@Table(name = "difficulty")
@Db2File(name = "Difficulty.db2", fileDataId = 1352127, layoutHash = 0x3FE0C298)
public class Difficulty {
    @Id
    @ColumnDefault("'0'")
    @Column(name = "ID", columnDefinition = "int UNSIGNED not null")
    @Db2Field(fieldIndex = 0, type = Db2Type.INT)
    private Integer id;

    @Id
    @ColumnDefault("0")
    @Column(name = "VerifiedBuild", nullable = false)
    private Integer verifiedBuild;

    @Lob
    @Column(name = "Name")
    @Db2Field(fieldIndex = 1, type = Db2Type.STRING)
    private String name;

    @ColumnDefault("'0'")
    @Column(name = "InstanceType", columnDefinition = "tinyint UNSIGNED not null")
    @Db2Field(fieldIndex = 2, type = Db2Type.BYTE)
    private Short instanceType;

    @ColumnDefault("'0'")
    @Column(name = "OrderIndex", columnDefinition = "tinyint UNSIGNED not null")
    @Db2Field(fieldIndex = 3, type = Db2Type.BYTE)
    private Short orderIndex;

    @ColumnDefault("0")
    @Column(name = "OldEnumValue", nullable = false)
    @Db2Field(fieldIndex = 4, type = Db2Type.BYTE, signed = true)
    private Byte oldEnumValue;

    @ColumnDefault("'0'")
    @Column(name = "FallbackDifficultyID", columnDefinition = "tinyint UNSIGNED not null")
    @Db2Field(fieldIndex = 5, type = Db2Type.BYTE)
    private Short fallbackDifficultyID;

    @ColumnDefault("'0'")
    @Column(name = "MinPlayers", columnDefinition = "tinyint UNSIGNED not null")
    @Db2Field(fieldIndex = 6, type = Db2Type.BYTE)
    private Short minPlayers;

    @ColumnDefault("'0'")
    @Column(name = "MaxPlayers", columnDefinition = "tinyint UNSIGNED not null")
    @Db2Field(fieldIndex = 7, type = Db2Type.BYTE)
    private Short maxPlayers;

    @ColumnDefault("'0'")
    @Column(name = "Flags", columnDefinition = "tinyint UNSIGNED not null")
    @Db2Field(fieldIndex = 8, type = Db2Type.BYTE)
    private Short flags;

    @ColumnDefault("'0'")
    @Column(name = "ItemContext", columnDefinition = "tinyint UNSIGNED not null")
    @Db2Field(fieldIndex = 9, type = Db2Type.BYTE)
    private Short itemContext;

    @ColumnDefault("'0'")
    @Column(name = "ToggleDifficultyID", columnDefinition = "tinyint UNSIGNED not null")
    @Db2Field(fieldIndex = 10, type = Db2Type.BYTE)
    private Short toggleDifficultyID;

    @ColumnDefault("'0'")
    @Column(name = "GroupSizeHealthCurveID", columnDefinition = "smallint UNSIGNED not null")
    @Db2Field(fieldIndex = 11, type = Db2Type.SHORT)
    private Integer groupSizeHealthCurveID;

    @ColumnDefault("'0'")
    @Column(name = "GroupSizeDmgCurveID", columnDefinition = "smallint UNSIGNED not null")
    @Db2Field(fieldIndex = 12, type = Db2Type.SHORT)
    private Integer groupSizeDmgCurveID;

    @ColumnDefault("'0'")
    @Column(name = "GroupSizeSpellPointsCurveID", columnDefinition = "smallint UNSIGNED not null")
    @Db2Field(fieldIndex = 13, type = Db2Type.SHORT)
    private Integer groupSizeSpellPointsCurveID;

}