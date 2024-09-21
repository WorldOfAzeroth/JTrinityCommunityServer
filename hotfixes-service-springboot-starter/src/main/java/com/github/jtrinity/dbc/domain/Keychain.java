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
@Table(name = "keychain")
@Db2File(name = "Keychain.db2", layoutHash = 0x5B214E82)
public class Keychain implements DbcEntity {
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


    @Column(name = "Key17")
    @Db2Field(fieldIndex = 17, type = Db2Type.BYTE)
    private Byte key17;


    @Column(name = "Key18")
    @Db2Field(fieldIndex = 18, type = Db2Type.BYTE)
    private Byte key18;


    @Column(name = "Key19")
    @Db2Field(fieldIndex = 19, type = Db2Type.BYTE)
    private Byte key19;


    @Column(name = "Key20")
    @Db2Field(fieldIndex = 20, type = Db2Type.BYTE)
    private Byte key20;


    @Column(name = "Key21")
    @Db2Field(fieldIndex = 21, type = Db2Type.BYTE)
    private Byte key21;


    @Column(name = "Key22")
    @Db2Field(fieldIndex = 22, type = Db2Type.BYTE)
    private Byte key22;


    @Column(name = "Key23")
    @Db2Field(fieldIndex = 23, type = Db2Type.BYTE)
    private Byte key23;


    @Column(name = "Key24")
    @Db2Field(fieldIndex = 24, type = Db2Type.BYTE)
    private Byte key24;


    @Column(name = "Key25")
    @Db2Field(fieldIndex = 25, type = Db2Type.BYTE)
    private Byte key25;


    @Column(name = "Key26")
    @Db2Field(fieldIndex = 26, type = Db2Type.BYTE)
    private Byte key26;


    @Column(name = "Key27")
    @Db2Field(fieldIndex = 27, type = Db2Type.BYTE)
    private Byte key27;


    @Column(name = "Key28")
    @Db2Field(fieldIndex = 28, type = Db2Type.BYTE)
    private Byte key28;


    @Column(name = "Key29")
    @Db2Field(fieldIndex = 29, type = Db2Type.BYTE)
    private Byte key29;


    @Column(name = "Key30")
    @Db2Field(fieldIndex = 30, type = Db2Type.BYTE)
    private Byte key30;


    @Column(name = "Key31")
    @Db2Field(fieldIndex = 31, type = Db2Type.BYTE)
    private Byte key31;


    @Column(name = "Key32")
    @Db2Field(fieldIndex = 32, type = Db2Type.BYTE)
    private Byte key32;

    @Id
    @ColumnDefault("0")
    @Column(name = "VerifiedBuild", nullable = false)
    private Integer verifiedBuild;


}
