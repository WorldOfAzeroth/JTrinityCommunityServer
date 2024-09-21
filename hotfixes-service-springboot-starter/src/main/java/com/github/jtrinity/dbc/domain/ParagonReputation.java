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
@Table(name = "paragon_reputation")
@Db2File(name = "ParagonReputation.db2", layoutHash = 0xD7712F98, parentIndexField = 2)
public class ParagonReputation implements DbcEntity {
    @Id
    @ColumnDefault("'0'")
    @Column(name = "ID", columnDefinition = "int UNSIGNED not null")
    @Db2Field(fieldIndex = 0, type = Db2Type.INT)
    private Integer id;


    @Column(name = "FactionID")
    @Db2Field(fieldIndex = 1, type = Db2Type.INT)
    private Integer factionID;


    @Column(name = "LevelThreshold")
    @Db2Field(fieldIndex = 2, type = Db2Type.INT, signed = true)
    private Integer levelThreshold;


    @Column(name = "QuestID")
    @Db2Field(fieldIndex = 3, type = Db2Type.INT, signed = true)
    private Integer questID;

    @Id
    @ColumnDefault("0")
    @Column(name = "VerifiedBuild", nullable = false)
    private Integer verifiedBuild;


}
