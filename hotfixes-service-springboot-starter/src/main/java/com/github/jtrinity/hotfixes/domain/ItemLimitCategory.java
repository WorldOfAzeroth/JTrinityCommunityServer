package com.github.jtrinity.hotfixes.domain;

import com.github.jtrinity.hotfixes.db2.Db2Field;
import com.github.jtrinity.hotfixes.db2.Db2File;
import com.github.jtrinity.hotfixes.db2.Db2Type;

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
@Table(name = "item_limit_category")
@Db2File(name = "ItemLimitCategory.db2", fileDataId = 1237440, layoutHash = 0x403BC7B2)
public class ItemLimitCategory {
    @Id
    @ColumnDefault("'0'")
    @Column(name = "ID", columnDefinition = "int UNSIGNED not null")
    @Db2Field(fieldIndex = 0, type = Db2Type.INT)
    private Integer id;

    @Id
    @ColumnDefault("0")
    @Column(name = "VerifiedBuild", nullable = false)
    private Integer verifiedBuild;

    @Lob
    @Column(name = "Name")
    @Db2Field(fieldIndex = 1, type = Db2Type.STRING)
    private String name;

    @ColumnDefault("'0'")
    @Column(name = "Quantity", columnDefinition = "tinyint UNSIGNED not null")
    @Db2Field(fieldIndex = 2, type = Db2Type.BYTE)
    private Short quantity;

    @ColumnDefault("'0'")
    @Column(name = "Flags", columnDefinition = "tinyint UNSIGNED not null")
    @Db2Field(fieldIndex = 3, type = Db2Type.BYTE)
    private Short flags;

}