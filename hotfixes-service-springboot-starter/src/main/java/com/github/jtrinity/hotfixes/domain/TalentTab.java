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
@Table(name = "talent_tab")
public class TalentTab {
    @Id
    @ColumnDefault("'0'")
    @Column(name = "ID", columnDefinition = "int UNSIGNED not null")
    private Long id;

    @Id
    @ColumnDefault("0")
    @Column(name = "VerifiedBuild", nullable = false)
    private Integer verifiedBuild;

    @Lob
    @Column(name = "Name")
    private String name;

    @Lob
    @Column(name = "BackgroundFile")
    private String backgroundFile;

    @Lob
    @Column(name = "Description")
    private String description;

    @ColumnDefault("0")
    @Column(name = "OrderIndex", nullable = false)
    private Integer orderIndex;

    @ColumnDefault("0")
    @Column(name = "RaceMask", nullable = false)
    private Integer raceMask;

    @ColumnDefault("0")
    @Column(name = "ClassMask", nullable = false)
    private Integer classMask;

    @ColumnDefault("0")
    @Column(name = "CategoryEnumID", nullable = false)
    private Integer categoryEnumID;

    @ColumnDefault("0")
    @Column(name = "SpellIconID", nullable = false)
    private Integer spellIconID;

    @ColumnDefault("0")
    @Column(name = "RoleMask", nullable = false)
    private Integer roleMask;

    @ColumnDefault("0")
    @Column(name = "MasterySpellID1", nullable = false)
    private Integer masterySpellID1;

    @ColumnDefault("0")
    @Column(name = "MasterySpellID2", nullable = false)
    private Integer masterySpellID2;

}