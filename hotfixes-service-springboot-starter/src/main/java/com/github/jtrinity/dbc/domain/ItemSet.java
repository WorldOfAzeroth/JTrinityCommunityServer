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
@Table(name = "item_set")
@Db2File(name = "ItemSet.db2", layoutHash = 0x847FF58A)
public class ItemSet implements DbcEntity {
    @Id
    @ColumnDefault("'0'")
    @Column(name = "ID", columnDefinition = "int UNSIGNED not null")
    @Db2Field(fieldIndex = 0, type = Db2Type.INT)
    private Integer id;


    @Column(name = "Name")
    @Db2Field(fieldIndex = 1, type = Db2Type.STRING)
    private LocalizedString name;


    @Column(name = "ItemID1")
    @Db2Field(fieldIndex = 2, type = Db2Type.INT)
    private Integer itemID1;


    @Column(name = "ItemID2")
    @Db2Field(fieldIndex = 3, type = Db2Type.INT)
    private Integer itemID2;


    @Column(name = "ItemID3")
    @Db2Field(fieldIndex = 4, type = Db2Type.INT)
    private Integer itemID3;


    @Column(name = "ItemID4")
    @Db2Field(fieldIndex = 5, type = Db2Type.INT)
    private Integer itemID4;


    @Column(name = "ItemID5")
    @Db2Field(fieldIndex = 6, type = Db2Type.INT)
    private Integer itemID5;


    @Column(name = "ItemID6")
    @Db2Field(fieldIndex = 7, type = Db2Type.INT)
    private Integer itemID6;


    @Column(name = "ItemID7")
    @Db2Field(fieldIndex = 8, type = Db2Type.INT)
    private Integer itemID7;


    @Column(name = "ItemID8")
    @Db2Field(fieldIndex = 9, type = Db2Type.INT)
    private Integer itemID8;


    @Column(name = "ItemID9")
    @Db2Field(fieldIndex = 10, type = Db2Type.INT)
    private Integer itemID9;


    @Column(name = "ItemID10")
    @Db2Field(fieldIndex = 11, type = Db2Type.INT)
    private Integer itemID10;


    @Column(name = "ItemID11")
    @Db2Field(fieldIndex = 12, type = Db2Type.INT)
    private Integer itemID11;


    @Column(name = "ItemID12")
    @Db2Field(fieldIndex = 13, type = Db2Type.INT)
    private Integer itemID12;


    @Column(name = "ItemID13")
    @Db2Field(fieldIndex = 14, type = Db2Type.INT)
    private Integer itemID13;


    @Column(name = "ItemID14")
    @Db2Field(fieldIndex = 15, type = Db2Type.INT)
    private Integer itemID14;


    @Column(name = "ItemID15")
    @Db2Field(fieldIndex = 16, type = Db2Type.INT)
    private Integer itemID15;


    @Column(name = "ItemID16")
    @Db2Field(fieldIndex = 17, type = Db2Type.INT)
    private Integer itemID16;


    @Column(name = "ItemID17")
    @Db2Field(fieldIndex = 18, type = Db2Type.INT)
    private Integer itemID17;


    @Column(name = "RequiredSkillRank")
    @Db2Field(fieldIndex = 19, type = Db2Type.SHORT)
    private Short requiredSkillRank;


    @Column(name = "RequiredSkill")
    @Db2Field(fieldIndex = 20, type = Db2Type.INT)
    private Integer requiredSkill;


    @Column(name = "SetFlags")
    @Db2Field(fieldIndex = 21, type = Db2Type.INT)
    private Integer setFlags;

    @Id
    @ColumnDefault("0")
    @Column(name = "VerifiedBuild", nullable = false)
    private Integer verifiedBuild;


}
