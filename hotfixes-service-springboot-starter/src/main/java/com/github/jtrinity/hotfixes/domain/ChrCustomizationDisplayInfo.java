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
@Table(name = "chr_customization_display_info")
public class ChrCustomizationDisplayInfo {
    @Id
    @ColumnDefault("'0'")
    @Column(name = "ID", columnDefinition = "int UNSIGNED not null")
    private Integer id;

    @Id
    @ColumnDefault("0")
    @Column(name = "VerifiedBuild", nullable = false)
    private Integer verifiedBuild;

    @ColumnDefault("0")
    @Column(name = "ShapeshiftFormID", nullable = false)
    private Integer shapeshiftFormID;

    @ColumnDefault("0")
    @Column(name = "DisplayID", nullable = false)
    private Integer displayID;

    @ColumnDefault("0")
    @Column(name = "BarberShopMinCameraDistance", nullable = false)
    private Float barberShopMinCameraDistance;

    @ColumnDefault("0")
    @Column(name = "BarberShopHeightOffset", nullable = false)
    private Float barberShopHeightOffset;

    @ColumnDefault("0")
    @Column(name = "BarberShopCameraZoomOffset", nullable = false)
    private Float barberShopCameraZoomOffset;

}