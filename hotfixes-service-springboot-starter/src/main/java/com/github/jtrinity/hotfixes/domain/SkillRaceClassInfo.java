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
@Table(name = "skill_race_class_info")
public class SkillRaceClassInfo {
    @Id
    @ColumnDefault("'0'")
    @Column(name = "ID", columnDefinition = "int UNSIGNED not null")
    private Integer id;

    @Id
    @ColumnDefault("0")
    @Column(name = "VerifiedBuild", nullable = false)
    private Integer verifiedBuild;

    @ColumnDefault("0")
    @Column(name = "RaceMask", nullable = false)
    private Long raceMask;

    @ColumnDefault("0")
    @Column(name = "SkillID", nullable = false)
    private Short skillID;

    @ColumnDefault("0")
    @Column(name = "ClassMask", nullable = false)
    private Integer classMask;

    @ColumnDefault("'0'")
    @Column(name = "Flags", columnDefinition = "smallint UNSIGNED not null")
    private Integer flags;

    @ColumnDefault("0")
    @Column(name = "Availability", nullable = false)
    private Byte availability;

    @ColumnDefault("0")
    @Column(name = "MinLevel", nullable = false)
    private Byte minLevel;

    @ColumnDefault("0")
    @Column(name = "SkillTierID", nullable = false)
    private Short skillTierID;

    @ColumnDefault("0")
    @Column(name = "Unknown115_1", nullable = false)
    private Integer unknown115_1;

}