package com.github.jtrinity.hotfixes.domain;

import com.github.jtrinity.hotfixes.db2.Db2Field;
import com.github.jtrinity.hotfixes.db2.Db2File;
import com.github.jtrinity.hotfixes.db2.Db2Type;

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
@Table(name = "item_effect")
@Db2File(name = "ItemEffect.db2", fileDataId = 969941, layoutHash = 0xF2A2E644, parentIndexField = 8)
public class ItemEffect {
    @Id
    @ColumnDefault("'0'")
    @Column(name = "ID", columnDefinition = "int UNSIGNED not null")
    @Db2Field(fieldIndex = 0, type = Db2Type.INT)
    private Integer id;

    @Id
    @ColumnDefault("0")
    @Column(name = "VerifiedBuild", nullable = false)
    private Integer verifiedBuild;

    @ColumnDefault("'0'")
    @Column(name = "LegacySlotIndex", columnDefinition = "tinyint UNSIGNED not null")
    @Db2Field(fieldIndex = 1, type = Db2Type.BYTE)
    private Short legacySlotIndex;

    @ColumnDefault("0")
    @Column(name = "TriggerType", nullable = false)
    @Db2Field(fieldIndex = 2, type = Db2Type.BYTE, signed = true)
    private Byte triggerType;

    @ColumnDefault("0")
    @Column(name = "Charges", nullable = false)
    @Db2Field(fieldIndex = 3, type = Db2Type.SHORT, signed = true)
    private Short charges;

    @ColumnDefault("0")
    @Column(name = "CoolDownMSec", nullable = false)
    @Db2Field(fieldIndex = 4, type = Db2Type.INT, signed = true)
    private Integer coolDownMSec;

    @ColumnDefault("0")
    @Column(name = "CategoryCoolDownMSec", nullable = false)
    @Db2Field(fieldIndex = 5, type = Db2Type.INT, signed = true)
    private Integer categoryCoolDownMSec;

    @ColumnDefault("'0'")
    @Column(name = "SpellCategoryID", columnDefinition = "smallint UNSIGNED not null")
    @Db2Field(fieldIndex = 6, type = Db2Type.SHORT)
    private Integer spellCategoryID;

    @ColumnDefault("0")
    @Column(name = "SpellID", nullable = false)
    @Db2Field(fieldIndex = 7, type = Db2Type.INT, signed = true)
    private Integer spellID;

    @ColumnDefault("'0'")
    @Column(name = "ChrSpecializationID", columnDefinition = "smallint UNSIGNED not null")
    @Db2Field(fieldIndex = 8, type = Db2Type.SHORT)
    private Integer chrSpecializationID;

    @ColumnDefault("'0'")
    @Column(name = "ParentItemID", columnDefinition = "int UNSIGNED not null")
    @Db2Field(fieldIndex = 9, type = Db2Type.INT)
    private Long parentItemID;

}