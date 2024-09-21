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
@Table(name = "difficulty")
@Db2File(name = "Difficulty.db2", layoutHash = 0x92302BB8)
public class Difficulty implements DbcEntity {
    @Id
    @ColumnDefault("'0'")
    @Column(name = "ID", columnDefinition = "int UNSIGNED not null")
    @Db2Field(fieldIndex = 0, type = Db2Type.INT)
    private Integer id;


    @Column(name = "Name")
    @Db2Field(fieldIndex = 1, type = Db2Type.STRING)
    private LocalizedString name;


    @Column(name = "GroupSizeHealthCurveID")
    @Db2Field(fieldIndex = 2, type = Db2Type.SHORT)
    private Short groupSizeHealthCurveID;


    @Column(name = "GroupSizeDmgCurveID")
    @Db2Field(fieldIndex = 3, type = Db2Type.SHORT)
    private Short groupSizeDmgCurveID;


    @Column(name = "GroupSizeSpellPointsCurveID")
    @Db2Field(fieldIndex = 4, type = Db2Type.SHORT)
    private Short groupSizeSpellPointsCurveID;


    @Column(name = "FallbackDifficultyID")
    @Db2Field(fieldIndex = 5, type = Db2Type.BYTE)
    private Byte fallbackDifficultyID;


    @Column(name = "InstanceType")
    @Db2Field(fieldIndex = 6, type = Db2Type.BYTE)
    private Byte instanceType;


    @Column(name = "MinPlayers")
    @Db2Field(fieldIndex = 7, type = Db2Type.BYTE)
    private Byte minPlayers;


    @Column(name = "MaxPlayers")
    @Db2Field(fieldIndex = 8, type = Db2Type.BYTE)
    private Byte maxPlayers;


    @Column(name = "OldEnumValue")
    @Db2Field(fieldIndex = 9, type = Db2Type.BYTE, signed = true)
    private Byte oldEnumValue;


    @Column(name = "Flags")
    @Db2Field(fieldIndex = 10, type = Db2Type.BYTE)
    private Byte flags;


    @Column(name = "ToggleDifficultyID")
    @Db2Field(fieldIndex = 11, type = Db2Type.BYTE)
    private Byte toggleDifficultyID;


    @Column(name = "ItemContext")
    @Db2Field(fieldIndex = 12, type = Db2Type.BYTE)
    private Byte itemContext;


    @Column(name = "OrderIndex")
    @Db2Field(fieldIndex = 13, type = Db2Type.BYTE)
    private Byte orderIndex;

    @Id
    @ColumnDefault("0")
    @Column(name = "VerifiedBuild", nullable = false)
    private Integer verifiedBuild;


}
