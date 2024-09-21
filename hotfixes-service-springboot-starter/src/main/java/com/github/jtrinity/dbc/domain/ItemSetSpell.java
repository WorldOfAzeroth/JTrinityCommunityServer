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
@Table(name = "item_set_spell")
@Db2File(name = "ItemSetSpell.db2", layoutHash = 0xF65D0AF8, parentIndexField = 3)
public class ItemSetSpell implements DbcEntity {
    @Id
    @ColumnDefault("'0'")
    @Column(name = "ID", columnDefinition = "int UNSIGNED not null")
    @Db2Field(fieldIndex = 0, type = Db2Type.INT)
    private Integer id;


    @Column(name = "SpellID")
    @Db2Field(fieldIndex = 1, type = Db2Type.INT)
    private Integer spellID;


    @Column(name = "ChrSpecID")
    @Db2Field(fieldIndex = 2, type = Db2Type.SHORT)
    private Short chrSpecID;


    @Column(name = "Threshold")
    @Db2Field(fieldIndex = 3, type = Db2Type.BYTE)
    private Byte threshold;


    @Column(name = "ItemSetID")
    @Db2Field(fieldIndex = 4, type = Db2Type.SHORT)
    private Short itemSetID;

    @Id
    @ColumnDefault("0")
    @Column(name = "VerifiedBuild", nullable = false)
    private Integer verifiedBuild;


}
