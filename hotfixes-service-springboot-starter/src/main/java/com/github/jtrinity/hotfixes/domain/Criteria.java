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
@Table(name = "criteria")
public class Criteria {
    @Id
    @ColumnDefault("'0'")
    @Column(name = "ID", columnDefinition = "int UNSIGNED not null")
    private Integer id;

    @Id
    @ColumnDefault("0")
    @Column(name = "VerifiedBuild", nullable = false)
    private Integer verifiedBuild;

    @ColumnDefault("0")
    @Column(name = "Type", nullable = false)
    private Short type;

    @ColumnDefault("0")
    @Column(name = "Asset", nullable = false)
    private Integer asset;

    @ColumnDefault("'0'")
    @Column(name = "ModifierTreeId", columnDefinition = "int UNSIGNED not null")
    private Long modifierTreeId;

    @ColumnDefault("0")
    @Column(name = "StartEvent", nullable = false)
    private Integer startEvent;

    @ColumnDefault("0")
    @Column(name = "StartAsset", nullable = false)
    private Integer startAsset;

    @ColumnDefault("'0'")
    @Column(name = "StartTimer", columnDefinition = "smallint UNSIGNED not null")
    private Integer startTimer;

    @ColumnDefault("0")
    @Column(name = "FailEvent", nullable = false)
    private Integer failEvent;

    @ColumnDefault("0")
    @Column(name = "FailAsset", nullable = false)
    private Integer failAsset;

    @ColumnDefault("0")
    @Column(name = "Flags", nullable = false)
    private Integer flags;

    @ColumnDefault("0")
    @Column(name = "EligibilityWorldStateID", nullable = false)
    private Short eligibilityWorldStateID;

    @ColumnDefault("0")
    @Column(name = "EligibilityWorldStateValue", nullable = false)
    private Byte eligibilityWorldStateValue;

}