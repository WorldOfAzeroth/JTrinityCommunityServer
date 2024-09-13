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
@Table(name = "faction_template")
@Db2File(name = "FactionTemplate.db2", fileDataId = 1361579, layoutHash = 0x207C5E80)
public class FactionTemplate {
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
    @Column(name = "Faction", columnDefinition = "smallint UNSIGNED not null")
    @Db2Field(fieldIndex = 1, type = Db2Type.SHORT)
    private Integer faction;

    @ColumnDefault("'0'")
    @Column(name = "Flags", columnDefinition = "smallint UNSIGNED not null")
    @Db2Field(fieldIndex = 2, type = Db2Type.SHORT)
    private Integer flags;

    @ColumnDefault("'0'")
    @Column(name = "FactionGroup", columnDefinition = "tinyint UNSIGNED not null")
    @Db2Field(fieldIndex = 3, type = Db2Type.BYTE)
    private Short factionGroup;

    @ColumnDefault("'0'")
    @Column(name = "FriendGroup", columnDefinition = "tinyint UNSIGNED not null")
    @Db2Field(fieldIndex = 4, type = Db2Type.BYTE)
    private Short friendGroup;

    @ColumnDefault("'0'")
    @Column(name = "EnemyGroup", columnDefinition = "tinyint UNSIGNED not null")
    @Db2Field(fieldIndex = 5, type = Db2Type.BYTE)
    private Short enemyGroup;

    @ColumnDefault("'0'")
    @Column(name = "Enemies1", columnDefinition = "smallint UNSIGNED not null")
    @Db2Field(fieldIndex = 6, type = Db2Type.SHORT)
    private Integer enemies1;

    @ColumnDefault("'0'")
    @Column(name = "Enemies2", columnDefinition = "smallint UNSIGNED not null")
    @Db2Field(fieldIndex = 7, type = Db2Type.SHORT)
    private Integer enemies2;

    @ColumnDefault("'0'")
    @Column(name = "Enemies3", columnDefinition = "smallint UNSIGNED not null")
    @Db2Field(fieldIndex = 8, type = Db2Type.SHORT)
    private Integer enemies3;

    @ColumnDefault("'0'")
    @Column(name = "Enemies4", columnDefinition = "smallint UNSIGNED not null")
    @Db2Field(fieldIndex = 9, type = Db2Type.SHORT)
    private Integer enemies4;

    @ColumnDefault("'0'")
    @Column(name = "Enemies5", columnDefinition = "smallint UNSIGNED not null")
    @Db2Field(fieldIndex = 10, type = Db2Type.SHORT)
    private Integer enemies5;

    @ColumnDefault("'0'")
    @Column(name = "Enemies6", columnDefinition = "smallint UNSIGNED not null")
    @Db2Field(fieldIndex = 11, type = Db2Type.SHORT)
    private Integer enemies6;

    @ColumnDefault("'0'")
    @Column(name = "Enemies7", columnDefinition = "smallint UNSIGNED not null")
    @Db2Field(fieldIndex = 12, type = Db2Type.SHORT)
    private Integer enemies7;

    @ColumnDefault("'0'")
    @Column(name = "Enemies8", columnDefinition = "smallint UNSIGNED not null")
    @Db2Field(fieldIndex = 13, type = Db2Type.SHORT)
    private Integer enemies8;

    @ColumnDefault("'0'")
    @Column(name = "Friend1", columnDefinition = "smallint UNSIGNED not null")
    @Db2Field(fieldIndex = 14, type = Db2Type.SHORT)
    private Integer friend1;

    @ColumnDefault("'0'")
    @Column(name = "Friend2", columnDefinition = "smallint UNSIGNED not null")
    @Db2Field(fieldIndex = 15, type = Db2Type.SHORT)
    private Integer friend2;

    @ColumnDefault("'0'")
    @Column(name = "Friend3", columnDefinition = "smallint UNSIGNED not null")
    @Db2Field(fieldIndex = 16, type = Db2Type.SHORT)
    private Integer friend3;

    @ColumnDefault("'0'")
    @Column(name = "Friend4", columnDefinition = "smallint UNSIGNED not null")
    @Db2Field(fieldIndex = 17, type = Db2Type.SHORT)
    private Integer friend4;

    @ColumnDefault("'0'")
    @Column(name = "Friend5", columnDefinition = "smallint UNSIGNED not null")
    @Db2Field(fieldIndex = 18, type = Db2Type.SHORT)
    private Integer friend5;

    @ColumnDefault("'0'")
    @Column(name = "Friend6", columnDefinition = "smallint UNSIGNED not null")
    @Db2Field(fieldIndex = 19, type = Db2Type.SHORT)
    private Integer friend6;

    @ColumnDefault("'0'")
    @Column(name = "Friend7", columnDefinition = "smallint UNSIGNED not null")
    @Db2Field(fieldIndex = 20, type = Db2Type.SHORT)
    private Integer friend7;

    @ColumnDefault("'0'")
    @Column(name = "Friend8", columnDefinition = "smallint UNSIGNED not null")
    @Db2Field(fieldIndex = 21, type = Db2Type.SHORT)
    private Integer friend8;

}