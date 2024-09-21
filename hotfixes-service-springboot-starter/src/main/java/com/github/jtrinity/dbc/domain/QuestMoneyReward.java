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
@Table(name = "quest_money_reward")
@Db2File(name = "QuestMoneyReward.db2", layoutHash = 0x86397302)
public class QuestMoneyReward implements DbcEntity {
    @Id
    @ColumnDefault("'0'")
    @Column(name = "ID", columnDefinition = "int UNSIGNED not null")
    @Db2Field(fieldIndex = 0, type = Db2Type.INT)
    private Integer id;


    @Column(name = "Difficulty1")
    @Db2Field(fieldIndex = 1, type = Db2Type.INT)
    private Integer difficulty1;


    @Column(name = "Difficulty2")
    @Db2Field(fieldIndex = 2, type = Db2Type.INT)
    private Integer difficulty2;


    @Column(name = "Difficulty3")
    @Db2Field(fieldIndex = 3, type = Db2Type.INT)
    private Integer difficulty3;


    @Column(name = "Difficulty4")
    @Db2Field(fieldIndex = 4, type = Db2Type.INT)
    private Integer difficulty4;


    @Column(name = "Difficulty5")
    @Db2Field(fieldIndex = 5, type = Db2Type.INT)
    private Integer difficulty5;


    @Column(name = "Difficulty6")
    @Db2Field(fieldIndex = 6, type = Db2Type.INT)
    private Integer difficulty6;


    @Column(name = "Difficulty7")
    @Db2Field(fieldIndex = 7, type = Db2Type.INT)
    private Integer difficulty7;


    @Column(name = "Difficulty8")
    @Db2Field(fieldIndex = 8, type = Db2Type.INT)
    private Integer difficulty8;


    @Column(name = "Difficulty9")
    @Db2Field(fieldIndex = 9, type = Db2Type.INT)
    private Integer difficulty9;


    @Column(name = "Difficulty10")
    @Db2Field(fieldIndex = 10, type = Db2Type.INT)
    private Integer difficulty10;

    @Id
    @ColumnDefault("0")
    @Column(name = "VerifiedBuild", nullable = false)
    private Integer verifiedBuild;


}
