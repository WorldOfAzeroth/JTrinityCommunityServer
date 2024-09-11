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
@Table(name = "vignette")
public class Vignette {
    @Id
    @ColumnDefault("'0'")
    @Column(name = "ID", columnDefinition = "int UNSIGNED not null")
    private Long id;

    @Id
    @ColumnDefault("0")
    @Column(name = "VerifiedBuild", nullable = false)
    private Integer verifiedBuild;

    @Lob
    @Column(name = "Name")
    private String name;

    @ColumnDefault("'0'")
    @Column(name = "PlayerConditionID", columnDefinition = "int UNSIGNED not null")
    private Long playerConditionID;

    @ColumnDefault("'0'")
    @Column(name = "VisibleTrackingQuestID", columnDefinition = "int UNSIGNED not null")
    private Long visibleTrackingQuestID;

    @ColumnDefault("'0'")
    @Column(name = "QuestFeedbackEffectID", columnDefinition = "int UNSIGNED not null")
    private Long questFeedbackEffectID;

    @ColumnDefault("0")
    @Column(name = "Flags", nullable = false)
    private Integer flags;

    @ColumnDefault("0")
    @Column(name = "MaxHeight", nullable = false)
    private Float maxHeight;

    @ColumnDefault("0")
    @Column(name = "MinHeight", nullable = false)
    private Float minHeight;

    @ColumnDefault("0")
    @Column(name = "VignetteType", nullable = false)
    private Byte vignetteType;

    @ColumnDefault("0")
    @Column(name = "RewardQuestID", nullable = false)
    private Integer rewardQuestID;

}