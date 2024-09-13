package com.github.jtrinity.hotfixes.domain;

import com.github.jtrinity.hotfixes.db2.Db2Field;
import com.github.jtrinity.hotfixes.db2.Db2File;
import com.github.jtrinity.hotfixes.db2.Db2Type;

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
@Table(name = "modifier_tree")
@Db2File(name = "ModifierTree.db2", fileDataId = 1267645, layoutHash = 0x36C062E7)
public class ModifierTree {
    @Id
    @ColumnDefault("'0'")
    @Column(name = "ID", columnDefinition = "int UNSIGNED not null")
    @Db2Field(fieldIndex = 0, type = Db2Type.INT)
    private Integer id;

    @Id
    @ColumnDefault("0")
    @Column(name = "VerifiedBuild", nullable = false)
    private Integer verifiedBuild;

    @ColumnDefault("'0'")
    @Column(name = "Parent", columnDefinition = "int UNSIGNED not null")
    @Db2Field(fieldIndex = 1, type = Db2Type.INT)
    private Long parent;

    @ColumnDefault("0")
    @Column(name = "Operator", nullable = false)
    @Db2Field(fieldIndex = 2, type = Db2Type.BYTE, signed = true)
    private Byte operator;

    @ColumnDefault("0")
    @Column(name = "Amount", nullable = false)
    @Db2Field(fieldIndex = 3, type = Db2Type.BYTE, signed = true)
    private Byte amount;

    @ColumnDefault("0")
    @Column(name = "Type", nullable = false)
    @Db2Field(fieldIndex = 4, type = Db2Type.INT, signed = true)
    private Integer type;

    @ColumnDefault("0")
    @Column(name = "Asset", nullable = false)
    @Db2Field(fieldIndex = 5, type = Db2Type.INT, signed = true)
    private Integer asset;

    @ColumnDefault("0")
    @Column(name = "SecondaryAsset", nullable = false)
    @Db2Field(fieldIndex = 6, type = Db2Type.INT, signed = true)
    private Integer secondaryAsset;

    @ColumnDefault("0")
    @Column(name = "TertiaryAsset", nullable = false)
    @Db2Field(fieldIndex = 7, type = Db2Type.BYTE, signed = true)
    private Byte tertiaryAsset;

}