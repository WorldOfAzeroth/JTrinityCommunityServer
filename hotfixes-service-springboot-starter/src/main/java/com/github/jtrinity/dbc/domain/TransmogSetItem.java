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
@Table(name = "transmog_set_item")
@Db2File(name = "TransmogSetItem.db2", layoutHash = 0x0E96B3A2, indexField = 0, parentIndexField = 1)
public class TransmogSetItem implements DbcEntity {
    @Id
    @ColumnDefault("'0'")
    @Column(name = "ID", columnDefinition = "int UNSIGNED not null")
    @Db2Field(fieldIndex = 0, type = Db2Type.INT)
    private Integer id;


    @Column(name = "TransmogSetID")
    @Db2Field(fieldIndex = 1, type = Db2Type.INT)
    private Integer transmogSetID;


    @Column(name = "ItemModifiedAppearanceID")
    @Db2Field(fieldIndex = 2, type = Db2Type.INT)
    private Integer itemModifiedAppearanceID;


    @Column(name = "Flags")
    @Db2Field(fieldIndex = 3, type = Db2Type.INT, signed = true)
    private Integer flags;

    @Id
    @ColumnDefault("0")
    @Column(name = "VerifiedBuild", nullable = false)
    private Integer verifiedBuild;


}
