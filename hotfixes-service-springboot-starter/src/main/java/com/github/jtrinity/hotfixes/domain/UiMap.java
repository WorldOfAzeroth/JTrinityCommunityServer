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
@Table(name = "ui_map")
public class UiMap {
    @Id
    @ColumnDefault("'0'")
    @Column(name = "ID", columnDefinition = "int UNSIGNED not null")
    private Long id;

    @Id
    @ColumnDefault("0")
    @Column(name = "VerifiedBuild", nullable = false)
    private Integer verifiedBuild;

    @Lob
    @Column(name = "Name")
    private String name;

    @ColumnDefault("0")
    @Column(name = "ParentUiMapID", nullable = false)
    private Integer parentUiMapID;

    @ColumnDefault("0")
    @Column(name = "Flags", nullable = false)
    private Integer flags;

    @ColumnDefault("0")
    @Column(name = "System", nullable = false)
    private Byte system;

    @ColumnDefault("'0'")
    @Column(name = "Type", columnDefinition = "tinyint UNSIGNED not null")
    private Short type;

    @ColumnDefault("0")
    @Column(name = "BountySetID", nullable = false)
    private Integer bountySetID;

    @ColumnDefault("'0'")
    @Column(name = "BountyDisplayLocation", columnDefinition = "int UNSIGNED not null")
    private Long bountyDisplayLocation;

    @ColumnDefault("0")
    @Column(name = "VisibilityPlayerConditionID2", nullable = false)
    private Integer visibilityPlayerConditionID2;

    @ColumnDefault("0")
    @Column(name = "VisibilityPlayerConditionID", nullable = false)
    private Integer visibilityPlayerConditionID;

    @ColumnDefault("0")
    @Column(name = "HelpTextPosition", nullable = false)
    private Byte helpTextPosition;

    @ColumnDefault("0")
    @Column(name = "BkgAtlasID", nullable = false)
    private Integer bkgAtlasID;

    @ColumnDefault("'0'")
    @Column(name = "AlternateUiMapGroup", columnDefinition = "int UNSIGNED not null")
    private Long alternateUiMapGroup;

    @ColumnDefault("'0'")
    @Column(name = "ContentTuningID", columnDefinition = "int UNSIGNED not null")
    private Long contentTuningID;

}