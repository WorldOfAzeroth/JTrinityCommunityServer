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
@Table(name = "map")
public class Map {
    @Id
    @ColumnDefault("'0'")
    @Column(name = "ID", columnDefinition = "int UNSIGNED not null")
    private Integer id;

    @Id
    @ColumnDefault("0")
    @Column(name = "VerifiedBuild", nullable = false)
    private Integer verifiedBuild;

    @Lob
    @Column(name = "Directory")
    private String directory;

    @Lob
    @Column(name = "MapName")
    private String mapName;

    @Lob
    @Column(name = "MapDescription0")
    private String mapDescription0;

    @Lob
    @Column(name = "MapDescription1")
    private String mapDescription1;

    @Lob
    @Column(name = "PvpShortDescription")
    private String pvpShortDescription;

    @Lob
    @Column(name = "PvpLongDescription")
    private String pvpLongDescription;

    @ColumnDefault("'0'")
    @Column(name = "MapType", columnDefinition = "tinyint UNSIGNED not null")
    private Short mapType;

    @ColumnDefault("0")
    @Column(name = "InstanceType", nullable = false)
    private Byte instanceType;

    @ColumnDefault("'0'")
    @Column(name = "ExpansionID", columnDefinition = "tinyint UNSIGNED not null")
    private Short expansionID;

    @ColumnDefault("'0'")
    @Column(name = "AreaTableID", columnDefinition = "smallint UNSIGNED not null")
    private Integer areaTableID;

    @ColumnDefault("0")
    @Column(name = "LoadingScreenID", nullable = false)
    private Short loadingScreenID;

    @ColumnDefault("0")
    @Column(name = "TimeOfDayOverride", nullable = false)
    private Short timeOfDayOverride;

    @ColumnDefault("0")
    @Column(name = "ParentMapID", nullable = false)
    private Short parentMapID;

    @ColumnDefault("0")
    @Column(name = "CosmeticParentMapID", nullable = false)
    private Short cosmeticParentMapID;

    @ColumnDefault("'0'")
    @Column(name = "TimeOffset", columnDefinition = "tinyint UNSIGNED not null")
    private Short timeOffset;

    @ColumnDefault("0")
    @Column(name = "MinimapIconScale", nullable = false)
    private Float minimapIconScale;

    @ColumnDefault("0")
    @Column(name = "RaidOffset", nullable = false)
    private Integer raidOffset;

    @ColumnDefault("0")
    @Column(name = "CorpseMapID", nullable = false)
    private Short corpseMapID;

    @ColumnDefault("'0'")
    @Column(name = "MaxPlayers", columnDefinition = "tinyint UNSIGNED not null")
    private Short maxPlayers;

    @ColumnDefault("0")
    @Column(name = "WindSettingsID", nullable = false)
    private Short windSettingsID;

    @ColumnDefault("0")
    @Column(name = "ZmpFileDataID", nullable = false)
    private Integer zmpFileDataID;

    @ColumnDefault("0")
    @Column(name = "Flags1", nullable = false)
    private Integer flags1;

    @ColumnDefault("0")
    @Column(name = "Flags2", nullable = false)
    private Integer flags2;

    @ColumnDefault("0")
    @Column(name = "Flags3", nullable = false)
    private Integer flags3;

}