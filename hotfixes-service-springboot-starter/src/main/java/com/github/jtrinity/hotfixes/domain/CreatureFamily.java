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
@Table(name = "creature_family")
@Db2File(name = "CreatureFamily.db2", fileDataId = 1351351, layoutHash = 0x67175047)
public class CreatureFamily {
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

    @ColumnDefault("0")
    @Column(name = "MinScale", nullable = false)
    @Db2Field(fieldIndex = 2, type = Db2Type.FLOAT)
    private Float minScale;

    @ColumnDefault("0")
    @Column(name = "MinScaleLevel", nullable = false)
    @Db2Field(fieldIndex = 3, type = Db2Type.BYTE, signed = true)
    private Byte minScaleLevel;

    @ColumnDefault("0")
    @Column(name = "MaxScale", nullable = false)
    @Db2Field(fieldIndex = 4, type = Db2Type.FLOAT)
    private Float maxScale;

    @ColumnDefault("0")
    @Column(name = "MaxScaleLevel", nullable = false)
    @Db2Field(fieldIndex = 5, type = Db2Type.BYTE, signed = true)
    private Byte maxScaleLevel;

    @ColumnDefault("0")
    @Column(name = "PetFoodMask", nullable = false)
    @Db2Field(fieldIndex = 6, type = Db2Type.SHORT, signed = true)
    private Short petFoodMask;

    @ColumnDefault("0")
    @Column(name = "PetTalentType", nullable = false)
    @Db2Field(fieldIndex = 7, type = Db2Type.BYTE, signed = true)
    private Byte petTalentType;

    @ColumnDefault("0")
    @Column(name = "CategoryEnumID", nullable = false)
    @Db2Field(fieldIndex = 8, type = Db2Type.INT, signed = true)
    private Integer categoryEnumID;

    @ColumnDefault("0")
    @Column(name = "IconFileID", nullable = false)
    @Db2Field(fieldIndex = 9, type = Db2Type.INT, signed = true)
    private Integer iconFileID;

    @ColumnDefault("0")
    @Column(name = "SkillLine1", nullable = false)
    @Db2Field(fieldIndex = 10, type = Db2Type.SHORT, signed = true)
    private Short skillLine1;

    @ColumnDefault("0")
    @Column(name = "SkillLine2", nullable = false)
    @Db2Field(fieldIndex = 11, type = Db2Type.SHORT, signed = true)
    private Short skillLine2;

}