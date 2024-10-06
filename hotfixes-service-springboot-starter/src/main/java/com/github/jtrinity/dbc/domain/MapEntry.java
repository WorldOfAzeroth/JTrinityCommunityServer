package com.github.jtrinity.dbc.domain;

import com.github.jtrinity.cache.DbcEntity;
import com.github.jtrinity.common.LocalizedString;
import com.github.jtrinity.dbc.db2.Db2Field;
import com.github.jtrinity.dbc.db2.Db2DataBind;
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
@Table(name = "map")
@Db2DataBind(name = "Map.db2", layoutHash = 0xF568DF12, fields = {
        @Db2Field(name = "directory", type = Db2Type.STRING_NOT_LOCALIZED),
        @Db2Field(name = "mapName", type = Db2Type.STRING),
        @Db2Field(name = {"mapDescription0", "mapDescription1"}, type = Db2Type.STRING),
        @Db2Field(name = "pvpShortDescription", type = Db2Type.STRING),
        @Db2Field(name = "pvpLongDescription", type = Db2Type.STRING),
        @Db2Field(name = {"flags1", "flags2"}, type = Db2Type.INT, signed = true),
        @Db2Field(name = "minimapIconScale", type = Db2Type.FLOAT),
        @Db2Field(name = "corpseX", type = Db2Type.FLOAT),
        @Db2Field(name = "corpseY", type = Db2Type.FLOAT),
        @Db2Field(name = "areaTableID", type = Db2Type.SHORT),
        @Db2Field(name = "loadingScreenID", type = Db2Type.SHORT, signed = true),
        @Db2Field(name = "corpseMapID", type = Db2Type.SHORT, signed = true),
        @Db2Field(name = "timeOfDayOverride", type = Db2Type.SHORT, signed = true),
        @Db2Field(name = "parentMapID", type = Db2Type.SHORT, signed = true),
        @Db2Field(name = "cosmeticParentMapID", type = Db2Type.SHORT, signed = true),
        @Db2Field(name = "windSettingsID", type = Db2Type.SHORT, signed = true),
        @Db2Field(name = "instanceType", type = Db2Type.BYTE),
        @Db2Field(name = "mapType", type = Db2Type.BYTE),
        @Db2Field(name = "expansionID", type = Db2Type.BYTE),
        @Db2Field(name = "maxPlayers", type = Db2Type.BYTE),
        @Db2Field(name = "timeOffset", type = Db2Type.BYTE)
})
public class MapEntry implements DbcEntity {
    @Id
    @ColumnDefault("'0'")
    @Column(name = "ID", columnDefinition = "int UNSIGNED not null")
    private Integer id;

    @Column(name = "Directory")
    private String directory;

    @Column(name = "MapName")
    private LocalizedString mapName;

    @Column(name = "MapDescription0")
    private LocalizedString mapDescription0;

    @Column(name = "MapDescription1")
    private LocalizedString mapDescription1;

    @Column(name = "PvpShortDescription")
    private LocalizedString pvpShortDescription;

    @Column(name = "PvpLongDescription")
    private LocalizedString pvpLongDescription;

    @Column(name = "Flags1")
    private Integer flags1;

    @Column(name = "Flags2")
    private Integer flags2;

    @Column(name = "MinimapIconScale")
    private Float minimapIconScale;

    @Column(name = "CorpseX")
    private Float corpseX;

    @Column(name = "CorpseY")
    private Float corpseY;

    @Column(name = "AreaTableID")
    private Short areaTableID;

    @Column(name = "LoadingScreenID")
    private Short loadingScreenID;

    @Column(name = "CorpseMapID")
    private Short corpseMapID;

    @Column(name = "TimeOfDayOverride")
    private Short timeOfDayOverride;

    @Column(name = "ParentMapID")
    private Short parentMapID;

    @Column(name = "CosmeticParentMapID")
    private Short cosmeticParentMapID;

    @Column(name = "WindSettingsID")
    private Short windSettingsID;

    @Column(name = "InstanceType")
    private Byte instanceType;

    @Column(name = "MapType")
    private Byte mapType;

    @Column(name = "ExpansionID")
    private Byte expansionID;

    @Column(name = "MaxPlayers")
    private Byte maxPlayers;

    @Column(name = "TimeOffset")
    private Byte timeOffset;

    @Id
    @ColumnDefault("0")
    @Column(name = "VerifiedBuild", nullable = false)
    private Integer verifiedBuild;

}
