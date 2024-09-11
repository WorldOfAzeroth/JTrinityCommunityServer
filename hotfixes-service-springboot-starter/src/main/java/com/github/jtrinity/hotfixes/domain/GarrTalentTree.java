package com.github.jtrinity.hotfixes.domain;

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
@Table(name = "garr_talent_tree")
public class GarrTalentTree {
    @Id
    @ColumnDefault("'0'")
    @Column(name = "ID", columnDefinition = "int UNSIGNED not null")
    private Integer id;

    @Id
    @ColumnDefault("0")
    @Column(name = "VerifiedBuild", nullable = false)
    private Integer verifiedBuild;

    @Lob
    @Column(name = "Name")
    private String name;

    @ColumnDefault("0")
    @Column(name = "GarrTypeID", nullable = false)
    private Integer garrTypeID;

    @ColumnDefault("0")
    @Column(name = "ClassID", nullable = false)
    private Integer classID;

    @ColumnDefault("0")
    @Column(name = "MaxTiers", nullable = false)
    private Byte maxTiers;

    @ColumnDefault("0")
    @Column(name = "UiOrder", nullable = false)
    private Byte uiOrder;

    @ColumnDefault("0")
    @Column(name = "Flags", nullable = false)
    private Byte flags;

    @ColumnDefault("'0'")
    @Column(name = "UiTextureKitID", columnDefinition = "smallint UNSIGNED not null")
    private Integer uiTextureKitID;

}