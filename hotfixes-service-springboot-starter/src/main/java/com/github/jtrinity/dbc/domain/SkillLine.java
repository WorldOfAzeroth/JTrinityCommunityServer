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
@Table(name = "skill_line")
@Db2File(name = "SkillLine.db2", layoutHash = 0x3F7E88AF)
public class SkillLine implements DbcEntity {
    @Id
    @ColumnDefault("'0'")
    @Column(name = "ID", columnDefinition = "int UNSIGNED not null")
    @Db2Field(fieldIndex = 0, type = Db2Type.INT)
    private Integer id;


    @Column(name = "DisplayName")
    @Db2Field(fieldIndex = 1, type = Db2Type.STRING)
    private LocalizedString displayName;


    @Column(name = "Description")
    @Db2Field(fieldIndex = 2, type = Db2Type.STRING)
    private LocalizedString description;


    @Column(name = "AlternateVerb")
    @Db2Field(fieldIndex = 3, type = Db2Type.STRING)
    private LocalizedString alternateVerb;


    @Column(name = "Flags")
    @Db2Field(fieldIndex = 4, type = Db2Type.SHORT)
    private Short flags;


    @Column(name = "CategoryID")
    @Db2Field(fieldIndex = 5, type = Db2Type.BYTE, signed = true)
    private Byte categoryID;


    @Column(name = "CanLink")
    @Db2Field(fieldIndex = 6, type = Db2Type.BYTE, signed = true)
    private Byte canLink;


    @Column(name = "SpellIconFileID")
    @Db2Field(fieldIndex = 7, type = Db2Type.INT, signed = true)
    private Integer spellIconFileID;


    @Column(name = "ParentSkillLineID")
    @Db2Field(fieldIndex = 8, type = Db2Type.INT)
    private Integer parentSkillLineID;

    @Id
    @ColumnDefault("0")
    @Column(name = "VerifiedBuild", nullable = false)
    private Integer verifiedBuild;


}
