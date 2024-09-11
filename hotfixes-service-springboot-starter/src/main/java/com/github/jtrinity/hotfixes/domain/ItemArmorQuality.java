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
@Table(name = "item_armor_quality")
public class ItemArmorQuality {
    @Id
    @ColumnDefault("'0'")
    @Column(name = "ID", columnDefinition = "int UNSIGNED not null")
    private Integer id;

    @Id
    @ColumnDefault("0")
    @Column(name = "VerifiedBuild", nullable = false)
    private Integer verifiedBuild;

    @ColumnDefault("0")
    @Column(name = "Qualitymod1", nullable = false)
    private Float qualitymod1;

    @ColumnDefault("0")
    @Column(name = "Qualitymod2", nullable = false)
    private Float qualitymod2;

    @ColumnDefault("0")
    @Column(name = "Qualitymod3", nullable = false)
    private Float qualitymod3;

    @ColumnDefault("0")
    @Column(name = "Qualitymod4", nullable = false)
    private Float qualitymod4;

    @ColumnDefault("0")
    @Column(name = "Qualitymod5", nullable = false)
    private Float qualitymod5;

    @ColumnDefault("0")
    @Column(name = "Qualitymod6", nullable = false)
    private Float qualitymod6;

    @ColumnDefault("0")
    @Column(name = "Qualitymod7", nullable = false)
    private Float qualitymod7;

}