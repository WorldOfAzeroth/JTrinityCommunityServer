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
@Table(name = "mount_capability")
@Db2File(name = "MountCapability.db2", layoutHash = 0xB0D11D52, indexField = 6)
public class MountCapability implements DbcEntity {

    @Column(name = "ReqSpellKnownID")
    @Db2Field(fieldIndex = 0, type = Db2Type.INT, signed = true)
    private Integer reqSpellKnownID;


    @Column(name = "ModSpellAuraID")
    @Db2Field(fieldIndex = 1, type = Db2Type.INT, signed = true)
    private Integer modSpellAuraID;


    @Column(name = "ReqRidingSkill")
    @Db2Field(fieldIndex = 2, type = Db2Type.SHORT)
    private Short reqRidingSkill;


    @Column(name = "ReqAreaID")
    @Db2Field(fieldIndex = 3, type = Db2Type.SHORT)
    private Short reqAreaID;


    @Column(name = "ReqMapID")
    @Db2Field(fieldIndex = 4, type = Db2Type.SHORT, signed = true)
    private Short reqMapID;


    @Column(name = "Flags")
    @Db2Field(fieldIndex = 5, type = Db2Type.BYTE)
    private Byte flags;

    @Id
    @ColumnDefault("'0'")
    @Column(name = "ID", columnDefinition = "int UNSIGNED not null")
    @Db2Field(fieldIndex = 6, type = Db2Type.INT)
    private Integer id;


    @Column(name = "ReqSpellAuraID")
    @Db2Field(fieldIndex = 7, type = Db2Type.INT)
    private Integer reqSpellAuraID;

    @Id
    @ColumnDefault("0")
    @Column(name = "VerifiedBuild", nullable = false)
    private Integer verifiedBuild;


}
