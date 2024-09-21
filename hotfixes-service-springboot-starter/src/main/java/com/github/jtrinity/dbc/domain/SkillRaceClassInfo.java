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
@Table(name = "skill_race_class_info")
@Db2File(name = "SkillRaceClassInfo.db2", layoutHash = 0x9752C2CE, parentIndexField = 1)
public class SkillRaceClassInfo implements DbcEntity {
    @Id
    @ColumnDefault("'0'")
    @Column(name = "ID", columnDefinition = "int UNSIGNED not null")
    @Db2Field(fieldIndex = 0, type = Db2Type.INT)
    private Integer id;


    @Column(name = "RaceMask")
    @Db2Field(fieldIndex = 1, type = Db2Type.LONG, signed = true)
    private Long raceMask;


    @Column(name = "SkillID")
    @Db2Field(fieldIndex = 2, type = Db2Type.SHORT, signed = true)
    private Short skillID;


    @Column(name = "Flags")
    @Db2Field(fieldIndex = 3, type = Db2Type.SHORT)
    private Short flags;


    @Column(name = "SkillTierID")
    @Db2Field(fieldIndex = 4, type = Db2Type.SHORT, signed = true)
    private Short skillTierID;


    @Column(name = "Availability")
    @Db2Field(fieldIndex = 5, type = Db2Type.BYTE, signed = true)
    private Byte availability;


    @Column(name = "MinLevel")
    @Db2Field(fieldIndex = 6, type = Db2Type.BYTE, signed = true)
    private Byte minLevel;


    @Column(name = "ClassMask")
    @Db2Field(fieldIndex = 7, type = Db2Type.INT, signed = true)
    private Integer classMask;

    @Id
    @ColumnDefault("0")
    @Column(name = "VerifiedBuild", nullable = false)
    private Integer verifiedBuild;


}
