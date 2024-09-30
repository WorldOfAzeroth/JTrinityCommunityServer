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
@Table(name = "artifact_unlock")
@Db2DataBind(name = "ArtifactUnlock.db2", layoutHash = 0x52839A77, parentIndexField = 4, fields = {
        @Db2Field(name = "id", type = Db2Type.INT),
        @Db2Field(name = "itemBonusListID", type = Db2Type.SHORT),
        @Db2Field(name = "powerRank", type = Db2Type.BYTE),
        @Db2Field(name = "powerID", type = Db2Type.INT),
        @Db2Field(name = "playerConditionID", type = Db2Type.INT),
        @Db2Field(name = "artifactID", type = Db2Type.BYTE)
})
public class ArtifactUnlock implements DbcEntity {
    @Id
    @ColumnDefault("'0'")
    @Column(name = "ID", columnDefinition = "int UNSIGNED not null")
    private Integer id;

    @Column(name = "ItemBonusListID")
    private Short itemBonusListID;

    @Column(name = "PowerRank")
    private Byte powerRank;

    @Column(name = "PowerID")
    private Integer powerID;

    @Column(name = "PlayerConditionID")
    private Integer playerConditionID;

    @Column(name = "ArtifactID")
    private Byte artifactID;

    @Id
    @ColumnDefault("0")
    @Column(name = "VerifiedBuild", nullable = false)
    private Integer verifiedBuild;

}
