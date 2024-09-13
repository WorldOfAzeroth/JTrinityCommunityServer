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
@Table(name = "skill_line")
@Db2File(name = "SkillLine.db2", fileDataId = 1240935, layoutHash = 0x5CB7F941, indexField = 5)
public class SkillLine {
    @Id
    @ColumnDefault("'0'")
    @Column(name = "ID", columnDefinition = "int UNSIGNED not null")
    @Db2Field(fieldIndex = 5, type = Db2Type.INT)
    private Integer id;

    @Id
    @ColumnDefault("0")
    @Column(name = "VerifiedBuild", nullable = false)
    private Integer verifiedBuild;

    @Lob
    @Column(name = "DisplayName")
    @Db2Field(fieldIndex = 0, type = Db2Type.STRING)
    private String displayName;

    @Lob
    @Column(name = "AlternateVerb")
    @Db2Field(fieldIndex = 1, type = Db2Type.STRING)
    private String alternateVerb;

    @Lob
    @Column(name = "Description")
    @Db2Field(fieldIndex = 2, type = Db2Type.STRING)
    private String description;

    @Lob
    @Column(name = "HordeDisplayName")
    @Db2Field(fieldIndex = 3, type = Db2Type.STRING)
    private String hordeDisplayName;

    @Lob
    @Column(name = "OverrideSourceInfoDisplayName")
    @Db2Field(fieldIndex = 4, type = Db2Type.STRING_NOT_LOCALIZED)
    private String overrideSourceInfoDisplayName;

    @ColumnDefault("0")
    @Column(name = "CategoryID", nullable = false)
    @Db2Field(fieldIndex = 6, type = Db2Type.BYTE, signed = true)
    private Byte categoryID;

    @ColumnDefault("0")
    @Column(name = "SpellIconFileID", nullable = false)
    @Db2Field(fieldIndex = 7, type = Db2Type.INT, signed = true)
    private Integer spellIconFileID;

    @ColumnDefault("0")
    @Column(name = "CanLink", nullable = false)
    @Db2Field(fieldIndex = 8, type = Db2Type.BYTE, signed = true)
    private Byte canLink;

    @ColumnDefault("'0'")
    @Column(name = "ParentSkillLineID", columnDefinition = "int UNSIGNED not null")
    @Db2Field(fieldIndex = 9, type = Db2Type.INT)
    private Long parentSkillLineID;

    @ColumnDefault("0")
    @Column(name = "ParentTierIndex", nullable = false)
    @Db2Field(fieldIndex = 10, type = Db2Type.INT, signed = true)
    private Integer parentTierIndex;

    @ColumnDefault("'0'")
    @Column(name = "Flags", columnDefinition = "smallint UNSIGNED not null")
    @Db2Field(fieldIndex = 11, type = Db2Type.SHORT)
    private Integer flags;

    @ColumnDefault("0")
    @Column(name = "SpellBookSpellID", nullable = false)
    @Db2Field(fieldIndex = 12, type = Db2Type.INT, signed = true)
    private Integer spellBookSpellID;

}