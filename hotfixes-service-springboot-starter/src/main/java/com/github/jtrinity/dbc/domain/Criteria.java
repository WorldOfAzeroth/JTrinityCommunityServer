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
@Table(name = "criteria")
@Db2File(name = "Criteria.db2", layoutHash = 0xA87A5BB9)
public class Criteria implements DbcEntity {
    @Id
    @ColumnDefault("'0'")
    @Column(name = "ID", columnDefinition = "int UNSIGNED not null")
    @Db2Field(fieldIndex = 0, type = Db2Type.INT)
    private Integer id;


    @Column(name = "Asset")
    @Db2Field(fieldIndex = 1, type = Db2Type.INT)
    private Integer asset;


    @Column(name = "StartAsset")
    @Db2Field(fieldIndex = 2, type = Db2Type.INT, signed = true)
    private Integer startAsset;


    @Column(name = "FailAsset")
    @Db2Field(fieldIndex = 3, type = Db2Type.INT, signed = true)
    private Integer failAsset;


    @Column(name = "ModifierTreeId")
    @Db2Field(fieldIndex = 4, type = Db2Type.INT)
    private Integer ModifierTreeId;


    @Column(name = "StartTimer")
    @Db2Field(fieldIndex = 5, type = Db2Type.SHORT)
    private Short startTimer;


    @Column(name = "EligibilityWorldStateID")
    @Db2Field(fieldIndex = 6, type = Db2Type.SHORT, signed = true)
    private Short eligibilityWorldStateID;


    @Column(name = "Type")
    @Db2Field(fieldIndex = 7, type = Db2Type.BYTE)
    private Byte type;


    @Column(name = "StartEvent")
    @Db2Field(fieldIndex = 8, type = Db2Type.BYTE)
    private Byte startEvent;


    @Column(name = "FailEvent")
    @Db2Field(fieldIndex = 9, type = Db2Type.BYTE)
    private Byte failEvent;


    @Column(name = "Flags")
    @Db2Field(fieldIndex = 10, type = Db2Type.BYTE)
    private Byte flags;


    @Column(name = "EligibilityWorldStateValue")
    @Db2Field(fieldIndex = 11, type = Db2Type.BYTE, signed = true)
    private Byte eligibilityWorldStateValue;

    @Id
    @ColumnDefault("0")
    @Column(name = "VerifiedBuild", nullable = false)
    private Integer verifiedBuild;


}
