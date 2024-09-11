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
@Table(name = "glyph_required_spec")
public class GlyphRequiredSpec {
    @Id
    @ColumnDefault("'0'")
    @Column(name = "ID", columnDefinition = "int UNSIGNED not null")
    private Integer id;

    @Id
    @ColumnDefault("0")
    @Column(name = "VerifiedBuild", nullable = false)
    private Integer verifiedBuild;

    @ColumnDefault("'0'")
    @Column(name = "ChrSpecializationID", columnDefinition = "smallint UNSIGNED not null")
    private Integer chrSpecializationID;

    @ColumnDefault("'0'")
    @Column(name = "GlyphPropertiesID", columnDefinition = "int UNSIGNED not null")
    private Long glyphPropertiesID;

}