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
@Table(name = "spell_equipped_items")
@Db2File(name = "SpellEquippedItems.db2", fileDataId = 1140011, layoutHash = 0x9E98F8F8)
public class SpellEquippedItem {
    @Id
    @ColumnDefault("'0'")
    @Column(name = "ID", columnDefinition = "int UNSIGNED not null")
    @Db2Field(fieldIndex = 0, type = Db2Type.INT)
    private Long id;

    @Id
    @ColumnDefault("0")
    @Column(name = "VerifiedBuild", nullable = false)
    private Integer verifiedBuild;

    @ColumnDefault("0")
    @Column(name = "SpellID", nullable = false)
    @Db2Field(fieldIndex = 1, type = Db2Type.INT, signed = true)
    private Integer spellID;

    @ColumnDefault("0")
    @Column(name = "EquippedItemClass", nullable = false)
    @Db2Field(fieldIndex = 2, type = Db2Type.BYTE, signed = true)
    private Byte equippedItemClass;

    @ColumnDefault("0")
    @Column(name = "EquippedItemInvTypes", nullable = false)
    @Db2Field(fieldIndex = 3, type = Db2Type.INT, signed = true)
    private Integer equippedItemInvTypes;

    @ColumnDefault("0")
    @Column(name = "EquippedItemSubclass", nullable = false)
    @Db2Field(fieldIndex = 4, type = Db2Type.INT, signed = true)
    private Integer equippedItemSubclass;

}