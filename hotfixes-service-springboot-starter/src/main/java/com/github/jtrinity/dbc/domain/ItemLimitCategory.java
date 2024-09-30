package com.github.jtrinity.dbc.domain;

import com.github.jtrinity.cache.DbcEntity;
import com.github.jtrinity.common.LocalizedString;
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
@Table(name = "item_limit_category")
@Db2DataBind(name = "ItemLimitCategory.db2", layoutHash = 0xB6BB188D, fields = {
        @Db2Field(name = "id", type = Db2Type.INT),
        @Db2Field(name = "name", type = Db2Type.STRING),
        @Db2Field(name = "quantity", type = Db2Type.BYTE),
        @Db2Field(name = "flags", type = Db2Type.BYTE)
})
public class ItemLimitCategory implements DbcEntity {
    @Id
    @ColumnDefault("'0'")
    @Column(name = "ID", columnDefinition = "int UNSIGNED not null")
    private Integer id;

    @Column(name = "Name")
    private LocalizedString name;

    @Column(name = "Quantity")
    private Byte quantity;

    @Column(name = "Flags")
    private Byte flags;

    @Id
    @ColumnDefault("0")
    @Column(name = "VerifiedBuild", nullable = false)
    private Integer verifiedBuild;

}
