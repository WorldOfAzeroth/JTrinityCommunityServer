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
@Table(name = "transport_rotation")
public class TransportRotation {
    @Id
    @ColumnDefault("'0'")
    @Column(name = "ID", columnDefinition = "int UNSIGNED not null")
    private Long id;

    @Id
    @ColumnDefault("0")
    @Column(name = "VerifiedBuild", nullable = false)
    private Integer verifiedBuild;

    @ColumnDefault("0")
    @Column(name = "Rot1", nullable = false)
    private Float rot1;

    @ColumnDefault("0")
    @Column(name = "Rot2", nullable = false)
    private Float rot2;

    @ColumnDefault("0")
    @Column(name = "Rot3", nullable = false)
    private Float rot3;

    @ColumnDefault("0")
    @Column(name = "Rot4", nullable = false)
    private Float rot4;

    @ColumnDefault("'0'")
    @Column(name = "TimeIndex", columnDefinition = "int UNSIGNED not null")
    private Long timeIndex;

    @ColumnDefault("'0'")
    @Column(name = "GameObjectsID", columnDefinition = "int UNSIGNED not null")
    private Long gameObjectsID;

}