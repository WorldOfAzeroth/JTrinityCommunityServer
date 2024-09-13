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
@Table(name = "item_level_selector")
@Db2File(name = "ItemLevelSelector.db2", fileDataId = 1588911, layoutHash = 0xDAC5C754)
public class ItemLevelSelector {
    @Id
    @ColumnDefault("'0'")
    @Column(name = "ID", columnDefinition = "int UNSIGNED not null")
    @Db2Field(fieldIndex = 0, type = Db2Type.INT)
    private Integer id;

    @Id
    @ColumnDefault("0")
    @Column(name = "VerifiedBuild", nullable = false)
    private Integer verifiedBuild;

    @ColumnDefault("'0'")
    @Column(name = "MinItemLevel", columnDefinition = "smallint UNSIGNED not null")
    @Db2Field(fieldIndex = 1, type = Db2Type.SHORT)
    private Integer minItemLevel;

    @ColumnDefault("'0'")
    @Column(name = "ItemLevelSelectorQualitySetID", columnDefinition = "smallint UNSIGNED not null")
    @Db2Field(fieldIndex = 2, type = Db2Type.SHORT)
    private Integer itemLevelSelectorQualitySetID;

}