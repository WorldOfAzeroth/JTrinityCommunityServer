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
@Table(name = "toy")
@Db2DataBind(name = "Toy.db2", layoutHash = 0x5409C5EA, indexField = 4, fields = {
        @Db2Field(name = "sourceText", type = Db2Type.STRING),
        @Db2Field(name = "itemID", type = Db2Type.INT, signed = true),
        @Db2Field(name = "flags", type = Db2Type.BYTE),
        @Db2Field(name = "sourceTypeEnum", type = Db2Type.BYTE, signed = true),
        @Db2Field(name = "id", type = Db2Type.INT)
})
public class Toy implements DbcEntity {
    @Column(name = "SourceText")
    private LocalizedString sourceText;

    @Column(name = "ItemID")
    private Integer itemID;

    @Column(name = "Flags")
    private Byte flags;

    @Column(name = "SourceTypeEnum")
    private Byte sourceTypeEnum;

    @Id
    @ColumnDefault("'0'")
    @Column(name = "ID", columnDefinition = "int UNSIGNED not null")
    private Integer id;

    @Id
    @ColumnDefault("0")
    @Column(name = "VerifiedBuild", nullable = false)
    private Integer verifiedBuild;

}
