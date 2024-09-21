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
@Table(name = "item_modified_appearance")
@Db2File(name = "ItemModifiedAppearance.db2", layoutHash = 0xE64FD18B, indexField = 1, parentIndexField = 0)
public class ItemModifiedAppearance implements DbcEntity {

    @Column(name = "ItemID")
    @Db2Field(fieldIndex = 0, type = Db2Type.INT, signed = true)
    private Integer itemID;

    @Id
    @ColumnDefault("'0'")
    @Column(name = "ID", columnDefinition = "int UNSIGNED not null")
    @Db2Field(fieldIndex = 1, type = Db2Type.INT)
    private Integer id;


    @Column(name = "ItemAppearanceModifierID")
    @Db2Field(fieldIndex = 2, type = Db2Type.BYTE)
    private Byte itemAppearanceModifierID;


    @Column(name = "ItemAppearanceID")
    @Db2Field(fieldIndex = 3, type = Db2Type.SHORT)
    private Short itemAppearanceID;


    @Column(name = "OrderIndex")
    @Db2Field(fieldIndex = 4, type = Db2Type.BYTE)
    private Byte orderIndex;


    @Column(name = "TransmogSourceTypeEnum")
    @Db2Field(fieldIndex = 5, type = Db2Type.BYTE, signed = true)
    private Byte transmogSourceTypeEnum;

    @Id
    @ColumnDefault("0")
    @Column(name = "VerifiedBuild", nullable = false)
    private Integer verifiedBuild;


}
