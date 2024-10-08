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
@Table(name = "quest_package_item")
@Db2DataBind(name = "QuestPackageItem.db2", layoutHash = 0xCF9401CF, fields = {
        @Db2Field(name = "itemID", type = Db2Type.INT, signed = true),
        @Db2Field(name = "packageID", type = Db2Type.SHORT),
        @Db2Field(name = "displayType", type = Db2Type.BYTE),
        @Db2Field(name = "itemQuantity", type = Db2Type.INT)
})
public class QuestPackageItem implements DbcEntity {
    @Id
    @ColumnDefault("'0'")
    @Column(name = "ID", columnDefinition = "int UNSIGNED not null")
    private Integer id;

    @Column(name = "ItemID")
    private Integer itemID;

    @Column(name = "PackageID")
    private Short packageID;

    @Column(name = "DisplayType")
    private Byte displayType;

    @Column(name = "ItemQuantity")
    private Integer itemQuantity;

    @Id
    @ColumnDefault("0")
    @Column(name = "VerifiedBuild", nullable = false)
    private Integer verifiedBuild;

}
