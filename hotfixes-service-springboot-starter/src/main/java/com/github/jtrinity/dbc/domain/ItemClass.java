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
@Table(name = "item_class")
@Db2DataBind(name = "ItemClass.db2", layoutHash = 0xA1E4663C, fields = {
        @Db2Field(name = "className", type = Db2Type.STRING),
        @Db2Field(name = "priceModifier", type = Db2Type.FLOAT),
        @Db2Field(name = "classID", type = Db2Type.BYTE, signed = true),
        @Db2Field(name = "flags", type = Db2Type.BYTE)
})
public class ItemClass implements DbcEntity {
    @Id
    @ColumnDefault("'0'")
    @Column(name = "ID", columnDefinition = "int UNSIGNED not null")
    private Integer id;

    @Column(name = "ClassName")
    private LocalizedString className;

    @Column(name = "PriceModifier")
    private Float priceModifier;

    @Column(name = "ClassID")
    private Byte classID;

    @Column(name = "Flags")
    private Byte flags;

    @Id
    @ColumnDefault("0")
    @Column(name = "VerifiedBuild", nullable = false)
    private Integer verifiedBuild;

}
