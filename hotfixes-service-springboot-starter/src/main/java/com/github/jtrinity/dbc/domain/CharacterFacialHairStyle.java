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
@Table(name = "character_facial_hair_styles")
@Db2File(name = "CharacterFacialHairStyles.db2", layoutHash = 0x47D79688)
public class CharacterFacialHairStyle implements DbcEntity {
    @Id
    @ColumnDefault("'0'")
    @Column(name = "ID", columnDefinition = "int UNSIGNED not null")
    @Db2Field(fieldIndex = 0, type = Db2Type.INT)
    private Integer id;


    @Column(name = "Geoset1")
    @Db2Field(fieldIndex = 1, type = Db2Type.INT, signed = true)
    private Integer geoset1;


    @Column(name = "Geoset2")
    @Db2Field(fieldIndex = 2, type = Db2Type.INT, signed = true)
    private Integer geoset2;


    @Column(name = "Geoset3")
    @Db2Field(fieldIndex = 3, type = Db2Type.INT, signed = true)
    private Integer geoset3;


    @Column(name = "Geoset4")
    @Db2Field(fieldIndex = 4, type = Db2Type.INT, signed = true)
    private Integer geoset4;


    @Column(name = "Geoset5")
    @Db2Field(fieldIndex = 5, type = Db2Type.INT, signed = true)
    private Integer geoset5;


    @Column(name = "RaceID")
    @Db2Field(fieldIndex = 6, type = Db2Type.BYTE)
    private Byte raceID;


    @Column(name = "SexID")
    @Db2Field(fieldIndex = 7, type = Db2Type.BYTE)
    private Byte sexID;


    @Column(name = "VariationID")
    @Db2Field(fieldIndex = 8, type = Db2Type.BYTE)
    private Byte variationID;

    @Id
    @ColumnDefault("0")
    @Column(name = "VerifiedBuild", nullable = false)
    private Integer verifiedBuild;


}
