package com.github.jtrinity.hotfixes.domain;

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
@Table(name = "glyph_properties")
public class GlyphProperty {
    @Id
    @ColumnDefault("'0'")
    @Column(name = "ID", columnDefinition = "int UNSIGNED not null")
    private Integer id;

    @Id
    @ColumnDefault("0")
    @Column(name = "VerifiedBuild", nullable = false)
    private Integer verifiedBuild;

    @ColumnDefault("'0'")
    @Column(name = "SpellID", columnDefinition = "int UNSIGNED not null")
    private Long spellID;

    @ColumnDefault("'0'")
    @Column(name = "GlyphType", columnDefinition = "tinyint UNSIGNED not null")
    private Short glyphType;

    @ColumnDefault("'0'")
    @Column(name = "GlyphExclusiveCategoryID", columnDefinition = "tinyint UNSIGNED not null")
    private Short glyphExclusiveCategoryID;

    @ColumnDefault("0")
    @Column(name = "SpellIconFileDataID", nullable = false)
    private Integer spellIconFileDataID;

    @ColumnDefault("'0'")
    @Column(name = "GlyphSlotFlags", columnDefinition = "int UNSIGNED not null")
    private Long glyphSlotFlags;

}