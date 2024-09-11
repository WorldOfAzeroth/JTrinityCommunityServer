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
@Table(name = "spell_cooldowns")
public class SpellCooldown {
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
    @Column(name = "CategoryRecoveryTime", nullable = false)
    private Integer categoryRecoveryTime;

    @ColumnDefault("0")
    @Column(name = "RecoveryTime", nullable = false)
    private Integer recoveryTime;

    @ColumnDefault("0")
    @Column(name = "StartRecoveryTime", nullable = false)
    private Integer startRecoveryTime;

    @ColumnDefault("0")
    @Column(name = "AuraSpellID", nullable = false)
    private Integer auraSpellID;

    @ColumnDefault("'0'")
    @Column(name = "SpellID", columnDefinition = "int UNSIGNED not null")
    private Long spellID;

}