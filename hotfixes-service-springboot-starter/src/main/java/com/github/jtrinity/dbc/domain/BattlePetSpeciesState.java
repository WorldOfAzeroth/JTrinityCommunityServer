package com.github.jtrinity.dbc.domain;

import com.github.jtrinity.common.LocalizedString;
import com.github.jtrinity.cache.DbcEntity;
import com.github.jtrinity.dbc.db2.Db2Field;
import com.github.jtrinity.dbc.db2.Db2File;
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
@Db2File(name = "BattlePetSpeciesState.db2", layoutHash = 0x8F958D5C, parentIndexField = 2)
public class BattlePetSpeciesState implements DbcEntity {
    @Id
    @ColumnDefault("'0'")
    @Column(name = "ID", columnDefinition = "int UNSIGNED not null")
    @Db2Field(fieldIndex = 0, type = Db2Type.INT)
    private Integer id;


    @Column(name = "Value")
    @Db2Field(fieldIndex = 1, type = Db2Type.INT, signed = true)
    private Integer value;


    @Column(name = "BattlePetStateID")
    @Db2Field(fieldIndex = 2, type = Db2Type.BYTE)
    private Byte battlePetStateID;


    @Column(name = "BattlePetSpeciesID")
    @Db2Field(fieldIndex = 3, type = Db2Type.SHORT)
    private Short battlePetSpeciesID;

    @Id
    @ColumnDefault("0")
    @Column(name = "VerifiedBuild", nullable = false)
    private Integer verifiedBuild;


}
