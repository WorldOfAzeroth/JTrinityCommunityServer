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
@Table(name = "chr_customization_req")
@Db2File(name = "ChrCustomizationReq.db2", fileDataId = 3450453, layoutHash = 0x9B25E739, indexField = 2)
public class ChrCustomizationReq {
    @Id
    @ColumnDefault("'0'")
    @Column(name = "ID", columnDefinition = "int UNSIGNED not null")
    @Db2Field(fieldIndex = 2, type = Db2Type.INT)
    private Integer id;

    @Id
    @ColumnDefault("0")
    @Column(name = "VerifiedBuild", nullable = false)
    private Integer verifiedBuild;

    @ColumnDefault("0")
    @Column(name = "RaceMask", nullable = false)
    @Db2Field(fieldIndex = 0, type = Db2Type.LONG, signed = true)
    private Long raceMask;

    @Lob
    @Column(name = "ReqSource")
    @Db2Field(fieldIndex = 1, type = Db2Type.STRING)
    private String reqSource;

    @ColumnDefault("0")
    @Column(name = "Flags", nullable = false)
    @Db2Field(fieldIndex = 3, type = Db2Type.INT, signed = true)
    private Integer flags;

    @ColumnDefault("0")
    @Column(name = "ClassMask", nullable = false)
    @Db2Field(fieldIndex = 4, type = Db2Type.INT, signed = true)
    private Integer classMask;

    @ColumnDefault("0")
    @Column(name = "AchievementID", nullable = false)
    @Db2Field(fieldIndex = 5, type = Db2Type.INT, signed = true)
    private Integer achievementID;

    @ColumnDefault("0")
    @Column(name = "QuestID", nullable = false)
    @Db2Field(fieldIndex = 6, type = Db2Type.INT, signed = true)
    private Integer questID;

    @ColumnDefault("0")
    @Column(name = "OverrideArchive", nullable = false)
    @Db2Field(fieldIndex = 7, type = Db2Type.INT, signed = true)
    private Integer overrideArchive;

    @ColumnDefault("0")
    @Column(name = "ItemModifiedAppearanceID", nullable = false)
    @Db2Field(fieldIndex = 8, type = Db2Type.INT, signed = true)
    private Integer itemModifiedAppearanceID;

}