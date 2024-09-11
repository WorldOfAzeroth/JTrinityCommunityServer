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
@Table(name = "character_loadout")
public class CharacterLoadout {
    @Id
    @ColumnDefault("'0'")
    @Column(name = "ID", columnDefinition = "int UNSIGNED not null")
    private Integer id;

    @Id
    @ColumnDefault("0")
    @Column(name = "VerifiedBuild", nullable = false)
    private Integer verifiedBuild;

    @ColumnDefault("0")
    @Column(name = "RaceMask", nullable = false)
    private Long raceMask;

    @ColumnDefault("0")
    @Column(name = "ChrClassID", nullable = false)
    private Byte chrClassID;

    @ColumnDefault("0")
    @Column(name = "Purpose", nullable = false)
    private Integer purpose;

    @ColumnDefault("0")
    @Column(name = "ItemContext", nullable = false)
    private Byte itemContext;

}