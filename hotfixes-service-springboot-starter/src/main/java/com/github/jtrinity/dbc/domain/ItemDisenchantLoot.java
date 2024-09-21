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
@Table(name = "item_disenchant_loot")
@Db2File(name = "ItemDisenchantLoot.db2", layoutHash = 0xC0D926CC, parentIndexField = 6)
public class ItemDisenchantLoot implements DbcEntity {
    @Id
    @ColumnDefault("'0'")
    @Column(name = "ID", columnDefinition = "int UNSIGNED not null")
    @Db2Field(fieldIndex = 0, type = Db2Type.INT)
    private Integer id;


    @Column(name = "MinLevel")
    @Db2Field(fieldIndex = 1, type = Db2Type.SHORT)
    private Short minLevel;


    @Column(name = "MaxLevel")
    @Db2Field(fieldIndex = 2, type = Db2Type.SHORT)
    private Short maxLevel;


    @Column(name = "SkillRequired")
    @Db2Field(fieldIndex = 3, type = Db2Type.SHORT)
    private Short skillRequired;


    @Column(name = "Subclass")
    @Db2Field(fieldIndex = 4, type = Db2Type.BYTE, signed = true)
    private Byte subclass;


    @Column(name = "Quality")
    @Db2Field(fieldIndex = 5, type = Db2Type.BYTE)
    private Byte quality;


    @Column(name = "ExpansionID")
    @Db2Field(fieldIndex = 6, type = Db2Type.BYTE, signed = true)
    private Byte expansionID;


    @Column(name = "Class")
    @Db2Field(fieldIndex = 7, type = Db2Type.BYTE)
    private Byte klass;

    @Id
    @ColumnDefault("0")
    @Column(name = "VerifiedBuild", nullable = false)
    private Integer verifiedBuild;


}
