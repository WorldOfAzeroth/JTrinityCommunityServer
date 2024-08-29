package com.pandaria.auth.domain;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "battle_pet_declinedname")
public class BattlePetDeclinedname {
    @Id
    @Column(name = "guid", nullable = false)
    private Long id;

    @MapsId
    @OneToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "guid", nullable = false)
    private BattlePet battlePets;

    @Column(name = "genitive", nullable = false, length = 12)
    private String genitive;

    @Column(name = "dative", nullable = false, length = 12)
    private String dative;

    @Column(name = "accusative", nullable = false, length = 12)
    private String accusative;

    @Column(name = "instrumental", nullable = false, length = 12)
    private String instrumental;

    @Column(name = "prepositional", nullable = false, length = 12)
    private String prepositional;

}