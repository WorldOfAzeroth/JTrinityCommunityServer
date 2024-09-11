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
@Table(name = "trait_definition")
public class TraitDefinition {
    @Id
    @ColumnDefault("'0'")
    @Column(name = "ID", columnDefinition = "int UNSIGNED not null")
    private Long id;

    @Id
    @ColumnDefault("0")
    @Column(name = "VerifiedBuild", nullable = false)
    private Integer verifiedBuild;

    @Lob
    @Column(name = "OverrideName")
    private String overrideName;

    @Lob
    @Column(name = "OverrideSubtext")
    private String overrideSubtext;

    @Lob
    @Column(name = "OverrideDescription")
    private String overrideDescription;

    @ColumnDefault("0")
    @Column(name = "SpellID", nullable = false)
    private Integer spellID;

    @ColumnDefault("0")
    @Column(name = "OverrideIcon", nullable = false)
    private Integer overrideIcon;

    @ColumnDefault("0")
    @Column(name = "OverridesSpellID", nullable = false)
    private Integer overridesSpellID;

    @ColumnDefault("0")
    @Column(name = "VisibleSpellID", nullable = false)
    private Integer visibleSpellID;

}