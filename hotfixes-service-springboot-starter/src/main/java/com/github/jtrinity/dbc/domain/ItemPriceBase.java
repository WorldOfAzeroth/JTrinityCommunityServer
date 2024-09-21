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
@Table(name = "item_price_base")
@Db2File(name = "ItemPriceBase.db2", layoutHash = 0x4BD234D7)
public class ItemPriceBase implements DbcEntity {
    @Id
    @ColumnDefault("'0'")
    @Column(name = "ID", columnDefinition = "int UNSIGNED not null")
    @Db2Field(fieldIndex = 0, type = Db2Type.INT)
    private Integer id;


    @Column(name = "Armor")
    @Db2Field(fieldIndex = 1, type = Db2Type.FLOAT)
    private Float armor;


    @Column(name = "Weapon")
    @Db2Field(fieldIndex = 2, type = Db2Type.FLOAT)
    private Float weapon;


    @Column(name = "ItemLevel")
    @Db2Field(fieldIndex = 3, type = Db2Type.SHORT)
    private Short itemLevel;

    @Id
    @ColumnDefault("0")
    @Column(name = "VerifiedBuild", nullable = false)
    private Integer verifiedBuild;


}
