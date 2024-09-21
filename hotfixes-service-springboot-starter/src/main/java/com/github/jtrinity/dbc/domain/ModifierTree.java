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
@Table(name = "modifier_tree")
@Db2File(name = "ModifierTree.db2", layoutHash = 0x7718AFC2)
public class ModifierTree implements DbcEntity {
    @Id
    @ColumnDefault("'0'")
    @Column(name = "ID", columnDefinition = "int UNSIGNED not null")
    @Db2Field(fieldIndex = 0, type = Db2Type.INT)
    private Integer id;


    @Column(name = "Asset")
    @Db2Field(fieldIndex = 1, type = Db2Type.INT, signed = true)
    private Integer asset;


    @Column(name = "SecondaryAsset")
    @Db2Field(fieldIndex = 2, type = Db2Type.INT, signed = true)
    private Integer secondaryAsset;


    @Column(name = "Parent")
    @Db2Field(fieldIndex = 3, type = Db2Type.INT)
    private Integer parent;


    @Column(name = "Type")
    @Db2Field(fieldIndex = 4, type = Db2Type.BYTE)
    private Byte type;


    @Column(name = "TertiaryAsset")
    @Db2Field(fieldIndex = 5, type = Db2Type.BYTE, signed = true)
    private Byte tertiaryAsset;


    @Column(name = "Operator")
    @Db2Field(fieldIndex = 6, type = Db2Type.BYTE, signed = true)
    private Byte operator;


    @Column(name = "Amount")
    @Db2Field(fieldIndex = 7, type = Db2Type.BYTE, signed = true)
    private Byte amount;

    @Id
    @ColumnDefault("0")
    @Column(name = "VerifiedBuild", nullable = false)
    private Integer verifiedBuild;


}
