package com.github.jtrinity.hotfixes.domain;

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
public class SoundKit {
    @Id
    @ColumnDefault("'0'")
    @Column(name = "ID", columnDefinition = "int UNSIGNED not null")
    private Integer id;

    @Id
    @ColumnDefault("0")
    @Column(name = "VerifiedBuild", nullable = false)
    private Integer verifiedBuild;

    @ColumnDefault("'0'")
    @Column(name = "SoundType", columnDefinition = "tinyint UNSIGNED not null")
    private Short soundType;

    @ColumnDefault("0")
    @Column(name = "VolumeFloat", nullable = false)
    private Float volumeFloat;

    @ColumnDefault("0")
    @Column(name = "Flags", nullable = false)
    private Integer flags;

    @ColumnDefault("0")
    @Column(name = "MinDistance", nullable = false)
    private Float minDistance;

    @ColumnDefault("0")
    @Column(name = "DistanceCutoff", nullable = false)
    private Float distanceCutoff;

    @ColumnDefault("'0'")
    @Column(name = "EAXDef", columnDefinition = "tinyint UNSIGNED not null")
    private Short eAXDef;

    @ColumnDefault("'0'")
    @Column(name = "SoundKitAdvancedID", columnDefinition = "int UNSIGNED not null")
    private Long soundKitAdvancedID;

    @ColumnDefault("0")
    @Column(name = "VolumeVariationPlus", nullable = false)
    private Float volumeVariationPlus;

    @ColumnDefault("0")
    @Column(name = "VolumeVariationMinus", nullable = false)
    private Float volumeVariationMinus;

    @ColumnDefault("0")
    @Column(name = "PitchVariationPlus", nullable = false)
    private Float pitchVariationPlus;

    @ColumnDefault("0")
    @Column(name = "PitchVariationMinus", nullable = false)
    private Float pitchVariationMinus;

    @ColumnDefault("0")
    @Column(name = "DialogType", nullable = false)
    private Byte dialogType;

    @ColumnDefault("0")
    @Column(name = "PitchAdjust", nullable = false)
    private Float pitchAdjust;

    @ColumnDefault("'0'")
    @Column(name = "BusOverwriteID", columnDefinition = "smallint UNSIGNED not null")
    private Integer busOverwriteID;

    @ColumnDefault("'0'")
    @Column(name = "MaxInstances", columnDefinition = "tinyint UNSIGNED not null")
    private Short maxInstances;

    @ColumnDefault("'0'")
    @Column(name = "SoundMixGroupID", columnDefinition = "int UNSIGNED not null")
    private Long soundMixGroupID;

}