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
@Table(name = "quest_info")
@Db2File(name = "QuestInfo.db2", fileDataId = 1120960, layoutHash = 0x8CE69EF5)
public class QuestInfo {
    @Id
    @ColumnDefault("'0'")
    @Column(name = "ID", columnDefinition = "int UNSIGNED not null")
    @Db2Field(fieldIndex = 0, type = Db2Type.INT)
    private Integer id;

    @Id
    @ColumnDefault("0")
    @Column(name = "VerifiedBuild", nullable = false)
    private Integer verifiedBuild;

    @Lob
    @Column(name = "InfoName")
    @Db2Field(fieldIndex = 1, type = Db2Type.STRING)
    private String infoName;

    @ColumnDefault("0")
    @Column(name = "Type", nullable = false)
    @Db2Field(fieldIndex = 2, type = Db2Type.BYTE, signed = true)
    private Byte type;

    @ColumnDefault("0")
    @Column(name = "Modifiers", nullable = false)
    @Db2Field(fieldIndex = 3, type = Db2Type.INT, signed = true)
    private Integer modifiers;

    @ColumnDefault("'0'")
    @Column(name = "Profession", columnDefinition = "smallint UNSIGNED not null")
    @Db2Field(fieldIndex = 4, type = Db2Type.SHORT)
    private Integer profession;

}