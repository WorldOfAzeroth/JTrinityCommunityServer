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
@Table(name = "quest_faction_reward")
@Db2File(name = "QuestFactionReward.db2", layoutHash = 0xE6DC889F)
public class QuestFactionReward implements DbcEntity {
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
    @Db2Field(fieldIndex = 1, type = Db2Type.SHORT, signed = true)
    private Short difficulty1;

    @ColumnDefault("0")
    @Column(name = "Difficulty2", nullable = false)
    @Db2Field(fieldIndex = 2, type = Db2Type.SHORT, signed = true)
    private Short difficulty2;

    @ColumnDefault("0")
    @Column(name = "Difficulty3", nullable = false)
    @Db2Field(fieldIndex = 3, type = Db2Type.SHORT, signed = true)
    private Short difficulty3;

    @ColumnDefault("0")
    @Column(name = "Difficulty4", nullable = false)
    @Db2Field(fieldIndex = 4, type = Db2Type.SHORT, signed = true)
    private Short difficulty4;

    @ColumnDefault("0")
    @Column(name = "Difficulty5", nullable = false)
    @Db2Field(fieldIndex = 5, type = Db2Type.SHORT, signed = true)
    private Short difficulty5;

    @ColumnDefault("0")
    @Column(name = "Difficulty6", nullable = false)
    @Db2Field(fieldIndex = 6, type = Db2Type.SHORT, signed = true)
    private Short difficulty6;

    @ColumnDefault("0")
    @Column(name = "Difficulty7", nullable = false)
    @Db2Field(fieldIndex = 7, type = Db2Type.SHORT, signed = true)
    private Short difficulty7;

    @ColumnDefault("0")
    @Column(name = "Difficulty8", nullable = false)
    @Db2Field(fieldIndex = 8, type = Db2Type.SHORT, signed = true)
    private Short difficulty8;

    @ColumnDefault("0")
    @Column(name = "Difficulty9", nullable = false)
    @Db2Field(fieldIndex = 9, type = Db2Type.SHORT, signed = true)
    private Short difficulty9;

    @ColumnDefault("0")
    @Column(name = "Difficulty10", nullable = false)
    @Db2Field(fieldIndex = 10, type = Db2Type.SHORT, signed = true)
    private Short difficulty10;

}