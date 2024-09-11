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
@Table(name = "item_damage_two_hand_caster")
public class ItemDamageTwoHandCaster {
    @Id
    @ColumnDefault("'0'")
    @Column(name = "ID", columnDefinition = "int UNSIGNED not null")
    private Integer id;

    @Id
    @ColumnDefault("0")
    @Column(name = "VerifiedBuild", nullable = false)
    private Integer verifiedBuild;

    @ColumnDefault("'0'")
    @Column(name = "ItemLevel", columnDefinition = "smallint UNSIGNED not null")
    private Integer itemLevel;

    @ColumnDefault("0")
    @Column(name = "Quality1", nullable = false)
    private Float quality1;

    @ColumnDefault("0")
    @Column(name = "Quality2", nullable = false)
    private Float quality2;

    @ColumnDefault("0")
    @Column(name = "Quality3", nullable = false)
    private Float quality3;

    @ColumnDefault("0")
    @Column(name = "Quality4", nullable = false)
    private Float quality4;

    @ColumnDefault("0")
    @Column(name = "Quality5", nullable = false)
    private Float quality5;

    @ColumnDefault("0")
    @Column(name = "Quality6", nullable = false)
    private Float quality6;

    @ColumnDefault("0")
    @Column(name = "Quality7", nullable = false)
    private Float quality7;

}