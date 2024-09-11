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
@Table(name = "journal_instance")
public class JournalInstance {
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

    @Lob
    @Column(name = "Description")
    private String description;

    @ColumnDefault("'0'")
    @Column(name = "MapID", columnDefinition = "smallint UNSIGNED not null")
    private Integer mapID;

    @ColumnDefault("0")
    @Column(name = "BackgroundFileDataID", nullable = false)
    private Integer backgroundFileDataID;

    @ColumnDefault("0")
    @Column(name = "ButtonFileDataID", nullable = false)
    private Integer buttonFileDataID;

    @ColumnDefault("0")
    @Column(name = "ButtonSmallFileDataID", nullable = false)
    private Integer buttonSmallFileDataID;

    @ColumnDefault("0")
    @Column(name = "LoreFileDataID", nullable = false)
    private Integer loreFileDataID;

    @ColumnDefault("0")
    @Column(name = "Flags", nullable = false)
    private Integer flags;

    @ColumnDefault("'0'")
    @Column(name = "AreaID", columnDefinition = "smallint UNSIGNED not null")
    private Integer areaID;

}