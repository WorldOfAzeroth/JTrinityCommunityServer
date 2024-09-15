package com.github.jtrinity.dbc.domain;

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
@ToString(onlyExplicitlyIncluded = true)
@IdClass(DB2Id.class)
@Entity
@Table(name = "battle_pet_species")
@Db2File(name = "BattlePetSpecies.db2", layoutHash = 0xA8750D81, indexField = 2)
public class BattlePetSpecie implements DbcEntity {
    @Id
    @ColumnDefault("'0'")
    @Column(name = "ID", columnDefinition = "int UNSIGNED not null")
    @Db2Field(fieldIndex = 2, type = Db2Type.INT)
    private Integer id;

    @Id
    @ColumnDefault("0")
    @Column(name = "VerifiedBuild", nullable = false)
    private Integer verifiedBuild;

    @Lob
    @Column(name = "Description")
    @Db2Field(fieldIndex = 0, type = Db2Type.STRING)
    private String description;

    @Lob
    @Column(name = "SourceText")
    @Db2Field(fieldIndex = 1, type = Db2Type.STRING)
    private String sourceText;

    @ColumnDefault("0")
    @Column(name = "CreatureID", nullable = false)
    @Db2Field(fieldIndex = 3, type = Db2Type.INT, signed = true)
    private Integer creatureID;

    @ColumnDefault("0")
    @Column(name = "SummonSpellID", nullable = false)
    @Db2Field(fieldIndex = 4, type = Db2Type.INT, signed = true)
    private Integer summonSpellID;

    @ColumnDefault("0")
    @Column(name = "IconFileDataID", nullable = false)
    @Db2Field(fieldIndex = 5, type = Db2Type.INT, signed = true)
    private Integer iconFileDataID;

    @ColumnDefault("'0'")
    @Column(name = "PetTypeEnum", columnDefinition = "tinyint UNSIGNED not null")
    @Db2Field(fieldIndex = 6, type = Db2Type.BYTE)
    private Short petTypeEnum;

    @ColumnDefault("0")
    @Column(name = "Flags", nullable = false)
    @Db2Field(fieldIndex = 7, type = Db2Type.INT, signed = true)
    private Integer flags;

    @ColumnDefault("0")
    @Column(name = "SourceTypeEnum", nullable = false)
    @Db2Field(fieldIndex = 8, type = Db2Type.BYTE, signed = true)
    private Byte sourceTypeEnum;

    @ColumnDefault("0")
    @Column(name = "CardUIModelSceneID", nullable = false)
    @Db2Field(fieldIndex = 9, type = Db2Type.INT, signed = true)
    private Integer cardUIModelSceneID;

    @ColumnDefault("0")
    @Column(name = "LoadoutUIModelSceneID", nullable = false)
    @Db2Field(fieldIndex = 10, type = Db2Type.INT, signed = true)
    private Integer loadoutUIModelSceneID;

}