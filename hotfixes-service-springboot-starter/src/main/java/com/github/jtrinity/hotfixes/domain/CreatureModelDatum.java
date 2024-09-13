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
@Table(name = "creature_model_data")
@Db2File(name = "CreatureModelData.db2", fileDataId = 1365368, layoutHash = 0x925EA78B)
public class CreatureModelDatum {
    @Id
    @ColumnDefault("'0'")
    @Column(name = "ID", columnDefinition = "int UNSIGNED not null")
    @Db2Field(fieldIndex = 0, type = Db2Type.INT)
    private Integer id;

    @Id
    @ColumnDefault("0")
    @Column(name = "VerifiedBuild", nullable = false)
    private Integer verifiedBuild;

    @ColumnDefault("0")
    @Column(name = "GeoBox1", nullable = false)
    @Db2Field(fieldIndex = 1, type = Db2Type.FLOAT)
    private Float geoBox1;

    @ColumnDefault("0")
    @Column(name = "GeoBox2", nullable = false)
    @Db2Field(fieldIndex = 2, type = Db2Type.FLOAT)
    private Float geoBox2;

    @ColumnDefault("0")
    @Column(name = "GeoBox3", nullable = false)
    @Db2Field(fieldIndex = 3, type = Db2Type.FLOAT)
    private Float geoBox3;

    @ColumnDefault("0")
    @Column(name = "GeoBox4", nullable = false)
    @Db2Field(fieldIndex = 4, type = Db2Type.FLOAT)
    private Float geoBox4;

    @ColumnDefault("0")
    @Column(name = "GeoBox5", nullable = false)
    @Db2Field(fieldIndex = 5, type = Db2Type.FLOAT)
    private Float geoBox5;

    @ColumnDefault("0")
    @Column(name = "GeoBox6", nullable = false)
    @Db2Field(fieldIndex = 6, type = Db2Type.FLOAT)
    private Float geoBox6;

    @ColumnDefault("'0'")
    @Column(name = "Flags", columnDefinition = "int UNSIGNED not null")
    @Db2Field(fieldIndex = 7, type = Db2Type.INT)
    private Long flags;

    @ColumnDefault("'0'")
    @Column(name = "FileDataID", columnDefinition = "int UNSIGNED not null")
    @Db2Field(fieldIndex = 8, type = Db2Type.INT)
    private Long fileDataID;

    @ColumnDefault("'0'")
    @Column(name = "BloodID", columnDefinition = "int UNSIGNED not null")
    @Db2Field(fieldIndex = 9, type = Db2Type.INT)
    private Long bloodID;

    @ColumnDefault("'0'")
    @Column(name = "FootprintTextureID", columnDefinition = "int UNSIGNED not null")
    @Db2Field(fieldIndex = 10, type = Db2Type.INT)
    private Long footprintTextureID;

    @ColumnDefault("0")
    @Column(name = "FootprintTextureLength", nullable = false)
    @Db2Field(fieldIndex = 11, type = Db2Type.FLOAT)
    private Float footprintTextureLength;

    @ColumnDefault("0")
    @Column(name = "FootprintTextureWidth", nullable = false)
    @Db2Field(fieldIndex = 12, type = Db2Type.FLOAT)
    private Float footprintTextureWidth;

    @ColumnDefault("0")
    @Column(name = "FootprintParticleScale", nullable = false)
    @Db2Field(fieldIndex = 13, type = Db2Type.FLOAT)
    private Float footprintParticleScale;

    @ColumnDefault("'0'")
    @Column(name = "FoleyMaterialID", columnDefinition = "int UNSIGNED not null")
    @Db2Field(fieldIndex = 14, type = Db2Type.INT)
    private Long foleyMaterialID;

    @ColumnDefault("'0'")
    @Column(name = "FootstepCameraEffectID", columnDefinition = "int UNSIGNED not null")
    @Db2Field(fieldIndex = 15, type = Db2Type.INT)
    private Long footstepCameraEffectID;

