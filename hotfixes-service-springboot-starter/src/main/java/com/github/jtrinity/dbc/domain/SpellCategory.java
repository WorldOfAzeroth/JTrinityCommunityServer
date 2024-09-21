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
@Table(name = "spell_category")
@Db2File(name = "SpellCategory.db2", layoutHash = 0xEA60E384)
public class SpellCategory implements DbcEntity {
    @Id
    @ColumnDefault("'0'")
    @Column(name = "ID", columnDefinition = "int UNSIGNED not null")
    @Db2Field(fieldIndex = 0, type = Db2Type.INT)
    private Integer id;


    @Column(name = "Name")
    @Db2Field(fieldIndex = 1, type = Db2Type.STRING)
    private LocalizedString name;


    @Column(name = "ChargeRecoveryTime")
    @Db2Field(fieldIndex = 2, type = Db2Type.INT, signed = true)
    private Integer chargeRecoveryTime;


    @Column(name = "Flags")
    @Db2Field(fieldIndex = 3, type = Db2Type.BYTE, signed = true)
    private Byte flags;


    @Column(name = "UsesPerWeek")
    @Db2Field(fieldIndex = 4, type = Db2Type.BYTE)
    private Byte usesPerWeek;


    @Column(name = "MaxCharges")
    @Db2Field(fieldIndex = 5, type = Db2Type.BYTE, signed = true)
    private Byte maxCharges;


    @Column(name = "TypeMask")
    @Db2Field(fieldIndex = 6, type = Db2Type.INT, signed = true)
    private Integer typeMask;

    @Id
    @ColumnDefault("0")
    @Column(name = "VerifiedBuild", nullable = false)
    private Integer verifiedBuild;


}
