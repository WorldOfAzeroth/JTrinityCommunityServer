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
@Table(name = "override_spell_data")
@Db2File(name = "OverrideSpellData.db2", layoutHash = 0x9417628C)
public class OverrideSpellData implements DbcEntity {
    @Id
    @ColumnDefault("'0'")
    @Column(name = "ID", columnDefinition = "int UNSIGNED not null")
    @Db2Field(fieldIndex = 0, type = Db2Type.INT)
    private Integer id;


    @Column(name = "Spells1")
    @Db2Field(fieldIndex = 1, type = Db2Type.INT, signed = true)
    private Integer spells1;


    @Column(name = "Spells2")
    @Db2Field(fieldIndex = 2, type = Db2Type.INT, signed = true)
    private Integer spells2;


    @Column(name = "Spells3")
    @Db2Field(fieldIndex = 3, type = Db2Type.INT, signed = true)
    private Integer spells3;


    @Column(name = "Spells4")
    @Db2Field(fieldIndex = 4, type = Db2Type.INT, signed = true)
    private Integer spells4;


    @Column(name = "Spells5")
    @Db2Field(fieldIndex = 5, type = Db2Type.INT, signed = true)
    private Integer spells5;


    @Column(name = "Spells6")
    @Db2Field(fieldIndex = 6, type = Db2Type.INT, signed = true)
    private Integer spells6;


    @Column(name = "Spells7")
    @Db2Field(fieldIndex = 7, type = Db2Type.INT, signed = true)
    private Integer spells7;


    @Column(name = "Spells8")
    @Db2Field(fieldIndex = 8, type = Db2Type.INT, signed = true)
    private Integer spells8;


    @Column(name = "Spells9")
    @Db2Field(fieldIndex = 9, type = Db2Type.INT, signed = true)
    private Integer spells9;


    @Column(name = "Spells10")
    @Db2Field(fieldIndex = 10, type = Db2Type.INT, signed = true)
    private Integer spells10;


    @Column(name = "PlayerActionBarFileDataID")
    @Db2Field(fieldIndex = 11, type = Db2Type.INT, signed = true)
    private Integer playerActionBarFileDataID;


    @Column(name = "Flags")
    @Db2Field(fieldIndex = 12, type = Db2Type.BYTE)
    private Byte flags;

    @Id
    @ColumnDefault("0")
    @Column(name = "VerifiedBuild", nullable = false)
    private Integer verifiedBuild;


}
