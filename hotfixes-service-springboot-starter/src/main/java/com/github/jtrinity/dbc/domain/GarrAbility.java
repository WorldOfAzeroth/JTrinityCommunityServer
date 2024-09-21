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
@Table(name = "garr_ability")
@Db2File(name = "GarrAbility.db2", layoutHash = 0x5DF95DBD, indexField = 7)
public class GarrAbility implements DbcEntity {

    @Column(name = "Name")
    @Db2Field(fieldIndex = 0, type = Db2Type.STRING)
    private LocalizedString name;


    @Column(name = "Description")
    @Db2Field(fieldIndex = 1, type = Db2Type.STRING)
    private LocalizedString description;


    @Column(name = "IconFileDataID")
    @Db2Field(fieldIndex = 2, type = Db2Type.INT, signed = true)
    private Integer iconFileDataID;


    @Column(name = "Flags")
    @Db2Field(fieldIndex = 3, type = Db2Type.SHORT)
    private Short flags;


    @Column(name = "FactionChangeGarrAbilityID")
    @Db2Field(fieldIndex = 4, type = Db2Type.SHORT)
    private Short factionChangeGarrAbilityID;


    @Column(name = "GarrAbilityCategoryID")
    @Db2Field(fieldIndex = 5, type = Db2Type.BYTE)
    private Byte garrAbilityCategoryID;


    @Column(name = "GarrFollowerTypeID")
    @Db2Field(fieldIndex = 6, type = Db2Type.BYTE)
    private Byte garrFollowerTypeID;

    @Id
    @ColumnDefault("'0'")
    @Column(name = "ID", columnDefinition = "int UNSIGNED not null")
    @Db2Field(fieldIndex = 7, type = Db2Type.INT)
    private Integer id;

    @Id
    @ColumnDefault("0")
    @Column(name = "VerifiedBuild", nullable = false)
    private Integer verifiedBuild;


}
