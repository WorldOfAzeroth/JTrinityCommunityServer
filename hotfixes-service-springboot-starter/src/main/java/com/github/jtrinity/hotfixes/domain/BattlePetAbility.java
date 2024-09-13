package com.github.jtrinity.hotfixes.domain;

import com.github.jtrinity.hotfixes.db2.Db2Field;
import com.github.jtrinity.hotfixes.db2.Db2File;
import com.github.jtrinity.hotfixes.db2.Db2Type;

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
@Table(name = "battle_pet_ability")
@Db2File(name = "BattlePetAbility.db2", fileDataId = 841610, layoutHash = 0xF9548A5A)
public class BattlePetAbility {
    @Id
    @ColumnDefault("'0'")
    @Column(name = "ID", columnDefinition = "int UNSIGNED not null")
    @Db2Field(fieldIndex = 0, type = Db2Type.INT)
    private Integer id;

    @Id
    @ColumnDefault("0")
    @Column(name = "VerifiedBuild", nullable = false)
    private Integer verifiedBuild;

    @Lob
    @Column(name = "Name")
    @Db2Field(fieldIndex = 1, type = Db2Type.STRING)
    private String name;

    @Lob
    @Column(name = "Description")
    @Db2Field(fieldIndex = 2, type = Db2Type.STRING)
    private String description;

    @ColumnDefault("0")
    @Column(name = "IconFileDataID", nullable = false)
    @Db2Field(fieldIndex = 3, type = Db2Type.INT, signed = true)
    private Integer iconFileDataID;

    @ColumnDefault("0")
    @Column(name = "PetTypeEnum", nullable = false)
    @Db2Field(fieldIndex = 4, type = Db2Type.BYTE, signed = true)
    private Byte petTypeEnum;

    @ColumnDefault("'0'")
    @Column(name = "Cooldown", columnDefinition = "int UNSIGNED not null")
    @Db2Field(fieldIndex = 5, type = Db2Type.INT)
    private Long cooldown;

    @ColumnDefault("'0'")
    @Column(name = "BattlePetVisualID", columnDefinition = "smallint UNSIGNED not null")
    @Db2Field(fieldIndex = 6, type = Db2Type.SHORT)
    private Integer battlePetVisualID;

    @ColumnDefault("'0'")
    @Column(name = "Flags", columnDefinition = "tinyint UNSIGNED not null")
    @Db2Field(fieldIndex = 7, type = Db2Type.BYTE)
    private Short flags;

}