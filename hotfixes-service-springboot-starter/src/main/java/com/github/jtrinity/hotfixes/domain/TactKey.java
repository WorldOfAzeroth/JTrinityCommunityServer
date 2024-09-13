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
@Table(name = "tact_key")
@Db2File(name = "TactKey.db2", fileDataId = 1302850, layoutHash = 0xD3F61A9E)
public class TactKey {
    @Id
    @ColumnDefault("'0'")
    @Column(name = "ID", columnDefinition = "int UNSIGNED not null")
    @Db2Field(fieldIndex = 0, type = Db2Type.INT)
    private Long id;

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

}