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
@Table(name = "char_sections")
@Db2File(name = "CharSections.db2", layoutHash = 0xE349E55B)
public class CharSection implements DbcEntity {
    @Id
    @ColumnDefault("'0'")
    @Column(name = "ID", columnDefinition = "int UNSIGNED not null")
    @Db2Field(fieldIndex = 0, type = Db2Type.INT)
    private Integer id;


    @Column(name = "MaterialResourcesID1")
    @Db2Field(fieldIndex = 1, type = Db2Type.INT, signed = true)
    private Integer materialResourcesID1;


    @Column(name = "MaterialResourcesID2")
    @Db2Field(fieldIndex = 2, type = Db2Type.INT, signed = true)
    private Integer materialResourcesID2;


    @Column(name = "MaterialResourcesID3")
    @Db2Field(fieldIndex = 3, type = Db2Type.INT, signed = true)
    private Integer materialResourcesID3;


    @Column(name = "Flags")
    @Db2Field(fieldIndex = 4, type = Db2Type.SHORT, signed = true)
    private Short flags;


    @Column(name = "RaceID")
    @Db2Field(fieldIndex = 5, type = Db2Type.BYTE, signed = true)
    private Byte raceID;


    @Column(name = "SexID")
    @Db2Field(fieldIndex = 6, type = Db2Type.BYTE, signed = true)
    private Byte sexID;


    @Column(name = "BaseSection")
    @Db2Field(fieldIndex = 7, type = Db2Type.BYTE, signed = true)
    private Byte baseSection;


    @Column(name = "VariationIndex")
    @Db2Field(fieldIndex = 8, type = Db2Type.BYTE, signed = true)
    private Byte variationIndex;


    @Column(name = "ColorIndex")
    @Db2Field(fieldIndex = 9, type = Db2Type.BYTE, signed = true)
    private Byte colorIndex;

    @Id
    @ColumnDefault("0")
    @Column(name = "VerifiedBuild", nullable = false)
    private Integer verifiedBuild;


}
