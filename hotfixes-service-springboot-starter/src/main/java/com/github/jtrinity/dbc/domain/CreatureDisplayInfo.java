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
@Table(name = "creature_display_info")
@Db2File(name = "CreatureDisplayInfo.db2", layoutHash = 0x406268DF, indexField = 0)
public class CreatureDisplayInfo implements DbcEntity {
    @Id
    @ColumnDefault("'0'")
    @Column(name = "ID", columnDefinition = "int UNSIGNED not null")
    @Db2Field(fieldIndex = 0, type = Db2Type.INT)
    private Integer id;


    @Column(name = "CreatureModelScale")
    @Db2Field(fieldIndex = 1, type = Db2Type.FLOAT)
    private Float creatureModelScale;


    @Column(name = "ModelID")
    @Db2Field(fieldIndex = 2, type = Db2Type.SHORT)
    private Short modelID;


    @Column(name = "NPCSoundID")
    @Db2Field(fieldIndex = 3, type = Db2Type.SHORT)
    private Short nPCSoundID;


    @Column(name = "SizeClass")
    @Db2Field(fieldIndex = 4, type = Db2Type.BYTE, signed = true)
    private Byte sizeClass;


    @Column(name = "Flags")
    @Db2Field(fieldIndex = 5, type = Db2Type.BYTE)
    private Byte flags;


    @Column(name = "Gender")
    @Db2Field(fieldIndex = 6, type = Db2Type.BYTE, signed = true)
    private Byte gender;


    @Column(name = "ExtendedDisplayInfoID")
    @Db2Field(fieldIndex = 7, type = Db2Type.INT, signed = true)
    private Integer extendedDisplayInfoID;


    @Column(name = "PortraitTextureFileDataID")
    @Db2Field(fieldIndex = 8, type = Db2Type.INT, signed = true)
    private Integer portraitTextureFileDataID;


    @Column(name = "CreatureModelAlpha")
    @Db2Field(fieldIndex = 9, type = Db2Type.BYTE)
    private Byte creatureModelAlpha;


    @Column(name = "SoundID")
    @Db2Field(fieldIndex = 10, type = Db2Type.SHORT)
    private Short soundID;


    @Column(name = "PlayerOverrideScale")
    @Db2Field(fieldIndex = 11, type = Db2Type.FLOAT)
    private Float playerOverrideScale;


    @Column(name = "PortraitCreatureDisplayInfoID")
    @Db2Field(fieldIndex = 12, type = Db2Type.INT, signed = true)
    private Integer portraitCreatureDisplayInfoID;


    @Column(name = "BloodID")
    @Db2Field(fieldIndex = 13, type = Db2Type.BYTE)
    private Byte bloodID;


    @Column(name = "ParticleColorID")
    @Db2Field(fieldIndex = 14, type = Db2Type.SHORT)
    private Short particleColorID;


    @Column(name = "CreatureGeosetData")
    @Db2Field(fieldIndex = 15, type = Db2Type.INT)
    private Integer creatureGeosetData;


    @Column(name = "ObjectEffectPackageID")
    @Db2Field(fieldIndex = 16, type = Db2Type.SHORT)
    private Short objectEffectPackageID;


    @Column(name = "AnimReplacementSetID")
    @Db2Field(fieldIndex = 17, type = Db2Type.SHORT)
    private Short animReplacementSetID;


    @Column(name = "UnarmedWeaponType")
    @Db2Field(fieldIndex = 18, type = Db2Type.BYTE, signed = true)
    private Byte unarmedWeaponType;


    @Column(name = "StateSpellVisualKitID")
    @Db2Field(fieldIndex = 19, type = Db2Type.INT, signed = true)
    private Integer stateSpellVisualKitID;


    @Column(name = "PetInstanceScale")
    @Db2Field(fieldIndex = 20, type = Db2Type.FLOAT)
    private Float petInstanceScale;


    @Column(name = "MountPoofSpellVisualKitID")
    @Db2Field(fieldIndex = 21, type = Db2Type.INT, signed = true)
    private Integer mountPoofSpellVisualKitID;


    @Column(name = "TextureVariationFileDataID1")
    @Db2Field(fieldIndex = 22, type = Db2Type.INT, signed = true)
    private Integer textureVariationFileDataID1;


    @Column(name = "TextureVariationFileDataID2")
    @Db2Field(fieldIndex = 23, type = Db2Type.INT, signed = true)
    private Integer textureVariationFileDataID2;


    @Column(name = "TextureVariationFileDataID3")
    @Db2Field(fieldIndex = 24, type = Db2Type.INT, signed = true)
    private Integer textureVariationFileDataID3;

    @Id
    @ColumnDefault("0")
    @Column(name = "VerifiedBuild", nullable = false)
    private Integer verifiedBuild;


}
