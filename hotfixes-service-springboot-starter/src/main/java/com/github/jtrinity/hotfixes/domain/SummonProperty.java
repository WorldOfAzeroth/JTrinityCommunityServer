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
@Table(name = "summon_properties")
public class SummonProperty {
    @Id
    @ColumnDefault("'0'")
    @Column(name = "ID", columnDefinition = "int UNSIGNED not null")
    private Long id;

    @Id
    @ColumnDefault("0")
    @Column(name = "VerifiedBuild", nullable = false)
    private Integer verifiedBuild;

    @ColumnDefault("0")
    @Column(name = "Control", nullable = false)
    private Integer control;

    @ColumnDefault("0")
    @Column(name = "Faction", nullable = false)
    private Integer faction;

    @ColumnDefault("0")
    @Column(name = "Title", nullable = false)
    private Integer title;

    @ColumnDefault("0")
    @Column(name = "Slot", nullable = false)
    private Integer slot;

    @ColumnDefault("0")
    @Column(name = "Flags1", nullable = false)
    private Integer flags1;

    @ColumnDefault("0")
    @Column(name = "Flags2", nullable = false)
    private Integer flags2;

}