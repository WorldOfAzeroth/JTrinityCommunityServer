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
@Table(name = "destructible_model_data")
@Db2File(name = "DestructibleModelData.db2", layoutHash = 0x1092C9AF)
public class DestructibleModelData implements DbcEntity {
    @Id
    @ColumnDefault("'0'")
    @Column(name = "ID", columnDefinition = "int UNSIGNED not null")
    @Db2Field(fieldIndex = 0, type = Db2Type.INT)
    private Integer id;


    @Column(name = "State0Wmo")
    @Db2Field(fieldIndex = 1, type = Db2Type.SHORT)
    private Short state0Wmo;


    @Column(name = "State1Wmo")
    @Db2Field(fieldIndex = 2, type = Db2Type.SHORT)
    private Short state1Wmo;


    @Column(name = "State2Wmo")
    @Db2Field(fieldIndex = 3, type = Db2Type.SHORT)
    private Short state2Wmo;


    @Column(name = "State3Wmo")
    @Db2Field(fieldIndex = 4, type = Db2Type.SHORT)
    private Short state3Wmo;


    @Column(name = "HealEffectSpeed")
    @Db2Field(fieldIndex = 5, type = Db2Type.SHORT)
    private Short healEffectSpeed;


    @Column(name = "State0ImpactEffectDoodadSet")
    @Db2Field(fieldIndex = 6, type = Db2Type.BYTE, signed = true)
    private Byte state0ImpactEffectDoodadSet;


    @Column(name = "State0AmbientDoodadSet")
    @Db2Field(fieldIndex = 7, type = Db2Type.BYTE)
    private Byte state0AmbientDoodadSet;


    @Column(name = "State0NameSet")
    @Db2Field(fieldIndex = 8, type = Db2Type.BYTE, signed = true)
    private Byte state0NameSet;


    @Column(name = "State1DestructionDoodadSet")
    @Db2Field(fieldIndex = 9, type = Db2Type.BYTE, signed = true)
    private Byte state1DestructionDoodadSet;


    @Column(name = "State1ImpactEffectDoodadSet")
    @Db2Field(fieldIndex = 10, type = Db2Type.BYTE, signed = true)
    private Byte state1ImpactEffectDoodadSet;


    @Column(name = "State1AmbientDoodadSet")
    @Db2Field(fieldIndex = 11, type = Db2Type.BYTE)
    private Byte state1AmbientDoodadSet;


    @Column(name = "State1NameSet")
    @Db2Field(fieldIndex = 12, type = Db2Type.BYTE, signed = true)
    private Byte state1NameSet;


    @Column(name = "State2DestructionDoodadSet")
    @Db2Field(fieldIndex = 13, type = Db2Type.BYTE, signed = true)
    private Byte state2DestructionDoodadSet;


    @Column(name = "State2ImpactEffectDoodadSet")
    @Db2Field(fieldIndex = 14, type = Db2Type.BYTE, signed = true)
    private Byte state2ImpactEffectDoodadSet;


    @Column(name = "State2AmbientDoodadSet")
    @Db2Field(fieldIndex = 15, type = Db2Type.BYTE)
    private Byte state2AmbientDoodadSet;


    @Column(name = "State2NameSet")
    @Db2Field(fieldIndex = 16, type = Db2Type.BYTE, signed = true)
    private Byte state2NameSet;


    @Column(name = "State3InitDoodadSet")
    @Db2Field(fieldIndex = 17, type = Db2Type.BYTE)
    private Byte state3InitDoodadSet;


    @Column(name = "State3AmbientDoodadSet")
    @Db2Field(fieldIndex = 18, type = Db2Type.BYTE)
    private Byte state3AmbientDoodadSet;


    @Column(name = "State3NameSet")
    @Db2Field(fieldIndex = 19, type = Db2Type.BYTE, signed = true)
    private Byte state3NameSet;


    @Column(name = "EjectDirection")
    @Db2Field(fieldIndex = 20, type = Db2Type.BYTE)
    private Byte ejectDirection;


    @Column(name = "DoNotHighlight")
    @Db2Field(fieldIndex = 21, type = Db2Type.BYTE)
    private Byte doNotHighlight;


    @Column(name = "HealEffect")
    @Db2Field(fieldIndex = 22, type = Db2Type.BYTE)
    private Byte healEffect;

    @Id
    @ColumnDefault("0")
    @Column(name = "VerifiedBuild", nullable = false)
    private Integer verifiedBuild;


}
