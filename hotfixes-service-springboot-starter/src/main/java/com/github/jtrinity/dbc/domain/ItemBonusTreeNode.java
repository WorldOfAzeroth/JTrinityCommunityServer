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
@Table(name = "item_bonus_tree_node")
@Db2File(name = "ItemBonusTreeNode.db2", layoutHash = 0x84FE93B7, parentIndexField = 4)
public class ItemBonusTreeNode implements DbcEntity {
    @Id
    @ColumnDefault("'0'")
    @Column(name = "ID", columnDefinition = "int UNSIGNED not null")
    @Db2Field(fieldIndex = 0, type = Db2Type.INT)
    private Integer id;


    @Column(name = "ChildItemBonusTreeID")
    @Db2Field(fieldIndex = 1, type = Db2Type.SHORT)
    private Short childItemBonusTreeID;


    @Column(name = "ChildItemBonusListID")
    @Db2Field(fieldIndex = 2, type = Db2Type.SHORT)
    private Short childItemBonusListID;


    @Column(name = "ChildItemLevelSelectorID")
    @Db2Field(fieldIndex = 3, type = Db2Type.SHORT)
    private Short childItemLevelSelectorID;


    @Column(name = "ItemContext")
    @Db2Field(fieldIndex = 4, type = Db2Type.BYTE)
    private Byte itemContext;


    @Column(name = "ParentItemBonusTreeID")
    @Db2Field(fieldIndex = 5, type = Db2Type.SHORT)
    private Short parentItemBonusTreeID;

    @Id
    @ColumnDefault("0")
    @Column(name = "VerifiedBuild", nullable = false)
    private Integer verifiedBuild;


}
