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
@Table(name = "destructible_model_data")
@Db2File(name = "DestructibleModelData.db2", fileDataId = 1122116, layoutHash = 0xA4261431)
public class DestructibleModelDatum {
    @Id
    @ColumnDefault("'0'")
    @Column(name = "ID", columnDefinition = "int UNSIGNED not null")
    @Db2Field(fieldIndex = 0, type = Db2Type.INT)
    private Integer id;

    @Id
    @ColumnDefault("0")
    @Column(name = "VerifiedBuild", nullable = false)
    private Integer verifiedBuild;

    @ColumnDefault("0")
    @Column(name = "State0ImpactEffectDoodadSet", nullable = false)
    @Db2Field(fieldIndex = 1, type = Db2Type.BYTE, signed = true)
    private Byte state0ImpactEffectDoodadSet;

    @ColumnDefault("'0'")
    @Column(name = "State0AmbientDoodadSet", columnDefinition = "tinyint UNSIGNED not null")
    @Db2Field(fieldIndex = 2, type = Db2Type.BYTE)
    private Short state0AmbientDoodadSet;

    @ColumnDefault("'0'")
    @Column(name = "State1Wmo", columnDefinition = "int UNSIGNED not null")
    @Db2Field(fieldIndex = 3, type = Db2Type.INT)
    private Long state1Wmo;

    @ColumnDefault("0")
    @Column(name = "State1DestructionDoodadSet", nullable = false)
    @Db2Field(fieldIndex = 4, type = Db2Type.BYTE, signed = true)
    private Byte state1DestructionDoodadSet;

    @ColumnDefault("0")
    @Column(name = "State1ImpactEffectDoodadSet", nullable = false)
    @Db2Field(fieldIndex = 5, type = Db2Type.BYTE, signed = true)
    private Byte state1ImpactEffectDoodadSet;

    @ColumnDefault("'0'")
    @Column(name = "State1AmbientDoodadSet", columnDefinition = "tinyint UNSIGNED not null")
    @Db2Field(fieldIndex = 6, type = Db2Type.BYTE)
    private Short state1AmbientDoodadSet;

    @ColumnDefault("'0'")
    @Column(name = "State2Wmo", columnDefinition = "int UNSIGNED not null")
    @Db2Field(fieldIndex = 7, type = Db2Type.INT)
    private Long state2Wmo;

    @ColumnDefault("0")
    @Column(name = "State2DestructionDoodadSet", nullable = false)
    @Db2Field(fieldIndex = 8, type = Db2Type.BYTE, signed = true)
    private Byte state2DestructionDoodadSet;

    @ColumnDefault("0")
    @Column(name = "State2ImpactEffectDoodadSet", nullable = false)
    @Db2Field(fieldIndex = 9, type = Db2Type.BYTE, signed = true)
    private Byte state2ImpactEffectDoodadSet;

    @ColumnDefault("'0'")
    @Column(name = "State2AmbientDoodadSet", columnDefinition = "tinyint UNSIGNED not null")
    @Db2Field(fieldIndex = 10, type = Db2Type.BYTE)
    private Short state2AmbientDoodadSet;

    @ColumnDefault("'0'")
    @Column(name = "State3Wmo", columnDefinition = "int UNSIGNED not null")
    @Db2Field(fieldIndex = 11, type = Db2Type.INT)
    private Long state3Wmo;

    @ColumnDefault("'0'")
    @Column(name = "State3InitDoodadSet", columnDefinition = "tinyint UNSIGNED not null")
    @Db2Field(fieldIndex = 12, type = Db2Type.BYTE)
    private Short state3InitDoodadSet;

    @ColumnDefault("'0'")
    @Column(name = "State3AmbientDoodadSet", columnDefinition = "tinyint UNSIGNED not null")
    @Db2Field(fieldIndex = 13, type = Db2Type.BYTE)
    private Short state3AmbientDoodadSet;

    @ColumnDefault("'0'")
    @Column(name = "EjectDirection", columnDefinition = "tinyint UNSIGNED not null")
    @Db2Field(fieldIndex = 14, type = Db2Type.BYTE)
    private Short ejectDirection;

    @ColumnDefault("'0'")
    @Column(name = "DoNotHighlight", columnDefinition = "tinyint UNSIGNED not null")
    @Db2Field(fieldIndex = 15, type = Db2Type.BYTE)
    private Short doNotHighlight;

    @ColumnDefault("'0'")
    @Column(name = "State0Wmo", columnDefinition = "int UNSIGNED not null")
    @Db2Field(fieldIndex = 16, type = Db2Type.INT)
    private Long state0Wmo;

    @ColumnDefault("'0'")
    @Column(name = "HealEffect", columnDefinition = "tinyint UNSIGNED not null")
    @Db2Field(fieldIndex = 17, type = Db2Type.BYTE)
    private Short healEffect;

    @ColumnDefault("'0'")
    @Column(name = "HealEffectSpeed", columnDefinition = "smallint UNSIGNED not null")
    @Db2Field(fieldIndex = 18, type = Db2Type.SHORT)
    private Integer healEffectSpeed;

    @ColumnDefault("0")
    @Column(name = "State0NameSet", nullable = false)
    @Db2Field(fieldIndex = 19, type = Db2Type.BYTE, signed = true)
    private Byte state0NameSet;

    @ColumnDefault("0")
    @Column(name = "State1NameSet", nullable = false)
    @Db2Field(fieldIndex = 20, type = Db2Type.BYTE, signed = true)
    private Byte state1NameSet;

    @ColumnDefault("0")
    @Column(name = "State2NameSet", nullable = false)
    @Db2Field(fieldIndex = 21, type = Db2Type.BYTE, signed = true)
    private Byte state2NameSet;

    @ColumnDefault("0")
    @Column(name = "State3NameSet", nullable = false)
    @Db2Field(fieldIndex = 22, type = Db2Type.BYTE, signed = true)
    private Byte state3NameSet;

}