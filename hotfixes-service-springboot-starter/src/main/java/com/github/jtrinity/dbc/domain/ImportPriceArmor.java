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
@Table(name = "import_price_armor")
@Db2File(name = "ImportPriceArmor.db2", layoutHash = 0x1F7A850F)
public class ImportPriceArmor implements DbcEntity {
    @Id
    @ColumnDefault("'0'")
    @Column(name = "ID", columnDefinition = "int UNSIGNED not null")
    @Db2Field(fieldIndex = 0, type = Db2Type.INT)
    private Integer id;


    @Column(name = "ClothModifier")
    @Db2Field(fieldIndex = 1, type = Db2Type.FLOAT)
    private Float clothModifier;


    @Column(name = "LeatherModifier")
    @Db2Field(fieldIndex = 2, type = Db2Type.FLOAT)
    private Float leatherModifier;


    @Column(name = "ChainModifier")
    @Db2Field(fieldIndex = 3, type = Db2Type.FLOAT)
    private Float chainModifier;


    @Column(name = "PlateModifier")
    @Db2Field(fieldIndex = 4, type = Db2Type.FLOAT)
    private Float plateModifier;

    @Id
    @ColumnDefault("0")
    @Column(name = "VerifiedBuild", nullable = false)
    private Integer verifiedBuild;


}
