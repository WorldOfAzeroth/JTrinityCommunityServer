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
@Table(name = "item_effect")
@Db2File(name = "ItemEffect.db2", layoutHash = 0xA390FA40, parentIndexField = 8)
public class ItemEffect implements DbcEntity {
    @Id
    @ColumnDefault("'0'")
    @Column(name = "ID", columnDefinition = "int UNSIGNED not null")
    @Db2Field(fieldIndex = 0, type = Db2Type.INT)
    private Integer id;


    @Column(name = "SpellID")
    @Db2Field(fieldIndex = 1, type = Db2Type.INT, signed = true)
    private Integer spellID;


    @Column(name = "CoolDownMSec")
    @Db2Field(fieldIndex = 2, type = Db2Type.INT, signed = true)
    private Integer coolDownMSec;


    @Column(name = "CategoryCoolDownMSec")
    @Db2Field(fieldIndex = 3, type = Db2Type.INT, signed = true)
    private Integer categoryCoolDownMSec;


    @Column(name = "Charges")
    @Db2Field(fieldIndex = 4, type = Db2Type.SHORT, signed = true)
    private Short charges;


    @Column(name = "SpellCategoryID")
    @Db2Field(fieldIndex = 5, type = Db2Type.SHORT)
    private Short spellCategoryID;


    @Column(name = "ChrSpecializationID")
    @Db2Field(fieldIndex = 6, type = Db2Type.SHORT)
    private Short chrSpecializationID;


    @Column(name = "LegacySlotIndex")
    @Db2Field(fieldIndex = 7, type = Db2Type.BYTE)
    private Byte legacySlotIndex;


    @Column(name = "TriggerType")
    @Db2Field(fieldIndex = 8, type = Db2Type.BYTE, signed = true)
    private Byte triggerType;


    @Column(name = "ParentItemID")
    @Db2Field(fieldIndex = 9, type = Db2Type.INT, signed = true)
    private Integer parentItemID;

    @Id
    @ColumnDefault("0")
    @Column(name = "VerifiedBuild", nullable = false)
    private Integer verifiedBuild;


}
