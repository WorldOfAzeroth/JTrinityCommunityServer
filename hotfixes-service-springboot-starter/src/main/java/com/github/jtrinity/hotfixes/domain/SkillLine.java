package com.github.jtrinity.hotfixes.domain;

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
public class SkillLine {
    @Id
    @ColumnDefault("'0'")
    @Column(name = "ID", columnDefinition = "int UNSIGNED not null")
    private Integer id;

    @Id
    @ColumnDefault("0")
    @Column(name = "VerifiedBuild", nullable = false)
    private Integer verifiedBuild;

    @Lob
    @Column(name = "DisplayName")
    private String displayName;

    @Lob
    @Column(name = "AlternateVerb")
    private String alternateVerb;

    @Lob
    @Column(name = "Description")
    private String description;

    @Lob
    @Column(name = "HordeDisplayName")
    private String hordeDisplayName;

    @Lob
    @Column(name = "OverrideSourceInfoDisplayName")
    private String overrideSourceInfoDisplayName;

    @ColumnDefault("0")
    @Column(name = "CategoryID", nullable = false)
    private Byte categoryID;

    @ColumnDefault("0")
    @Column(name = "SpellIconFileID", nullable = false)
    private Integer spellIconFileID;

    @ColumnDefault("0")
    @Column(name = "CanLink", nullable = false)
    private Byte canLink;

    @ColumnDefault("'0'")
    @Column(name = "ParentSkillLineID", columnDefinition = "int UNSIGNED not null")
    private Long parentSkillLineID;

    @ColumnDefault("0")
    @Column(name = "ParentTierIndex", nullable = false)
    private Integer parentTierIndex;

    @ColumnDefault("'0'")
    @Column(name = "Flags", columnDefinition = "smallint UNSIGNED not null")
    private Integer flags;

    @ColumnDefault("0")
    @Column(name = "SpellBookSpellID", nullable = false)
    private Integer spellBookSpellID;

}