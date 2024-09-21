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
@Table(name = "glyph_properties")
@Db2File(name = "GlyphProperties.db2", layoutHash = 0xD0046829)
public class GlyphProperty implements DbcEntity {
    @Id
    @ColumnDefault("'0'")
    @Column(name = "ID", columnDefinition = "int UNSIGNED not null")
    @Db2Field(fieldIndex = 0, type = Db2Type.INT)
    private Integer id;


    @Column(name = "SpellID")
    @Db2Field(fieldIndex = 1, type = Db2Type.INT)
    private Integer spellID;


    @Column(name = "SpellIconID")
    @Db2Field(fieldIndex = 2, type = Db2Type.SHORT)
    private Short spellIconID;


    @Column(name = "GlyphType")
    @Db2Field(fieldIndex = 3, type = Db2Type.BYTE)
    private Byte glyphType;


    @Column(name = "GlyphExclusiveCategoryID")
    @Db2Field(fieldIndex = 4, type = Db2Type.BYTE)
    private Byte glyphExclusiveCategoryID;

    @Id
    @ColumnDefault("0")
    @Column(name = "VerifiedBuild", nullable = false)
    private Integer verifiedBuild;


}
