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
@Table(name = "lock")
@Db2File(name = "Lock.db2", layoutHash = 0xDAC7F42F)
public class Lock implements DbcEntity {
    @Id
    @ColumnDefault("'0'")
    @Column(name = "ID", columnDefinition = "int UNSIGNED not null")
    @Db2Field(fieldIndex = 0, type = Db2Type.INT)
    private Integer id;


    @Column(name = "Index1")
    @Db2Field(fieldIndex = 1, type = Db2Type.INT, signed = true)
    private Integer index1;


    @Column(name = "Index2")
    @Db2Field(fieldIndex = 2, type = Db2Type.INT, signed = true)
    private Integer index2;


    @Column(name = "Index3")
    @Db2Field(fieldIndex = 3, type = Db2Type.INT, signed = true)
    private Integer index3;


    @Column(name = "Index4")
    @Db2Field(fieldIndex = 4, type = Db2Type.INT, signed = true)
    private Integer index4;


    @Column(name = "Index5")
    @Db2Field(fieldIndex = 5, type = Db2Type.INT, signed = true)
    private Integer index5;


    @Column(name = "Index6")
    @Db2Field(fieldIndex = 6, type = Db2Type.INT, signed = true)
    private Integer index6;


    @Column(name = "Index7")
    @Db2Field(fieldIndex = 7, type = Db2Type.INT, signed = true)
    private Integer index7;


    @Column(name = "Index8")
    @Db2Field(fieldIndex = 8, type = Db2Type.INT, signed = true)
    private Integer index8;


    @Column(name = "Skill1")
    @Db2Field(fieldIndex = 9, type = Db2Type.SHORT)
    private Short skill1;


    @Column(name = "Skill2")
    @Db2Field(fieldIndex = 10, type = Db2Type.SHORT)
    private Short skill2;


    @Column(name = "Skill3")
    @Db2Field(fieldIndex = 11, type = Db2Type.SHORT)
    private Short skill3;


    @Column(name = "Skill4")
    @Db2Field(fieldIndex = 12, type = Db2Type.SHORT)
    private Short skill4;


    @Column(name = "Skill5")
    @Db2Field(fieldIndex = 13, type = Db2Type.SHORT)
    private Short skill5;


    @Column(name = "Skill6")
    @Db2Field(fieldIndex = 14, type = Db2Type.SHORT)
    private Short skill6;


    @Column(name = "Skill7")
    @Db2Field(fieldIndex = 15, type = Db2Type.SHORT)
    private Short skill7;


    @Column(name = "Skill8")
    @Db2Field(fieldIndex = 16, type = Db2Type.SHORT)
    private Short skill8;


    @Column(name = "Type1")
    @Db2Field(fieldIndex = 17, type = Db2Type.BYTE)
    private Byte type1;


    @Column(name = "Type2")
    @Db2Field(fieldIndex = 18, type = Db2Type.BYTE)
    private Byte type2;


    @Column(name = "Type3")
    @Db2Field(fieldIndex = 19, type = Db2Type.BYTE)
    private Byte type3;


    @Column(name = "Type4")
    @Db2Field(fieldIndex = 20, type = Db2Type.BYTE)
    private Byte type4;


    @Column(name = "Type5")
    @Db2Field(fieldIndex = 21, type = Db2Type.BYTE)
    private Byte type5;


    @Column(name = "Type6")
    @Db2Field(fieldIndex = 22, type = Db2Type.BYTE)
    private Byte type6;


    @Column(name = "Type7")
    @Db2Field(fieldIndex = 23, type = Db2Type.BYTE)
    private Byte type7;


    @Column(name = "Type8")
    @Db2Field(fieldIndex = 24, type = Db2Type.BYTE)
    private Byte type8;


    @Column(name = "Action1")
    @Db2Field(fieldIndex = 25, type = Db2Type.BYTE)
    private Byte action1;


    @Column(name = "Action2")
    @Db2Field(fieldIndex = 26, type = Db2Type.BYTE)
    private Byte action2;


    @Column(name = "Action3")
    @Db2Field(fieldIndex = 27, type = Db2Type.BYTE)
    private Byte action3;


    @Column(name = "Action4")
    @Db2Field(fieldIndex = 28, type = Db2Type.BYTE)
    private Byte action4;


    @Column(name = "Action5")
    @Db2Field(fieldIndex = 29, type = Db2Type.BYTE)
    private Byte action5;


    @Column(name = "Action6")
    @Db2Field(fieldIndex = 30, type = Db2Type.BYTE)
    private Byte action6;


    @Column(name = "Action7")
    @Db2Field(fieldIndex = 31, type = Db2Type.BYTE)
    private Byte action7;


    @Column(name = "Action8")
    @Db2Field(fieldIndex = 32, type = Db2Type.BYTE)
    private Byte action8;

    @Id
    @ColumnDefault("0")
    @Column(name = "VerifiedBuild", nullable = false)
    private Integer verifiedBuild;


}
