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
@Table(name = "num_talents_at_level")
public class NumTalentsAtLevel {
    @Id
    @ColumnDefault("'0'")
    @Column(name = "ID", columnDefinition = "int UNSIGNED not null")
    private Integer id;

    @Id
    @ColumnDefault("0")
    @Column(name = "VerifiedBuild", nullable = false)
    private Integer verifiedBuild;

    @ColumnDefault("0")
    @Column(name = "NumTalents", nullable = false)
    private Integer numTalents;

    @ColumnDefault("0")
    @Column(name = "NumTalentsDeathKnight", nullable = false)
    private Integer numTalentsDeathKnight;

    @ColumnDefault("0")
    @Column(name = "NumTalentsDemonHunter", nullable = false)
    private Integer numTalentsDemonHunter;

    @ColumnDefault("0")
    @Column(name = "NumberOfTalents", nullable = false)
    private Float numberOfTalents;

}