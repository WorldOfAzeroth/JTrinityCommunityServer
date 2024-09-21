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
@Table(name = "talent")
@Db2File(name = "Talent.db2", layoutHash = 0xE8850B48)
public class Talent implements DbcEntity {
    @Id
    @ColumnDefault("'0'")
    @Column(name = "ID", columnDefinition = "int UNSIGNED not null")
    @Db2Field(fieldIndex = 0, type = Db2Type.INT)
    private Integer id;


    @Column(name = "Description")
    @Db2Field(fieldIndex = 1, type = Db2Type.STRING)
    private LocalizedString description;


    @Column(name = "SpellID")
    @Db2Field(fieldIndex = 2, type = Db2Type.INT)
    private Integer spellID;


    @Column(name = "OverridesSpellID")
    @Db2Field(fieldIndex = 3, type = Db2Type.INT)
    private Integer overridesSpellID;


    @Column(name = "SpecID")
    @Db2Field(fieldIndex = 4, type = Db2Type.SHORT)
    private Short specID;


    @Column(name = "TierID")
    @Db2Field(fieldIndex = 5, type = Db2Type.BYTE)
    private Byte tierID;


    @Column(name = "ColumnIndex")
    @Db2Field(fieldIndex = 6, type = Db2Type.BYTE)
    private Byte columnIndex;


    @Column(name = "Flags")
    @Db2Field(fieldIndex = 7, type = Db2Type.BYTE)
    private Byte flags;


    @Column(name = "CategoryMask1")
    @Db2Field(fieldIndex = 8, type = Db2Type.BYTE)
    private Byte categoryMask1;


    @Column(name = "CategoryMask2")
    @Db2Field(fieldIndex = 9, type = Db2Type.BYTE)
    private Byte categoryMask2;


    @Column(name = "ClassID")
    @Db2Field(fieldIndex = 10, type = Db2Type.BYTE)
    private Byte classID;

    @Id
    @ColumnDefault("0")
    @Column(name = "VerifiedBuild", nullable = false)
    private Integer verifiedBuild;


}
