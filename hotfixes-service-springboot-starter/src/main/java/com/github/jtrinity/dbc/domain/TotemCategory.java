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
@Table(name = "totem_category")
@Db2DataBind(name = "TotemCategory.db2", layoutHash = 0x20B9177A, fields = {
        @Db2Field(name = "name", type = Db2Type.STRING),
        @Db2Field(name = "totemCategoryMask", type = Db2Type.INT, signed = true),
        @Db2Field(name = "totemCategoryType", type = Db2Type.BYTE)
})
public class TotemCategory implements DbcEntity {
    @Id
    @ColumnDefault("'0'")
    @Column(name = "ID", columnDefinition = "int UNSIGNED not null")
    private Integer id;

    @Column(name = "Name")
    private LocalizedString name;

    @Column(name = "TotemCategoryMask")
    private Integer totemCategoryMask;

    @Column(name = "TotemCategoryType")
    private Byte totemCategoryType;

    @Id
    @ColumnDefault("0")
    @Column(name = "VerifiedBuild", nullable = false)
    private Integer verifiedBuild;

}
