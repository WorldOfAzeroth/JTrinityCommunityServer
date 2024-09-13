package com.github.jtrinity.hotfixes.domain;

import com.github.jtrinity.hotfixes.db2.Db2Field;
import com.github.jtrinity.hotfixes.db2.Db2File;
import com.github.jtrinity.hotfixes.db2.Db2Type;

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
@Db2File(name = "Map.db2", fileDataId = 1349477, layoutHash = 0xEE526FA5)
public class MapEntry {
    @Id
    @ColumnDefault("'0'")
    @Column(name = "ID", columnDefinition = "int UNSIGNED not null")
    @Db2Field(fieldIndex = 0, type = Db2Type.INT)
    private Integer id;

    @Id
    @ColumnDefault("0")
    @Column(name = "VerifiedBuild", nullable = false)
    private Integer verifiedBuild;

    @Lob
    @Column(name = "Directory")
    @Db2Field(fieldIndex = 1, type = Db2Type.STRING_NOT_LOCALIZED)
    private String directory;

    @Lob
    @Column(name = "MapName")
    @Db2Field(fieldIndex = 2, type = Db2Type.STRING)
    private String mapName;

    @Lob
    @Column(name = "MapDescription0")
    @Db2Field(fieldIndex = 3, type = Db2Type.STRING)
    private String mapDescription0;

    @Lob
    @Column(name = "MapDescription1")
    @Db2Field(fieldIndex = 4, type = Db2Type.STRING)
    private String mapDescription1;

    @Lob
    @Column(name = "PvpShortDescription")
    @Db2Field(fieldIndex = 5, type = Db2Type.STRING)
    private String pvpShortDescription;

    @Lob
    @Column(name = "PvpLongDescription")
    @Db2Field(fieldIndex = 6, type = Db2Type.STRING)
    private String pvpLongDescription;

    @ColumnDefault("'0'")
    @Column(name = "MapType", columnDefinition = "tinyint UNSIGNED not null")
    @Db2Field(fieldIndex = 7, type = Db2Type.BYTE)
    private Short mapType;

    @ColumnDefault("0")
    @Column(name = "InstanceType", nullable = false)
    @Db2Field(fieldIndex = 8, type = Db2Type.BYTE, signed = true)
    private Byte instanceType;

    @ColumnDefault("'0'")
    @Column(name = "ExpansionID", columnDefinition = "tinyint UNSIGNED not null")
    @Db2Field(fieldIndex = 9, type = Db2Type.BYTE)
    private Short expansionID;

    @ColumnDefault("'0'")
    @Column(name = "AreaTableID", columnDefinition = "smallint UNSIGNED not null")
    @Db2Field(fieldIndex = 10, type = Db2Type.SHORT)
    private Integer areaTableID;

    @ColumnDefault("0")
    @Column(name = "LoadingScreenID", nullable = false)
    @Db2Field(fieldIndex = 11, type = Db2Type.SHORT, signed = true)
    private Short loadingScreenID;

    @ColumnDefault("0")
    @Column(name = "TimeOfDayOverride", nullable = false)
    @Db2Field(fieldIndex = 12, type = Db2Type.SHORT, signed = true)
    private Short timeOfDayOverride;

    @ColumnDefault("0")
    @Column(name = "ParentMapID", nullable = false)
    @Db2Field(fieldIndex = 13, type = Db2Type.SHORT, signed = true)
    private Short parentMapID;

    @ColumnDefault("0")
    @Column(name = "CosmeticParentMapID", nullable = false)
    @Db2Field(fieldIndex = 14, type = Db2Type.SHORT, signed = true)
    private Short cosmeticParentMapID;

    @ColumnDefault("'0'")
    @Column(name = "TimeOffset", columnDefinition = "tinyint UNSIGNED not null")
    @Db2Field(fieldIndex = 15, type = Db2Type.BYTE)
    private Short timeOffset;

    @ColumnDefault("0")
    @Column(name = "MinimapIconScale", nullable = false)
    @Db2Field(fieldIndex = 16, type = Db2Type.FLOAT)
    private Float minimapIconScale;

    @ColumnDefault("0")
    @Column(name = "RaidOffset", nullable = false)
    @Db2Field(fieldIndex = 17, type = Db2Type.INT, signed = true)
    private Integer raidOffset;

    @ColumnDefault("0")
    @Column(name = "CorpseMapID", nullable = false)
    @Db2Field(fieldIndex = 18, type = Db2Type.SHORT, signed = true)
    private Short corpseMapID;

    @ColumnDefault("'0'")
    @Column(name = "MaxPlayers", columnDefinition = "tinyint UNSIGNED not null")
    @Db2Field(fieldIndex = 19, type = Db2Type.BYTE)
    private Short maxPlayers;

    @ColumnDefault("0")
    @Column(name = "WindSettingsID", nullable = false)
    @Db2Field(fieldIndex = 20, type = Db2Type.SHORT, signed = true)
    private Short windSettingsID;

    @ColumnDefault("0")
    @Column(name = "ZmpFileDataID", nullable = false)
    @Db2Field(fieldIndex = 21, type = Db2Type.INT, signed = true)
    private Integer zmpFileDataID;

    @ColumnDefault("0")
    @Column(name = "Flags1", nullable = false)
    @Db2Field(fieldIndex = 22, type = Db2Type.INT, signed = true)
    private Integer flags1;

    @ColumnDefault("0")
    @Column(name = "Flags2", nullable = false)
    @Db2Field(fieldIndex = 23, type = Db2Type.INT, signed = true)
    private Integer flags2;

    @ColumnDefault("0")
    @Column(name = "Flags3", nullable = false)
    @Db2Field(fieldIndex = 24, type = Db2Type.INT, signed = true)
    private Integer flags3;

}