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
@Table(name = "creature_family")
@Db2File(name = "CreatureFamily.db2", layoutHash = 0xE2DC5126)
public class CreatureFamily implements DbcEntity {
    @Id
    @ColumnDefault("'0'")
    @Column(name = "ID", columnDefinition = "int UNSIGNED not null")
    @Db2Field(fieldIndex = 0, type = Db2Type.INT)
    private Integer id;


    @Column(name = "Name")
    @Db2Field(fieldIndex = 1, type = Db2Type.STRING)
    private LocalizedString name;


    @Column(name = "MinScale")
    @Db2Field(fieldIndex = 2, type = Db2Type.FLOAT)
    private Float minScale;


    @Column(name = "MaxScale")
    @Db2Field(fieldIndex = 3, type = Db2Type.FLOAT)
    private Float maxScale;


    @Column(name = "IconFileID")
    @Db2Field(fieldIndex = 4, type = Db2Type.INT, signed = true)
    private Integer iconFileID;


    @Column(name = "SkillLine1")
    @Db2Field(fieldIndex = 5, type = Db2Type.SHORT, signed = true)
    private Short skillLine1;


    @Column(name = "SkillLine2")
    @Db2Field(fieldIndex = 6, type = Db2Type.SHORT, signed = true)
    private Short skillLine2;


    @Column(name = "PetFoodMask")
    @Db2Field(fieldIndex = 7, type = Db2Type.SHORT, signed = true)
    private Short petFoodMask;


    @Column(name = "MinScaleLevel")
    @Db2Field(fieldIndex = 8, type = Db2Type.BYTE, signed = true)
    private Byte minScaleLevel;


    @Column(name = "MaxScaleLevel")
    @Db2Field(fieldIndex = 9, type = Db2Type.BYTE, signed = true)
    private Byte maxScaleLevel;


    @Column(name = "PetTalentType")
    @Db2Field(fieldIndex = 10, type = Db2Type.BYTE, signed = true)
    private Byte petTalentType;

    @Id
    @ColumnDefault("0")
    @Column(name = "VerifiedBuild", nullable = false)
    private Integer verifiedBuild;


}
