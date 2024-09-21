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
@Table(name = "item_random_suffix")
@Db2File(name = "ItemRandomSuffix.db2", layoutHash = 0x95CAB825)
public class ItemRandomSuffix implements DbcEntity {
    @Id
    @ColumnDefault("'0'")
    @Column(name = "ID", columnDefinition = "int UNSIGNED not null")
    @Db2Field(fieldIndex = 0, type = Db2Type.INT)
    private Integer id;


    @Column(name = "Name")
    @Db2Field(fieldIndex = 1, type = Db2Type.STRING)
    private LocalizedString name;


    @Column(name = "Enchantment1")
    @Db2Field(fieldIndex = 2, type = Db2Type.SHORT)
    private Short enchantment1;


    @Column(name = "Enchantment2")
    @Db2Field(fieldIndex = 3, type = Db2Type.SHORT)
    private Short enchantment2;


    @Column(name = "Enchantment3")
    @Db2Field(fieldIndex = 4, type = Db2Type.SHORT)
    private Short enchantment3;


    @Column(name = "Enchantment4")
    @Db2Field(fieldIndex = 5, type = Db2Type.SHORT)
    private Short enchantment4;


    @Column(name = "Enchantment5")
    @Db2Field(fieldIndex = 6, type = Db2Type.SHORT)
    private Short enchantment5;


    @Column(name = "AllocationPct1")
    @Db2Field(fieldIndex = 7, type = Db2Type.SHORT)
    private Short allocationPct1;


    @Column(name = "AllocationPct2")
    @Db2Field(fieldIndex = 8, type = Db2Type.SHORT)
    private Short allocationPct2;


    @Column(name = "AllocationPct3")
    @Db2Field(fieldIndex = 9, type = Db2Type.SHORT)
    private Short allocationPct3;


    @Column(name = "AllocationPct4")
    @Db2Field(fieldIndex = 10, type = Db2Type.SHORT)
    private Short allocationPct4;


    @Column(name = "AllocationPct5")
    @Db2Field(fieldIndex = 11, type = Db2Type.SHORT)
    private Short allocationPct5;

    @Id
    @ColumnDefault("0")
    @Column(name = "VerifiedBuild", nullable = false)
    private Integer verifiedBuild;


}
