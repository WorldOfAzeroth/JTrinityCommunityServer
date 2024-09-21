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
@Table(name = "creature_display_info_extra")
@Db2File(name = "CreatureDisplayInfoExtra.db2", layoutHash = 0x6DF98EF6)
public class CreatureDisplayInfoExtra implements DbcEntity {
    @Id
    @ColumnDefault("'0'")
    @Column(name = "ID", columnDefinition = "int UNSIGNED not null")
    @Db2Field(fieldIndex = 0, type = Db2Type.INT)
    private Integer id;


    @Column(name = "BakeMaterialResourcesID")
    @Db2Field(fieldIndex = 1, type = Db2Type.INT, signed = true)
    private Integer bakeMaterialResourcesID;


    @Column(name = "HDBakeMaterialResourcesID")
    @Db2Field(fieldIndex = 2, type = Db2Type.INT, signed = true)
    private Integer hDBakeMaterialResourcesID;


    @Column(name = "DisplayRaceID")
    @Db2Field(fieldIndex = 3, type = Db2Type.BYTE, signed = true)
    private Byte displayRaceID;


    @Column(name = "DisplaySexID")
    @Db2Field(fieldIndex = 4, type = Db2Type.BYTE, signed = true)
    private Byte displaySexID;


    @Column(name = "DisplayClassID")
    @Db2Field(fieldIndex = 5, type = Db2Type.BYTE, signed = true)
    private Byte displayClassID;


    @Column(name = "SkinID")
    @Db2Field(fieldIndex = 6, type = Db2Type.BYTE, signed = true)
    private Byte skinID;


    @Column(name = "FaceID")
    @Db2Field(fieldIndex = 7, type = Db2Type.BYTE, signed = true)
    private Byte faceID;


    @Column(name = "HairStyleID")
    @Db2Field(fieldIndex = 8, type = Db2Type.BYTE, signed = true)
    private Byte hairStyleID;


    @Column(name = "HairColorID")
    @Db2Field(fieldIndex = 9, type = Db2Type.BYTE, signed = true)
    private Byte hairColorID;


    @Column(name = "FacialHairID")
    @Db2Field(fieldIndex = 10, type = Db2Type.BYTE, signed = true)
    private Byte facialHairID;


    @Column(name = "CustomDisplayOption1")
    @Db2Field(fieldIndex = 11, type = Db2Type.BYTE)
    private Byte customDisplayOption1;


    @Column(name = "CustomDisplayOption2")
    @Db2Field(fieldIndex = 12, type = Db2Type.BYTE)
    private Byte customDisplayOption2;


    @Column(name = "CustomDisplayOption3")
    @Db2Field(fieldIndex = 13, type = Db2Type.BYTE)
    private Byte customDisplayOption3;


    @Column(name = "Flags")
    @Db2Field(fieldIndex = 14, type = Db2Type.BYTE, signed = true)
    private Byte flags;

    @Id
    @ColumnDefault("0")
    @Column(name = "VerifiedBuild", nullable = false)
    private Integer verifiedBuild;


}
