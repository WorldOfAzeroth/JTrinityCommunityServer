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
@Table(name = "currency_types")
@Db2File(name = "CurrencyTypes.db2", layoutHash = 0x6CC25CBF)
public class CurrencyType implements DbcEntity {
    @Id
    @ColumnDefault("'0'")
    @Column(name = "ID", columnDefinition = "int UNSIGNED not null")
    @Db2Field(fieldIndex = 0, type = Db2Type.INT)
    private Integer id;


    @Column(name = "Name")
    @Db2Field(fieldIndex = 1, type = Db2Type.STRING)
    private LocalizedString name;


    @Column(name = "Description")
    @Db2Field(fieldIndex = 2, type = Db2Type.STRING)
    private LocalizedString description;


    @Column(name = "MaxQty")
    @Db2Field(fieldIndex = 3, type = Db2Type.INT)
    private Integer maxQty;


    @Column(name = "MaxEarnablePerWeek")
    @Db2Field(fieldIndex = 4, type = Db2Type.INT)
    private Integer maxEarnablePerWeek;


    @Column(name = "Flags")
    @Db2Field(fieldIndex = 5, type = Db2Type.INT)
    private Integer flags;


    @Column(name = "CategoryID")
    @Db2Field(fieldIndex = 6, type = Db2Type.BYTE)
    private Byte categoryID;


    @Column(name = "SpellCategory")
    @Db2Field(fieldIndex = 7, type = Db2Type.BYTE)
    private Byte spellCategory;


    @Column(name = "Quality")
    @Db2Field(fieldIndex = 8, type = Db2Type.BYTE)
    private Byte quality;


    @Column(name = "InventoryIconFileID")
    @Db2Field(fieldIndex = 9, type = Db2Type.INT, signed = true)
    private Integer inventoryIconFileID;


    @Column(name = "SpellWeight")
    @Db2Field(fieldIndex = 10, type = Db2Type.INT)
    private Integer spellWeight;

    @Id
    @ColumnDefault("0")
    @Column(name = "VerifiedBuild", nullable = false)
    private Integer verifiedBuild;


}
