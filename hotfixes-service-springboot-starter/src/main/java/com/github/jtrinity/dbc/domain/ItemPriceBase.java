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
@Table(name = "item_price_base")
@Db2DataBind(name = "ItemPriceBase.db2", layoutHash = 0x4BD234D7, fields = {
        @Db2Field(name = "armor", type = Db2Type.FLOAT),
        @Db2Field(name = "weapon", type = Db2Type.FLOAT),
        @Db2Field(name = "itemLevel", type = Db2Type.SHORT)
})
public class ItemPriceBase implements DbcEntity {
    @Id
    @ColumnDefault("'0'")
    @Column(name = "ID", columnDefinition = "int UNSIGNED not null")
    private Integer id;

    @Column(name = "Armor")
    private Float armor;

    @Column(name = "Weapon")
    private Float weapon;

    @Column(name = "ItemLevel")
    private Short itemLevel;

    @Id
    @ColumnDefault("0")
    @Column(name = "VerifiedBuild", nullable = false)
    private Integer verifiedBuild;

}
