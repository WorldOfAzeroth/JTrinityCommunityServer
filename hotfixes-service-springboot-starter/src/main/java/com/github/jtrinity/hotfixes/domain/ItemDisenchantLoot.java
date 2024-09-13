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
@Table(name = "item_disenchant_loot")
@Db2File(name = "ItemDisenchantLoot.db2", fileDataId = 1134087, layoutHash = 0xB1D813A9, parentIndexField = 6)
public class ItemDisenchantLoot {
    @Id
    @ColumnDefault("'0'")
    @Column(name = "ID", columnDefinition = "int UNSIGNED not null")
    @Db2Field(fieldIndex = 0, type = Db2Type.INT)
    private Integer id;

    @Id
    @ColumnDefault("0")
    @Column(name = "VerifiedBuild", nullable = false)
    private Integer verifiedBuild;

    @ColumnDefault("0")
    @Column(name = "Subclass", nullable = false)
    @Db2Field(fieldIndex = 1, type = Db2Type.BYTE, signed = true)
    private Byte subclass;

    @ColumnDefault("'0'")
    @Column(name = "Quality", columnDefinition = "tinyint UNSIGNED not null")
    @Db2Field(fieldIndex = 2, type = Db2Type.BYTE)
    private Short quality;

    @ColumnDefault("'0'")
    @Column(name = "MinLevel", columnDefinition = "smallint UNSIGNED not null")
    @Db2Field(fieldIndex = 3, type = Db2Type.SHORT)
    private Integer minLevel;

    @ColumnDefault("'0'")
    @Column(name = "MaxLevel", columnDefinition = "smallint UNSIGNED not null")
    @Db2Field(fieldIndex = 4, type = Db2Type.SHORT)
    private Integer maxLevel;

    @ColumnDefault("'0'")
    @Column(name = "SkillRequired", columnDefinition = "smallint UNSIGNED not null")
    @Db2Field(fieldIndex = 5, type = Db2Type.SHORT)
    private Integer skillRequired;

    @ColumnDefault("0")
    @Column(name = "ExpansionID", nullable = false)
    @Db2Field(fieldIndex = 6, type = Db2Type.BYTE, signed = true)
    private Byte expansionID;

    @ColumnDefault("'0'")
    @Column(name = "Class", columnDefinition = "int UNSIGNED not null")
    @Db2Field(fieldIndex = 7, type = Db2Type.INT)
    private Long classField;

}