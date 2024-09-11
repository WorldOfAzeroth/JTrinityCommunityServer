package com.github.jtrinity.hotfixes.domain;

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
public class Keychain {
    @Id
    @ColumnDefault("'0'")
    @Column(name = "ID", columnDefinition = "int UNSIGNED not null")
    private Integer id;

    @Id
    @ColumnDefault("0")
    @Column(name = "VerifiedBuild", nullable = false)
    private Integer verifiedBuild;

    @ColumnDefault("'0'")
    @Column(name = "Key1", columnDefinition = "tinyint UNSIGNED not null")
    private Short key1;

    @ColumnDefault("'0'")
    @Column(name = "Key2", columnDefinition = "tinyint UNSIGNED not null")
    private Short key2;

    @ColumnDefault("'0'")
    @Column(name = "Key3", columnDefinition = "tinyint UNSIGNED not null")
    private Short key3;

    @ColumnDefault("'0'")
    @Column(name = "Key4", columnDefinition = "tinyint UNSIGNED not null")
    private Short key4;

    @ColumnDefault("'0'")
    @Column(name = "Key5", columnDefinition = "tinyint UNSIGNED not null")
    private Short key5;

    @ColumnDefault("'0'")
    @Column(name = "Key6", columnDefinition = "tinyint UNSIGNED not null")
    private Short key6;

    @ColumnDefault("'0'")
    @Column(name = "Key7", columnDefinition = "tinyint UNSIGNED not null")
    private Short key7;

    @ColumnDefault("'0'")
    @Column(name = "Key8", columnDefinition = "tinyint UNSIGNED not null")
    private Short key8;

    @ColumnDefault("'0'")
    @Column(name = "Key9", columnDefinition = "tinyint UNSIGNED not null")
    private Short key9;

    @ColumnDefault("'0'")
    @Column(name = "Key10", columnDefinition = "tinyint UNSIGNED not null")
    private Short key10;

    @ColumnDefault("'0'")
    @Column(name = "Key11", columnDefinition = "tinyint UNSIGNED not null")
    private Short key11;

    @ColumnDefault("'0'")
    @Column(name = "Key12", columnDefinition = "tinyint UNSIGNED not null")
    private Short key12;

    @ColumnDefault("'0'")
    @Column(name = "Key13", columnDefinition = "tinyint UNSIGNED not null")
    private Short key13;

    @ColumnDefault("'0'")
    @Column(name = "Key14", columnDefinition = "tinyint UNSIGNED not null")
    private Short key14;

    @ColumnDefault("'0'")
    @Column(name = "Key15", columnDefinition = "tinyint UNSIGNED not null")
    private Short key15;

    @ColumnDefault("'0'")
    @Column(name = "Key16", columnDefinition = "tinyint UNSIGNED not null")
    private Short key16;

    @ColumnDefault("'0'")
    @Column(name = "Key17", columnDefinition = "tinyint UNSIGNED not null")
    private Short key17;

    @ColumnDefault("'0'")
    @Column(name = "Key18", columnDefinition = "tinyint UNSIGNED not null")
    private Short key18;

    @ColumnDefault("'0'")
    @Column(name = "Key19", columnDefinition = "tinyint UNSIGNED not null")
    private Short key19;

    @ColumnDefault("'0'")
    @Column(name = "Key20", columnDefinition = "tinyint UNSIGNED not null")
    private Short key20;

    @ColumnDefault("'0'")
    @Column(name = "Key21", columnDefinition = "tinyint UNSIGNED not null")
    private Short key21;

    @ColumnDefault("'0'")
    @Column(name = "Key22", columnDefinition = "tinyint UNSIGNED not null")
    private Short key22;

    @ColumnDefault("'0'")
    @Column(name = "Key23", columnDefinition = "tinyint UNSIGNED not null")
    private Short key23;

    @ColumnDefault("'0'")
    @Column(name = "Key24", columnDefinition = "tinyint UNSIGNED not null")
    private Short key24;

    @ColumnDefault("'0'")
    @Column(name = "Key25", columnDefinition = "tinyint UNSIGNED not null")
    private Short key25;

    @ColumnDefault("'0'")
    @Column(name = "Key26", columnDefinition = "tinyint UNSIGNED not null")
    private Short key26;

    @ColumnDefault("'0'")
    @Column(name = "Key27", columnDefinition = "tinyint UNSIGNED not null")
    private Short key27;

    @ColumnDefault("'0'")
    @Column(name = "Key28", columnDefinition = "tinyint UNSIGNED not null")
    private Short key28;

    @ColumnDefault("'0'")
    @Column(name = "Key29", columnDefinition = "tinyint UNSIGNED not null")
    private Short key29;

    @ColumnDefault("'0'")
    @Column(name = "Key30", columnDefinition = "tinyint UNSIGNED not null")
    private Short key30;

    @ColumnDefault("'0'")
    @Column(name = "Key31", columnDefinition = "tinyint UNSIGNED not null")
    private Short key31;

    @ColumnDefault("'0'")
    @Column(name = "Key32", columnDefinition = "tinyint UNSIGNED not null")
    private Short key32;

}