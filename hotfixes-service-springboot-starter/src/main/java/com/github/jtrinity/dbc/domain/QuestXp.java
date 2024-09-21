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
@Table(name = "quest_xp")
@Db2File(name = "QuestXP.db2", layoutHash = -1, indexField = 0xCB76B4C0)
public class QuestXp implements DbcEntity {
    @Id
    @ColumnDefault("'0'")
    @Column(name = "ID", columnDefinition = "int UNSIGNED not null")
    @Db2Field(fieldIndex = 0, type = Db2Type.INT)
    private Integer id;


    @Column(name = "Difficulty1")
    @Db2Field(fieldIndex = 1, type = Db2Type.SHORT)
    private Short difficulty1;


    @Column(name = "Difficulty2")
    @Db2Field(fieldIndex = 2, type = Db2Type.SHORT)
    private Short difficulty2;


    @Column(name = "Difficulty3")
    @Db2Field(fieldIndex = 3, type = Db2Type.SHORT)
    private Short difficulty3;


    @Column(name = "Difficulty4")
    @Db2Field(fieldIndex = 4, type = Db2Type.SHORT)
    private Short difficulty4;


    @Column(name = "Difficulty5")
    @Db2Field(fieldIndex = 5, type = Db2Type.SHORT)
    private Short difficulty5;


    @Column(name = "Difficulty6")
    @Db2Field(fieldIndex = 6, type = Db2Type.SHORT)
    private Short difficulty6;


    @Column(name = "Difficulty7")
    @Db2Field(fieldIndex = 7, type = Db2Type.SHORT)
    private Short difficulty7;


    @Column(name = "Difficulty8")
    @Db2Field(fieldIndex = 8, type = Db2Type.SHORT)
    private Short difficulty8;


    @Column(name = "Difficulty9")
    @Db2Field(fieldIndex = 9, type = Db2Type.SHORT)
    private Short difficulty9;


    @Column(name = "Difficulty10")
    @Db2Field(fieldIndex = 10, type = Db2Type.SHORT)
    private Short difficulty10;

    @Id
    @ColumnDefault("0")
    @Column(name = "VerifiedBuild", nullable = false)
    private Integer verifiedBuild;


}
