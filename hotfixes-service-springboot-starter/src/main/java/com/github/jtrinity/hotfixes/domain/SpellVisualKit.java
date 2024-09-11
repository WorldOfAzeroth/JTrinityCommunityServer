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
@Table(name = "spell_visual_kit")
public class SpellVisualKit {
    @Id
    @ColumnDefault("'0'")
    @Column(name = "ID", columnDefinition = "int UNSIGNED not null")
    private Long id;

    @Id
    @ColumnDefault("0")
    @Column(name = "VerifiedBuild", nullable = false)
    private Integer verifiedBuild;

    @ColumnDefault("'0'")
    @Column(name = "FallbackSpellVisualKitId", columnDefinition = "int UNSIGNED not null")
    private Long fallbackSpellVisualKitId;

    @ColumnDefault("'0'")
    @Column(name = "DelayMin", columnDefinition = "smallint UNSIGNED not null")
    private Integer delayMin;

    @ColumnDefault("'0'")
    @Column(name = "DelayMax", columnDefinition = "smallint UNSIGNED not null")
    private Integer delayMax;

    @ColumnDefault("0")
    @Column(name = "FallbackPriority", nullable = false)
    private Float fallbackPriority;

    @ColumnDefault("0")
    @Column(name = "Flags1", nullable = false)
    private Integer flags1;

    @ColumnDefault("0")
    @Column(name = "Flags2", nullable = false)
    private Integer flags2;

}