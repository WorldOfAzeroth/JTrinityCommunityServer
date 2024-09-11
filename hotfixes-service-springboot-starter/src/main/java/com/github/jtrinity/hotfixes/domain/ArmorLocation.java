package com.github.jtrinity.hotfixes.domain;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.hibernate.annotations.ColumnDefault;

@Getter
@Setter
@ToString(onlyExplicitlyIncluded = true)
@IdClass(DB2LocaleId.class)
@Entity
@Table(name = "armor_location")
public class ArmorLocation {
    @Id
    @ColumnDefault("'0'")
    @Column(name = "ID", columnDefinition = "int UNSIGNED not null")
    private Integer id;

    @Id
    @ColumnDefault("0")
    @Column(name = "VerifiedBuild", nullable = false)
    private Integer verifiedBuild;

    @ColumnDefault("0")
    @Column(name = "Clothmodifier", nullable = false)
    private Float clothmodifier;

    @ColumnDefault("0")
    @Column(name = "Leathermodifier", nullable = false)
    private Float leathermodifier;

    @ColumnDefault("0")
    @Column(name = "Chainmodifier", nullable = false)
    private Float chainmodifier;

    @ColumnDefault("0")
    @Column(name = "Platemodifier", nullable = false)
    private Float platemodifier;

    @ColumnDefault("0")
    @Column(name = "Modifier", nullable = false)
    private Float modifier;

}