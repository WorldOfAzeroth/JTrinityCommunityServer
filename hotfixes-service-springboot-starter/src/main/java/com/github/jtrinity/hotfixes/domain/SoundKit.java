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
@Table(name = "sound_kit")
@Db2File(name = "SoundKit.db2", fileDataId = 1237434, layoutHash = 0x5BA5D1BB, indexField = 0)
public class SoundKit {
    @Id
    @ColumnDefault("'0'")
    @Column(name = "ID", columnDefinition = "int UNSIGNED not null")
    @Db2Field(fieldIndex = 0, type = Db2Type.INT)
    private Integer id;

    @Id
    @ColumnDefault("0")
    @Column(name = "VerifiedBuild", nullable = false)
    private Integer verifiedBuild;

    @ColumnDefault("'0'")
    @Column(name = "SoundType", columnDefinition = "tinyint UNSIGNED not null")
    @Db2Field(fieldIndex = 1, type = Db2Type.BYTE)
    private Short soundType;

    @ColumnDefault("0")
    @Column(name = "VolumeFloat", nullable = false)
    @Db2Field(fieldIndex = 2, type = Db2Type.FLOAT)
    private Float volumeFloat;

    @ColumnDefault("0")
    @Column(name = "Flags", nullable = false)
    @Db2Field(fieldIndex = 3, type = Db2Type.INT, signed = true)
    private Integer flags;

    @ColumnDefault("0")
    @Column(name = "MinDistance", nullable = false)
    @Db2Field(fieldIndex = 4, type = Db2Type.FLOAT)
    private Float minDistance;

    @ColumnDefault("0")
    @Column(name = "DistanceCutoff", nullable = false)
    @Db2Field(fieldIndex = 5, type = Db2Type.FLOAT)
    private Float distanceCutoff;

    @ColumnDefault("'0'")
    @Column(name = "EAXDef", columnDefinition = "tinyint UNSIGNED not null")
    @Db2Field(fieldIndex = 6, type = Db2Type.BYTE)
    private Short eAXDef;

    @ColumnDefault("'0'")
    @Column(name = "SoundKitAdvancedID", columnDefinition = "int UNSIGNED not null")
    @Db2Field(fieldIndex = 7, type = Db2Type.INT)
    private Long soundKitAdvancedID;

    @ColumnDefault("0")
    @Column(name = "VolumeVariationPlus", nullable = false)
    @Db2Field(fieldIndex = 8, type = Db2Type.FLOAT)
    private Float volumeVariationPlus;

    @ColumnDefault("0")
    @Column(name = "VolumeVariationMinus", nullable = false)
    @Db2Field(fieldIndex = 9, type = Db2Type.FLOAT)
    private Float volumeVariationMinus;

    @ColumnDefault("0")
    @Column(name = "PitchVariationPlus", nullable = false)
    @Db2Field(fieldIndex = 10, type = Db2Type.FLOAT)
    private Float pitchVariationPlus;

    @ColumnDefault("0")
    @Column(name = "PitchVariationMinus", nullable = false)
    @Db2Field(fieldIndex = 11, type = Db2Type.FLOAT)
    private Float pitchVariationMinus;

    @ColumnDefault("0")
    @Column(name = "DialogType", nullable = false)
    @Db2Field(fieldIndex = 12, type = Db2Type.BYTE, signed = true)
    private Byte dialogType;

    @ColumnDefault("0")
    @Column(name = "PitchAdjust", nullable = false)
    @Db2Field(fieldIndex = 13, type = Db2Type.FLOAT)
    private Float pitchAdjust;

    @ColumnDefault("'0'")
    @Column(name = "BusOverwriteID", columnDefinition = "smallint UNSIGNED not null")
    @Db2Field(fieldIndex = 14, type = Db2Type.SHORT)
    private Integer busOverwriteID;

    @ColumnDefault("'0'")
    @Column(name = "MaxInstances", columnDefinition = "tinyint UNSIGNED not null")
    @Db2Field(fieldIndex = 15, type = Db2Type.BYTE)
    private Short maxInstances;

    @ColumnDefault("'0'")
    @Column(name = "SoundMixGroupID", columnDefinition = "int UNSIGNED not null")
    @Db2Field(fieldIndex = 16, type = Db2Type.INT)
    private Long soundMixGroupID;

}