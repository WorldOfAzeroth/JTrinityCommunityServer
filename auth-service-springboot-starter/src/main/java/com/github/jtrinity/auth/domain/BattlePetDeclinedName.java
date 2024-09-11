package com.github.jtrinity.auth.domain;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.hibernate.annotations.ColumnDefault;

@Getter
@Setter
@ToString(onlyExplicitlyIncluded = true)
@Entity
@Table(name = "battle_pet_declinedname")
public class BattlePetDeclinedName {
    @Id
    @Column(name = "guid", nullable = false)
    private Long id;

    @MapsId
    @OneToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "guid", nullable = false)
    private BattlePet battlePets;

    @ColumnDefault("''")
    @Column(name = "genitive", nullable = false, length = 12)
    private String genitive;

    @ColumnDefault("''")
    @Column(name = "dative", nullable = false, length = 12)
    private String dative;

    @ColumnDefault("''")
    @Column(name = "accusative", nullable = false, length = 12)
    private String accusative;

    @ColumnDefault("''")
    @Column(name = "instrumental", nullable = false, length = 12)
    private String instrumental;

    @ColumnDefault("''")
    @Column(name = "prepositional", nullable = false, length = 12)
    private String prepositional;

}