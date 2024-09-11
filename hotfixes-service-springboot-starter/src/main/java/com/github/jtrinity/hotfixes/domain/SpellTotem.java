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
@Table(name = "spell_totems")
public class SpellTotem {
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
    @Column(name = "RequiredTotemCategoryID1", columnDefinition = "smallint UNSIGNED not null")
    private Integer requiredTotemCategoryID1;

    @ColumnDefault("'0'")
    @Column(name = "RequiredTotemCategoryID2", columnDefinition = "smallint UNSIGNED not null")
    private Integer requiredTotemCategoryID2;

    @ColumnDefault("0")
    @Column(name = "Totem1", nullable = false)
    private Integer totem1;

    @ColumnDefault("0")
    @Column(name = "Totem2", nullable = false)
    private Integer totem2;

}