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
@Table(name = "tact_key")
@Db2File(name = "TactKey.db2", layoutHash = 0xF0F98B62)
public class TactKey implements DbcEntity {
    @Id
    @ColumnDefault("'0'")
    @Column(name = "ID", columnDefinition = "int UNSIGNED not null")
    @Db2Field(fieldIndex = 0, type = Db2Type.INT)
    private Integer id;


    @Column(name = "Key1")
    @Db2Field(fieldIndex = 1, type = Db2Type.BYTE)
    private Byte key1;


    @Column(name = "Key2")
    @Db2Field(fieldIndex = 2, type = Db2Type.BYTE)
    private Byte key2;


    @Column(name = "Key3")
    @Db2Field(fieldIndex = 3, type = Db2Type.BYTE)
    private Byte key3;


    @Column(name = "Key4")
    @Db2Field(fieldIndex = 4, type = Db2Type.BYTE)
    private Byte key4;


    @Column(name = "Key5")
    @Db2Field(fieldIndex = 5, type = Db2Type.BYTE)
    private Byte key5;


    @Column(name = "Key6")
    @Db2Field(fieldIndex = 6, type = Db2Type.BYTE)
    private Byte key6;


    @Column(name = "Key7")
    @Db2Field(fieldIndex = 7, type = Db2Type.BYTE)
    private Byte key7;


    @Column(name = "Key8")
    @Db2Field(fieldIndex = 8, type = Db2Type.BYTE)
    private Byte key8;


    @Column(name = "Key9")
    @Db2Field(fieldIndex = 9, type = Db2Type.BYTE)
    private Byte key9;


    @Column(name = "Key10")
    @Db2Field(fieldIndex = 10, type = Db2Type.BYTE)
    private Byte key10;


    @Column(name = "Key11")
    @Db2Field(fieldIndex = 11, type = Db2Type.BYTE)
    private Byte key11;


    @Column(name = "Key12")
    @Db2Field(fieldIndex = 12, type = Db2Type.BYTE)
    private Byte key12;


    @Column(name = "Key13")
    @Db2Field(fieldIndex = 13, type = Db2Type.BYTE)
    private Byte key13;


    @Column(name = "Key14")
    @Db2Field(fieldIndex = 14, type = Db2Type.BYTE)
    private Byte key14;


    @Column(name = "Key15")
    @Db2Field(fieldIndex = 15, type = Db2Type.BYTE)
    private Byte key15;


    @Column(name = "Key16")
    @Db2Field(fieldIndex = 16, type = Db2Type.BYTE)
    private Byte key16;

    @Id
    @ColumnDefault("0")
    @Column(name = "VerifiedBuild", nullable = false)
    private Integer verifiedBuild;


}
