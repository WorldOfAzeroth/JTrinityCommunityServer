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
@Table(name = "anim_kit")
@Db2DataBind(name = "AnimKit.db2", layoutHash = 0x81D6D250, fields = {
        @Db2Field(name = "id", type = Db2Type.INT),
        @Db2Field(name = "oneShotDuration", type = Db2Type.INT),
        @Db2Field(name = "oneShotStopAnimKitID", type = Db2Type.SHORT),
        @Db2Field(name = "lowDefAnimKitID", type = Db2Type.SHORT)
})
public class AnimKit implements DbcEntity {
    @Id
    @ColumnDefault("'0'")
    @Column(name = "ID", columnDefinition = "int UNSIGNED not null")
    private Integer id;

    @Column(name = "OneShotDuration")
    private Integer oneShotDuration;

    @Column(name = "OneShotStopAnimKitID")
    private Short oneShotStopAnimKitID;

    @Column(name = "LowDefAnimKitID")
    private Short lowDefAnimKitID;

    @Id
    @ColumnDefault("0")
    @Column(name = "VerifiedBuild", nullable = false)
    private Integer verifiedBuild;

}
