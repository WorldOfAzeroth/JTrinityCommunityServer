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
@Table(name = "item_level_selector_quality")
@Db2File(name = "ItemLevelSelectorQuality.db2", layoutHash = 0xB7174A51, parentIndexField = 2)
public class ItemLevelSelectorQuality implements DbcEntity {
    @Id
    @ColumnDefault("'0'")
    @Column(name = "ID", columnDefinition = "int UNSIGNED not null")
    @Db2Field(fieldIndex = 0, type = Db2Type.INT)
    private Integer id;


    @Column(name = "QualityItemBonusListID")
    @Db2Field(fieldIndex = 1, type = Db2Type.INT, signed = true)
    private Integer qualityItemBonusListID;


    @Column(name = "Quality")
    @Db2Field(fieldIndex = 2, type = Db2Type.BYTE, signed = true)
    private Byte quality;


    @Column(name = "ParentILSQualitySetID")
    @Db2Field(fieldIndex = 3, type = Db2Type.SHORT, signed = true)
    private Short parentILSQualitySetID;

    @Id
    @ColumnDefault("0")
    @Column(name = "VerifiedBuild", nullable = false)
    private Integer verifiedBuild;


}
