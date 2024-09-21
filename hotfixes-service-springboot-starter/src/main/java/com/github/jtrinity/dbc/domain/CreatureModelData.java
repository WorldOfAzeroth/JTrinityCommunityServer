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
@Table(name = "creature_model_data")
@Db2File(name = "CreatureModelData.db2", layoutHash = 0x983BD312)
public class CreatureModelData implements DbcEntity {
    @Id
    @ColumnDefault("'0'")
    @Column(name = "ID", columnDefinition = "int UNSIGNED not null")
    @Db2Field(fieldIndex = 0, type = Db2Type.INT)
    private Integer id;


    @Column(name = "ModelScale")
    @Db2Field(fieldIndex = 1, type = Db2Type.FLOAT)
    private Float modelScale;


    @Column(name = "FootprintTextureLength")
    @Db2Field(fieldIndex = 2, type = Db2Type.FLOAT)
    private Float footprintTextureLength;


    @Column(name = "FootprintTextureWidth")
    @Db2Field(fieldIndex = 3, type = Db2Type.FLOAT)
    private Float footprintTextureWidth;


    @Column(name = "FootprintParticleScale")
    @Db2Field(fieldIndex = 4, type = Db2Type.FLOAT)
    private Float footprintParticleScale;


    @Column(name = "CollisionWidth")
    @Db2Field(fieldIndex = 5, type = Db2Type.FLOAT)
    private Float collisionWidth;


    @Column(name = "CollisionHeight")
    @Db2Field(fieldIndex = 6, type = Db2Type.FLOAT)
    private Float collisionHeight;


    @Column(name = "MountHeight")
    @Db2Field(fieldIndex = 7, type = Db2Type.FLOAT)
    private Float mountHeight;


    @Column(name = "GeoBox1")
    @Db2Field(fieldIndex = 8, type = Db2Type.FLOAT)
    private Float geoBox1;


    @Column(name = "GeoBox2")
    @Db2Field(fieldIndex = 9, type = Db2Type.FLOAT)
    private Float geoBox2;


    @Column(name = "GeoBox3")
    @Db2Field(fieldIndex = 10, type = Db2Type.FLOAT)
    private Float geoBox3;


    @Column(name = "GeoBox4")
    @Db2Field(fieldIndex = 11, type = Db2Type.FLOAT)
    private Float geoBox4;


    @Column(name = "GeoBox5")
    @Db2Field(fieldIndex = 12, type = Db2Type.FLOAT)
    private Float geoBox5;


    @Column(name = "GeoBox6")
    @Db2Field(fieldIndex = 13, type = Db2Type.FLOAT)
    private Float geoBox6;


    @Column(name = "WorldEffectScale")
    @Db2Field(fieldIndex = 14, type = Db2Type.FLOAT)
    private Float worldEffectScale;


    @Column(name = "AttachedEffectScale")
    @Db2Field(fieldIndex = 15, type = Db2Type.FLOAT)
    private Float attachedEffectScale;


    @Column(name = "MissileCollisionRadius")
    @Db2Field(fieldIndex = 16, type = Db2Type.FLOAT)
    private Float missileCollisionRadius;


    @Column(name = "MissileCollisionPush")
    @Db2Field(fieldIndex = 17, type = Db2Type.FLOAT)
    private Float missileCollisionPush;


    @Column(name = "MissileCollisionRaise")
    @Db2Field(fieldIndex = 18, type = Db2Type.FLOAT)
    private Float missileCollisionRaise;


    @Column(name = "OverrideLootEffectScale")
    @Db2Field(fieldIndex = 19, type = Db2Type.FLOAT)
    private Float overrideLootEffectScale;


    @Column(name = "OverrideNameScale")
    @Db2Field(fieldIndex = 20, type = Db2Type.FLOAT)
    private Float overrideNameScale;


    @Column(name = "OverrideSelectionRadius")
    @Db2Field(fieldIndex = 21, type = Db2Type.FLOAT)
    private Float overrideSelectionRadius;


    @Column(name = "TamedPetBaseScale")
    @Db2Field(fieldIndex = 22, type = Db2Type.FLOAT)
    private Float tamedPetBaseScale;


    @Column(name = "HoverHeight")
    @Db2Field(fieldIndex = 23, type = Db2Type.FLOAT)
    private Float hoverHeight;


    @Column(name = "Flags")
    @Db2Field(fieldIndex = 24, type = Db2Type.INT)
    private Integer flags;


    @Column(name = "FileDataID")
    @Db2Field(fieldIndex = 25, type = Db2Type.INT)
    private Integer fileDataID;


    @Column(name = "SizeClass")
    @Db2Field(fieldIndex = 26, type = Db2Type.INT)
    private Integer sizeClass;


    @Column(name = "BloodID")
    @Db2Field(fieldIndex = 27, type = Db2Type.INT)
    private Integer bloodID;


    @Column(name = "FootprintTextureID")
    @Db2Field(fieldIndex = 28, type = Db2Type.INT)
    private Integer footprintTextureID;


    @Column(name = "FoleyMaterialID")
    @Db2Field(fieldIndex = 29, type = Db2Type.INT)
    private Integer foleyMaterialID;


    @Column(name = "FootstepCameraEffectID")
    @Db2Field(fieldIndex = 30, type = Db2Type.INT)
    private Integer footstepCameraEffectID;


    @Column(name = "DeathThudCameraEffectID")
    @Db2Field(fieldIndex = 31, type = Db2Type.INT)
    private Integer deathThudCameraEffectID;


    @Column(name = "SoundID")
    @Db2Field(fieldIndex = 32, type = Db2Type.INT)
    private Integer soundID;


    @Column(name = "CreatureGeosetDataID")
    @Db2Field(fieldIndex = 33, type = Db2Type.INT)
    private Integer creatureGeosetDataID;

    @Id
    @ColumnDefault("0")
    @Column(name = "VerifiedBuild", nullable = false)
    private Integer verifiedBuild;


}
