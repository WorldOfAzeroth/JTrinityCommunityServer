package com.github.jtrinity.dbc.domain;

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
@ToString(onlyExplicitlyIncluded = true)
@IdClass(DB2Id.class)
@Entity
@Table(name = "battle_pet_breed_state")
@Db2File(name = "BattlePetBreedState.db2", layoutHash = 0xFACA6D44, parentIndexField = 2)
public class BattlePetBreedState implements DbcEntity {
    @Id
    @ColumnDefault("'0'")
    @Column(name = "ID", columnDefinition = "int UNSIGNED not null")
    @Db2Field(fieldIndex = 0, type = Db2Type.INT)
    private Integer id;

    @Id
    @ColumnDefault("0")
    @Column(name = "VerifiedBuild", nullable = false)
    private Integer verifiedBuild;

    @ColumnDefault("'0'")
    @Column(name = "BattlePetStateID", columnDefinition = "tinyint UNSIGNED not null")
    @Db2Field(fieldIndex = 1, type = Db2Type.BYTE)
    private Short battlePetStateID;

    @ColumnDefault("'0'")
    @Column(name = "Value", columnDefinition = "smallint UNSIGNED not null")
    @Db2Field(fieldIndex = 2, type = Db2Type.SHORT)
    private Integer value;

    @ColumnDefault("'0'")
    @Column(name = "BattlePetBreedID", columnDefinition = "int UNSIGNED not null")
    @Db2Field(fieldIndex = 3, type = Db2Type.INT)
    private Long battlePetBreedID;

}