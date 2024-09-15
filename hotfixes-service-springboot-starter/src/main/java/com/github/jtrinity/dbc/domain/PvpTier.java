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
@Table(name = "pvp_tier")
@Db2File(name = "PvpTier.db2", layoutHash = 0xF5A42A7C, parentIndexField = 5)
public class PvpTier implements DbcEntity {
    @Id
    @ColumnDefault("'0'")
    @Column(name = "ID", columnDefinition = "int UNSIGNED not null")
    @Db2Field(fieldIndex = 0, type = Db2Type.INT)
    private Integer id;

    @Id
    @ColumnDefault("0")
    @Column(name = "VerifiedBuild", nullable = false)
    private Integer verifiedBuild;

    @Lob
    @Column(name = "Name")
    @Db2Field(fieldIndex = 1, type = Db2Type.STRING)
    private String name;

    @ColumnDefault("0")
    @Column(name = "MinRating", nullable = false)
    @Db2Field(fieldIndex = 2, type = Db2Type.SHORT, signed = true)
    private Short minRating;

    @ColumnDefault("0")
    @Column(name = "MaxRating", nullable = false)
    @Db2Field(fieldIndex = 3, type = Db2Type.SHORT, signed = true)
    private Short maxRating;

    @ColumnDefault("0")
    @Column(name = "PrevTier", nullable = false)
    @Db2Field(fieldIndex = 4, type = Db2Type.INT, signed = true)
    private Integer prevTier;

    @ColumnDefault("0")
    @Column(name = "NextTier", nullable = false)
    @Db2Field(fieldIndex = 5, type = Db2Type.INT, signed = true)
    private Integer nextTier;

    @ColumnDefault("'0'")
    @Column(name = "BracketID", columnDefinition = "tinyint UNSIGNED not null")
    @Db2Field(fieldIndex = 6, type = Db2Type.BYTE)
    private Short bracketID;

    @ColumnDefault("0")
    @Column(name = "Rank", nullable = false)
    @Db2Field(fieldIndex = 7, type = Db2Type.BYTE, signed = true)
    private Byte rank;

    @ColumnDefault("0")
    @Column(name = "RankIconFileDataID", nullable = false)
    @Db2Field(fieldIndex = 8, type = Db2Type.INT, signed = true)
    private Integer rankIconFileDataID;

}