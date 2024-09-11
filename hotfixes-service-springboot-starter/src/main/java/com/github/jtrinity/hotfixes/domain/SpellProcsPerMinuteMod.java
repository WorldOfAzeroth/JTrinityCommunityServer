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
@Table(name = "spell_procs_per_minute_mod")
public class SpellProcsPerMinuteMod {
    @Id
    @ColumnDefault("'0'")
    @Column(name = "ID", columnDefinition = "int UNSIGNED not null")
    private Long id;

    @Id
    @ColumnDefault("0")
    @Column(name = "VerifiedBuild", nullable = false)
    private Integer verifiedBuild;

    @ColumnDefault("'0'")
    @Column(name = "Type", columnDefinition = "tinyint UNSIGNED not null")
    private Short type;

    @ColumnDefault("0")
    @Column(name = "Param", nullable = false)
    private Short param;

    @ColumnDefault("0")
    @Column(name = "Coeff", nullable = false)
    private Float coeff;

    @ColumnDefault("'0'")
    @Column(name = "SpellProcsPerMinuteID", columnDefinition = "int UNSIGNED not null")
    private Long spellProcsPerMinuteID;

}