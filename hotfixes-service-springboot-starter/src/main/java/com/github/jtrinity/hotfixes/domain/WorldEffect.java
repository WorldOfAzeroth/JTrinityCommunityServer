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
@Table(name = "world_effect")
public class WorldEffect {
    @Id
    @ColumnDefault("'0'")
    @Column(name = "ID", columnDefinition = "int UNSIGNED not null")
    private Long id;

    @Id
    @ColumnDefault("0")
    @Column(name = "VerifiedBuild", nullable = false)
    private Integer verifiedBuild;

    @ColumnDefault("'0'")
    @Column(name = "QuestFeedbackEffectID", columnDefinition = "int UNSIGNED not null")
    private Long questFeedbackEffectID;

    @ColumnDefault("'0'")
    @Column(name = "WhenToDisplay", columnDefinition = "tinyint UNSIGNED not null")
    private Short whenToDisplay;

    @ColumnDefault("'0'")
    @Column(name = "TargetType", columnDefinition = "tinyint UNSIGNED not null")
    private Short targetType;

    @ColumnDefault("0")
    @Column(name = "TargetAsset", nullable = false)
    private Integer targetAsset;

    @ColumnDefault("'0'")
    @Column(name = "PlayerConditionID", columnDefinition = "int UNSIGNED not null")
    private Long playerConditionID;

    @ColumnDefault("'0'")
    @Column(name = "CombatConditionID", columnDefinition = "smallint UNSIGNED not null")
    private Integer combatConditionID;

}