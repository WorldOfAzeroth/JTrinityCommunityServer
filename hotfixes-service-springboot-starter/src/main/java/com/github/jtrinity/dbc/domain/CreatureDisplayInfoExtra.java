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
@Table(name = "creature_display_info_extra")
@Db2File(name = "CreatureDisplayInfoExtra.db2", layoutHash = 0x03BFCF96, indexField = 0)
public class CreatureDisplayInfoExtra implements DbcEntity {
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
    @Column(name = "DisplayRaceID", nullable = false)
    @Db2Field(fieldIndex = 1, type = Db2Type.BYTE, signed = true)
    private Byte displayRaceID;

    @ColumnDefault("0")
    @Column(name = "DisplaySexID", nullable = false)
    @Db2Field(fieldIndex = 2, type = Db2Type.BYTE, signed = true)
    private Byte displaySexID;

    @ColumnDefault("0")
    @Column(name = "DisplayClassID", nullable = false)
    @Db2Field(fieldIndex = 3, type = Db2Type.BYTE, signed = true)
    private Byte displayClassID;

    @ColumnDefault("0")
    @Column(name = "SkinID", nullable = false)
    @Db2Field(fieldIndex = 4, type = Db2Type.BYTE, signed = true)
    private Byte skinID;

    @ColumnDefault("0")
    @Column(name = "FaceID", nullable = false)
    @Db2Field(fieldIndex = 5, type = Db2Type.BYTE, signed = true)
    private Byte faceID;

    @ColumnDefault("0")
    @Column(name = "HairStyleID", nullable = false)
    @Db2Field(fieldIndex = 6, type = Db2Type.BYTE, signed = true)
    private Byte hairStyleID;

    @ColumnDefault("0")
    @Column(name = "HairColorID", nullable = false)
    @Db2Field(fieldIndex = 7, type = Db2Type.BYTE, signed = true)
    private Byte hairColorID;

    @ColumnDefault("0")
    @Column(name = "FacialHairID", nullable = false)
    @Db2Field(fieldIndex = 8, type = Db2Type.BYTE, signed = true)
    private Byte facialHairID;

    @ColumnDefault("0")
    @Column(name = "Flags", nullable = false)
    @Db2Field(fieldIndex = 9, type = Db2Type.BYTE, signed = true)
    private Byte flags;

    @ColumnDefault("0")
    @Column(name = "BakeMaterialResourcesID", nullable = false)
    @Db2Field(fieldIndex = 10, type = Db2Type.INT, signed = true)
    private Integer bakeMaterialResourcesID;

    @ColumnDefault("0")
    @Column(name = "HDBakeMaterialResourcesID", nullable = false)
    @Db2Field(fieldIndex = 11, type = Db2Type.INT, signed = true)
    private Integer hDBakeMaterialResourcesID;

    @ColumnDefault("'0'")
    @Column(name = "CustomDisplayOption1", columnDefinition = "tinyint UNSIGNED not null")
    @Db2Field(fieldIndex = 12, type = Db2Type.BYTE)
    private Short customDisplayOption1;

    @ColumnDefault("'0'")
    @Column(name = "CustomDisplayOption2", columnDefinition = "tinyint UNSIGNED not null")
    @Db2Field(fieldIndex = 13, type = Db2Type.BYTE)
    private Short customDisplayOption2;

    @ColumnDefault("'0'")
    @Column(name = "CustomDisplayOption3", columnDefinition = "tinyint UNSIGNED not null")
    @Db2Field(fieldIndex = 14, type = Db2Type.BYTE)
    private Short customDisplayOption3;

}