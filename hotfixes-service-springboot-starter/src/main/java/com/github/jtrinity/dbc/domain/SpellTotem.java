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
@Table(name = "spell_totems")
@Db2File(name = "SpellTotems.db2", layoutHash = 0xEC0C4866)
public class SpellTotem implements DbcEntity {
    @Id
    @ColumnDefault("'0'")
    @Column(name = "ID", columnDefinition = "int UNSIGNED not null")
    @Db2Field(fieldIndex = 0, type = Db2Type.INT)
    private Integer id;


    @Column(name = "SpellID")
    @Db2Field(fieldIndex = 1, type = Db2Type.INT, signed = true)
    private Integer spellID;


    @Column(name = "Totem1")
    @Db2Field(fieldIndex = 2, type = Db2Type.INT, signed = true)
    private Integer totem1;


    @Column(name = "Totem2")
    @Db2Field(fieldIndex = 3, type = Db2Type.INT, signed = true)
    private Integer totem2;


    @Column(name = "RequiredTotemCategoryID1")
    @Db2Field(fieldIndex = 4, type = Db2Type.SHORT)
    private Short requiredTotemCategoryID1;


    @Column(name = "RequiredTotemCategoryID2")
    @Db2Field(fieldIndex = 5, type = Db2Type.SHORT)
    private Short requiredTotemCategoryID2;

    @Id
    @ColumnDefault("0")
    @Column(name = "VerifiedBuild", nullable = false)
    private Integer verifiedBuild;


}
