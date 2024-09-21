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
@Table(name = "spell_x_spell_visual")
@Db2File(name = "SpellXSpellVisual.db2", layoutHash = 0x4F4B8A2A, indexField = 1, parentIndexField = 12)
public class SpellXSpellVisual implements DbcEntity {

    @Column(name = "SpellVisualID")
    @Db2Field(fieldIndex = 0, type = Db2Type.INT)
    private Integer spellVisualID;

    @Id
    @ColumnDefault("'0'")
    @Column(name = "ID", columnDefinition = "int UNSIGNED not null")
    @Db2Field(fieldIndex = 1, type = Db2Type.INT)
    private Integer id;


    @Column(name = "Probability")
    @Db2Field(fieldIndex = 2, type = Db2Type.FLOAT)
    private Float probability;


    @Column(name = "CasterPlayerConditionID")
    @Db2Field(fieldIndex = 3, type = Db2Type.SHORT)
    private Short casterPlayerConditionID;


    @Column(name = "CasterUnitConditionID")
    @Db2Field(fieldIndex = 4, type = Db2Type.SHORT)
    private Short casterUnitConditionID;


    @Column(name = "ViewerPlayerConditionID")
    @Db2Field(fieldIndex = 5, type = Db2Type.SHORT)
    private Short viewerPlayerConditionID;


    @Column(name = "ViewerUnitConditionID")
    @Db2Field(fieldIndex = 6, type = Db2Type.SHORT)
    private Short viewerUnitConditionID;


    @Column(name = "SpellIconFileID")
    @Db2Field(fieldIndex = 7, type = Db2Type.INT, signed = true)
    private Integer spellIconFileID;


    @Column(name = "ActiveIconFileID")
    @Db2Field(fieldIndex = 8, type = Db2Type.INT, signed = true)
    private Integer activeIconFileID;


    @Column(name = "Flags")
    @Db2Field(fieldIndex = 9, type = Db2Type.BYTE)
    private Byte flags;


    @Column(name = "DifficultyID")
    @Db2Field(fieldIndex = 10, type = Db2Type.BYTE)
    private Byte difficultyID;


    @Column(name = "Priority")
    @Db2Field(fieldIndex = 11, type = Db2Type.BYTE)
    private Byte priority;


    @Column(name = "SpellID")
    @Db2Field(fieldIndex = 12, type = Db2Type.INT, signed = true)
    private Integer spellID;

    @Id
    @ColumnDefault("0")
    @Column(name = "VerifiedBuild", nullable = false)
    private Integer verifiedBuild;


}
