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
@Table(name = "spell_categories")
@Db2File(name = "SpellCategories.db2", fileDataId = 1139939, layoutHash = 0xE1D0C5AC, parentIndexField = 8)
public class SpellCategories {
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
    @Column(name = "DifficultyID", columnDefinition = "tinyint UNSIGNED not null")
    @Db2Field(fieldIndex = 1, type = Db2Type.BYTE)
    private Short difficultyID;

    @ColumnDefault("0")
    @Column(name = "Category", nullable = false)
    @Db2Field(fieldIndex = 2, type = Db2Type.SHORT, signed = true)
    private Short category;

    @ColumnDefault("0")
    @Column(name = "DefenseType", nullable = false)
    @Db2Field(fieldIndex = 3, type = Db2Type.BYTE, signed = true)
    private Byte defenseType;

    @ColumnDefault("0")
    @Column(name = "DispelType", nullable = false)
    @Db2Field(fieldIndex = 4, type = Db2Type.BYTE, signed = true)
    private Byte dispelType;

    @ColumnDefault("0")
    @Column(name = "Mechanic", nullable = false)
    @Db2Field(fieldIndex = 5, type = Db2Type.BYTE, signed = true)
    private Byte mechanic;

    @ColumnDefault("0")
    @Column(name = "PreventionType", nullable = false)
    @Db2Field(fieldIndex = 6, type = Db2Type.BYTE, signed = true)
    private Byte preventionType;

    @ColumnDefault("0")
    @Column(name = "StartRecoveryCategory", nullable = false)
    @Db2Field(fieldIndex = 7, type = Db2Type.SHORT, signed = true)
    private Short startRecoveryCategory;

    @ColumnDefault("0")
    @Column(name = "ChargeCategory", nullable = false)
    @Db2Field(fieldIndex = 8, type = Db2Type.SHORT, signed = true)
    private Short chargeCategory;

    @ColumnDefault("'0'")
    @Column(name = "SpellID", columnDefinition = "int UNSIGNED not null")
    @Db2Field(fieldIndex = 9, type = Db2Type.INT)
    private Long spellID;

}