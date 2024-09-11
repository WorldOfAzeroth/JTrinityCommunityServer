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
@Table(name = "spell_shapeshift")
public class SpellShapeshift {
    @Id
    @ColumnDefault("'0'")
    @Column(name = "ID", columnDefinition = "int UNSIGNED not null")
    private Long id;

    @Id
    @ColumnDefault("0")
    @Column(name = "VerifiedBuild", nullable = false)
    private Integer verifiedBuild;

    @ColumnDefault("0")
    @Column(name = "SpellID", nullable = false)
    private Integer spellID;

    @ColumnDefault("0")
    @Column(name = "StanceBarOrder", nullable = false)
    private Byte stanceBarOrder;

    @ColumnDefault("0")
    @Column(name = "ShapeshiftExclude1", nullable = false)
    private Integer shapeshiftExclude1;

    @ColumnDefault("0")
    @Column(name = "ShapeshiftExclude2", nullable = false)
    private Integer shapeshiftExclude2;

    @ColumnDefault("0")
    @Column(name = "ShapeshiftMask1", nullable = false)
    private Integer shapeshiftMask1;

    @ColumnDefault("0")
    @Column(name = "ShapeshiftMask2", nullable = false)
    private Integer shapeshiftMask2;

}