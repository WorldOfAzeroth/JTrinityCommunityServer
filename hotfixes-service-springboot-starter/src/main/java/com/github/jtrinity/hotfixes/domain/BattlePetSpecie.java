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
@Table(name = "battle_pet_species")
public class BattlePetSpecie {
    @Id
    @ColumnDefault("'0'")
    @Column(name = "ID", columnDefinition = "int UNSIGNED not null")
    private Integer id;

    @Id
    @ColumnDefault("0")
    @Column(name = "VerifiedBuild", nullable = false)
    private Integer verifiedBuild;

    @Lob
    @Column(name = "Description")
    private String description;

    @Lob
    @Column(name = "SourceText")
    private String sourceText;

    @ColumnDefault("0")
    @Column(name = "CreatureID", nullable = false)
    private Integer creatureID;

    @ColumnDefault("0")
    @Column(name = "SummonSpellID", nullable = false)
    private Integer summonSpellID;

    @ColumnDefault("0")
    @Column(name = "IconFileDataID", nullable = false)
    private Integer iconFileDataID;

    @ColumnDefault("'0'")
    @Column(name = "PetTypeEnum", columnDefinition = "tinyint UNSIGNED not null")
    private Short petTypeEnum;

    @ColumnDefault("0")
    @Column(name = "Flags", nullable = false)
    private Integer flags;

    @ColumnDefault("0")
    @Column(name = "SourceTypeEnum", nullable = false)
    private Byte sourceTypeEnum;

    @ColumnDefault("0")
    @Column(name = "CardUIModelSceneID", nullable = false)
    private Integer cardUIModelSceneID;

    @ColumnDefault("0")
    @Column(name = "LoadoutUIModelSceneID", nullable = false)
    private Integer loadoutUIModelSceneID;

}