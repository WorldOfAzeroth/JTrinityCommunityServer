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
@ToString(onlyExplicitlyIncluded = true)
@IdClass(DB2Id.class)
@Entity
@Table(name = "item_name_description")
@Db2DataBind(name = "ItemNameDescription.db2", layoutHash = 0xB60E60BD, fields = {
        @Db2Field(name = "id", type = Db2Type.INT, signed = true),
        @Db2Field(name = "description", type = Db2Type.STRING),
        @Db2Field(name = "color", type = Db2Type.INT)
})
public class ItemNameDescription implements DbcEntity {
    @Id
    @ColumnDefault("'0'")
    @Column(name = "ID", columnDefinition = "int UNSIGNED not null")
    private Integer id;

    @Id
    @ColumnDefault("0")
    @Column(name = "VerifiedBuild", nullable = false)
    private Integer verifiedBuild;

    @Lob
    @Column(name = "Description")
    private LocalizedString description;

    @ColumnDefault("0")
    @Column(name = "Color", nullable = false)
    private Integer color;

}