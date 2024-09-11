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
@Table(name = "spell_casting_requirements")
public class SpellCastingRequirement {
    @Id
    @ColumnDefault("'0'")
    @Column(name = "ID", columnDefinition = "int UNSIGNED not null")
    private Integer id;

    @Id
    @ColumnDefault("0")
    @Column(name = "VerifiedBuild", nullable = false)
    private Integer verifiedBuild;

    @ColumnDefault("0")
    @Column(name = "SpellID", nullable = false)
    private Integer spellID;

    @ColumnDefault("'0'")
    @Column(name = "FacingCasterFlags", columnDefinition = "tinyint UNSIGNED not null")
    private Short facingCasterFlags;

    @ColumnDefault("'0'")
    @Column(name = "MinFactionID", columnDefinition = "smallint UNSIGNED not null")
    private Integer minFactionID;

    @ColumnDefault("0")
    @Column(name = "MinReputation", nullable = false)
    private Integer minReputation;

    @ColumnDefault("'0'")
    @Column(name = "RequiredAreasID", columnDefinition = "smallint UNSIGNED not null")
    private Integer requiredAreasID;

    @ColumnDefault("'0'")
    @Column(name = "RequiredAuraVision", columnDefinition = "tinyint UNSIGNED not null")
    private Short requiredAuraVision;

    @ColumnDefault("'0'")
    @Column(name = "RequiresSpellFocus", columnDefinition = "smallint UNSIGNED not null")
    private Integer requiresSpellFocus;

}