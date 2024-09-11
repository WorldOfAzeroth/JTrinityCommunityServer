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
@Table(name = "ui_map_x_map_art")
public class UiMapXMapArt {
    @Id
    @ColumnDefault("'0'")
    @Column(name = "ID", columnDefinition = "int UNSIGNED not null")
    private Long id;

    @Id
    @ColumnDefault("0")
    @Column(name = "VerifiedBuild", nullable = false)
    private Integer verifiedBuild;

    @ColumnDefault("0")
    @Column(name = "PhaseID", nullable = false)
    private Integer phaseID;

    @ColumnDefault("0")
    @Column(name = "UiMapArtID", nullable = false)
    private Integer uiMapArtID;

    @ColumnDefault("'0'")
    @Column(name = "UiMapID", columnDefinition = "int UNSIGNED not null")
    private Long uiMapID;

}