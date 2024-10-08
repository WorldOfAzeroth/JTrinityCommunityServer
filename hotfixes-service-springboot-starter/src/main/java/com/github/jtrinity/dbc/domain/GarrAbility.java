package com.github.jtrinity.dbc.domain;

import com.github.jtrinity.cache.DbcEntity;
import com.github.jtrinity.common.LocalizedString;
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
@Table(name = "garr_ability")
@Db2DataBind(name = "GarrAbility.db2", layoutHash = 0x5DF95DBD, indexField = 7, fields = {
        @Db2Field(name = "name", type = Db2Type.STRING),
        @Db2Field(name = "description", type = Db2Type.STRING),
        @Db2Field(name = "iconFileDataID", type = Db2Type.INT, signed = true),
        @Db2Field(name = "flags", type = Db2Type.SHORT),
        @Db2Field(name = "factionChangeGarrAbilityID", type = Db2Type.SHORT),
        @Db2Field(name = "garrAbilityCategoryID", type = Db2Type.BYTE),
        @Db2Field(name = "garrFollowerTypeID", type = Db2Type.BYTE),
        @Db2Field(name = "id", type = Db2Type.INT)
})
public class GarrAbility implements DbcEntity {
    @Column(name = "Name")
    private LocalizedString name;

    @Column(name = "Description")
    private LocalizedString description;

    @Column(name = "IconFileDataID")
    private Integer iconFileDataID;

    @Column(name = "Flags")
    private Short flags;

    @Column(name = "FactionChangeGarrAbilityID")
    private Short factionChangeGarrAbilityID;

    @Column(name = "GarrAbilityCategoryID")
    private Byte garrAbilityCategoryID;

    @Column(name = "GarrFollowerTypeID")
    private Byte garrFollowerTypeID;

    @Id
    @ColumnDefault("'0'")
    @Column(name = "ID", columnDefinition = "int UNSIGNED not null")
    private Integer id;

    @Id
    @ColumnDefault("0")
    @Column(name = "VerifiedBuild", nullable = false)
    private Integer verifiedBuild;

}
