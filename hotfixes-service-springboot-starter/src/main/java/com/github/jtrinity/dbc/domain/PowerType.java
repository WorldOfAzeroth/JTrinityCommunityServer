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
@Table(name = "power_type")
@Db2File(name = "PowerType.db2", layoutHash = 0x0C3844E1)
public class PowerType implements DbcEntity {
    @Id
    @ColumnDefault("'0'")
    @Column(name = "ID", columnDefinition = "int UNSIGNED not null")
    @Db2Field(fieldIndex = 0, type = Db2Type.INT)
    private Integer id;


    @Column(name = "NameGlobalStringTag")
    @Db2Field(fieldIndex = 1, type = Db2Type.STRING_NOT_LOCALIZED)
    private String nameGlobalStringTag;


    @Column(name = "CostGlobalStringTag")
    @Db2Field(fieldIndex = 2, type = Db2Type.STRING_NOT_LOCALIZED)
    private String costGlobalStringTag;


    @Column(name = "RegenPeace")
    @Db2Field(fieldIndex = 3, type = Db2Type.FLOAT)
    private Float regenPeace;


    @Column(name = "RegenCombat")
    @Db2Field(fieldIndex = 4, type = Db2Type.FLOAT)
    private Float regenCombat;


    @Column(name = "MaxBasePower")
    @Db2Field(fieldIndex = 5, type = Db2Type.SHORT, signed = true)
    private Short maxBasePower;


    @Column(name = "RegenInterruptTimeMS")
    @Db2Field(fieldIndex = 6, type = Db2Type.SHORT, signed = true)
    private Short regenInterruptTimeMS;


    @Column(name = "Flags")
    @Db2Field(fieldIndex = 7, type = Db2Type.SHORT, signed = true)
    private Short flags;


    @Column(name = "PowerTypeEnum")
    @Db2Field(fieldIndex = 8, type = Db2Type.BYTE, signed = true)
    private Byte powerTypeEnum;


    @Column(name = "MinPower")
    @Db2Field(fieldIndex = 9, type = Db2Type.BYTE, signed = true)
    private Byte minPower;


    @Column(name = "CenterPower")
    @Db2Field(fieldIndex = 10, type = Db2Type.BYTE, signed = true)
    private Byte centerPower;


    @Column(name = "DefaultPower")
    @Db2Field(fieldIndex = 11, type = Db2Type.BYTE, signed = true)
    private Byte defaultPower;


    @Column(name = "DisplayModifier")
    @Db2Field(fieldIndex = 12, type = Db2Type.BYTE, signed = true)
    private Byte displayModifier;

    @Id
    @ColumnDefault("0")
    @Column(name = "VerifiedBuild", nullable = false)
    private Integer verifiedBuild;


}
