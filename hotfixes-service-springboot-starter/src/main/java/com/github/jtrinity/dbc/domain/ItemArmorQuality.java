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
@Table(name = "item_armor_quality")
@Db2File(name = "ItemArmorQuality.db2", layoutHash = 0x85642CC0)
public class ItemArmorQuality implements DbcEntity {
    @Id
    @ColumnDefault("'0'")
    @Column(name = "ID", columnDefinition = "int UNSIGNED not null")
    @Db2Field(fieldIndex = 0, type = Db2Type.INT)
    private Integer id;


    @Column(name = "Qualitymod1")
    @Db2Field(fieldIndex = 1, type = Db2Type.FLOAT)
    private Float qualitymod1;


    @Column(name = "Qualitymod2")
    @Db2Field(fieldIndex = 2, type = Db2Type.FLOAT)
    private Float qualitymod2;


    @Column(name = "Qualitymod3")
    @Db2Field(fieldIndex = 3, type = Db2Type.FLOAT)
    private Float qualitymod3;


    @Column(name = "Qualitymod4")
    @Db2Field(fieldIndex = 4, type = Db2Type.FLOAT)
    private Float qualitymod4;


    @Column(name = "Qualitymod5")
    @Db2Field(fieldIndex = 5, type = Db2Type.FLOAT)
    private Float qualitymod5;


    @Column(name = "Qualitymod6")
    @Db2Field(fieldIndex = 6, type = Db2Type.FLOAT)
    private Float qualitymod6;


    @Column(name = "Qualitymod7")
    @Db2Field(fieldIndex = 7, type = Db2Type.FLOAT)
    private Float qualitymod7;


    @Column(name = "ItemLevel")
    @Db2Field(fieldIndex = 8, type = Db2Type.SHORT, signed = true)
    private Short itemLevel;

    @Id
    @ColumnDefault("0")
    @Column(name = "VerifiedBuild", nullable = false)
    private Integer verifiedBuild;


}
