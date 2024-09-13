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
@Table(name = "skill_race_class_info")
@Db2File(name = "SkillRaceClassInfo.db2", fileDataId = 1240406, layoutHash = 0x97B1C484, parentIndexField = 1)
public class SkillRaceClassInfo {
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
    @Column(name = "RaceMask", nullable = false)
    @Db2Field(fieldIndex = 1, type = Db2Type.LONG, signed = true)
    private Long raceMask;

    @ColumnDefault("0")
    @Column(name = "SkillID", nullable = false)
    @Db2Field(fieldIndex = 2, type = Db2Type.SHORT, signed = true)
    private Short skillID;

    @ColumnDefault("0")
    @Column(name = "ClassMask", nullable = false)
    @Db2Field(fieldIndex = 3, type = Db2Type.INT, signed = true)
    private Integer classMask;

    @ColumnDefault("'0'")
    @Column(name = "Flags", columnDefinition = "smallint UNSIGNED not null")
    @Db2Field(fieldIndex = 4, type = Db2Type.SHORT)
    private Integer flags;

    @ColumnDefault("0")
    @Column(name = "Availability", nullable = false)
    @Db2Field(fieldIndex = 5, type = Db2Type.BYTE, signed = true)
    private Byte availability;

    @ColumnDefault("0")
    @Column(name = "MinLevel", nullable = false)
    @Db2Field(fieldIndex = 6, type = Db2Type.BYTE, signed = true)
    private Byte minLevel;

    @ColumnDefault("0")
    @Column(name = "SkillTierID", nullable = false)
    @Db2Field(fieldIndex = 7, type = Db2Type.SHORT, signed = true)
    private Short skillTierID;

    @ColumnDefault("0")
    @Column(name = "Unknown115_1", nullable = false)
    @Db2Field(fieldIndex = 8, type = Db2Type.INT, signed = true)
    private Integer unknown115_1;

}