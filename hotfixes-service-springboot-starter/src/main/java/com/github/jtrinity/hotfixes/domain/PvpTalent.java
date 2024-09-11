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
@Table(name = "pvp_talent")
public class PvpTalent {
    @Id
    @ColumnDefault("'0'")
    @Column(name = "ID", columnDefinition = "int UNSIGNED not null")
    private Integer id;

    @Id
    @ColumnDefault("0")
    @Column(name = "VerifiedBuild", nullable = false)
    private Integer verifiedBuild;

    @Lob
    @Column(name = "Description")
    private String description;

    @ColumnDefault("'0'")
    @Column(name = "SpecID", columnDefinition = "int UNSIGNED not null")
    private Long specID;

    @ColumnDefault("0")
    @Column(name = "SpellID", nullable = false)
    private Integer spellID;

    @ColumnDefault("0")
    @Column(name = "OverridesSpellID", nullable = false)
    private Integer overridesSpellID;

    @ColumnDefault("0")
    @Column(name = "Flags", nullable = false)
    private Integer flags;

    @ColumnDefault("0")
    @Column(name = "ActionBarSpellID", nullable = false)
    private Integer actionBarSpellID;

    @ColumnDefault("0")
    @Column(name = "PvpTalentCategoryID", nullable = false)
    private Integer pvpTalentCategoryID;

    @ColumnDefault("0")
    @Column(name = "LevelRequired", nullable = false)
    private Integer levelRequired;

}