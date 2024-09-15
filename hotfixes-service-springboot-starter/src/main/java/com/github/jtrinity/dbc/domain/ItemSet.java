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
@Table(name = "item_set")
@Db2File(name = "ItemSet.db2", layoutHash = 0x4F7008BF)
public class ItemSet implements DbcEntity {
    @Id
    @ColumnDefault("'0'")
    @Column(name = "ID", columnDefinition = "int UNSIGNED not null")
    @Db2Field(fieldIndex = 0, type = Db2Type.INT)
    private Integer id;

    @Id
    @ColumnDefault("0")
    @Column(name = "VerifiedBuild", nullable = false)
    private Integer verifiedBuild;

    @Lob
    @Column(name = "Name")
    @Db2Field(fieldIndex = 1, type = Db2Type.STRING)
    private String name;

    @ColumnDefault("'0'")
    @Column(name = "SetFlags", columnDefinition = "int UNSIGNED not null")
    @Db2Field(fieldIndex = 2, type = Db2Type.INT)
    private Long setFlags;

    @ColumnDefault("'0'")
    @Column(name = "RequiredSkill", columnDefinition = "int UNSIGNED not null")
    @Db2Field(fieldIndex = 3, type = Db2Type.INT)
    private Long requiredSkill;

    @ColumnDefault("'0'")
    @Column(name = "RequiredSkillRank", columnDefinition = "smallint UNSIGNED not null")
    @Db2Field(fieldIndex = 4, type = Db2Type.SHORT)
    private Integer requiredSkillRank;

    @ColumnDefault("'0'")
    @Column(name = "ItemID1", columnDefinition = "int UNSIGNED not null")
    @Db2Field(fieldIndex = 5, type = Db2Type.INT)
    private Long itemID1;

    @ColumnDefault("'0'")
    @Column(name = "ItemID2", columnDefinition = "int UNSIGNED not null")
    @Db2Field(fieldIndex = 6, type = Db2Type.INT)
    private Long itemID2;

    @ColumnDefault("'0'")
    @Column(name = "ItemID3", columnDefinition = "int UNSIGNED not null")
    @Db2Field(fieldIndex = 7, type = Db2Type.INT)
    private Long itemID3;

    @ColumnDefault("'0'")
    @Column(name = "ItemID4", columnDefinition = "int UNSIGNED not null")
    @Db2Field(fieldIndex = 8, type = Db2Type.INT)
    private Long itemID4;

    @ColumnDefault("'0'")
    @Column(name = "ItemID5", columnDefinition = "int UNSIGNED not null")
    @Db2Field(fieldIndex = 9, type = Db2Type.INT)
    private Long itemID5;

    @ColumnDefault("'0'")
    @Column(name = "ItemID6", columnDefinition = "int UNSIGNED not null")
    @Db2Field(fieldIndex = 10, type = Db2Type.INT)
    private Long itemID6;

    @ColumnDefault("'0'")
    @Column(name = "ItemID7", columnDefinition = "int UNSIGNED not null")
    @Db2Field(fieldIndex = 11, type = Db2Type.INT)
    private Long itemID7;

    @ColumnDefault("'0'")
    @Column(name = "ItemID8", columnDefinition = "int UNSIGNED not null")
    @Db2Field(fieldIndex = 12, type = Db2Type.INT)
    private Long itemID8;

    @ColumnDefault("'0'")
    @Column(name = "ItemID9", columnDefinition = "int UNSIGNED not null")
    @Db2Field(fieldIndex = 13, type = Db2Type.INT)
    private Long itemID9;

    @ColumnDefault("'0'")
    @Column(name = "ItemID10", columnDefinition = "int UNSIGNED not null")
    @Db2Field(fieldIndex = 14, type = Db2Type.INT)
    private Long itemID10;

    @ColumnDefault("'0'")
    @Column(name = "ItemID11", columnDefinition = "int UNSIGNED not null")
    @Db2Field(fieldIndex = 15, type = Db2Type.INT)
    private Long itemID11;

    @ColumnDefault("'0'")
    @Column(name = "ItemID12", columnDefinition = "int UNSIGNED not null")
    @Db2Field(fieldIndex = 16, type = Db2Type.INT)
    private Long itemID12;

    @ColumnDefault("'0'")
    @Column(name = "ItemID13", columnDefinition = "int UNSIGNED not null")
    @Db2Field(fieldIndex = 17, type = Db2Type.INT)
    private Long itemID13;

    @ColumnDefault("'0'")
    @Column(name = "ItemID14", columnDefinition = "int UNSIGNED not null")
    @Db2Field(fieldIndex = 18, type = Db2Type.INT)
    private Long itemID14;

    @ColumnDefault("'0'")
    @Column(name = "ItemID15", columnDefinition = "int UNSIGNED not null")
    @Db2Field(fieldIndex = 19, type = Db2Type.INT)
    private Long itemID15;

    @ColumnDefault("'0'")
    @Column(name = "ItemID16", columnDefinition = "int UNSIGNED not null")
    @Db2Field(fieldIndex = 20, type = Db2Type.INT)
    private Long itemID16;

    @ColumnDefault("'0'")
    @Column(name = "ItemID17", columnDefinition = "int UNSIGNED not null")
    @Db2Field(fieldIndex = 21, type = Db2Type.INT)
    private Long itemID17;

}