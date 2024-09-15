package com.github.jtrinity.dbc.domain;

import com.github.jtrinity.cache.DbcEntity;
import com.github.jtrinity.dbc.db2.Db2Field;
import com.github.jtrinity.dbc.db2.Db2File;
import com.github.jtrinity.dbc.db2.Db2Type;

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
@Db2File(name = "Light.db2", layoutHash = 0xAD1B2253)
public class Light implements DbcEntity {
    @Id
    @ColumnDefault("'0'")
    @Column(name = "ID", columnDefinition = "int UNSIGNED not null")
    @Db2Field(fieldIndex = 0, type = Db2Type.INT)
    private Integer id;

    @Id
    @ColumnDefault("0")
    @Column(name = "VerifiedBuild", nullable = false)
    private Integer verifiedBuild;

    @ColumnDefault("0")
    @Column(name = "GameCoordsX", nullable = false)
    @Db2Field(fieldIndex = 1, type = Db2Type.FLOAT)
    private Float gameCoordsX;

    @ColumnDefault("0")
    @Column(name = "GameCoordsY", nullable = false)
    @Db2Field(fieldIndex = 2, type = Db2Type.FLOAT)
    private Float gameCoordsY;

    @ColumnDefault("0")
    @Column(name = "GameCoordsZ", nullable = false)
    @Db2Field(fieldIndex = 3, type = Db2Type.FLOAT)
    private Float gameCoordsZ;

    @ColumnDefault("0")
    @Column(name = "GameFalloffStart", nullable = false)
    @Db2Field(fieldIndex = 4, type = Db2Type.FLOAT)
    private Float gameFalloffStart;

    @ColumnDefault("0")
    @Column(name = "GameFalloffEnd", nullable = false)
    @Db2Field(fieldIndex = 5, type = Db2Type.FLOAT)
    private Float gameFalloffEnd;

    @ColumnDefault("0")
    @Column(name = "ContinentID", nullable = false)
    @Db2Field(fieldIndex = 6, type = Db2Type.SHORT, signed = true)
    private Short continentID;

    @ColumnDefault("'0'")
    @Column(name = "LightParamsID1", columnDefinition = "smallint UNSIGNED not null")
    @Db2Field(fieldIndex = 7, type = Db2Type.SHORT)
    private Integer lightParamsID1;

    @ColumnDefault("'0'")
    @Column(name = "LightParamsID2", columnDefinition = "smallint UNSIGNED not null")
    @Db2Field(fieldIndex = 8, type = Db2Type.SHORT)
    private Integer lightParamsID2;

    @ColumnDefault("'0'")
    @Column(name = "LightParamsID3", columnDefinition = "smallint UNSIGNED not null")
    @Db2Field(fieldIndex = 9, type = Db2Type.SHORT)
    private Integer lightParamsID3;

    @ColumnDefault("'0'")
    @Column(name = "LightParamsID4", columnDefinition = "smallint UNSIGNED not null")
    @Db2Field(fieldIndex = 10, type = Db2Type.SHORT)
    private Integer lightParamsID4;

    @ColumnDefault("'0'")
    @Column(name = "LightParamsID5", columnDefinition = "smallint UNSIGNED not null")
    @Db2Field(fieldIndex = 11, type = Db2Type.SHORT)
    private Integer lightParamsID5;

    @ColumnDefault("'0'")
    @Column(name = "LightParamsID6", columnDefinition = "smallint UNSIGNED not null")
    @Db2Field(fieldIndex = 12, type = Db2Type.SHORT)
    private Integer lightParamsID6;

    @ColumnDefault("'0'")
    @Column(name = "LightParamsID7", columnDefinition = "smallint UNSIGNED not null")
    @Db2Field(fieldIndex = 13, type = Db2Type.SHORT)
    private Integer lightParamsID7;

    @ColumnDefault("'0'")
    @Column(name = "LightParamsID8", columnDefinition = "smallint UNSIGNED not null")
    @Db2Field(fieldIndex = 14, type = Db2Type.SHORT)
    private Integer lightParamsID8;

}