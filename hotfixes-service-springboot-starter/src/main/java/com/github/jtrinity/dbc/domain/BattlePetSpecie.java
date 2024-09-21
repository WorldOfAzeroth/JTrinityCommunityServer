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
@Table(name = "battle_pet_species")
@Db2File(name = "BattlePetSpecies.db2", layoutHash = 0x8A3D97A4, indexField = 8)
public class BattlePetSpecie implements DbcEntity {

    @Column(name = "SourceText")
    @Db2Field(fieldIndex = 0, type = Db2Type.STRING)
    private LocalizedString sourceText;


    @Column(name = "Description")
    @Db2Field(fieldIndex = 1, type = Db2Type.STRING)
    private LocalizedString description;


    @Column(name = "CreatureID")
    @Db2Field(fieldIndex = 2, type = Db2Type.INT, signed = true)
    private Integer creatureID;


    @Column(name = "IconFileDataID")
    @Db2Field(fieldIndex = 3, type = Db2Type.INT, signed = true)
    private Integer iconFileDataID;


    @Column(name = "SummonSpellID")
    @Db2Field(fieldIndex = 4, type = Db2Type.INT, signed = true)
    private Integer summonSpellID;


    @Column(name = "Flags")
    @Db2Field(fieldIndex = 5, type = Db2Type.SHORT)
    private Short flags;


    @Column(name = "PetTypeEnum")
    @Db2Field(fieldIndex = 6, type = Db2Type.BYTE)
    private Byte petTypeEnum;


    @Column(name = "SourceTypeEnum")
    @Db2Field(fieldIndex = 7, type = Db2Type.BYTE, signed = true)
    private Byte sourceTypeEnum;

    @Id
    @ColumnDefault("'0'")
    @Column(name = "ID", columnDefinition = "int UNSIGNED not null")
    @Db2Field(fieldIndex = 8, type = Db2Type.INT)
    private Integer id;


    @Column(name = "CardUIModelSceneID")
    @Db2Field(fieldIndex = 9, type = Db2Type.INT, signed = true)
    private Integer cardUIModelSceneID;


    @Column(name = "LoadoutUIModelSceneID")
    @Db2Field(fieldIndex = 10, type = Db2Type.INT, signed = true)
    private Integer loadoutUIModelSceneID;

    @Id
    @ColumnDefault("0")
    @Column(name = "VerifiedBuild", nullable = false)
    private Integer verifiedBuild;


}
