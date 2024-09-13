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
@Table(name = "creature_display_info")
@Db2File(name = "CreatureDisplayInfo.db2", fileDataId = 1108759, layoutHash = 0xC99CB5F9, indexField = 0)
public class CreatureDisplayInfo {
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
    @Column(name = "ModelID", columnDefinition = "smallint UNSIGNED not null")
    @Db2Field(fieldIndex = 1, type = Db2Type.SHORT)
    private Integer modelID;

    @ColumnDefault("'0'")
    @Column(name = "SoundID", columnDefinition = "smallint UNSIGNED not null")
    @Db2Field(fieldIndex = 2, type = Db2Type.SHORT)
    private Integer soundID;

    @ColumnDefault("0")
    @Column(name = "SizeClass", nullable = false)
    @Db2Field(fieldIndex = 3, type = Db2Type.BYTE, signed = true)
    private Byte sizeClass;

    @ColumnDefault("0")
    @Column(name = "CreatureModelScale", nullable = false)
    @Db2Field(fieldIndex = 4, type = Db2Type.FLOAT)
    private Float creatureModelScale;

    @ColumnDefault("'0'")
    @Column(name = "CreatureModelAlpha", columnDefinition = "tinyint UNSIGNED not null")
    @Db2Field(fieldIndex = 5, type = Db2Type.BYTE)
    private Short creatureModelAlpha;

    @ColumnDefault("'0'")
    @Column(name = "BloodID", columnDefinition = "tinyint UNSIGNED not null")
    @Db2Field(fieldIndex = 6, type = Db2Type.BYTE)
    private Short bloodID;

    @ColumnDefault("0")
    @Column(name = "ExtendedDisplayInfoID", nullable = false)
    @Db2Field(fieldIndex = 7, type = Db2Type.INT, signed = true)
    private Integer extendedDisplayInfoID;

    @ColumnDefault("'0'")
    @Column(name = "NPCSoundID", columnDefinition = "smallint UNSIGNED not null")
    @Db2Field(fieldIndex = 8, type = Db2Type.SHORT)
    private Integer nPCSoundID;

    @ColumnDefault("'0'")
    @Column(name = "ParticleColorID", columnDefinition = "smallint UNSIGNED not null")
    @Db2Field(fieldIndex = 9, type = Db2Type.SHORT)
    private Integer particleColorID;

    @ColumnDefault("0")
    @Column(name = "PortraitCreatureDisplayInfoID", nullable = false)
    @Db2Field(fieldIndex = 10, type = Db2Type.INT, signed = true)
    private Integer portraitCreatureDisplayInfoID;

    @ColumnDefault("0")
    @Column(name = "PortraitTextureFileDataID", nullable = false)
    @Db2Field(fieldIndex = 11, type = Db2Type.INT, signed = true)
    private Integer portraitTextureFileDataID;

    @ColumnDefault("'0'")
    @Column(name = "ObjectEffectPackageID", columnDefinition = "smallint UNSIGNED not null")
    @Db2Field(fieldIndex = 12, type = Db2Type.SHORT)
    private Integer objectEffectPackageID;

    @ColumnDefault("'0'")
    @Column(name = "AnimReplacementSetID", columnDefinition = "smallint UNSIGNED not null")
    @Db2Field(fieldIndex = 13, type = Db2Type.SHORT)
    private Integer animReplacementSetID;

    @ColumnDefault("'0'")
    @Column(name = "Flags", columnDefinition = "tinyint UNSIGNED not null")
    @Db2Field(fieldIndex = 14, type = Db2Type.BYTE)
    private Short flags;

    @ColumnDefault("0")
    @Column(name = "StateSpellVisualKitID", nullable = false)
    @Db2Field(fieldIndex = 15, type = Db2Type.INT, signed = true)
    private Integer stateSpellVisualKitID;

    @ColumnDefault("0")
    @Column(name = "PlayerOverrideScale", nullable = false)
    @Db2Field(fieldIndex = 16, type = Db2Type.FLOAT)
    private Float playerOverrideScale;

    @ColumnDefault("0")
    @Column(name = "PetInstanceScale", nullable = false)
    @Db2Field(fieldIndex = 17, type = Db2Type.FLOAT)
    private Float petInstanceScale;

    @ColumnDefault("0")
    @Column(name = "UnarmedWeaponType", nullable = false)
    @Db2Field(fieldIndex = 18, type = Db2Type.BYTE, signed = true)
    private Byte unarmedWeaponType;

    @ColumnDefault("0")
    @Column(name = "MountPoofSpellVisualKitID", nullable = false)
    @Db2Field(fieldIndex = 19, type = Db2Type.INT, signed = true)
    private Integer mountPoofSpellVisualKitID;

    @ColumnDefault("0")
    @Column(name = "DissolveEffectID", nullable = false)
    @Db2Field(fieldIndex = 20, type = Db2Type.INT, signed = true)
    private Integer dissolveEffectID;

    @ColumnDefault("0")
    @Column(name = "Gender", nullable = false)
    @Db2Field(fieldIndex = 21, type = Db2Type.BYTE, signed = true)
    private Byte gender;

    @ColumnDefault("0")
    @Column(name = "DissolveOutEffectID", nullable = false)
    @Db2Field(fieldIndex = 22, type = Db2Type.INT, signed = true)
    private Integer dissolveOutEffectID;

    @ColumnDefault("0")
    @Column(name = "CreatureModelMinLod", nullable = false)
    @Db2Field(fieldIndex = 23, type = Db2Type.BYTE, signed = true)
    private Byte creatureModelMinLod;

    @ColumnDefault("0")
    @Column(name = "TextureVariationFileDataID1", nullable = false)
    @Db2Field(fieldIndex = 24, type = Db2Type.INT, signed = true)
    private Integer textureVariationFileDataID1;

    @ColumnDefault("0")
    @Column(name = "TextureVariationFileDataID2", nullable = false)
    @Db2Field(fieldIndex = 25, type = Db2Type.INT, signed = true)
    private Integer textureVariationFileDataID2;

    @ColumnDefault("0")
    @Column(name = "TextureVariationFileDataID3", nullable = false)
    @Db2Field(fieldIndex = 26, type = Db2Type.INT, signed = true)
    private Integer textureVariationFileDataID3;

    @ColumnDefault("0")
    @Column(name = "TextureVariationFileDataID4", nullable = false)
    @Db2Field(fieldIndex = 27, type = Db2Type.INT, signed = true)
    private Integer textureVariationFileDataID4;

}