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
@Table(name = "sound_kit")
@Db2File(name = "SoundKit.db2", layoutHash = 0x0E9CB7AE, indexField = 0)
public class SoundKit implements DbcEntity {
    @Id
    @ColumnDefault("'0'")
    @Column(name = "ID", columnDefinition = "int UNSIGNED not null")
    @Db2Field(fieldIndex = 0, type = Db2Type.INT)
    private Integer id;


    @Column(name = "VolumeFloat")
    @Db2Field(fieldIndex = 1, type = Db2Type.FLOAT)
    private Float volumeFloat;


    @Column(name = "MinDistance")
    @Db2Field(fieldIndex = 2, type = Db2Type.FLOAT)
    private Float minDistance;


    @Column(name = "DistanceCutoff")
    @Db2Field(fieldIndex = 3, type = Db2Type.FLOAT)
    private Float distanceCutoff;


    @Column(name = "Flags")
    @Db2Field(fieldIndex = 4, type = Db2Type.SHORT)
    private Short flags;


    @Column(name = "SoundEntriesAdvancedID")
    @Db2Field(fieldIndex = 5, type = Db2Type.SHORT)
    private Short soundEntriesAdvancedID;


    @Column(name = "SoundType")
    @Db2Field(fieldIndex = 6, type = Db2Type.BYTE)
    private Byte soundType;


    @Column(name = "DialogType")
    @Db2Field(fieldIndex = 7, type = Db2Type.BYTE)
    private Byte dialogType;


    @Column(name = "EAXDef")
    @Db2Field(fieldIndex = 8, type = Db2Type.BYTE)
    private Byte eAXDef;


    @Column(name = "VolumeVariationPlus")
    @Db2Field(fieldIndex = 9, type = Db2Type.FLOAT)
    private Float volumeVariationPlus;


    @Column(name = "VolumeVariationMinus")
    @Db2Field(fieldIndex = 10, type = Db2Type.FLOAT)
    private Float volumeVariationMinus;


    @Column(name = "PitchVariationPlus")
    @Db2Field(fieldIndex = 11, type = Db2Type.FLOAT)
    private Float pitchVariationPlus;


    @Column(name = "PitchVariationMinus")
    @Db2Field(fieldIndex = 12, type = Db2Type.FLOAT)
    private Float pitchVariationMinus;


    @Column(name = "PitchAdjust")
    @Db2Field(fieldIndex = 13, type = Db2Type.FLOAT)
    private Float pitchAdjust;


    @Column(name = "BusOverwriteID")
    @Db2Field(fieldIndex = 14, type = Db2Type.SHORT)
    private Short busOverwriteID;


    @Column(name = "MaxInstances")
    @Db2Field(fieldIndex = 15, type = Db2Type.BYTE)
    private Byte maxInstances;

    @Id
    @ColumnDefault("0")
    @Column(name = "VerifiedBuild", nullable = false)
    private Integer verifiedBuild;


}
