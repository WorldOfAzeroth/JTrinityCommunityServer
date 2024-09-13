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
@Table(name = "currency_types")
@Db2File(name = "CurrencyTypes.db2", fileDataId = 1095531, layoutHash = 0x5BD9D2E6)
public class CurrencyType {
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

    @Lob
    @Column(name = "Description")
    @Db2Field(fieldIndex = 2, type = Db2Type.STRING)
    private String description;

    @ColumnDefault("'0'")
    @Column(name = "CategoryID", columnDefinition = "tinyint UNSIGNED not null")
    @Db2Field(fieldIndex = 3, type = Db2Type.BYTE)
    private Short categoryID;

    @ColumnDefault("0")
    @Column(name = "InventoryIconFileID", nullable = false)
    @Db2Field(fieldIndex = 4, type = Db2Type.INT, signed = true)
    private Integer inventoryIconFileID;

    @ColumnDefault("'0'")
    @Column(name = "SpellWeight", columnDefinition = "int UNSIGNED not null")
    @Db2Field(fieldIndex = 5, type = Db2Type.INT)
    private Long spellWeight;

    @ColumnDefault("'0'")
    @Column(name = "SpellCategory", columnDefinition = "tinyint UNSIGNED not null")
    @Db2Field(fieldIndex = 6, type = Db2Type.BYTE)
    private Short spellCategory;

    @ColumnDefault("'0'")
    @Column(name = "MaxQty", columnDefinition = "int UNSIGNED not null")
    @Db2Field(fieldIndex = 7, type = Db2Type.INT)
    private Long maxQty;

    @ColumnDefault("'0'")
    @Column(name = "MaxEarnablePerWeek", columnDefinition = "int UNSIGNED not null")
    @Db2Field(fieldIndex = 8, type = Db2Type.INT)
    private Long maxEarnablePerWeek;

    @ColumnDefault("0")
    @Column(name = "Quality", nullable = false)
    @Db2Field(fieldIndex = 9, type = Db2Type.BYTE, signed = true)
    private Byte quality;

    @ColumnDefault("0")
    @Column(name = "FactionID", nullable = false)
    @Db2Field(fieldIndex = 10, type = Db2Type.INT, signed = true)
    private Integer factionID;

    @ColumnDefault("0")
    @Column(name = "AwardConditionID", nullable = false)
    @Db2Field(fieldIndex = 11, type = Db2Type.INT, signed = true)
    private Integer awardConditionID;

    @ColumnDefault("0")
    @Column(name = "MaxQtyWorldStateID", nullable = false)
    @Db2Field(fieldIndex = 12, type = Db2Type.INT, signed = true)
    private Integer maxQtyWorldStateID;

    @ColumnDefault("0")
    @Column(name = "Flags1", nullable = false)
    @Db2Field(fieldIndex = 13, type = Db2Type.INT, signed = true)
    private Integer flags1;

    @ColumnDefault("0")
    @Column(name = "Flags2", nullable = false)
    @Db2Field(fieldIndex = 14, type = Db2Type.INT, signed = true)
    private Integer flags2;

}