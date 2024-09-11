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
@Table(name = "transmog_set")
public class TransmogSet {
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
    @Column(name = "ClassMask", nullable = false)
    private Integer classMask;

    @ColumnDefault("'0'")
    @Column(name = "TrackingQuestID", columnDefinition = "int UNSIGNED not null")
    private Long trackingQuestID;

    @ColumnDefault("0")
    @Column(name = "Flags", nullable = false)
    private Integer flags;

    @ColumnDefault("'0'")
    @Column(name = "TransmogSetGroupID", columnDefinition = "int UNSIGNED not null")
    private Long transmogSetGroupID;

    @ColumnDefault("0")
    @Column(name = "ItemNameDescriptionID", nullable = false)
    private Integer itemNameDescriptionID;

    @ColumnDefault("'0'")
    @Column(name = "ParentTransmogSetID", columnDefinition = "smallint UNSIGNED not null")
    private Integer parentTransmogSetID;

    @ColumnDefault("'0'")
    @Column(name = "ExpansionID", columnDefinition = "tinyint UNSIGNED not null")
    private Short expansionID;

    @ColumnDefault("0")
    @Column(name = "UiOrder", nullable = false)
    private Short uiOrder;

}