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
@Table(name = "item")
@Db2File(name = "Item.db2", layoutHash = 0x0DFCC83D)
public class Item implements DbcEntity {
    @Id
    @ColumnDefault("'0'")
    @Column(name = "ID", columnDefinition = "int UNSIGNED not null")
    @Db2Field(fieldIndex = 0, type = Db2Type.INT)
    private Integer id;


    @Column(name = "IconFileDataID")
    @Db2Field(fieldIndex = 1, type = Db2Type.INT, signed = true)
    private Integer iconFileDataID;


    @Column(name = "ClassID")
    @Db2Field(fieldIndex = 2, type = Db2Type.BYTE)
    private Byte classID;


    @Column(name = "SubclassID")
    @Db2Field(fieldIndex = 3, type = Db2Type.BYTE)
    private Byte subclassID;


    @Column(name = "SoundOverrideSubclassID")
    @Db2Field(fieldIndex = 4, type = Db2Type.BYTE, signed = true)
    private Byte soundOverrideSubclassID;


    @Column(name = "Material")
    @Db2Field(fieldIndex = 5, type = Db2Type.BYTE)
    private Byte material;


    @Column(name = "InventoryType")
    @Db2Field(fieldIndex = 6, type = Db2Type.BYTE)
    private Byte inventoryType;


    @Column(name = "SheatheType")
    @Db2Field(fieldIndex = 7, type = Db2Type.BYTE)
    private Byte sheatheType;


    @Column(name = "ItemGroupSoundsID")
    @Db2Field(fieldIndex = 8, type = Db2Type.BYTE)
    private Byte itemGroupSoundsID;

    @Id
    @ColumnDefault("0")
    @Column(name = "VerifiedBuild", nullable = false)
    private Integer verifiedBuild;


}
