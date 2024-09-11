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
@Table(name = "creature_model_data")
public class CreatureModelDatum {
    @Id
    @ColumnDefault("'0'")
    @Column(name = "ID", columnDefinition = "int UNSIGNED not null")
    private Integer id;

    @Id
    @ColumnDefault("0")
    @Column(name = "VerifiedBuild", nullable = false)
    private Integer verifiedBuild;

    @ColumnDefault("0")
    @Column(name = "GeoBox1", nullable = false)
    private Float geoBox1;

    @ColumnDefault("0")
    @Column(name = "GeoBox2", nullable = false)
    private Float geoBox2;

    @ColumnDefault("0")
    @Column(name = "GeoBox3", nullable = false)
    private Float geoBox3;

    @ColumnDefault("0")
    @Column(name = "GeoBox4", nullable = false)
    private Float geoBox4;

    @ColumnDefault("0")
    @Column(name = "GeoBox5", nullable = false)
    private Float geoBox5;

    @ColumnDefault("0")
    @Column(name = "GeoBox6", nullable = false)
    private Float geoBox6;

    @ColumnDefault("'0'")
    @Column(name = "Flags", columnDefinition = "int UNSIGNED not null")
    private Long flags;

    @ColumnDefault("'0'")
    @Column(name = "FileDataID", columnDefinition = "int UNSIGNED not null")
    private Long fileDataID;

    @ColumnDefault("'0'")
    @Column(name = "BloodID", columnDefinition = "int UNSIGNED not null")
    private Long bloodID;

    @ColumnDefault("'0'")
    @Column(name = "FootprintTextureID", columnDefinition = "int UNSIGNED not null")
    private Long footprintTextureID;

    @ColumnDefault("0")
    @Column(name = "FootprintTextureLength", nullable = false)
    private Float footprintTextureLength;

    @ColumnDefault("0")
    @Column(name = "FootprintTextureWidth", nullable = false)
    private Float footprintTextureWidth;

    @ColumnDefault("0")
    @Column(name = "FootprintParticleScale", nullable = false)
    private Float footprintParticleScale;

    @ColumnDefault("'0'")
    @Column(name = "FoleyMaterialID", columnDefinition = "int UNSIGNED not null")
    private Long foleyMaterialID;

    @ColumnDefault("'0'")
    @Column(name = "FootstepCameraEffectID", columnDefinition = "int UNSIGNED not null")
    private Long footstepCameraEffectID;

    @ColumnDefault("'0'")
    @Column(name = "DeathThudCameraEffectID", columnDefinition = "int UNSIGNED not null")
    private Long deathThudCameraEffectID;

    @ColumnDefault("'0'")
    @Column(name = "SoundID", columnDefinition = "int UNSIGNED not null")
    private Long soundID;

    @ColumnDefault("'0'")
    @Column(name = "SizeClass", columnDefinition = "int UNSIGNED not null")
    private Long sizeClass;

    @ColumnDefault("0")
    @Column(name = "CollisionWidth", nullable = false)
    private Float collisionWidth;

    @ColumnDefault("0")
    @Column(name = "CollisionHeight", nullable = false)
    private Float collisionHeight;

    @ColumnDefault("0")
    @Column(name = "WorldEffectScale", nullable = false)
    private Float worldEffectScale;

    @ColumnDefault("'0'")
    @Column(name = "CreatureGeosetDataID", columnDefinition = "int UNSIGNED not null")
    private Long creatureGeosetDataID;

    @ColumnDefault("0")
    @Column(name = "HoverHeight", nullable = false)
    private Float hoverHeight;

    @ColumnDefault("0")
    @Column(name = "AttachedEffectScale", nullable = false)
    private Float attachedEffectScale;

    @ColumnDefault("0")
    @Column(name = "ModelScale", nullable = false)
    private Float modelScale;

    @ColumnDefault("0")
    @Column(name = "MissileCollisionRadius", nullable = false)
    private Float missileCollisionRadius;

    @ColumnDefault("0")
    @Column(name = "MissileCollisionPush", nullable = false)
    private Float missileCollisionPush;

    @ColumnDefault("0")
    @Column(name = "MissileCollisionRaise", nullable = false)
    private Float missileCollisionRaise;

    @ColumnDefault("0")
    @Column(name = "MountHeight", nullable = false)
    private Float mountHeight;

    @ColumnDefault("0")
    @Column(name = "OverrideLootEffectScale", nullable = false)
    private Float overrideLootEffectScale;

    @ColumnDefault("0")
    @Column(name = "OverrideNameScale", nullable = false)
    private Float overrideNameScale;

    @ColumnDefault("0")
    @Column(name = "OverrideSelectionRadius", nullable = false)
    private Float overrideSelectionRadius;

    @ColumnDefault("0")
    @Column(name = "TamedPetBaseScale", nullable = false)
    private Float tamedPetBaseScale;

}