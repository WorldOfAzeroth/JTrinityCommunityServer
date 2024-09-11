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
@Table(name = "override_spell_data")
public class OverrideSpellDatum {
    @Id
    @ColumnDefault("'0'")
    @Column(name = "ID", columnDefinition = "int UNSIGNED not null")
    private Integer id;

    @Id
    @ColumnDefault("0")
    @Column(name = "VerifiedBuild", nullable = false)
    private Integer verifiedBuild;

    @ColumnDefault("0")
    @Column(name = "Spells1", nullable = false)
    private Integer spells1;

    @ColumnDefault("0")
    @Column(name = "Spells2", nullable = false)
    private Integer spells2;

    @ColumnDefault("0")
    @Column(name = "Spells3", nullable = false)
    private Integer spells3;

    @ColumnDefault("0")
    @Column(name = "Spells4", nullable = false)
    private Integer spells4;

    @ColumnDefault("0")
    @Column(name = "Spells5", nullable = false)
    private Integer spells5;

    @ColumnDefault("0")
    @Column(name = "Spells6", nullable = false)
    private Integer spells6;

    @ColumnDefault("0")
    @Column(name = "Spells7", nullable = false)
    private Integer spells7;

    @ColumnDefault("0")
    @Column(name = "Spells8", nullable = false)
    private Integer spells8;

    @ColumnDefault("0")
    @Column(name = "Spells9", nullable = false)
    private Integer spells9;

    @ColumnDefault("0")
    @Column(name = "Spells10", nullable = false)
    private Integer spells10;

    @ColumnDefault("0")
    @Column(name = "PlayerActionBarFileDataID", nullable = false)
    private Integer playerActionBarFileDataID;

    @ColumnDefault("'0'")
    @Column(name = "Flags", columnDefinition = "tinyint UNSIGNED not null")
    private Short flags;

}