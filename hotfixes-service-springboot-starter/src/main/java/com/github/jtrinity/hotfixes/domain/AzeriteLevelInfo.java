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
@Table(name = "azerite_level_info")
public class AzeriteLevelInfo {
    @Id
    @ColumnDefault("'0'")
    @Column(name = "ID", columnDefinition = "int UNSIGNED not null")
    private Integer id;

    @Id
    @ColumnDefault("0")
    @Column(name = "VerifiedBuild", nullable = false)
    private Integer verifiedBuild;

    @ColumnDefault("'0'")
    @Column(name = "BaseExperienceToNextLevel", nullable = false)
    private Long baseExperienceToNextLevel;

    @ColumnDefault("'0'")
    @Column(name = "MinimumExperienceToNextLevel", nullable = false)
    private Long minimumExperienceToNextLevel;

    @ColumnDefault("0")
    @Column(name = "ItemLevel", nullable = false)
    private Integer itemLevel;

}