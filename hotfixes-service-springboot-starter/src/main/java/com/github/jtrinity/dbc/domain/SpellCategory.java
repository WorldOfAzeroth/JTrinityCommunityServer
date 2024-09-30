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
@Table(name = "spell_category")
@Db2DataBind(name = "SpellCategory.db2", layoutHash = 0xEA60E384, fields = {
        @Db2Field(name = "id", type = Db2Type.INT),
        @Db2Field(name = "name", type = Db2Type.STRING),
        @Db2Field(name = "chargeRecoveryTime", type = Db2Type.INT, signed = true),
        @Db2Field(name = "flags", type = Db2Type.BYTE, signed = true),
        @Db2Field(name = "usesPerWeek", type = Db2Type.BYTE),
        @Db2Field(name = "maxCharges", type = Db2Type.BYTE, signed = true),
        @Db2Field(name = "typeMask", type = Db2Type.INT, signed = true)
})
public class SpellCategory implements DbcEntity {
    @Id
    @ColumnDefault("'0'")
    @Column(name = "ID", columnDefinition = "int UNSIGNED not null")
    private Integer id;

    @Column(name = "Name")
    private LocalizedString name;

    @Column(name = "ChargeRecoveryTime")
    private Integer chargeRecoveryTime;

    @Column(name = "Flags")
    private Byte flags;

    @Column(name = "UsesPerWeek")
    private Byte usesPerWeek;

    @Column(name = "MaxCharges")
    private Byte maxCharges;

    @Column(name = "TypeMask")
    private Integer typeMask;

    @Id
    @ColumnDefault("0")
    @Column(name = "VerifiedBuild", nullable = false)
    private Integer verifiedBuild;

}
