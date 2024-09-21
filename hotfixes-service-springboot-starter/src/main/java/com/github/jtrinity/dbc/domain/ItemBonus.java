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
@Table(name = "item_bonus")
@Db2File(name = "ItemBonus.db2", layoutHash = 0xE12FB1A0, parentIndexField = 1)
public class ItemBonus implements DbcEntity {
    @Id
    @ColumnDefault("'0'")
    @Column(name = "ID", columnDefinition = "int UNSIGNED not null")
    @Db2Field(fieldIndex = 0, type = Db2Type.INT)
    private Integer id;


    @Column(name = "Value1")
    @Db2Field(fieldIndex = 1, type = Db2Type.INT, signed = true)
    private Integer value1;


    @Column(name = "Value2")
    @Db2Field(fieldIndex = 2, type = Db2Type.INT, signed = true)
    private Integer value2;


    @Column(name = "Value3")
    @Db2Field(fieldIndex = 3, type = Db2Type.INT, signed = true)
    private Integer value3;


    @Column(name = "ParentItemBonusListID")
    @Db2Field(fieldIndex = 4, type = Db2Type.SHORT)
    private Short parentItemBonusListID;


    @Column(name = "Type")
    @Db2Field(fieldIndex = 5, type = Db2Type.BYTE)
    private Byte type;


    @Column(name = "OrderIndex")
    @Db2Field(fieldIndex = 6, type = Db2Type.BYTE)
    private Byte orderIndex;

    @Id
    @ColumnDefault("0")
    @Column(name = "VerifiedBuild", nullable = false)
    private Integer verifiedBuild;


}
