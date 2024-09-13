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
@Table(name = "chr_customization_display_info")
@Db2File(name = "ChrCustomizationDisplayInfo.db2", fileDataId = 3593032, layoutHash = 0xD11FB7A8, indexField = 0)
public class ChrCustomizationDisplayInfo {
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
    @Column(name = "ShapeshiftFormID", nullable = false)
    @Db2Field(fieldIndex = 1, type = Db2Type.INT, signed = true)
    private Integer shapeshiftFormID;

    @ColumnDefault("0")
    @Column(name = "DisplayID", nullable = false)
    @Db2Field(fieldIndex = 2, type = Db2Type.INT, signed = true)
    private Integer displayID;

    @ColumnDefault("0")
    @Column(name = "BarberShopMinCameraDistance", nullable = false)
    @Db2Field(fieldIndex = 3, type = Db2Type.FLOAT)
    private Float barberShopMinCameraDistance;

    @ColumnDefault("0")
    @Column(name = "BarberShopHeightOffset", nullable = false)
    @Db2Field(fieldIndex = 4, type = Db2Type.FLOAT)
    private Float barberShopHeightOffset;

    @ColumnDefault("0")
    @Column(name = "BarberShopCameraZoomOffset", nullable = false)
    @Db2Field(fieldIndex = 5, type = Db2Type.FLOAT)
    private Float barberShopCameraZoomOffset;

}