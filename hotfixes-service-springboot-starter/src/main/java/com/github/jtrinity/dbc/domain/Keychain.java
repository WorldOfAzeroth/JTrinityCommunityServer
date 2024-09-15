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
@Table(name = "keychain")
@Db2File(name = "Keychain.db2", layoutHash = 0x683DDBCE)
public class Keychain implements DbcEntity {
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
    @Column(name = "Key1", columnDefinition = "tinyint UNSIGNED not null")
    @Db2Field(fieldIndex = 1, type = Db2Type.BYTE)
    private Short key1;

    @ColumnDefault("'0'")
    @Column(name = "Key2", columnDefinition = "tinyint UNSIGNED not null")
    @Db2Field(fieldIndex = 2, type = Db2Type.BYTE)
    private Short key2;

    @ColumnDefault("'0'")
    @Column(name = "Key3", columnDefinition = "tinyint UNSIGNED not null")
    @Db2Field(fieldIndex = 3, type = Db2Type.BYTE)
    private Short key3;

    @ColumnDefault("'0'")
    @Column(name = "Key4", columnDefinition = "tinyint UNSIGNED not null")
    @Db2Field(fieldIndex = 4, type = Db2Type.BYTE)
    private Short key4;

    @ColumnDefault("'0'")
    @Column(name = "Key5", columnDefinition = "tinyint UNSIGNED not null")
    @Db2Field(fieldIndex = 5, type = Db2Type.BYTE)
    private Short key5;

    @ColumnDefault("'0'")
    @Column(name = "Key6", columnDefinition = "tinyint UNSIGNED not null")
    @Db2Field(fieldIndex = 6, type = Db2Type.BYTE)
    private Short key6;

    @ColumnDefault("'0'")
    @Column(name = "Key7", columnDefinition = "tinyint UNSIGNED not null")
    @Db2Field(fieldIndex = 7, type = Db2Type.BYTE)
    private Short key7;

    @ColumnDefault("'0'")
    @Column(name = "Key8", columnDefinition = "tinyint UNSIGNED not null")
    @Db2Field(fieldIndex = 8, type = Db2Type.BYTE)
    private Short key8;

    @ColumnDefault("'0'")
    @Column(name = "Key9", columnDefinition = "tinyint UNSIGNED not null")
    @Db2Field(fieldIndex = 9, type = Db2Type.BYTE)
    private Short key9;

    @ColumnDefault("'0'")
    @Column(name = "Key10", columnDefinition = "tinyint UNSIGNED not null")
    @Db2Field(fieldIndex = 10, type = Db2Type.BYTE)
    private Short key10;

    @ColumnDefault("'0'")
    @Column(name = "Key11", columnDefinition = "tinyint UNSIGNED not null")
    @Db2Field(fieldIndex = 11, type = Db2Type.BYTE)
    private Short key11;

    @ColumnDefault("'0'")
    @Column(name = "Key12", columnDefinition = "tinyint UNSIGNED not null")
    @Db2Field(fieldIndex = 12, type = Db2Type.BYTE)
    private Short key12;

    @ColumnDefault("'0'")
    @Column(name = "Key13", columnDefinition = "tinyint UNSIGNED not null")
    @Db2Field(fieldIndex = 13, type = Db2Type.BYTE)
    private Short key13;

    @ColumnDefault("'0'")
    @Column(name = "Key14", columnDefinition = "tinyint UNSIGNED not null")
    @Db2Field(fieldIndex = 14, type = Db2Type.BYTE)
    private Short key14;

    @ColumnDefault("'0'")
    @Column(name = "Key15", columnDefinition = "tinyint UNSIGNED not null")
    @Db2Field(fieldIndex = 15, type = Db2Type.BYTE)
    private Short key15;

    @ColumnDefault("'0'")
    @Column(name = "Key16", columnDefinition = "tinyint UNSIGNED not null")
    @Db2Field(fieldIndex = 16, type = Db2Type.BYTE)
    private Short key16;

    @ColumnDefault("'0'")
    @Column(name = "Key17", columnDefinition = "tinyint UNSIGNED not null")
    @Db2Field(fieldIndex = 17, type = Db2Type.BYTE)
    private Short key17;

    @ColumnDefault("'0'")
    @Column(name = "Key18", columnDefinition = "tinyint UNSIGNED not null")
    @Db2Field(fieldIndex = 18, type = Db2Type.BYTE)
    private Short key18;

    @ColumnDefault("'0'")
    @Column(name = "Key19", columnDefinition = "tinyint UNSIGNED not null")
    @Db2Field(fieldIndex = 19, type = Db2Type.BYTE)
    private Short key19;

    @ColumnDefault("'0'")
    @Column(name = "Key20", columnDefinition = "tinyint UNSIGNED not null")
    @Db2Field(fieldIndex = 20, type = Db2Type.BYTE)
    private Short key20;

    @ColumnDefault("'0'")
    @Column(name = "Key21", columnDefinition = "tinyint UNSIGNED not null")
    @Db2Field(fieldIndex = 21, type = Db2Type.BYTE)
    private Short key21;

    @ColumnDefault("'0'")
    @Column(name = "Key22", columnDefinition = "tinyint UNSIGNED not null")
    @Db2Field(fieldIndex = 22, type = Db2Type.BYTE)
    private Short key22;

    @ColumnDefault("'0'")
    @Column(name = "Key23", columnDefinition = "tinyint UNSIGNED not null")
    @Db2Field(fieldIndex = 23, type = Db2Type.BYTE)
    private Short key23;

    @ColumnDefault("'0'")
    @Column(name = "Key24", columnDefinition = "tinyint UNSIGNED not null")
    @Db2Field(fieldIndex = 24, type = Db2Type.BYTE)
    private Short key24;

    @ColumnDefault("'0'")
    @Column(name = "Key25", columnDefinition = "tinyint UNSIGNED not null")
    @Db2Field(fieldIndex = 25, type = Db2Type.BYTE)
    private Short key25;

    @ColumnDefault("'0'")
    @Column(name = "Key26", columnDefinition = "tinyint UNSIGNED not null")
    @Db2Field(fieldIndex = 26, type = Db2Type.BYTE)
    private Short key26;

    @ColumnDefault("'0'")
    @Column(name = "Key27", columnDefinition = "tinyint UNSIGNED not null")
    @Db2Field(fieldIndex = 27, type = Db2Type.BYTE)
    private Short key27;

    @ColumnDefault("'0'")
    @Column(name = "Key28", columnDefinition = "tinyint UNSIGNED not null")
    @Db2Field(fieldIndex = 28, type = Db2Type.BYTE)
    private Short key28;

    @ColumnDefault("'0'")
    @Column(name = "Key29", columnDefinition = "tinyint UNSIGNED not null")
    @Db2Field(fieldIndex = 29, type = Db2Type.BYTE)
    private Short key29;

    @ColumnDefault("'0'")
    @Column(name = "Key30", columnDefinition = "tinyint UNSIGNED not null")
    @Db2Field(fieldIndex = 30, type = Db2Type.BYTE)
    private Short key30;

    @ColumnDefault("'0'")
    @Column(name = "Key31", columnDefinition = "tinyint UNSIGNED not null")
    @Db2Field(fieldIndex = 31, type = Db2Type.BYTE)
    private Short key31;

    @ColumnDefault("'0'")
    @Column(name = "Key32", columnDefinition = "tinyint UNSIGNED not null")
    @Db2Field(fieldIndex = 32, type = Db2Type.BYTE)
    private Short key32;

}