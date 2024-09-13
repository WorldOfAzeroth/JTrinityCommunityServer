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
@Table(name = "item_bonus_tree_node")
@Db2File(name = "ItemBonusTreeNode.db2", fileDataId = 987134, layoutHash = 0xF5BD96C0, parentIndexField = 8)
public class ItemBonusTreeNode {
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
    @Column(name = "ItemContext", columnDefinition = "tinyint UNSIGNED not null")
    @Db2Field(fieldIndex = 1, type = Db2Type.BYTE)
    private Short itemContext;

    @ColumnDefault("'0'")
    @Column(name = "ChildItemBonusTreeID", columnDefinition = "smallint UNSIGNED not null")
    @Db2Field(fieldIndex = 2, type = Db2Type.SHORT)
    private Integer childItemBonusTreeID;

    @ColumnDefault("'0'")
    @Column(name = "ChildItemBonusListID", columnDefinition = "smallint UNSIGNED not null")
    @Db2Field(fieldIndex = 3, type = Db2Type.SHORT)
    private Integer childItemBonusListID;

    @ColumnDefault("'0'")
    @Column(name = "ChildItemLevelSelectorID", columnDefinition = "smallint UNSIGNED not null")
    @Db2Field(fieldIndex = 4, type = Db2Type.SHORT)
    private Integer childItemLevelSelectorID;

    @ColumnDefault("0")
    @Column(name = "ChildItemBonusListGroupID", nullable = false)
    @Db2Field(fieldIndex = 5, type = Db2Type.INT, signed = true)
    private Integer childItemBonusListGroupID;

    @ColumnDefault("0")
    @Column(name = "IblGroupPointsModSetID", nullable = false)
    @Db2Field(fieldIndex = 6, type = Db2Type.INT, signed = true)
    private Integer iblGroupPointsModSetID;

    @ColumnDefault("0")
    @Column(name = "MinMythicPlusLevel", nullable = false)
    @Db2Field(fieldIndex = 7, type = Db2Type.INT, signed = true)
    private Integer minMythicPlusLevel;

    @ColumnDefault("0")
    @Column(name = "MaxMythicPlusLevel", nullable = false)
    @Db2Field(fieldIndex = 8, type = Db2Type.INT, signed = true)
    private Integer maxMythicPlusLevel;

    @ColumnDefault("'0'")
    @Column(name = "ParentItemBonusTreeID", columnDefinition = "int UNSIGNED not null")
    @Db2Field(fieldIndex = 9, type = Db2Type.INT)
    private Long parentItemBonusTreeID;

}