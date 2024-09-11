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
@Table(name = "spell_radius")
public class SpellRadius {
    @Id
    @ColumnDefault("'0'")
    @Column(name = "ID", columnDefinition = "int UNSIGNED not null")
    private Long id;

    @Id
    @ColumnDefault("0")
    @Column(name = "VerifiedBuild", nullable = false)
    private Integer verifiedBuild;

    @ColumnDefault("0")
    @Column(name = "Radius", nullable = false)
    private Float radius;

    @ColumnDefault("0")
    @Column(name = "RadiusPerLevel", nullable = false)
    private Float radiusPerLevel;

    @ColumnDefault("0")
    @Column(name = "RadiusMin", nullable = false)
    private Float radiusMin;

    @ColumnDefault("0")
    @Column(name = "RadiusMax", nullable = false)
    private Float radiusMax;

}