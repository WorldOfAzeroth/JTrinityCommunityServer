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
@Table(name = "num_talents_at_level")
@Db2File(name = "NumTalentsAtLevel.db2", fileDataId = 1953326, layoutHash = 0x6CA01D0C, indexField = 0)
public class NumTalentsAtLevel {
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
    @Column(name = "NumTalents", nullable = false)
    @Db2Field(fieldIndex = 1, type = Db2Type.INT, signed = true)
    private Integer numTalents;

    @ColumnDefault("0")
    @Column(name = "NumTalentsDeathKnight", nullable = false)
    @Db2Field(fieldIndex = 2, type = Db2Type.INT, signed = true)
    private Integer numTalentsDeathKnight;

    @ColumnDefault("0")
    @Column(name = "NumTalentsDemonHunter", nullable = false)
    @Db2Field(fieldIndex = 3, type = Db2Type.INT, signed = true)
    private Integer numTalentsDemonHunter;

    @ColumnDefault("0")
    @Column(name = "NumberOfTalents", nullable = false)
    @Db2Field(fieldIndex = 4, type = Db2Type.FLOAT)
    private Float numberOfTalents;

}