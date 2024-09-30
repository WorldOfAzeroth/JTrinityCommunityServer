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
@Table(name = "cfg_regions")
@Db2DataBind(name = "CfgRegions.db2", layoutHash = 0x9F4272BF, fields = {
        @Db2Field(name = "id", type = Db2Type.INT),
        @Db2Field(name = "tag", type = Db2Type.STRING_NOT_LOCALIZED),
        @Db2Field(name = "raidorigin", type = Db2Type.INT),
        @Db2Field(name = "challengeOrigin", type = Db2Type.INT),
        @Db2Field(name = "regionID", type = Db2Type.SHORT),
        @Db2Field(name = "regionGroupMask", type = Db2Type.BYTE)
})
public class CfgRegion implements DbcEntity {
    @Id
    @ColumnDefault("'0'")
    @Column(name = "ID", columnDefinition = "int UNSIGNED not null")
    private Integer id;

    @Column(name = "Tag")
    private String tag;

    @Column(name = "Raidorigin")
    private Integer raidorigin;

    @Column(name = "ChallengeOrigin")
    private Integer challengeOrigin;

    @Column(name = "RegionID")
    private Short regionID;

    @Column(name = "RegionGroupMask")
    private Byte regionGroupMask;

    @Id
    @ColumnDefault("0")
    @Column(name = "VerifiedBuild", nullable = false)
    private Integer verifiedBuild;

}
