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
@Table(name = "battle_pet_breed_quality")
@Db2DataBind(name = "BattlePetBreedQuality.db2", layoutHash = 0xBDE74E1D, fields = {
        @Db2Field(name = "id", type = Db2Type.INT),
        @Db2Field(name = "stateMultiplier", type = Db2Type.FLOAT),
        @Db2Field(name = "qualityEnum", type = Db2Type.BYTE)
})
public class BattlePetBreedQuality implements DbcEntity {
    @Id
    @ColumnDefault("'0'")
    @Column(name = "ID", columnDefinition = "int UNSIGNED not null")
    private Integer id;

    @Column(name = "StateMultiplier")
    private Float stateMultiplier;

    @Column(name = "QualityEnum")
    private Byte qualityEnum;

    @Id
    @ColumnDefault("0")
    @Column(name = "VerifiedBuild", nullable = false)
    private Integer verifiedBuild;

}
