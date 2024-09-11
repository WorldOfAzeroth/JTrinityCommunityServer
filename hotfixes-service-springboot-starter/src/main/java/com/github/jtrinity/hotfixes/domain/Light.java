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
@Table(name = "light")
public class Light {
    @Id
    @ColumnDefault("'0'")
    @Column(name = "ID", columnDefinition = "int UNSIGNED not null")
    private Integer id;

    @Id
    @ColumnDefault("0")
    @Column(name = "VerifiedBuild", nullable = false)
    private Integer verifiedBuild;

    @ColumnDefault("0")
    @Column(name = "GameCoordsX", nullable = false)
    private Float gameCoordsX;

    @ColumnDefault("0")
    @Column(name = "GameCoordsY", nullable = false)
    private Float gameCoordsY;

    @ColumnDefault("0")
    @Column(name = "GameCoordsZ", nullable = false)
    private Float gameCoordsZ;

    @ColumnDefault("0")
    @Column(name = "GameFalloffStart", nullable = false)
    private Float gameFalloffStart;

    @ColumnDefault("0")
    @Column(name = "GameFalloffEnd", nullable = false)
    private Float gameFalloffEnd;

    @ColumnDefault("0")
    @Column(name = "ContinentID", nullable = false)
    private Short continentID;

    @ColumnDefault("'0'")
    @Column(name = "LightParamsID1", columnDefinition = "smallint UNSIGNED not null")
    private Integer lightParamsID1;

    @ColumnDefault("'0'")
    @Column(name = "LightParamsID2", columnDefinition = "smallint UNSIGNED not null")
    private Integer lightParamsID2;

    @ColumnDefault("'0'")
    @Column(name = "LightParamsID3", columnDefinition = "smallint UNSIGNED not null")
    private Integer lightParamsID3;

    @ColumnDefault("'0'")
    @Column(name = "LightParamsID4", columnDefinition = "smallint UNSIGNED not null")
    private Integer lightParamsID4;

    @ColumnDefault("'0'")
    @Column(name = "LightParamsID5", columnDefinition = "smallint UNSIGNED not null")
    private Integer lightParamsID5;

    @ColumnDefault("'0'")
    @Column(name = "LightParamsID6", columnDefinition = "smallint UNSIGNED not null")
    private Integer lightParamsID6;

    @ColumnDefault("'0'")
    @Column(name = "LightParamsID7", columnDefinition = "smallint UNSIGNED not null")
    private Integer lightParamsID7;

    @ColumnDefault("'0'")
    @Column(name = "LightParamsID8", columnDefinition = "smallint UNSIGNED not null")
    private Integer lightParamsID8;

}