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
@Table(name = "`lock`")
@Db2File(name = "Lock.db2", layoutHash = 0x82DBCD97)
public class Lock implements DbcEntity {
    @Id
    @ColumnDefault("'0'")
    @Column(name = "ID", columnDefinition = "int UNSIGNED not null")
    @Db2Field(fieldIndex = 0, type = Db2Type.INT)
    private Integer id;

    @Id
    @ColumnDefault("0")
    @Column(name = "VerifiedBuild", nullable = false)
    private Integer verifiedBuild;

    @ColumnDefault("0")
    @Column(name = "Index1", nullable = false)
    @Db2Field(fieldIndex = 1, type = Db2Type.INT, signed = true)
    private Integer index1;

    @ColumnDefault("0")
    @Column(name = "Index2", nullable = false)
    @Db2Field(fieldIndex = 2, type = Db2Type.INT, signed = true)
    private Integer index2;

    @ColumnDefault("0")
    @Column(name = "Index3", nullable = false)
    @Db2Field(fieldIndex = 3, type = Db2Type.INT, signed = true)
    private Integer index3;

    @ColumnDefault("0")
    @Column(name = "Index4", nullable = false)
    @Db2Field(fieldIndex = 4, type = Db2Type.INT, signed = true)
    private Integer index4;

    @ColumnDefault("0")
    @Column(name = "Index5", nullable = false)
    @Db2Field(fieldIndex = 5, type = Db2Type.INT, signed = true)
    private Integer index5;

    @ColumnDefault("0")
    @Column(name = "Index6", nullable = false)
    @Db2Field(fieldIndex = 6, type = Db2Type.INT, signed = true)
    private Integer index6;

    @ColumnDefault("0")
    @Column(name = "Index7", nullable = false)
    @Db2Field(fieldIndex = 7, type = Db2Type.INT, signed = true)
    private Integer index7;

    @ColumnDefault("0")
    @Column(name = "Index8", nullable = false)
    @Db2Field(fieldIndex = 8, type = Db2Type.INT, signed = true)
    private Integer index8;

    @ColumnDefault("'0'")
    @Column(name = "Skill1", columnDefinition = "smallint UNSIGNED not null")
    @Db2Field(fieldIndex = 9, type = Db2Type.SHORT)
    private Integer skill1;

    @ColumnDefault("'0'")
    @Column(name = "Skill2", columnDefinition = "smallint UNSIGNED not null")
    @Db2Field(fieldIndex = 10, type = Db2Type.SHORT)
    private Integer skill2;

    @ColumnDefault("'0'")
    @Column(name = "Skill3", columnDefinition = "smallint UNSIGNED not null")
    @Db2Field(fieldIndex = 11, type = Db2Type.SHORT)
    private Integer skill3;

    @ColumnDefault("'0'")
    @Column(name = "Skill4", columnDefinition = "smallint UNSIGNED not null")
    @Db2Field(fieldIndex = 12, type = Db2Type.SHORT)
    private Integer skill4;

    @ColumnDefault("'0'")
    @Column(name = "Skill5", columnDefinition = "smallint UNSIGNED not null")
    @Db2Field(fieldIndex = 13, type = Db2Type.SHORT)
    private Integer skill5;

    @ColumnDefault("'0'")
    @Column(name = "Skill6", columnDefinition = "smallint UNSIGNED not null")
    @Db2Field(fieldIndex = 14, type = Db2Type.SHORT)
    private Integer skill6;

    @ColumnDefault("'0'")
    @Column(name = "Skill7", columnDefinition = "smallint UNSIGNED not null")
    @Db2Field(fieldIndex = 15, type = Db2Type.SHORT)
    private Integer skill7;

    @ColumnDefault("'0'")
    @Column(name = "Skill8", columnDefinition = "smallint UNSIGNED not null")
    @Db2Field(fieldIndex = 16, type = Db2Type.SHORT)
    private Integer skill8;

    @ColumnDefault("'0'")
    @Column(name = "Type1", columnDefinition = "tinyint UNSIGNED not null")
    @Db2Field(fieldIndex = 17, type = Db2Type.BYTE)
    private Short type1;

    @ColumnDefault("'0'")
    @Column(name = "Type2", columnDefinition = "tinyint UNSIGNED not null")
    @Db2Field(fieldIndex = 18, type = Db2Type.BYTE)
    private Short type2;

    @ColumnDefault("'0'")
    @Column(name = "Type3", columnDefinition = "tinyint UNSIGNED not null")
    @Db2Field(fieldIndex = 19, type = Db2Type.BYTE)
    private Short type3;

    @ColumnDefault("'0'")
    @Column(name = "Type4", columnDefinition = "tinyint UNSIGNED not null")
    @Db2Field(fieldIndex = 20, type = Db2Type.BYTE)
    private Short type4;

    @ColumnDefault("'0'")
    @Column(name = "Type5", columnDefinition = "tinyint UNSIGNED not null")
    @Db2Field(fieldIndex = 21, type = Db2Type.BYTE)
    private Short type5;

    @ColumnDefault("'0'")
    @Column(name = "Type6", columnDefinition = "tinyint UNSIGNED not null")
    @Db2Field(fieldIndex = 22, type = Db2Type.BYTE)
    private Short type6;

    @ColumnDefault("'0'")
    @Column(name = "Type7", columnDefinition = "tinyint UNSIGNED not null")
    @Db2Field(fieldIndex = 23, type = Db2Type.BYTE)
    private Short type7;

    @ColumnDefault("'0'")
    @Column(name = "Type8", columnDefinition = "tinyint UNSIGNED not null")
    @Db2Field(fieldIndex = 24, type = Db2Type.BYTE)
    private Short type8;

    @ColumnDefault("'0'")
    @Column(name = "Action1", columnDefinition = "tinyint UNSIGNED not null")
    @Db2Field(fieldIndex = 25, type = Db2Type.BYTE)
    private Short action1;

    @ColumnDefault("'0'")
    @Column(name = "Action2", columnDefinition = "tinyint UNSIGNED not null")
    @Db2Field(fieldIndex = 26, type = Db2Type.BYTE)
    private Short action2;

    @ColumnDefault("'0'")
    @Column(name = "Action3", columnDefinition = "tinyint UNSIGNED not null")
    @Db2Field(fieldIndex = 27, type = Db2Type.BYTE)
    private Short action3;

    @ColumnDefault("'0'")
    @Column(name = "Action4", columnDefinition = "tinyint UNSIGNED not null")
    @Db2Field(fieldIndex = 28, type = Db2Type.BYTE)
    private Short action4;

    @ColumnDefault("'0'")
    @Column(name = "Action5", columnDefinition = "tinyint UNSIGNED not null")
    @Db2Field(fieldIndex = 29, type = Db2Type.BYTE)
    private Short action5;

    @ColumnDefault("'0'")
    @Column(name = "Action6", columnDefinition = "tinyint UNSIGNED not null")
    @Db2Field(fieldIndex = 30, type = Db2Type.BYTE)
    private Short action6;

    @ColumnDefault("'0'")
    @Column(name = "Action7", columnDefinition = "tinyint UNSIGNED not null")
    @Db2Field(fieldIndex = 31, type = Db2Type.BYTE)
    private Short action7;

    @ColumnDefault("'0'")
    @Column(name = "Action8", columnDefinition = "tinyint UNSIGNED not null")
    @Db2Field(fieldIndex = 32, type = Db2Type.BYTE)
    private Short action8;

}