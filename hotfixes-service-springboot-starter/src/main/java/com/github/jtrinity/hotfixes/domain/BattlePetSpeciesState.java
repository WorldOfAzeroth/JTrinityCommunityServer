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
@Table(name = "battle_pet_species_state")
public class BattlePetSpeciesState {
    @Id
    @ColumnDefault("'0'")
    @Column(name = "ID", columnDefinition = "int UNSIGNED not null")
    private Integer id;

    @Id
    @ColumnDefault("0")
    @Column(name = "VerifiedBuild", nullable = false)
    private Integer verifiedBuild;

    @ColumnDefault("'0'")
    @Column(name = "BattlePetStateID", columnDefinition = "tinyint UNSIGNED not null")
    private Short battlePetStateID;

    @ColumnDefault("0")
    @Column(name = "Value", nullable = false)
    private Integer value;

    @ColumnDefault("'0'")
    @Column(name = "BattlePetSpeciesID", columnDefinition = "int UNSIGNED not null")
    private Long battlePetSpeciesID;

}