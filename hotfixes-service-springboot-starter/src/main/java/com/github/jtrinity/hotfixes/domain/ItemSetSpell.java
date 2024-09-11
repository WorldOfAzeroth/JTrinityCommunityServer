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
@Table(name = "item_set_spell")
public class ItemSetSpell {
    @Id
    @ColumnDefault("'0'")
    @Column(name = "ID", columnDefinition = "int UNSIGNED not null")
    private Integer id;

    @Id
    @ColumnDefault("0")
    @Column(name = "VerifiedBuild", nullable = false)
    private Integer verifiedBuild;

    @ColumnDefault("'0'")
    @Column(name = "ChrSpecID", columnDefinition = "smallint UNSIGNED not null")
    private Integer chrSpecID;

    @ColumnDefault("'0'")
    @Column(name = "SpellID", columnDefinition = "int UNSIGNED not null")
    private Long spellID;

    @ColumnDefault("'0'")
    @Column(name = "Threshold", columnDefinition = "tinyint UNSIGNED not null")
    private Short threshold;

    @ColumnDefault("'0'")
    @Column(name = "ItemSetID", columnDefinition = "int UNSIGNED not null")
    private Long itemSetID;

}