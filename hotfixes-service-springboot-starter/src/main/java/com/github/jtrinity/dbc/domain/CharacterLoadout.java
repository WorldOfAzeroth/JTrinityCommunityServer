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
@ToString(onlyExplicitlyIncluded = true)
@IdClass(DB2Id.class)
@Entity
@Table(name = "character_loadout")
@Db2DataBind(name = "CharacterLoadout.db2", layoutHash = 0xCA30C801, indexField = 1, fields = {
        @Db2Field(name = "id", type = Db2Type.INT, signed = true),
        @Db2Field(name = "raceMask", type = Db2Type.LONG),
        @Db2Field(name = "chrClassID", type = Db2Type.INT, signed = true),
        @Db2Field(name = "purpose", type = Db2Type.INT, signed = true),
})
public class CharacterLoadout implements DbcEntity {

    @Id
    @ColumnDefault("'0'")
    @Column(name = "ID", columnDefinition = "int UNSIGNED not null")
    private Integer id;

    @Id
    @ColumnDefault("0")
    @Column(name = "VerifiedBuild", nullable = false)
    private Integer verifiedBuild;

    @ColumnDefault("0")
    @Column(name = "RaceMask", nullable = false)
    private Long raceMask;

    @ColumnDefault("0")
    @Column(name = "ChrClassID", nullable = false)
    private Byte chrClassID;

    @ColumnDefault("0")
    @Column(name = "Purpose", nullable = false)
    private Integer purpose;

    @ColumnDefault("0")
    @Column(name = "ItemContext", nullable = false)
    private Byte itemContext;

}