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
@Table(name = "spell_target_restrictions")
@Db2File(name = "SpellTargetRestrictions.db2", fileDataId = 1139993, layoutHash = 0xAC82CF4B, parentIndexField = 7)
public class SpellTargetRestriction {
    @Id
    @ColumnDefault("'0'")
    @Column(name = "ID", columnDefinition = "int UNSIGNED not null")
    @Db2Field(fieldIndex = 0, type = Db2Type.INT)
    private Long id;

    @Id
    @ColumnDefault("0")
    @Column(name = "VerifiedBuild", nullable = false)
    private Integer verifiedBuild;

    @ColumnDefault("'0'")
    @Column(name = "DifficultyID", columnDefinition = "tinyint UNSIGNED not null")
    @Db2Field(fieldIndex = 1, type = Db2Type.BYTE)
    private Short difficultyID;

    @ColumnDefault("0")
    @Column(name = "ConeDegrees", nullable = false)
    @Db2Field(fieldIndex = 2, type = Db2Type.FLOAT)
    private Float coneDegrees;

    @ColumnDefault("'0'")
    @Column(name = "MaxTargets", columnDefinition = "tinyint UNSIGNED not null")
    @Db2Field(fieldIndex = 3, type = Db2Type.BYTE)
    private Short maxTargets;

    @ColumnDefault("'0'")
    @Column(name = "MaxTargetLevel", columnDefinition = "int UNSIGNED not null")
    @Db2Field(fieldIndex = 4, type = Db2Type.INT)
    private Long maxTargetLevel;

    @ColumnDefault("0")
    @Column(name = "TargetCreatureType", nullable = false)
    @Db2Field(fieldIndex = 5, type = Db2Type.SHORT, signed = true)
    private Short targetCreatureType;

    @ColumnDefault("0")
    @Column(name = "Targets", nullable = false)
    @Db2Field(fieldIndex = 6, type = Db2Type.INT, signed = true)
    private Integer targets;

    @ColumnDefault("0")
    @Column(name = "Width", nullable = false)
    @Db2Field(fieldIndex = 7, type = Db2Type.FLOAT)
    private Float width;

    @ColumnDefault("'0'")
    @Column(name = "SpellID", columnDefinition = "int UNSIGNED not null")
    @Db2Field(fieldIndex = 8, type = Db2Type.INT)
    private Long spellID;

}