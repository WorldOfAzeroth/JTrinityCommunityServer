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
@Table(name = "item_appearance")
@Db2File(name = "ItemAppearance.db2", layoutHash = 0x06D35A59)
public class ItemAppearance implements DbcEntity {
    @Id
    @ColumnDefault("'0'")
    @Column(name = "ID", columnDefinition = "int UNSIGNED not null")
    @Db2Field(fieldIndex = 0, type = Db2Type.INT)
    private Integer id;


    @Column(name = "ItemDisplayInfoID")
    @Db2Field(fieldIndex = 1, type = Db2Type.INT, signed = true)
    private Integer itemDisplayInfoID;


    @Column(name = "DefaultIconFileDataID")
    @Db2Field(fieldIndex = 2, type = Db2Type.INT, signed = true)
    private Integer defaultIconFileDataID;


    @Column(name = "UiOrder")
    @Db2Field(fieldIndex = 3, type = Db2Type.INT, signed = true)
    private Integer uiOrder;


    @Column(name = "DisplayType")
    @Db2Field(fieldIndex = 4, type = Db2Type.BYTE)
    private Byte displayType;

    @Id
    @ColumnDefault("0")
    @Column(name = "VerifiedBuild", nullable = false)
    private Integer verifiedBuild;


}
