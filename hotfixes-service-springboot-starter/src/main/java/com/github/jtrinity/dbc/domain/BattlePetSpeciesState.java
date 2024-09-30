package com.github.jtrinity.dbc.domain;

import com.github.jtrinity.cache.DbcEntity;
import com.github.jtrinity.dbc.db2.Db2Field;
import com.github.jtrinity.dbc.db2.Db2DataBind;
import com.github.jtrinity.dbc.db2.Db2Type;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.hibernate.annotations.ColumnDefault;

@Getter
@Setter
@ToString
@IdClass(DB2Id.class)
@Entity
@Table(name = "battle_pet_species_state")
@Db2DataBind(name = "BattlePetSpeciesState.db2", layoutHash = 0x8F958D5C, parentIndexField = 2, fields = {
        @Db2Field(name = "id", type = Db2Type.INT),
        @Db2Field(name = "value", type = Db2Type.INT, signed = true),
        @Db2Field(name = "battlePetStateID", type = Db2Type.BYTE),
        @Db2Field(name = "battlePetSpeciesID", type = Db2Type.SHORT)
})
public class BattlePetSpeciesState implements DbcEntity {
    @Id
    @ColumnDefault("'0'")
    @Column(name = "ID", columnDefinition = "int UNSIGNED not null")
    private Integer id;

    @Column(name = "Value")
    private Integer value;

    @Column(name = "BattlePetStateID")
    private Byte battlePetStateID;

    @Column(name = "BattlePetSpeciesID")
    private Short battlePetSpeciesID;

    @Id
    @ColumnDefault("0")
    @Column(name = "VerifiedBuild", nullable = false)
    private Integer verifiedBuild;

}
