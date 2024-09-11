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
@Table(name = "spell_levels")
public class SpellLevel {
    @Id
    @ColumnDefault("'0'")
    @Column(name = "ID", columnDefinition = "int UNSIGNED not null")
    private Long id;

    @Id
    @ColumnDefault("0")
    @Column(name = "VerifiedBuild", nullable = false)
    private Integer verifiedBuild;

    @ColumnDefault("'0'")
    @Column(name = "DifficultyID", columnDefinition = "tinyint UNSIGNED not null")
    private Short difficultyID;

    @ColumnDefault("0")
    @Column(name = "BaseLevel", nullable = false)
    private Short baseLevel;

    @ColumnDefault("0")
    @Column(name = "MaxLevel", nullable = false)
    private Short maxLevel;

    @ColumnDefault("0")
    @Column(name = "SpellLevel", nullable = false)
    private Short spellLevel;

    @ColumnDefault("'0'")
    @Column(name = "MaxPassiveAuraLevel", columnDefinition = "tinyint UNSIGNED not null")
    private Short maxPassiveAuraLevel;

    @ColumnDefault("'0'")
    @Column(name = "SpellID", columnDefinition = "int UNSIGNED not null")
    private Long spellID;

}