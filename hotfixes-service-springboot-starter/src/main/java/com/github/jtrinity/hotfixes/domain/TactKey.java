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
@Table(name = "tact_key")
public class TactKey {
    @Id
    @ColumnDefault("'0'")
    @Column(name = "ID", columnDefinition = "int UNSIGNED not null")
    private Long id;

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

}