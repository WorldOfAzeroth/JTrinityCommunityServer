package com.github.jtrinity.dbc.domain;

import com.github.jtrinity.common.LocalizedString;
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
@ToString
@IdClass(DB2Id.class)
@Entity
@Table(name = "light")
@Db2File(name = "Light.db2", layoutHash = 0x25025A13)
public class Light implements DbcEntity {
    @Id
    @ColumnDefault("'0'")
    @Column(name = "ID", columnDefinition = "int UNSIGNED not null")
    @Db2Field(fieldIndex = 0, type = Db2Type.INT)
    private Integer id;


    @Column(name = "GameCoordsX")
    @Db2Field(fieldIndex = 1, type = Db2Type.FLOAT)
    private Float gameCoordsX;


    @Column(name = "GameCoordsY")
    @Db2Field(fieldIndex = 2, type = Db2Type.FLOAT)
    private Float gameCoordsY;


    @Column(name = "GameCoordsZ")
    @Db2Field(fieldIndex = 3, type = Db2Type.FLOAT)
    private Float gameCoordsZ;


    @Column(name = "GameFalloffStart")
    @Db2Field(fieldIndex = 4, type = Db2Type.FLOAT)
    private Float gameFalloffStart;


    @Column(name = "GameFalloffEnd")
    @Db2Field(fieldIndex = 5, type = Db2Type.FLOAT)
    private Float gameFalloffEnd;


    @Column(name = "ContinentID")
    @Db2Field(fieldIndex = 6, type = Db2Type.SHORT, signed = true)
    private Short continentID;


    @Column(name = "LightParamsID1")
    @Db2Field(fieldIndex = 7, type = Db2Type.SHORT)
    private Short lightParamsID1;


    @Column(name = "LightParamsID2")
    @Db2Field(fieldIndex = 8, type = Db2Type.SHORT)
    private Short lightParamsID2;


    @Column(name = "LightParamsID3")
    @Db2Field(fieldIndex = 9, type = Db2Type.SHORT)
    private Short lightParamsID3;


    @Column(name = "LightParamsID4")
    @Db2Field(fieldIndex = 10, type = Db2Type.SHORT)
    private Short lightParamsID4;


    @Column(name = "LightParamsID5")
    @Db2Field(fieldIndex = 11, type = Db2Type.SHORT)
    private Short lightParamsID5;


    @Column(name = "LightParamsID6")
    @Db2Field(fieldIndex = 12, type = Db2Type.SHORT)
    private Short lightParamsID6;


    @Column(name = "LightParamsID7")
    @Db2Field(fieldIndex = 13, type = Db2Type.SHORT)
    private Short lightParamsID7;


    @Column(name = "LightParamsID8")
    @Db2Field(fieldIndex = 14, type = Db2Type.SHORT)
    private Short lightParamsID8;

    @Id
    @ColumnDefault("0")
    @Column(name = "VerifiedBuild", nullable = false)
    private Integer verifiedBuild;


}
