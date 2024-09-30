package com.github.jtrinity.dbc.domain;

import com.github.jtrinity.cache.DbcEntity;
import com.github.jtrinity.dbc.db2.Db2Field;
import com.github.jtrinity.dbc.db2.Db2DataBind;
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
@Db2DataBind(name = "ParagonReputation.db2", layoutHash = 0xD7712F98, parentIndexField = 2, fields = {
        @Db2Field(name = "id", type = Db2Type.INT),
        @Db2Field(name = "factionID", type = Db2Type.INT),
        @Db2Field(name = "levelThreshold", type = Db2Type.INT, signed = true),
        @Db2Field(name = "questID", type = Db2Type.INT, signed = true)
})
public class ParagonReputation implements DbcEntity {
    @Id
    @ColumnDefault("'0'")
    @Column(name = "ID", columnDefinition = "int UNSIGNED not null")
    private Integer id;

    @Column(name = "FactionID")
    private Integer factionID;

    @Column(name = "LevelThreshold")
    private Integer levelThreshold;

    @Column(name = "QuestID")
    private Integer questID;

    @Id
    @ColumnDefault("0")
    @Column(name = "VerifiedBuild", nullable = false)
    private Integer verifiedBuild;

}
