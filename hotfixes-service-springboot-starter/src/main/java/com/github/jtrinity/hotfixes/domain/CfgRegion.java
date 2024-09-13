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
@Table(name = "cfg_regions")
@Db2File(name = "Cfg_Regions.db2", fileDataId = 1082876, layoutHash = 0xFC93C56C)
public class CfgRegion {
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
    @Column(name = "Tag")
    @Db2Field(fieldIndex = 1, type = Db2Type.STRING_NOT_LOCALIZED)
    private String tag;

    @ColumnDefault("'0'")
    @Column(name = "RegionID", columnDefinition = "smallint UNSIGNED not null")
    @Db2Field(fieldIndex = 2, type = Db2Type.SHORT)
    private Integer regionID;

    @ColumnDefault("'0'")
    @Column(name = "Raidorigin", columnDefinition = "int UNSIGNED not null")
    @Db2Field(fieldIndex = 3, type = Db2Type.INT)
    private Long raidorigin;

    @ColumnDefault("'0'")
    @Column(name = "RegionGroupMask", columnDefinition = "tinyint UNSIGNED not null")
    @Db2Field(fieldIndex = 4, type = Db2Type.BYTE)
    private Short regionGroupMask;

    @ColumnDefault("'0'")
    @Column(name = "ChallengeOrigin", columnDefinition = "int UNSIGNED not null")
    @Db2Field(fieldIndex = 5, type = Db2Type.INT)
    private Long challengeOrigin;

}