package com.github.jtrinity.dbc.domain;

import com.github.jtrinity.cache.DbcEntity;
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
@Table(name = "item_level_selector_quality")
@Db2DataBind(name = "ItemLevelSelectorQuality.db2", layoutHash = 0xB7174A51, parentIndexField = 2, fields = {
        @Db2Field(name = "id", type = Db2Type.INT),
        @Db2Field(name = "qualityItemBonusListID", type = Db2Type.INT, signed = true),
        @Db2Field(name = "quality", type = Db2Type.BYTE, signed = true),
        @Db2Field(name = "parentILSQualitySetID", type = Db2Type.SHORT, signed = true)
})
public class ItemLevelSelectorQuality implements DbcEntity {
    @Id
    @ColumnDefault("'0'")
    @Column(name = "ID", columnDefinition = "int UNSIGNED not null")
    private Integer id;

    @Column(name = "QualityItemBonusListID")
    private Integer qualityItemBonusListID;

    @Column(name = "Quality")
    private Byte quality;

    @Column(name = "ParentILSQualitySetID")
    private Short parentILSQualitySetID;

    @Id
    @ColumnDefault("0")
    @Column(name = "VerifiedBuild", nullable = false)
    private Integer verifiedBuild;

}
