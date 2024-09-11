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
@Table(name = "pvp_talent_slot_unlock")
public class PvpTalentSlotUnlock {
    @Id
    @ColumnDefault("'0'")
    @Column(name = "ID", columnDefinition = "int UNSIGNED not null")
    private Integer id;

    @Id
    @ColumnDefault("0")
    @Column(name = "VerifiedBuild", nullable = false)
    private Integer verifiedBuild;

    @ColumnDefault("0")
    @Column(name = "Slot", nullable = false)
    private Byte slot;

    @ColumnDefault("0")
    @Column(name = "LevelRequired", nullable = false)
    private Integer levelRequired;

    @ColumnDefault("0")
    @Column(name = "DeathKnightLevelRequired", nullable = false)
    private Integer deathKnightLevelRequired;

    @ColumnDefault("0")
    @Column(name = "DemonHunterLevelRequired", nullable = false)
    private Integer demonHunterLevelRequired;

}