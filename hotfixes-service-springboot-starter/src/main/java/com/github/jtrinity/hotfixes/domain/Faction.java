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
@Table(name = "faction")
@Db2File(name = "Faction.db2", fileDataId = 1361972, layoutHash = 0x767B5394, indexField = 3)
public class Faction {
    @Id
    @ColumnDefault("'0'")
    @Column(name = "ID", columnDefinition = "int UNSIGNED not null")
    @Db2Field(fieldIndex = 6, type = Db2Type.INT)
    private Integer id;

    @Id
    @ColumnDefault("0")
    @Column(name = "VerifiedBuild", nullable = false)
    private Integer verifiedBuild;

    @ColumnDefault("0")
    @Column(name = "ReputationRaceMask1", nullable = false)
    @Db2Field(fieldIndex = 0, type = Db2Type.LONG, signed = true)
    private Long reputationRaceMask1;

    @ColumnDefault("0")
    @Column(name = "ReputationRaceMask2", nullable = false)
    @Db2Field(fieldIndex = 1, type = Db2Type.LONG, signed = true)
    private Long reputationRaceMask2;

    @ColumnDefault("0")
    @Column(name = "ReputationRaceMask3", nullable = false)
    @Db2Field(fieldIndex = 2, type = Db2Type.LONG, signed = true)
    private Long reputationRaceMask3;

    @ColumnDefault("0")
    @Column(name = "ReputationRaceMask4", nullable = false)
    @Db2Field(fieldIndex = 3, type = Db2Type.LONG, signed = true)
    private Long reputationRaceMask4;

    @Lob
    @Column(name = "Name")
    @Db2Field(fieldIndex = 4, type = Db2Type.STRING)
    private String name;

    @Lob
    @Column(name = "Description")
    @Db2Field(fieldIndex = 5, type = Db2Type.STRING)
    private String description;

    @ColumnDefault("0")
    @Column(name = "ReputationIndex", nullable = false)
    @Db2Field(fieldIndex = 7, type = Db2Type.SHORT, signed = true)
    private Short reputationIndex;

    @ColumnDefault("'0'")
    @Column(name = "ParentFactionID", columnDefinition = "smallint UNSIGNED not null")
    @Db2Field(fieldIndex = 8, type = Db2Type.SHORT)
    private Integer parentFactionID;

    @ColumnDefault("'0'")
    @Column(name = "Expansion", columnDefinition = "tinyint UNSIGNED not null")
    @Db2Field(fieldIndex = 9, type = Db2Type.BYTE)
    private Short expansion;

    @ColumnDefault("'0'")
    @Column(name = "FriendshipRepID", columnDefinition = "tinyint UNSIGNED not null")
    @Db2Field(fieldIndex = 10, type = Db2Type.BYTE)
    private Short friendshipRepID;

    @ColumnDefault("0")
    @Column(name = "Flags", nullable = false)
    @Db2Field(fieldIndex = 11, type = Db2Type.INT, signed = true)
    private Integer flags;

    @ColumnDefault("'0'")
    @Column(name = "ParagonFactionID", columnDefinition = "smallint UNSIGNED not null")
    @Db2Field(fieldIndex = 12, type = Db2Type.SHORT)
    private Integer paragonFactionID;

    @ColumnDefault("0")
    @Column(name = "RenownFactionID", nullable = false)
    @Db2Field(fieldIndex = 13, type = Db2Type.INT, signed = true)
    private Integer renownFactionID;

    @ColumnDefault("0")
    @Column(name = "RenownCurrencyID", nullable = false)
    @Db2Field(fieldIndex = 14, type = Db2Type.INT, signed = true)
    private Integer renownCurrencyID;

    @ColumnDefault("0")
    @Column(name = "ReputationClassMask1", nullable = false)
    @Db2Field(fieldIndex = 15, type = Db2Type.SHORT, signed = true)
    private Short reputationClassMask1;

    @ColumnDefault("0")
    @Column(name = "ReputationClassMask2", nullable = false)
    @Db2Field(fieldIndex = 16, type = Db2Type.SHORT, signed = true)
    private Short reputationClassMask2;

