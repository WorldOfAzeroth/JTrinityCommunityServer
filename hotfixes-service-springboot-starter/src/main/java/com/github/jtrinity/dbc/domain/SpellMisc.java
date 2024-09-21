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
@Table(name = "spell_misc")
@Db2File(name = "SpellMisc.db2", layoutHash = 0xCDC114D5, parentIndexField = 10)
public class SpellMisc implements DbcEntity {
    @Id
    @ColumnDefault("'0'")
    @Column(name = "ID", columnDefinition = "int UNSIGNED not null")
    @Db2Field(fieldIndex = 0, type = Db2Type.INT)
    private Integer id;


    @Column(name = "CastingTimeIndex")
    @Db2Field(fieldIndex = 1, type = Db2Type.SHORT)
    private Short castingTimeIndex;


    @Column(name = "DurationIndex")
    @Db2Field(fieldIndex = 2, type = Db2Type.SHORT)
    private Short durationIndex;


    @Column(name = "RangeIndex")
    @Db2Field(fieldIndex = 3, type = Db2Type.SHORT)
    private Short rangeIndex;


    @Column(name = "SchoolMask")
    @Db2Field(fieldIndex = 4, type = Db2Type.BYTE)
    private Byte schoolMask;


    @Column(name = "SpellIconFileDataID")
    @Db2Field(fieldIndex = 5, type = Db2Type.INT, signed = true)
    private Integer spellIconFileDataID;


    @Column(name = "Speed")
    @Db2Field(fieldIndex = 6, type = Db2Type.FLOAT)
    private Float speed;


    @Column(name = "ActiveIconFileDataID")
    @Db2Field(fieldIndex = 7, type = Db2Type.INT, signed = true)
    private Integer activeIconFileDataID;


    @Column(name = "LaunchDelay")
    @Db2Field(fieldIndex = 8, type = Db2Type.FLOAT)
    private Float launchDelay;


    @Column(name = "DifficultyID")
    @Db2Field(fieldIndex = 9, type = Db2Type.BYTE)
    private Byte difficultyID;


    @Column(name = "Attributes1")
    @Db2Field(fieldIndex = 10, type = Db2Type.INT, signed = true)
    private Integer attributes1;


    @Column(name = "Attributes2")
    @Db2Field(fieldIndex = 11, type = Db2Type.INT, signed = true)
    private Integer attributes2;


    @Column(name = "Attributes3")
    @Db2Field(fieldIndex = 12, type = Db2Type.INT, signed = true)
    private Integer attributes3;


    @Column(name = "Attributes4")
    @Db2Field(fieldIndex = 13, type = Db2Type.INT, signed = true)
    private Integer attributes4;


    @Column(name = "Attributes5")
    @Db2Field(fieldIndex = 14, type = Db2Type.INT, signed = true)
    private Integer attributes5;


    @Column(name = "Attributes6")
    @Db2Field(fieldIndex = 15, type = Db2Type.INT, signed = true)
    private Integer attributes6;


    @Column(name = "Attributes7")
    @Db2Field(fieldIndex = 16, type = Db2Type.INT, signed = true)
    private Integer attributes7;


    @Column(name = "Attributes8")
    @Db2Field(fieldIndex = 17, type = Db2Type.INT, signed = true)
    private Integer attributes8;


    @Column(name = "Attributes9")
    @Db2Field(fieldIndex = 18, type = Db2Type.INT, signed = true)
    private Integer attributes9;


    @Column(name = "Attributes10")
    @Db2Field(fieldIndex = 19, type = Db2Type.INT, signed = true)
    private Integer attributes10;


    @Column(name = "Attributes11")
    @Db2Field(fieldIndex = 20, type = Db2Type.INT, signed = true)
    private Integer attributes11;


    @Column(name = "Attributes12")
    @Db2Field(fieldIndex = 21, type = Db2Type.INT, signed = true)
    private Integer attributes12;


    @Column(name = "Attributes13")
    @Db2Field(fieldIndex = 22, type = Db2Type.INT, signed = true)
    private Integer attributes13;


    @Column(name = "Attributes14")
    @Db2Field(fieldIndex = 23, type = Db2Type.INT, signed = true)
    private Integer attributes14;


    @Column(name = "SpellID")
    @Db2Field(fieldIndex = 24, type = Db2Type.INT, signed = true)
    private Integer spellID;

    @Id
    @ColumnDefault("0")
    @Column(name = "VerifiedBuild", nullable = false)
    private Integer verifiedBuild;


}
