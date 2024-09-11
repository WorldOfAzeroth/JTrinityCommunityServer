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
@Table(name = "creature_family")
public class CreatureFamily {
    @Id
    @ColumnDefault("'0'")
    @Column(name = "ID", columnDefinition = "int UNSIGNED not null")
    private Integer id;

    @Id
    @ColumnDefault("0")
    @Column(name = "VerifiedBuild", nullable = false)
    private Integer verifiedBuild;

    @Lob
    @Column(name = "Name")
    private String name;

    @ColumnDefault("0")
    @Column(name = "MinScale", nullable = false)
    private Float minScale;

    @ColumnDefault("0")
    @Column(name = "MinScaleLevel", nullable = false)
    private Byte minScaleLevel;

    @ColumnDefault("0")
    @Column(name = "MaxScale", nullable = false)
    private Float maxScale;

    @ColumnDefault("0")
    @Column(name = "MaxScaleLevel", nullable = false)
    private Byte maxScaleLevel;

    @ColumnDefault("0")
    @Column(name = "PetFoodMask", nullable = false)
    private Short petFoodMask;

    @ColumnDefault("0")
    @Column(name = "PetTalentType", nullable = false)
    private Byte petTalentType;

    @ColumnDefault("0")
    @Column(name = "CategoryEnumID", nullable = false)
    private Integer categoryEnumID;

    @ColumnDefault("0")
    @Column(name = "IconFileID", nullable = false)
    private Integer iconFileID;

    @ColumnDefault("0")
    @Column(name = "SkillLine1", nullable = false)
    private Short skillLine1;

    @ColumnDefault("0")
    @Column(name = "SkillLine2", nullable = false)
    private Short skillLine2;

}