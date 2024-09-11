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
@Table(name = "creature_display_info")
public class CreatureDisplayInfo {
    @Id
    @ColumnDefault("'0'")
    @Column(name = "ID", columnDefinition = "int UNSIGNED not null")
    private Integer id;

    @Id
    @ColumnDefault("0")
    @Column(name = "VerifiedBuild", nullable = false)
    private Integer verifiedBuild;

    @ColumnDefault("'0'")
    @Column(name = "ModelID", columnDefinition = "smallint UNSIGNED not null")
    private Integer modelID;

    @ColumnDefault("'0'")
    @Column(name = "SoundID", columnDefinition = "smallint UNSIGNED not null")
    private Integer soundID;

    @ColumnDefault("0")
    @Column(name = "SizeClass", nullable = false)
    private Byte sizeClass;

    @ColumnDefault("0")
    @Column(name = "CreatureModelScale", nullable = false)
    private Float creatureModelScale;

    @ColumnDefault("'0'")
    @Column(name = "CreatureModelAlpha", columnDefinition = "tinyint UNSIGNED not null")
    private Short creatureModelAlpha;

    @ColumnDefault("'0'")
    @Column(name = "BloodID", columnDefinition = "tinyint UNSIGNED not null")
    private Short bloodID;

    @ColumnDefault("0")
    @Column(name = "ExtendedDisplayInfoID", nullable = false)
    private Integer extendedDisplayInfoID;

    @ColumnDefault("'0'")
    @Column(name = "NPCSoundID", columnDefinition = "smallint UNSIGNED not null")
    private Integer nPCSoundID;

    @ColumnDefault("'0'")
    @Column(name = "ParticleColorID", columnDefinition = "smallint UNSIGNED not null")
    private Integer particleColorID;

    @ColumnDefault("0")
    @Column(name = "PortraitCreatureDisplayInfoID", nullable = false)
    private Integer portraitCreatureDisplayInfoID;

    @ColumnDefault("0")
    @Column(name = "PortraitTextureFileDataID", nullable = false)
    private Integer portraitTextureFileDataID;

    @ColumnDefault("'0'")
    @Column(name = "ObjectEffectPackageID", columnDefinition = "smallint UNSIGNED not null")
    private Integer objectEffectPackageID;

    @ColumnDefault("'0'")
    @Column(name = "AnimReplacementSetID", columnDefinition = "smallint UNSIGNED not null")
    private Integer animReplacementSetID;

    @ColumnDefault("'0'")
    @Column(name = "Flags", columnDefinition = "tinyint UNSIGNED not null")
    private Short flags;

    @ColumnDefault("0")
    @Column(name = "StateSpellVisualKitID", nullable = false)
    private Integer stateSpellVisualKitID;

    @ColumnDefault("0")
    @Column(name = "PlayerOverrideScale", nullable = false)
    private Float playerOverrideScale;

    @ColumnDefault("0")
    @Column(name = "PetInstanceScale", nullable = false)
    private Float petInstanceScale;

    @ColumnDefault("0")
    @Column(name = "UnarmedWeaponType", nullable = false)
    private Byte unarmedWeaponType;

    @ColumnDefault("0")
    @Column(name = "MountPoofSpellVisualKitID", nullable = false)
    private Integer mountPoofSpellVisualKitID;

    @ColumnDefault("0")
    @Column(name = "DissolveEffectID", nullable = false)
    private Integer dissolveEffectID;

    @ColumnDefault("0")
    @Column(name = "Gender", nullable = false)
    private Byte gender;

    @ColumnDefault("0")
    @Column(name = "DissolveOutEffectID", nullable = false)
    private Integer dissolveOutEffectID;

    @ColumnDefault("0")
    @Column(name = "CreatureModelMinLod", nullable = false)
    private Byte creatureModelMinLod;

    @ColumnDefault("0")
    @Column(name = "TextureVariationFileDataID1", nullable = false)
    private Integer textureVariationFileDataID1;

    @ColumnDefault("0")
    @Column(name = "TextureVariationFileDataID2", nullable = false)
    private Integer textureVariationFileDataID2;

    @ColumnDefault("0")
    @Column(name = "TextureVariationFileDataID3", nullable = false)
    private Integer textureVariationFileDataID3;

    @ColumnDefault("0")
    @Column(name = "TextureVariationFileDataID4", nullable = false)
    private Integer textureVariationFileDataID4;

}