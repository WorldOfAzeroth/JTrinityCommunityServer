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
@Table(name = "garr_class_spec")
@Db2File(name = "GarrClassSpec.db2", layoutHash = 0x194CD478, indexField = 7)
public class GarrClassSpec implements DbcEntity {

    @Column(name = "ClassSpec")
    @Db2Field(fieldIndex = 0, type = Db2Type.STRING)
    private LocalizedString classSpec;


    @Column(name = "ClassSpecMale")
    @Db2Field(fieldIndex = 1, type = Db2Type.STRING)
    private LocalizedString classSpecMale;


    @Column(name = "ClassSpecFemale")
    @Db2Field(fieldIndex = 2, type = Db2Type.STRING)
    private LocalizedString classSpecFemale;


    @Column(name = "UiTextureAtlasMemberID")
    @Db2Field(fieldIndex = 3, type = Db2Type.SHORT)
    private Short uiTextureAtlasMemberID;


    @Column(name = "GarrFollItemSetID")
    @Db2Field(fieldIndex = 4, type = Db2Type.SHORT)
    private Short garrFollItemSetID;


    @Column(name = "FollowerClassLimit")
    @Db2Field(fieldIndex = 5, type = Db2Type.BYTE)
    private Byte followerClassLimit;


    @Column(name = "Flags")
    @Db2Field(fieldIndex = 6, type = Db2Type.BYTE)
    private Byte flags;

    @Id
    @ColumnDefault("'0'")
    @Column(name = "ID", columnDefinition = "int UNSIGNED not null")
    @Db2Field(fieldIndex = 7, type = Db2Type.INT)
    private Integer id;

    @Id
    @ColumnDefault("0")
    @Column(name = "VerifiedBuild", nullable = false)
    private Integer verifiedBuild;


}
