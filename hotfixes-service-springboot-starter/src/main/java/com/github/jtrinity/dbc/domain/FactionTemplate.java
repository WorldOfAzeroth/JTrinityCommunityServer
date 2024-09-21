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
@Table(name = "faction_template")
@Db2File(name = "FactionTemplate.db2", layoutHash = 0x6F1D2135)
public class FactionTemplate implements DbcEntity {
    @Id
    @ColumnDefault("'0'")
    @Column(name = "ID", columnDefinition = "int UNSIGNED not null")
    @Db2Field(fieldIndex = 0, type = Db2Type.INT)
    private Integer id;


    @Column(name = "Faction")
    @Db2Field(fieldIndex = 1, type = Db2Type.SHORT)
    private Short faction;


    @Column(name = "Flags")
    @Db2Field(fieldIndex = 2, type = Db2Type.SHORT)
    private Short flags;


    @Column(name = "Enemies1")
    @Db2Field(fieldIndex = 3, type = Db2Type.SHORT)
    private Short enemies1;


    @Column(name = "Enemies2")
    @Db2Field(fieldIndex = 4, type = Db2Type.SHORT)
    private Short enemies2;


    @Column(name = "Enemies3")
    @Db2Field(fieldIndex = 5, type = Db2Type.SHORT)
    private Short enemies3;


    @Column(name = "Enemies4")
    @Db2Field(fieldIndex = 6, type = Db2Type.SHORT)
    private Short enemies4;


    @Column(name = "Friend1")
    @Db2Field(fieldIndex = 7, type = Db2Type.SHORT)
    private Short friend1;


    @Column(name = "Friend2")
    @Db2Field(fieldIndex = 8, type = Db2Type.SHORT)
    private Short friend2;


    @Column(name = "Friend3")
    @Db2Field(fieldIndex = 9, type = Db2Type.SHORT)
    private Short friend3;


    @Column(name = "Friend4")
    @Db2Field(fieldIndex = 10, type = Db2Type.SHORT)
    private Short friend4;


    @Column(name = "FactionGroup")
    @Db2Field(fieldIndex = 11, type = Db2Type.BYTE)
    private Byte factionGroup;


    @Column(name = "FriendGroup")
    @Db2Field(fieldIndex = 12, type = Db2Type.BYTE)
    private Byte friendGroup;


    @Column(name = "EnemyGroup")
    @Db2Field(fieldIndex = 13, type = Db2Type.BYTE)
    private Byte enemyGroup;

    @Id
    @ColumnDefault("0")
    @Column(name = "VerifiedBuild", nullable = false)
    private Integer verifiedBuild;


}