    @ColumnDefault("'0'")
    @Column(name = "DeathThudCameraEffectID", columnDefinition = "int UNSIGNED not null")
    @Db2Field(fieldIndex = 16, type = Db2Type.INT)
    private Long deathThudCameraEffectID;

    @ColumnDefault("'0'")
    @Column(name = "SoundID", columnDefinition = "int UNSIGNED not null")
    @Db2Field(fieldIndex = 17, type = Db2Type.INT)
    private Long soundID;

    @ColumnDefault("'0'")
    @Column(name = "SizeClass", columnDefinition = "int UNSIGNED not null")
    @Db2Field(fieldIndex = 18, type = Db2Type.INT)
    private Long sizeClass;

    @ColumnDefault("0")
    @Column(name = "CollisionWidth", nullable = false)
    @Db2Field(fieldIndex = 19, type = Db2Type.FLOAT)
    private Float collisionWidth;

    @ColumnDefault("0")
    @Column(name = "CollisionHeight", nullable = false)
    @Db2Field(fieldIndex = 20, type = Db2Type.FLOAT)
    private Float collisionHeight;

    @ColumnDefault("0")
    @Column(name = "WorldEffectScale", nullable = false)
    @Db2Field(fieldIndex = 21, type = Db2Type.FLOAT)
    private Float worldEffectScale;

    @ColumnDefault("'0'")
    @Column(name = "CreatureGeosetDataID", columnDefinition = "int UNSIGNED not null")
    @Db2Field(fieldIndex = 22, type = Db2Type.INT)
    private Long creatureGeosetDataID;

    @ColumnDefault("0")
    @Column(name = "HoverHeight", nullable = false)
    @Db2Field(fieldIndex = 23, type = Db2Type.FLOAT)
    private Float hoverHeight;

    @ColumnDefault("0")
    @Column(name = "AttachedEffectScale", nullable = false)
    @Db2Field(fieldIndex = 24, type = Db2Type.FLOAT)
    private Float attachedEffectScale;

    @ColumnDefault("0")
    @Column(name = "ModelScale", nullable = false)
    @Db2Field(fieldIndex = 25, type = Db2Type.FLOAT)
    private Float modelScale;

    @ColumnDefault("0")
    @Column(name = "MissileCollisionRadius", nullable = false)
    @Db2Field(fieldIndex = 26, type = Db2Type.FLOAT)
    private Float missileCollisionRadius;

    @ColumnDefault("0")
    @Column(name = "MissileCollisionPush", nullable = false)
    @Db2Field(fieldIndex = 27, type = Db2Type.FLOAT)
    private Float missileCollisionPush;

    @ColumnDefault("0")
    @Column(name = "MissileCollisionRaise", nullable = false)
    @Db2Field(fieldIndex = 28, type = Db2Type.FLOAT)
    private Float missileCollisionRaise;

    @ColumnDefault("0")
    @Column(name = "MountHeight", nullable = false)
    @Db2Field(fieldIndex = 29, type = Db2Type.FLOAT)
    private Float mountHeight;

    @ColumnDefault("0")
    @Column(name = "OverrideLootEffectScale", nullable = false)
    @Db2Field(fieldIndex = 30, type = Db2Type.FLOAT)
    private Float overrideLootEffectScale;

    @ColumnDefault("0")
    @Column(name = "OverrideNameScale", nullable = false)
    @Db2Field(fieldIndex = 31, type = Db2Type.FLOAT)
    private Float overrideNameScale;

    @ColumnDefault("0")
    @Column(name = "OverrideSelectionRadius", nullable = false)
    @Db2Field(fieldIndex = 32, type = Db2Type.FLOAT)
    private Float overrideSelectionRadius;

    @ColumnDefault("0")
    @Column(name = "TamedPetBaseScale", nullable = false)
    @Db2Field(fieldIndex = 33, type = Db2Type.FLOAT)
    private Float tamedPetBaseScale;

}