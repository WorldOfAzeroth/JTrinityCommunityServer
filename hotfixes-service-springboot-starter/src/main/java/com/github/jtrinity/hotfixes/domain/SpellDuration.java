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
@Table(name = "spell_duration")
public class SpellDuration {
    @Id
    @ColumnDefault("'0'")
    @Column(name = "ID", columnDefinition = "int UNSIGNED not null")
    private Long id;

    @Id
    @ColumnDefault("0")
    @Column(name = "VerifiedBuild", nullable = false)
    private Integer verifiedBuild;

    @ColumnDefault("0")
    @Column(name = "Duration", nullable = false)
    private Integer duration;

    @ColumnDefault("'0'")
    @Column(name = "DurationPerLevel", columnDefinition = "int UNSIGNED not null")
    private Long durationPerLevel;

    @ColumnDefault("0")
    @Column(name = "MaxDuration", nullable = false)
    private Integer maxDuration;

}