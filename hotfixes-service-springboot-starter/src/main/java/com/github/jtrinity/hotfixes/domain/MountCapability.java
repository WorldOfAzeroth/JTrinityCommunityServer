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
@Table(name = "mount_capability")
@Db2File(name = "MountCapability.db2", fileDataId = 1114709, layoutHash = 0x675B432D, indexField = 0)
public class MountCapability {
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
    @Column(name = "Flags", nullable = false)
    @Db2Field(fieldIndex = 1, type = Db2Type.INT, signed = true)
    private Integer flags;

    @ColumnDefault("'0'")
    @Column(name = "ReqRidingSkill", columnDefinition = "smallint UNSIGNED not null")
    @Db2Field(fieldIndex = 2, type = Db2Type.SHORT)
    private Integer reqRidingSkill;

    @ColumnDefault("'0'")
    @Column(name = "ReqAreaID", columnDefinition = "smallint UNSIGNED not null")
    @Db2Field(fieldIndex = 3, type = Db2Type.SHORT)
    private Integer reqAreaID;

    @ColumnDefault("'0'")
    @Column(name = "ReqSpellAuraID", columnDefinition = "int UNSIGNED not null")
    @Db2Field(fieldIndex = 4, type = Db2Type.INT)
    private Long reqSpellAuraID;

    @ColumnDefault("0")
    @Column(name = "ReqSpellKnownID", nullable = false)
    @Db2Field(fieldIndex = 5, type = Db2Type.INT, signed = true)
    private Integer reqSpellKnownID;

    @ColumnDefault("0")
    @Column(name = "ModSpellAuraID", nullable = false)
    @Db2Field(fieldIndex = 6, type = Db2Type.INT, signed = true)
    private Integer modSpellAuraID;

    @ColumnDefault("0")
    @Column(name = "ReqMapID", nullable = false)
    @Db2Field(fieldIndex = 7, type = Db2Type.SHORT, signed = true)
    private Short reqMapID;

}