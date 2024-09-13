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
@Table(name = "item_level_selector_quality")
@Db2File(name = "ItemLevelSelectorQuality.db2", fileDataId = 1624937, layoutHash = 0xBAF7EC29, parentIndexField = 2)
public class ItemLevelSelectorQuality {
    @Id
    @ColumnDefault("'0'")
    @Column(name = "ID", columnDefinition = "int UNSIGNED not null")
    @Db2Field(fieldIndex = 0, type = Db2Type.INT)
    private Integer id;

    @Id
    @ColumnDefault("0")
    @Column(name = "VerifiedBuild", nullable = false)
    private Integer verifiedBuild;

    @ColumnDefault("0")
    @Column(name = "QualityItemBonusListID", nullable = false)
    @Db2Field(fieldIndex = 1, type = Db2Type.INT, signed = true)
    private Integer qualityItemBonusListID;

    @ColumnDefault("0")
    @Column(name = "Quality", nullable = false)
    @Db2Field(fieldIndex = 2, type = Db2Type.BYTE, signed = true)
    private Byte quality;

    @ColumnDefault("'0'")
    @Column(name = "ParentILSQualitySetID", columnDefinition = "int UNSIGNED not null")
    @Db2Field(fieldIndex = 3, type = Db2Type.INT)
    private Long parentILSQualitySetID;

}