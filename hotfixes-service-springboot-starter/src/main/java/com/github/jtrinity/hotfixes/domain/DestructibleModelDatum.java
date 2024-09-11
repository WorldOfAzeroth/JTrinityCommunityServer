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
@Table(name = "destructible_model_data")
public class DestructibleModelDatum {
    @Id
    @ColumnDefault("'0'")
    @Column(name = "ID", columnDefinition = "int UNSIGNED not null")
    private Integer id;

    @Id
    @ColumnDefault("0")
    @Column(name = "VerifiedBuild", nullable = false)
    private Integer verifiedBuild;

    @ColumnDefault("0")
    @Column(name = "State0ImpactEffectDoodadSet", nullable = false)
    private Byte state0ImpactEffectDoodadSet;

    @ColumnDefault("'0'")
    @Column(name = "State0AmbientDoodadSet", columnDefinition = "tinyint UNSIGNED not null")
    private Short state0AmbientDoodadSet;

    @ColumnDefault("'0'")
    @Column(name = "State1Wmo", columnDefinition = "int UNSIGNED not null")
    private Long state1Wmo;

    @ColumnDefault("0")
    @Column(name = "State1DestructionDoodadSet", nullable = false)
    private Byte state1DestructionDoodadSet;

    @ColumnDefault("0")
    @Column(name = "State1ImpactEffectDoodadSet", nullable = false)
    private Byte state1ImpactEffectDoodadSet;

    @ColumnDefault("'0'")
    @Column(name = "State1AmbientDoodadSet", columnDefinition = "tinyint UNSIGNED not null")
    private Short state1AmbientDoodadSet;

    @ColumnDefault("'0'")
    @Column(name = "State2Wmo", columnDefinition = "int UNSIGNED not null")
    private Long state2Wmo;

    @ColumnDefault("0")
    @Column(name = "State2DestructionDoodadSet", nullable = false)
    private Byte state2DestructionDoodadSet;

    @ColumnDefault("0")
    @Column(name = "State2ImpactEffectDoodadSet", nullable = false)
    private Byte state2ImpactEffectDoodadSet;

    @ColumnDefault("'0'")
    @Column(name = "State2AmbientDoodadSet", columnDefinition = "tinyint UNSIGNED not null")
    private Short state2AmbientDoodadSet;

    @ColumnDefault("'0'")
    @Column(name = "State3Wmo", columnDefinition = "int UNSIGNED not null")
    private Long state3Wmo;

    @ColumnDefault("'0'")
    @Column(name = "State3InitDoodadSet", columnDefinition = "tinyint UNSIGNED not null")
    private Short state3InitDoodadSet;

    @ColumnDefault("'0'")
    @Column(name = "State3AmbientDoodadSet", columnDefinition = "tinyint UNSIGNED not null")
    private Short state3AmbientDoodadSet;

    @ColumnDefault("'0'")
    @Column(name = "EjectDirection", columnDefinition = "tinyint UNSIGNED not null")
    private Short ejectDirection;

    @ColumnDefault("'0'")
    @Column(name = "DoNotHighlight", columnDefinition = "tinyint UNSIGNED not null")
    private Short doNotHighlight;

    @ColumnDefault("'0'")
    @Column(name = "State0Wmo", columnDefinition = "int UNSIGNED not null")
    private Long state0Wmo;

    @ColumnDefault("'0'")
    @Column(name = "HealEffect", columnDefinition = "tinyint UNSIGNED not null")
    private Short healEffect;

    @ColumnDefault("'0'")
    @Column(name = "HealEffectSpeed", columnDefinition = "smallint UNSIGNED not null")
    private Integer healEffectSpeed;

    @ColumnDefault("0")
    @Column(name = "State0NameSet", nullable = false)
    private Byte state0NameSet;

    @ColumnDefault("0")
    @Column(name = "State1NameSet", nullable = false)
    private Byte state1NameSet;

    @ColumnDefault("0")
    @Column(name = "State2NameSet", nullable = false)
    private Byte state2NameSet;

    @ColumnDefault("0")
    @Column(name = "State3NameSet", nullable = false)
    private Byte state3NameSet;

}