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
@Table(name = "item_random_properties")
@Db2File(name = "ItemRandomProperties.db2", layoutHash = 0xB67375F8)
public class ItemRandomProperty implements DbcEntity {
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

    @Id
    @ColumnDefault("0")
    @Column(name = "VerifiedBuild", nullable = false)
    private Integer verifiedBuild;


}
