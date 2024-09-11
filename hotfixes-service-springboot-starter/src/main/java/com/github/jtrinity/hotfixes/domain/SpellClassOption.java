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
@Table(name = "spell_class_options")
public class SpellClassOption {
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

    @ColumnDefault("'0'")
    @Column(name = "ModalNextSpell", columnDefinition = "int UNSIGNED not null")
    private Long modalNextSpell;

    @ColumnDefault("'0'")
    @Column(name = "SpellClassSet", columnDefinition = "tinyint UNSIGNED not null")
    private Short spellClassSet;

    @ColumnDefault("0")
    @Column(name = "SpellClassMask1", nullable = false)
    private Integer spellClassMask1;

    @ColumnDefault("0")
    @Column(name = "SpellClassMask2", nullable = false)
    private Integer spellClassMask2;

    @ColumnDefault("0")
    @Column(name = "SpellClassMask3", nullable = false)
    private Integer spellClassMask3;

    @ColumnDefault("0")
    @Column(name = "SpellClassMask4", nullable = false)
    private Integer spellClassMask4;

}