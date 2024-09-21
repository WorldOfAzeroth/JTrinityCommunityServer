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
@Table(name = "pvp_talent")
@Db2File(name = "PvpTalent.db2", layoutHash = 0x6EB51740)
public class PvpTalent implements DbcEntity {
    @Id
    @ColumnDefault("'0'")
    @Column(name = "ID", columnDefinition = "int UNSIGNED not null")
    @Db2Field(fieldIndex = 0, type = Db2Type.INT)
    private Integer id;


    @Column(name = "Description")
    @Db2Field(fieldIndex = 1, type = Db2Type.STRING)
    private LocalizedString description;


    @Column(name = "SpellID")
    @Db2Field(fieldIndex = 2, type = Db2Type.INT, signed = true)
    private Integer spellID;


    @Column(name = "OverridesSpellID")
    @Db2Field(fieldIndex = 3, type = Db2Type.INT, signed = true)
    private Integer overridesSpellID;


    @Column(name = "ActionBarSpellID")
    @Db2Field(fieldIndex = 4, type = Db2Type.INT, signed = true)
    private Integer actionBarSpellID;


    @Column(name = "TierID")
    @Db2Field(fieldIndex = 5, type = Db2Type.INT, signed = true)
    private Integer tierID;


    @Column(name = "ColumnIndex")
    @Db2Field(fieldIndex = 6, type = Db2Type.INT, signed = true)
    private Integer columnIndex;


    @Column(name = "Flags")
    @Db2Field(fieldIndex = 7, type = Db2Type.INT, signed = true)
    private Integer flags;


    @Column(name = "ClassID")
    @Db2Field(fieldIndex = 8, type = Db2Type.INT, signed = true)
    private Integer classID;


    @Column(name = "SpecID")
    @Db2Field(fieldIndex = 9, type = Db2Type.INT, signed = true)
    private Integer specID;


    @Column(name = "Role")
    @Db2Field(fieldIndex = 10, type = Db2Type.INT, signed = true)
    private Integer role;

    @Id
    @ColumnDefault("0")
    @Column(name = "VerifiedBuild", nullable = false)
    private Integer verifiedBuild;


}
