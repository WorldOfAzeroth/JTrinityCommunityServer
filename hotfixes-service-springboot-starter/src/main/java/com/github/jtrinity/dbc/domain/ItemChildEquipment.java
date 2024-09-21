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
@Table(name = "item_child_equipment")
@Db2File(name = "ItemChildEquipment.db2", layoutHash = 0xB6940674, parentIndexField = 2)
public class ItemChildEquipment implements DbcEntity {
    @Id
    @ColumnDefault("'0'")
    @Column(name = "ID", columnDefinition = "int UNSIGNED not null")
    @Db2Field(fieldIndex = 0, type = Db2Type.INT)
    private Integer id;


    @Column(name = "ChildItemID")
    @Db2Field(fieldIndex = 1, type = Db2Type.INT, signed = true)
    private Integer childItemID;


    @Column(name = "ChildItemEquipSlot")
    @Db2Field(fieldIndex = 2, type = Db2Type.BYTE)
    private Byte childItemEquipSlot;


    @Column(name = "ParentItemID")
    @Db2Field(fieldIndex = 3, type = Db2Type.INT, signed = true)
    private Integer parentItemID;

    @Id
    @ColumnDefault("0")
    @Column(name = "VerifiedBuild", nullable = false)
    private Integer verifiedBuild;


}
