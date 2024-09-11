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
@Table(name = "spell_range")
public class SpellRange {
    @Id
    @ColumnDefault("'0'")
    @Column(name = "ID", columnDefinition = "int UNSIGNED not null")
    private Long id;

    @Id
    @ColumnDefault("0")
    @Column(name = "VerifiedBuild", nullable = false)
    private Integer verifiedBuild;

    @Lob
    @Column(name = "DisplayName")
    private String displayName;

    @Lob
    @Column(name = "DisplayNameShort")
    private String displayNameShort;

    @ColumnDefault("'0'")
    @Column(name = "Flags", columnDefinition = "tinyint UNSIGNED not null")
    private Short flags;

    @ColumnDefault("0")
    @Column(name = "RangeMin1", nullable = false)
    private Float rangeMin1;

    @ColumnDefault("0")
    @Column(name = "RangeMin2", nullable = false)
    private Float rangeMin2;

    @ColumnDefault("0")
    @Column(name = "RangeMax1", nullable = false)
    private Float rangeMax1;

    @ColumnDefault("0")
    @Column(name = "RangeMax2", nullable = false)
    private Float rangeMax2;

}