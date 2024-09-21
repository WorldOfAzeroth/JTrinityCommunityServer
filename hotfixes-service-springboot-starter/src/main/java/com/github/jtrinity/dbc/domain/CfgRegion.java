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
@Table(name = "cfg_regions")
@Db2File(name = "Cfg_Regions.db2", layoutHash = 0x9F4272BF)
public class CfgRegion implements DbcEntity {
    @Id
    @ColumnDefault("'0'")
    @Column(name = "ID", columnDefinition = "int UNSIGNED not null")
    @Db2Field(fieldIndex = 0, type = Db2Type.INT)
    private Integer id;


    @Column(name = "Tag")
    @Db2Field(fieldIndex = 1, type = Db2Type.STRING_NOT_LOCALIZED)
    private String tag;


    @Column(name = "Raidorigin")
    @Db2Field(fieldIndex = 2, type = Db2Type.INT)
    private Integer raidorigin;


    @Column(name = "ChallengeOrigin")
    @Db2Field(fieldIndex = 3, type = Db2Type.INT)
    private Integer challengeOrigin;


    @Column(name = "RegionID")
    @Db2Field(fieldIndex = 4, type = Db2Type.SHORT)
    private Short regionID;


    @Column(name = "RegionGroupMask")
    @Db2Field(fieldIndex = 5, type = Db2Type.BYTE)
    private Byte regionGroupMask;

    @Id
    @ColumnDefault("0")
    @Column(name = "VerifiedBuild", nullable = false)
    private Integer verifiedBuild;


}
