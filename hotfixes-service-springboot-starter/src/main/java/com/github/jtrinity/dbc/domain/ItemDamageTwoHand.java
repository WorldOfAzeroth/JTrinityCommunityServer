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
@Table(name = "item_damage_two_hand")
@Db2File(name = "ItemDamageTwoHand.db2", layoutHash = 0xC2186F95)
public class ItemDamageTwoHand implements DbcEntity {
    @Id
    @ColumnDefault("'0'")
    @Column(name = "ID", columnDefinition = "int UNSIGNED not null")
    @Db2Field(fieldIndex = 0, type = Db2Type.INT)
    private Integer id;


    @Column(name = "Quality1")
    @Db2Field(fieldIndex = 1, type = Db2Type.FLOAT)
    private Float quality1;


    @Column(name = "Quality2")
    @Db2Field(fieldIndex = 2, type = Db2Type.FLOAT)
    private Float quality2;


    @Column(name = "Quality3")
    @Db2Field(fieldIndex = 3, type = Db2Type.FLOAT)
    private Float quality3;


    @Column(name = "Quality4")
    @Db2Field(fieldIndex = 4, type = Db2Type.FLOAT)
    private Float quality4;


    @Column(name = "Quality5")
    @Db2Field(fieldIndex = 5, type = Db2Type.FLOAT)
    private Float quality5;


    @Column(name = "Quality6")
    @Db2Field(fieldIndex = 6, type = Db2Type.FLOAT)
    private Float quality6;


    @Column(name = "Quality7")
    @Db2Field(fieldIndex = 7, type = Db2Type.FLOAT)
    private Float quality7;


    @Column(name = "ItemLevel")
    @Db2Field(fieldIndex = 8, type = Db2Type.SHORT)
    private Short itemLevel;

    @Id
    @ColumnDefault("0")
    @Column(name = "VerifiedBuild", nullable = false)
    private Integer verifiedBuild;


}
