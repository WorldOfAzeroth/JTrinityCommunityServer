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
@Table(name = "battle_pet_breed_state")
public class BattlePetBreedState {
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

    @ColumnDefault("'0'")
    @Column(name = "Value", columnDefinition = "smallint UNSIGNED not null")
    private Integer value;

    @ColumnDefault("'0'")
    @Column(name = "BattlePetBreedID", columnDefinition = "int UNSIGNED not null")
    private Long battlePetBreedID;

}