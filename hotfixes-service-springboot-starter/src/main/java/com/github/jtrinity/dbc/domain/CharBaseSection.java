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
@Table(name = "char_base_section")
@Db2DataBind(name = "CharBaseSection.db2", layoutHash = 0x4F08B5F3, fields = {
        @Db2Field(name = "id", type = Db2Type.INT),
        @Db2Field(name = "variationEnum", type = Db2Type.BYTE),
        @Db2Field(name = "resolutionVariationEnum", type = Db2Type.BYTE),
        @Db2Field(name = "layoutResType", type = Db2Type.BYTE)
})
public class CharBaseSection implements DbcEntity {
    @Id
    @ColumnDefault("'0'")
    @Column(name = "ID", columnDefinition = "int UNSIGNED not null")
    private Integer id;

    @Column(name = "VariationEnum")
    private Byte variationEnum;

    @Column(name = "ResolutionVariationEnum")
    private Byte resolutionVariationEnum;

    @Column(name = "LayoutResType")
    private Byte layoutResType;

    @Id
    @ColumnDefault("0")
    @Column(name = "VerifiedBuild", nullable = false)
    private Integer verifiedBuild;

}
