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
@Table(name = "item_armor_total")
public class ItemArmorTotal {
    @Id
    @ColumnDefault("'0'")
    @Column(name = "ID", columnDefinition = "int UNSIGNED not null")
    private Integer id;

    @Id
    @ColumnDefault("0")
    @Column(name = "VerifiedBuild", nullable = false)
    private Integer verifiedBuild;

    @ColumnDefault("0")
    @Column(name = "ItemLevel", nullable = false)
    private Short itemLevel;

    @ColumnDefault("0")
    @Column(name = "Cloth", nullable = false)
    private Float cloth;

    @ColumnDefault("0")
    @Column(name = "Leather", nullable = false)
    private Float leather;

    @ColumnDefault("0")
    @Column(name = "Mail", nullable = false)
    private Float mail;

    @ColumnDefault("0")
    @Column(name = "Plate", nullable = false)
    private Float plate;

}