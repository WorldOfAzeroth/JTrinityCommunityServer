package com.github.jtrinity.dbc.domain;

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
@ToString(onlyExplicitlyIncluded = true)
@IdClass(DB2Id.class)
@Entity
@Table(name = "chr_model")
@Db2File(name = "ChrModel.db2", layoutHash = 0x79F06E99, indexField = 2, parentIndexField = 4)
public class ChrModel implements DbcEntity {
    @Id
    @ColumnDefault("'0'")
    @Column(name = "ID", columnDefinition = "int UNSIGNED not null")
    @Db2Field(fieldIndex = 6, type = Db2Type.INT)
    private Integer id;

    @Id
    @ColumnDefault("0")
    @Column(name = "VerifiedBuild", nullable = false)
    private Integer verifiedBuild;

    @ColumnDefault("0")
    @Column(name = "FaceCustomizationOffset1", nullable = false)
    @Db2Field(fieldIndex = 0, type = Db2Type.FLOAT)
    private Float faceCustomizationOffset1;

    @ColumnDefault("0")
    @Column(name = "FaceCustomizationOffset2", nullable = false)
    @Db2Field(fieldIndex = 1, type = Db2Type.FLOAT)
    private Float faceCustomizationOffset2;

    @ColumnDefault("0")
    @Column(name = "FaceCustomizationOffset3", nullable = false)
    @Db2Field(fieldIndex = 2, type = Db2Type.FLOAT)
    private Float faceCustomizationOffset3;

    @ColumnDefault("0")
    @Column(name = "CustomizeOffset1", nullable = false)
    @Db2Field(fieldIndex = 3, type = Db2Type.FLOAT)
    private Float customizeOffset1;

    @ColumnDefault("0")
    @Column(name = "CustomizeOffset2", nullable = false)
    @Db2Field(fieldIndex = 4, type = Db2Type.FLOAT)
    private Float customizeOffset2;

    @ColumnDefault("0")
    @Column(name = "CustomizeOffset3", nullable = false)
    @Db2Field(fieldIndex = 5, type = Db2Type.FLOAT)
    private Float customizeOffset3;

    @ColumnDefault("0")
    @Column(name = "Sex", nullable = false)
    @Db2Field(fieldIndex = 7, type = Db2Type.BYTE, signed = true)
    private Byte sex;

    @ColumnDefault("0")
    @Column(name = "DisplayID", nullable = false)
    @Db2Field(fieldIndex = 8, type = Db2Type.INT, signed = true)
    private Integer displayID;

    @ColumnDefault("0")
    @Column(name = "CharComponentTextureLayoutID", nullable = false)
    @Db2Field(fieldIndex = 9, type = Db2Type.INT, signed = true)
    private Integer charComponentTextureLayoutID;

    @ColumnDefault("0")
    @Column(name = "Flags", nullable = false)
    @Db2Field(fieldIndex = 10, type = Db2Type.INT, signed = true)
    private Integer flags;

    @ColumnDefault("0")
    @Column(name = "SkeletonFileDataID", nullable = false)
    @Db2Field(fieldIndex = 11, type = Db2Type.INT, signed = true)
    private Integer skeletonFileDataID;

    @ColumnDefault("0")
    @Column(name = "ModelFallbackChrModelID", nullable = false)
    @Db2Field(fieldIndex = 12, type = Db2Type.INT, signed = true)
    private Integer modelFallbackChrModelID;

    @ColumnDefault("0")
    @Column(name = "TextureFallbackChrModelID", nullable = false)
    @Db2Field(fieldIndex = 13, type = Db2Type.INT, signed = true)
    private Integer textureFallbackChrModelID;

    @ColumnDefault("0")
    @Column(name = "HelmVisFallbackChrModelID", nullable = false)
    @Db2Field(fieldIndex = 14, type = Db2Type.INT, signed = true)
    private Integer helmVisFallbackChrModelID;

    @ColumnDefault("0")
    @Column(name = "CustomizeScale", nullable = false)
    @Db2Field(fieldIndex = 15, type = Db2Type.FLOAT)
    private Float customizeScale;

    @ColumnDefault("0")
    @Column(name = "CustomizeFacing", nullable = false)
    @Db2Field(fieldIndex = 16, type = Db2Type.FLOAT)
    private Float customizeFacing;

    @ColumnDefault("0")
    @Column(name = "CameraDistanceOffset", nullable = false)
    @Db2Field(fieldIndex = 17, type = Db2Type.FLOAT)
    private Float cameraDistanceOffset;

    @ColumnDefault("0")
    @Column(name = "BarberShopCameraOffsetScale", nullable = false)
    @Db2Field(fieldIndex = 18, type = Db2Type.FLOAT)
    private Float barberShopCameraOffsetScale;

    @ColumnDefault("0")
    @Column(name = "BarberShopCameraHeightOffsetScale", nullable = false)
    @Db2Field(fieldIndex = 19, type = Db2Type.FLOAT)
    private Float barberShopCameraHeightOffsetScale;

    @ColumnDefault("0")
    @Column(name = "BarberShopCameraRotationOffset", nullable = false)
    @Db2Field(fieldIndex = 20, type = Db2Type.FLOAT)
    private Float barberShopCameraRotationOffset;

}