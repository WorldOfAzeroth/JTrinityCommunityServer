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
@Table(name = "quest_xp")
@Db2File(name = "QuestXP.db2", fileDataId = 1139378, layoutHash = 0xEF69DA71, indexField = 1)
public class QuestXp {
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
    @Column(name = "Difficulty1", nullable = false)
    @Db2Field(fieldIndex = 1, type = Db2Type.INT, signed = true)
    private Integer difficulty1;

    @ColumnDefault("0")
    @Column(name = "Difficulty2", nullable = false)
    @Db2Field(fieldIndex = 2, type = Db2Type.INT, signed = true)
    private Integer difficulty2;

    @ColumnDefault("0")
    @Column(name = "Difficulty3", nullable = false)
    @Db2Field(fieldIndex = 3, type = Db2Type.INT, signed = true)
    private Integer difficulty3;

    @ColumnDefault("0")
    @Column(name = "Difficulty4", nullable = false)
    @Db2Field(fieldIndex = 4, type = Db2Type.INT, signed = true)
    private Integer difficulty4;

    @ColumnDefault("0")
    @Column(name = "Difficulty5", nullable = false)
    @Db2Field(fieldIndex = 5, type = Db2Type.INT, signed = true)
    private Integer difficulty5;

    @ColumnDefault("0")
    @Column(name = "Difficulty6", nullable = false)
    @Db2Field(fieldIndex = 6, type = Db2Type.INT, signed = true)
    private Integer difficulty6;

    @ColumnDefault("0")
    @Column(name = "Difficulty7", nullable = false)
    @Db2Field(fieldIndex = 7, type = Db2Type.INT, signed = true)
    private Integer difficulty7;

    @ColumnDefault("0")
    @Column(name = "Difficulty8", nullable = false)
    @Db2Field(fieldIndex = 8, type = Db2Type.INT, signed = true)
    private Integer difficulty8;

    @ColumnDefault("0")
    @Column(name = "Difficulty9", nullable = false)
    @Db2Field(fieldIndex = 9, type = Db2Type.INT, signed = true)
    private Integer difficulty9;

    @ColumnDefault("0")
    @Column(name = "Difficulty10", nullable = false)
    @Db2Field(fieldIndex = 10, type = Db2Type.INT, signed = true)
    private Integer difficulty10;

}