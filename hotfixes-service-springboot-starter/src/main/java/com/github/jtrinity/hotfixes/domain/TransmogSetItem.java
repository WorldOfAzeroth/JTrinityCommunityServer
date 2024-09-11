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
@Table(name = "transmog_set_item")
public class TransmogSetItem {
    @Id
    @ColumnDefault("'0'")
    @Column(name = "ID", columnDefinition = "int UNSIGNED not null")
    private Long id;

    @Id
    @ColumnDefault("0")
    @Column(name = "VerifiedBuild", nullable = false)
    private Integer verifiedBuild;

    @ColumnDefault("'0'")
    @Column(name = "TransmogSetID", columnDefinition = "int UNSIGNED not null")
    private Long transmogSetID;

    @ColumnDefault("'0'")
    @Column(name = "ItemModifiedAppearanceID", columnDefinition = "int UNSIGNED not null")
    private Long itemModifiedAppearanceID;

    @ColumnDefault("0")
    @Column(name = "Flags", nullable = false)
    private Integer flags;

}