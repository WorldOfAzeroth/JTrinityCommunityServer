package com.github.jtrinity.dbc.domain;

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
@ToString(onlyExplicitlyIncluded = true)
@IdClass(DB2Id.class)
@Entity
@Table(name = "item_limit_category_condition")
@Db2File(name = "ItemLimitCategoryCondition.db2", layoutHash = 0x9E37B423, parentIndexField = 2)
public class ItemLimitCategoryCondition implements DbcEntity {
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
    @Column(name = "AddQuantity", nullable = false)
    @Db2Field(fieldIndex = 1, type = Db2Type.BYTE, signed = true)
    private Byte addQuantity;

    @ColumnDefault("'0'")
    @Column(name = "PlayerConditionID", columnDefinition = "int UNSIGNED not null")
    @Db2Field(fieldIndex = 2, type = Db2Type.INT)
    private Long playerConditionID;

    @ColumnDefault("'0'")
    @Column(name = "ParentItemLimitCategoryID", columnDefinition = "int UNSIGNED not null")
    @Db2Field(fieldIndex = 3, type = Db2Type.INT)
    private Long parentItemLimitCategoryID;

}