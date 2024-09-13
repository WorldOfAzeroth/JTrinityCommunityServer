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
@Table(name = "spell_scaling")
@Db2File(name = "SpellScaling.db2", fileDataId = 1139940, layoutHash = 0x0308E06A)
public class SpellScaling {
    @Id
    @ColumnDefault("'0'")
    @Column(name = "ID", columnDefinition = "int UNSIGNED not null")
    @Db2Field(fieldIndex = 0, type = Db2Type.INT)
    private Long id;

    @Id
    @ColumnDefault("0")
    @Column(name = "VerifiedBuild", nullable = false)
    private Integer verifiedBuild;

    @ColumnDefault("0")
    @Column(name = "SpellID", nullable = false)
    @Db2Field(fieldIndex = 1, type = Db2Type.INT, signed = true)
    private Integer spellID;

    @ColumnDefault("0")
    @Column(name = "Class", nullable = false)
    @Db2Field(fieldIndex = 2, type = Db2Type.INT, signed = true)
    private Integer classField;

    @ColumnDefault("'0'")
    @Column(name = "MinScalingLevel", columnDefinition = "int UNSIGNED not null")
    @Db2Field(fieldIndex = 3, type = Db2Type.INT)
    private Long minScalingLevel;

    @ColumnDefault("'0'")
    @Column(name = "MaxScalingLevel", columnDefinition = "int UNSIGNED not null")
    @Db2Field(fieldIndex = 4, type = Db2Type.INT)
    private Long maxScalingLevel;

    @ColumnDefault("0")
    @Column(name = "ScalesFromItemLevel", nullable = false)
    @Db2Field(fieldIndex = 5, type = Db2Type.SHORT, signed = true)
    private Short scalesFromItemLevel;

    @ColumnDefault("0")
    @Column(name = "CastTimeMin", nullable = false)
    @Db2Field(fieldIndex = 6, type = Db2Type.INT, signed = true)
    private Integer castTimeMin;

    @ColumnDefault("0")
    @Column(name = "CastTimeMax", nullable = false)
    @Db2Field(fieldIndex = 7, type = Db2Type.INT, signed = true)
    private Integer castTimeMax;

    @ColumnDefault("0")
    @Column(name = "CastTimeMaxLevel", nullable = false)
    @Db2Field(fieldIndex = 8, type = Db2Type.INT, signed = true)
    private Integer castTimeMaxLevel;

    @ColumnDefault("0")
    @Column(name = "NerfFactor", nullable = false)
    @Db2Field(fieldIndex = 9, type = Db2Type.FLOAT)
    private Float nerfFactor;

    @ColumnDefault("0")
    @Column(name = "NerfMaxLevel", nullable = false)
    @Db2Field(fieldIndex = 10, type = Db2Type.INT, signed = true)
    private Integer nerfMaxLevel;

}