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
@Table(name = "spell_misc")
@Db2File(name = "SpellMisc.db2", fileDataId = 1003144, layoutHash = 0x316AB86A, parentIndexField = 13)
public class SpellMisc {
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
    @Column(name = "Attributes1", nullable = false)
    @Db2Field(fieldIndex = 1, type = Db2Type.INT, signed = true)
    private Integer attributes1;

    @ColumnDefault("0")
    @Column(name = "Attributes2", nullable = false)
    @Db2Field(fieldIndex = 2, type = Db2Type.INT, signed = true)
    private Integer attributes2;

    @ColumnDefault("0")
    @Column(name = "Attributes3", nullable = false)
    @Db2Field(fieldIndex = 3, type = Db2Type.INT, signed = true)
    private Integer attributes3;

    @ColumnDefault("0")
    @Column(name = "Attributes4", nullable = false)
    @Db2Field(fieldIndex = 4, type = Db2Type.INT, signed = true)
    private Integer attributes4;

    @ColumnDefault("0")
    @Column(name = "Attributes5", nullable = false)
    @Db2Field(fieldIndex = 5, type = Db2Type.INT, signed = true)
    private Integer attributes5;

    @ColumnDefault("0")
    @Column(name = "Attributes6", nullable = false)
    @Db2Field(fieldIndex = 6, type = Db2Type.INT, signed = true)
    private Integer attributes6;

    @ColumnDefault("0")
    @Column(name = "Attributes7", nullable = false)
    @Db2Field(fieldIndex = 7, type = Db2Type.INT, signed = true)
    private Integer attributes7;

    @ColumnDefault("0")
    @Column(name = "Attributes8", nullable = false)
    @Db2Field(fieldIndex = 8, type = Db2Type.INT, signed = true)
    private Integer attributes8;

    @ColumnDefault("0")
    @Column(name = "Attributes9", nullable = false)
    @Db2Field(fieldIndex = 9, type = Db2Type.INT, signed = true)
    private Integer attributes9;

    @ColumnDefault("0")
    @Column(name = "Attributes10", nullable = false)
    @Db2Field(fieldIndex = 10, type = Db2Type.INT, signed = true)
    private Integer attributes10;

    @ColumnDefault("0")
    @Column(name = "Attributes11", nullable = false)
    @Db2Field(fieldIndex = 11, type = Db2Type.INT, signed = true)
    private Integer attributes11;

    @ColumnDefault("0")
    @Column(name = "Attributes12", nullable = false)
    @Db2Field(fieldIndex = 12, type = Db2Type.INT, signed = true)
    private Integer attributes12;

    @ColumnDefault("0")
    @Column(name = "Attributes13", nullable = false)
    @Db2Field(fieldIndex = 13, type = Db2Type.INT, signed = true)
    private Integer attributes13;

    @ColumnDefault("0")
    @Column(name = "Attributes14", nullable = false)
    @Db2Field(fieldIndex = 14, type = Db2Type.INT, signed = true)
    private Integer attributes14;

    @ColumnDefault("0")
    @Column(name = "Attributes15", nullable = false)
    @Db2Field(fieldIndex = 15, type = Db2Type.INT, signed = true)
    private Integer attributes15;

    @ColumnDefault("'0'")
    @Column(name = "DifficultyID", columnDefinition = "tinyint UNSIGNED not null")
    @Db2Field(fieldIndex = 16, type = Db2Type.BYTE)
    private Short difficultyID;

    @ColumnDefault("'0'")
    @Column(name = "CastingTimeIndex", columnDefinition = "smallint UNSIGNED not null")
    @Db2Field(fieldIndex = 17, type = Db2Type.SHORT)
    private Integer castingTimeIndex;

    @ColumnDefault("'0'")
    @Column(name = "DurationIndex", columnDefinition = "smallint UNSIGNED not null")
    @Db2Field(fieldIndex = 18, type = Db2Type.SHORT)
    private Integer durationIndex;

    @ColumnDefault("'0'")
    @Column(name = "RangeIndex", columnDefinition = "smallint UNSIGNED not null")
    @Db2Field(fieldIndex = 19, type = Db2Type.SHORT)
    private Integer rangeIndex;

    @ColumnDefault("'0'")
    @Column(name = "SchoolMask", columnDefinition = "tinyint UNSIGNED not null")
    @Db2Field(fieldIndex = 20, type = Db2Type.BYTE)
    private Short schoolMask;

    @ColumnDefault("0")
    @Column(name = "Speed", nullable = false)
    @Db2Field(fieldIndex = 21, type = Db2Type.FLOAT)
    private Float speed;

    @ColumnDefault("0")
    @Column(name = "LaunchDelay", nullable = false)
    @Db2Field(fieldIndex = 22, type = Db2Type.FLOAT)
    private Float launchDelay;

    @ColumnDefault("0")
    @Column(name = "MinDuration", nullable = false)
    @Db2Field(fieldIndex = 23, type = Db2Type.FLOAT)
    private Float minDuration;

    @ColumnDefault("0")
    @Column(name = "SpellIconFileDataID", nullable = false)
    @Db2Field(fieldIndex = 24, type = Db2Type.INT, signed = true)
    private Integer spellIconFileDataID;

    @ColumnDefault("0")
    @Column(name = "ActiveIconFileDataID", nullable = false)
    @Db2Field(fieldIndex = 25, type = Db2Type.INT, signed = true)
    private Integer activeIconFileDataID;

    @ColumnDefault("0")
    @Column(name = "ContentTuningID", nullable = false)
    @Db2Field(fieldIndex = 26, type = Db2Type.INT, signed = true)
    private Integer contentTuningID;

    @ColumnDefault("0")
    @Column(name = "ShowFutureSpellPlayerConditionID", nullable = false)
    @Db2Field(fieldIndex = 27, type = Db2Type.INT, signed = true)
    private Integer showFutureSpellPlayerConditionID;

    @ColumnDefault("'0'")
    @Column(name = "SpellID", columnDefinition = "int UNSIGNED not null")
    @Db2Field(fieldIndex = 28, type = Db2Type.INT)
    private Long spellID;

}