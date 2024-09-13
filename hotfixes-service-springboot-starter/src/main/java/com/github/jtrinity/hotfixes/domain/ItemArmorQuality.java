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
@Table(name = "item_armor_quality")
@Db2File(name = "ItemArmorQuality.db2", fileDataId = 1283021, layoutHash = 0x5DAB3131)
public class ItemArmorQuality {
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
    @Column(name = "Qualitymod1", nullable = false)
    @Db2Field(fieldIndex = 1, type = Db2Type.FLOAT)
    private Float qualitymod1;

    @ColumnDefault("0")
    @Column(name = "Qualitymod2", nullable = false)
    @Db2Field(fieldIndex = 2, type = Db2Type.FLOAT)
    private Float qualitymod2;

    @ColumnDefault("0")
    @Column(name = "Qualitymod3", nullable = false)
    @Db2Field(fieldIndex = 3, type = Db2Type.FLOAT)
    private Float qualitymod3;

    @ColumnDefault("0")
    @Column(name = "Qualitymod4", nullable = false)
    @Db2Field(fieldIndex = 4, type = Db2Type.FLOAT)
    private Float qualitymod4;

    @ColumnDefault("0")
    @Column(name = "Qualitymod5", nullable = false)
    @Db2Field(fieldIndex = 5, type = Db2Type.FLOAT)
    private Float qualitymod5;

    @ColumnDefault("0")
    @Column(name = "Qualitymod6", nullable = false)
    @Db2Field(fieldIndex = 6, type = Db2Type.FLOAT)
    private Float qualitymod6;

    @ColumnDefault("0")
    @Column(name = "Qualitymod7", nullable = false)
    @Db2Field(fieldIndex = 7, type = Db2Type.FLOAT)
    private Float qualitymod7;

}