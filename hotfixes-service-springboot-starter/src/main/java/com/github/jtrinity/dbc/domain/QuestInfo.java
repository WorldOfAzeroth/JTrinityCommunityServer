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
@Table(name = "quest_info")
@Db2File(name = "QuestInfo.db2", layoutHash = 0x4F45F445)
public class QuestInfo implements DbcEntity {
    @Id
    @ColumnDefault("'0'")
    @Column(name = "ID", columnDefinition = "int UNSIGNED not null")
    @Db2Field(fieldIndex = 0, type = Db2Type.INT)
    private Integer id;


    @Column(name = "InfoName")
    @Db2Field(fieldIndex = 1, type = Db2Type.STRING)
    private LocalizedString infoName;


    @Column(name = "Profession")
    @Db2Field(fieldIndex = 2, type = Db2Type.SHORT)
    private Short profession;


    @Column(name = "Type")
    @Db2Field(fieldIndex = 3, type = Db2Type.BYTE, signed = true)
    private Byte type;


    @Column(name = "Modifiers")
    @Db2Field(fieldIndex = 4, type = Db2Type.BYTE)
    private Byte Modifiers;

    @Id
    @ColumnDefault("0")
    @Column(name = "VerifiedBuild", nullable = false)
    private Integer verifiedBuild;


}
