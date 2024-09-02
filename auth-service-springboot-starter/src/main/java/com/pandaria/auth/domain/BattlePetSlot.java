package com.pandaria.auth.domain;

import jakarta.persistence.Column;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.hibernate.annotations.ColumnDefault;

@Getter
@Setter
@ToString(onlyExplicitlyIncluded = true)
@Entity
@Table(name = "battle_pet_slots")
public class BattlePetSlot {
    @EmbeddedId
    private BattlePetSlotId id;

    @Column(name = "battlePetGuid", nullable = false)
    private Long battlePetGuid;

    @ColumnDefault("1")
    @Column(name = "locked", nullable = false)
    private Byte locked;

}