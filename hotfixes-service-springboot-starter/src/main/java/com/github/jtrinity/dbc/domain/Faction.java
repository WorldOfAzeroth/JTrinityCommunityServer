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
@Table(name = "faction")
@Db2File(name = "Faction.db2", layoutHash = 0x6BFE8737, indexField = 3)
public class Faction implements DbcEntity {

    @Column(name = "ReputationRaceMask1")
    @Db2Field(fieldIndex = 0, type = Db2Type.LONG, signed = true)
    private Long reputationRaceMask1;


    @Column(name = "ReputationRaceMask2")
    @Db2Field(fieldIndex = 1, type = Db2Type.LONG, signed = true)
    private Long reputationRaceMask2;


    @Column(name = "ReputationRaceMask3")
    @Db2Field(fieldIndex = 2, type = Db2Type.LONG, signed = true)
    private Long reputationRaceMask3;


    @Column(name = "ReputationRaceMask4")
    @Db2Field(fieldIndex = 3, type = Db2Type.LONG, signed = true)
    private Long reputationRaceMask4;


    @Column(name = "Name")
    @Db2Field(fieldIndex = 4, type = Db2Type.STRING)
    private LocalizedString name;


    @Column(name = "Description")
    @Db2Field(fieldIndex = 5, type = Db2Type.STRING)
    private LocalizedString description;

    @Id
    @ColumnDefault("'0'")
    @Column(name = "ID", columnDefinition = "int UNSIGNED not null")
    @Db2Field(fieldIndex = 6, type = Db2Type.INT)
    private Integer id;


    @Column(name = "ReputationBase1")
    @Db2Field(fieldIndex = 7, type = Db2Type.INT, signed = true)
    private Integer reputationBase1;


    @Column(name = "ReputationBase2")
    @Db2Field(fieldIndex = 8, type = Db2Type.INT, signed = true)
    private Integer reputationBase2;


    @Column(name = "ReputationBase3")
    @Db2Field(fieldIndex = 9, type = Db2Type.INT, signed = true)
    private Integer reputationBase3;


    @Column(name = "ReputationBase4")
    @Db2Field(fieldIndex = 10, type = Db2Type.INT, signed = true)
    private Integer reputationBase4;


    @Column(name = "ParentFactionMod1")
    @Db2Field(fieldIndex = 11, type = Db2Type.FLOAT)
    private Float parentFactionMod1;


    @Column(name = "ParentFactionMod2")
    @Db2Field(fieldIndex = 12, type = Db2Type.FLOAT)
    private Float parentFactionMod2;


    @Column(name = "ReputationMax1")
    @Db2Field(fieldIndex = 13, type = Db2Type.INT, signed = true)
    private Integer reputationMax1;


    @Column(name = "ReputationMax2")
    @Db2Field(fieldIndex = 14, type = Db2Type.INT, signed = true)
    private Integer reputationMax2;


    @Column(name = "ReputationMax3")
    @Db2Field(fieldIndex = 15, type = Db2Type.INT, signed = true)
    private Integer reputationMax3;


    @Column(name = "ReputationMax4")
    @Db2Field(fieldIndex = 16, type = Db2Type.INT, signed = true)
    private Integer reputationMax4;


    @Column(name = "ReputationIndex")
    @Db2Field(fieldIndex = 17, type = Db2Type.SHORT, signed = true)
    private Short reputationIndex;


    @Column(name = "ReputationClassMask1")
    @Db2Field(fieldIndex = 18, type = Db2Type.SHORT, signed = true)
    private Short reputationClassMask1;


    @Column(name = "ReputationClassMask2")
    @Db2Field(fieldIndex = 19, type = Db2Type.SHORT, signed = true)
    private Short reputationClassMask2;


    @Column(name = "ReputationClassMask3")
    @Db2Field(fieldIndex = 20, type = Db2Type.SHORT, signed = true)
    private Short reputationClassMask3;


    @Column(name = "ReputationClassMask4")
    @Db2Field(fieldIndex = 21, type = Db2Type.SHORT, signed = true)
    private Short reputationClassMask4;


    @Column(name = "ReputationFlags1")
    @Db2Field(fieldIndex = 22, type = Db2Type.SHORT)
    private Short reputationFlags1;


    @Column(name = "ReputationFlags2")
    @Db2Field(fieldIndex = 23, type = Db2Type.SHORT)
    private Short reputationFlags2;


    @Column(name = "ReputationFlags3")
    @Db2Field(fieldIndex = 24, type = Db2Type.SHORT)
    private Short reputationFlags3;


    @Column(name = "ReputationFlags4")
    @Db2Field(fieldIndex = 25, type = Db2Type.SHORT)
    private Short reputationFlags4;


    @Column(name = "ParentFactionID")
    @Db2Field(fieldIndex = 26, type = Db2Type.SHORT)
    private Short parentFactionID;


    @Column(name = "ParagonFactionID")
    @Db2Field(fieldIndex = 27, type = Db2Type.SHORT)
    private Short paragonFactionID;


    @Column(name = "ParentFactionCap1")
    @Db2Field(fieldIndex = 28, type = Db2Type.BYTE)
    private Byte parentFactionCap1;


    @Column(name = "ParentFactionCap2")
    @Db2Field(fieldIndex = 29, type = Db2Type.BYTE)
    private Byte parentFactionCap2;


    @Column(name = "Expansion")
    @Db2Field(fieldIndex = 30, type = Db2Type.BYTE)
    private Byte expansion;


    @Column(name = "Flags")
    @Db2Field(fieldIndex = 31, type = Db2Type.BYTE)
    private Byte flags;


    @Column(name = "FriendshipRepID")
    @Db2Field(fieldIndex = 32, type = Db2Type.BYTE)
    private Byte friendshipRepID;

    @Id
    @ColumnDefault("0")
    @Column(name = "VerifiedBuild", nullable = false)
    private Integer verifiedBuild;


}
