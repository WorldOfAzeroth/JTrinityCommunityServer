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
@Table(name = "area_table")
@Db2File(name = "AreaTable.db2", layoutHash = 0x0CA01129)
public class AreaTable implements DbcEntity {
    @Id
    @ColumnDefault("'0'")
    @Column(name = "ID", columnDefinition = "int UNSIGNED not null")
    @Db2Field(fieldIndex = 0, type = Db2Type.INT)
    private Integer id;


    @Column(name = "ZoneName")
    @Db2Field(fieldIndex = 1, type = Db2Type.STRING_NOT_LOCALIZED)
    private String zoneName;


    @Column(name = "AreaName")
    @Db2Field(fieldIndex = 2, type = Db2Type.STRING)
    private LocalizedString areaName;


    @Column(name = "Flags1")
    @Db2Field(fieldIndex = 3, type = Db2Type.INT, signed = true)
    private Integer flags1;


    @Column(name = "Flags2")
    @Db2Field(fieldIndex = 4, type = Db2Type.INT, signed = true)
    private Integer flags2;


    @Column(name = "AmbientMultiplier")
    @Db2Field(fieldIndex = 5, type = Db2Type.FLOAT)
    private Float ambientMultiplier;


    @Column(name = "ContinentID")
    @Db2Field(fieldIndex = 6, type = Db2Type.SHORT)
    private Short continentID;


    @Column(name = "ParentAreaID")
    @Db2Field(fieldIndex = 7, type = Db2Type.SHORT)
    private Short parentAreaID;


    @Column(name = "AreaBit")
    @Db2Field(fieldIndex = 8, type = Db2Type.SHORT, signed = true)
    private Short areaBit;


    @Column(name = "AmbienceID")
    @Db2Field(fieldIndex = 9, type = Db2Type.SHORT)
    private Short ambienceID;


    @Column(name = "ZoneMusic")
    @Db2Field(fieldIndex = 10, type = Db2Type.SHORT)
    private Short zoneMusic;


    @Column(name = "IntroSound")
    @Db2Field(fieldIndex = 11, type = Db2Type.SHORT)
    private Short introSound;


    @Column(name = "LiquidTypeID1")
    @Db2Field(fieldIndex = 12, type = Db2Type.SHORT)
    private Short liquidTypeID1;


    @Column(name = "LiquidTypeID2")
    @Db2Field(fieldIndex = 13, type = Db2Type.SHORT)
    private Short liquidTypeID2;


    @Column(name = "LiquidTypeID3")
    @Db2Field(fieldIndex = 14, type = Db2Type.SHORT)
    private Short liquidTypeID3;


    @Column(name = "LiquidTypeID4")
    @Db2Field(fieldIndex = 15, type = Db2Type.SHORT)
    private Short liquidTypeID4;


    @Column(name = "UwZoneMusic")
    @Db2Field(fieldIndex = 16, type = Db2Type.SHORT)
    private Short uwZoneMusic;


    @Column(name = "UwAmbience")
    @Db2Field(fieldIndex = 17, type = Db2Type.SHORT)
    private Short uwAmbience;


    @Column(name = "PvpCombatWorldStateID")
    @Db2Field(fieldIndex = 18, type = Db2Type.SHORT, signed = true)
    private Short pvpCombatWorldStateID;


    @Column(name = "SoundProviderPref")
    @Db2Field(fieldIndex = 19, type = Db2Type.BYTE)
    private Byte soundProviderPref;


    @Column(name = "SoundProviderPrefUnderwater")
    @Db2Field(fieldIndex = 20, type = Db2Type.BYTE)
    private Byte soundProviderPrefUnderwater;


    @Column(name = "ExplorationLevel")
    @Db2Field(fieldIndex = 21, type = Db2Type.BYTE, signed = true)
    private Byte explorationLevel;


    @Column(name = "FactionGroupMask")
    @Db2Field(fieldIndex = 22, type = Db2Type.BYTE)
    private Byte factionGroupMask;


    @Column(name = "MountFlags")
    @Db2Field(fieldIndex = 23, type = Db2Type.BYTE)
    private Byte mountFlags;


    @Column(name = "WildBattlePetLevelMin")
    @Db2Field(fieldIndex = 24, type = Db2Type.BYTE)
    private Byte wildBattlePetLevelMin;


    @Column(name = "WildBattlePetLevelMax")
    @Db2Field(fieldIndex = 25, type = Db2Type.BYTE)
    private Byte wildBattlePetLevelMax;


    @Column(name = "WindSettingsID")
    @Db2Field(fieldIndex = 26, type = Db2Type.BYTE)
    private Byte windSettingsID;


    @Column(name = "UwIntroSound")
    @Db2Field(fieldIndex = 27, type = Db2Type.INT)
    private Integer uwIntroSound;

    @Id
    @ColumnDefault("0")
    @Column(name = "VerifiedBuild", nullable = false)
    private Integer verifiedBuild;


}
