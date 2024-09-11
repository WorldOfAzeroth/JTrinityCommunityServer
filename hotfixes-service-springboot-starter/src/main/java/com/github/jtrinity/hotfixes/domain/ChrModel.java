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
@Table(name = "chr_model")
public class ChrModel {
    @Id
    @ColumnDefault("'0'")
    @Column(name = "ID", columnDefinition = "int UNSIGNED not null")
    private Integer id;

    @Id
    @ColumnDefault("0")
    @Column(name = "VerifiedBuild", nullable = false)
    private Integer verifiedBuild;

    @ColumnDefault("0")
    @Column(name = "FaceCustomizationOffset1", nullable = false)
    private Float faceCustomizationOffset1;

    @ColumnDefault("0")
    @Column(name = "FaceCustomizationOffset2", nullable = false)
    private Float faceCustomizationOffset2;

    @ColumnDefault("0")
    @Column(name = "FaceCustomizationOffset3", nullable = false)
    private Float faceCustomizationOffset3;

    @ColumnDefault("0")
    @Column(name = "CustomizeOffset1", nullable = false)
    private Float customizeOffset1;

    @ColumnDefault("0")
    @Column(name = "CustomizeOffset2", nullable = false)
    private Float customizeOffset2;

    @ColumnDefault("0")
    @Column(name = "CustomizeOffset3", nullable = false)
    private Float customizeOffset3;

    @ColumnDefault("0")
    @Column(name = "Sex", nullable = false)
    private Byte sex;

    @ColumnDefault("0")
    @Column(name = "DisplayID", nullable = false)
    private Integer displayID;

    @ColumnDefault("0")
    @Column(name = "CharComponentTextureLayoutID", nullable = false)
    private Integer charComponentTextureLayoutID;

    @ColumnDefault("0")
    @Column(name = "Flags", nullable = false)
    private Integer flags;

    @ColumnDefault("0")
    @Column(name = "SkeletonFileDataID", nullable = false)
    private Integer skeletonFileDataID;

    @ColumnDefault("0")
    @Column(name = "ModelFallbackChrModelID", nullable = false)
    private Integer modelFallbackChrModelID;

    @ColumnDefault("0")
    @Column(name = "TextureFallbackChrModelID", nullable = false)
    private Integer textureFallbackChrModelID;

    @ColumnDefault("0")
    @Column(name = "HelmVisFallbackChrModelID", nullable = false)
    private Integer helmVisFallbackChrModelID;

    @ColumnDefault("0")
    @Column(name = "CustomizeScale", nullable = false)
    private Float customizeScale;

    @ColumnDefault("0")
    @Column(name = "CustomizeFacing", nullable = false)
    private Float customizeFacing;

    @ColumnDefault("0")
    @Column(name = "CameraDistanceOffset", nullable = false)
    private Float cameraDistanceOffset;

    @ColumnDefault("0")
    @Column(name = "BarberShopCameraOffsetScale", nullable = false)
    private Float barberShopCameraOffsetScale;

    @ColumnDefault("0")
    @Column(name = "BarberShopCameraHeightOffsetScale", nullable = false)
    private Float barberShopCameraHeightOffsetScale;

    @ColumnDefault("0")
    @Column(name = "BarberShopCameraRotationOffset", nullable = false)
    private Float barberShopCameraRotationOffset;

}