    @ColumnDefault("0")
    @Column(name = "ReputationClassMask3", nullable = false)
    @Db2Field(fieldIndex = 17, type = Db2Type.SHORT, signed = true)
    private Short reputationClassMask3;

    @ColumnDefault("0")
    @Column(name = "ReputationClassMask4", nullable = false)
    @Db2Field(fieldIndex = 18, type = Db2Type.SHORT, signed = true)
    private Short reputationClassMask4;

    @ColumnDefault("'0'")
    @Column(name = "ReputationFlags1", columnDefinition = "smallint UNSIGNED not null")
    @Db2Field(fieldIndex = 19, type = Db2Type.SHORT)
    private Integer reputationFlags1;

    @ColumnDefault("'0'")
    @Column(name = "ReputationFlags2", columnDefinition = "smallint UNSIGNED not null")
    @Db2Field(fieldIndex = 20, type = Db2Type.SHORT)
    private Integer reputationFlags2;

    @ColumnDefault("'0'")
    @Column(name = "ReputationFlags3", columnDefinition = "smallint UNSIGNED not null")
    @Db2Field(fieldIndex = 21, type = Db2Type.SHORT)
    private Integer reputationFlags3;

    @ColumnDefault("'0'")
    @Column(name = "ReputationFlags4", columnDefinition = "smallint UNSIGNED not null")
    @Db2Field(fieldIndex = 22, type = Db2Type.SHORT)
    private Integer reputationFlags4;

    @ColumnDefault("0")
    @Column(name = "ReputationBase1", nullable = false)
    @Db2Field(fieldIndex = 23, type = Db2Type.INT, signed = true)
    private Integer reputationBase1;

    @ColumnDefault("0")
    @Column(name = "ReputationBase2", nullable = false)
    @Db2Field(fieldIndex = 24, type = Db2Type.INT, signed = true)
    private Integer reputationBase2;

    @ColumnDefault("0")
    @Column(name = "ReputationBase3", nullable = false)
    @Db2Field(fieldIndex = 25, type = Db2Type.INT, signed = true)
    private Integer reputationBase3;

    @ColumnDefault("0")
    @Column(name = "ReputationBase4", nullable = false)
    @Db2Field(fieldIndex = 26, type = Db2Type.INT, signed = true)
    private Integer reputationBase4;

    @ColumnDefault("0")
    @Column(name = "ReputationMax1", nullable = false)
    @Db2Field(fieldIndex = 27, type = Db2Type.INT, signed = true)
    private Integer reputationMax1;

    @ColumnDefault("0")
    @Column(name = "ReputationMax2", nullable = false)
    @Db2Field(fieldIndex = 28, type = Db2Type.INT, signed = true)
    private Integer reputationMax2;

    @ColumnDefault("0")
    @Column(name = "ReputationMax3", nullable = false)
    @Db2Field(fieldIndex = 29, type = Db2Type.INT, signed = true)
    private Integer reputationMax3;

    @ColumnDefault("0")
    @Column(name = "ReputationMax4", nullable = false)
    @Db2Field(fieldIndex = 30, type = Db2Type.INT, signed = true)
    private Integer reputationMax4;

    @ColumnDefault("0")
    @Column(name = "ParentFactionMod1", nullable = false)
    @Db2Field(fieldIndex = 31, type = Db2Type.FLOAT)
    private Float parentFactionMod1;

    @ColumnDefault("0")
    @Column(name = "ParentFactionMod2", nullable = false)
    @Db2Field(fieldIndex = 32, type = Db2Type.FLOAT)
    private Float parentFactionMod2;

    @ColumnDefault("'0'")
    @Column(name = "ParentFactionCap1", columnDefinition = "tinyint UNSIGNED not null")
    @Db2Field(fieldIndex = 33, type = Db2Type.BYTE)
    private Short parentFactionCap1;

    @ColumnDefault("'0'")
    @Column(name = "ParentFactionCap2", columnDefinition = "tinyint UNSIGNED not null")
    @Db2Field(fieldIndex = 34, type = Db2Type.BYTE)
    private Short parentFactionCap2;

}