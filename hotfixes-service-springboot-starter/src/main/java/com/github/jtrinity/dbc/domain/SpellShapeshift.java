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
@Table(name = "spell_shapeshift")
@Db2File(name = "SpellShapeshift.db2", layoutHash = 0xA461C24D)
public class SpellShapeshift implements DbcEntity {
    @Id
    @ColumnDefault("'0'")
    @Column(name = "ID", columnDefinition = "int UNSIGNED not null")
    @Db2Field(fieldIndex = 0, type = Db2Type.INT)
    private Integer id;


    @Column(name = "SpellID")
    @Db2Field(fieldIndex = 1, type = Db2Type.INT, signed = true)
    private Integer spellID;


    @Column(name = "ShapeshiftExclude1")
    @Db2Field(fieldIndex = 2, type = Db2Type.INT, signed = true)
    private Integer shapeshiftExclude1;


    @Column(name = "ShapeshiftExclude2")
    @Db2Field(fieldIndex = 3, type = Db2Type.INT, signed = true)
    private Integer shapeshiftExclude2;


    @Column(name = "ShapeshiftMask1")
    @Db2Field(fieldIndex = 4, type = Db2Type.INT, signed = true)
    private Integer shapeshiftMask1;


    @Column(name = "ShapeshiftMask2")
    @Db2Field(fieldIndex = 5, type = Db2Type.INT, signed = true)
    private Integer shapeshiftMask2;


    @Column(name = "StanceBarOrder")
    @Db2Field(fieldIndex = 6, type = Db2Type.BYTE, signed = true)
    private Byte stanceBarOrder;

    @Id
    @ColumnDefault("0")
    @Column(name = "VerifiedBuild", nullable = false)
    private Integer verifiedBuild;


}
