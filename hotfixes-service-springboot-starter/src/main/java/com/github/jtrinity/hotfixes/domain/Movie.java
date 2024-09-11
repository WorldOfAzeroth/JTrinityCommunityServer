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
@Table(name = "movie")
public class Movie {
    @Id
    @ColumnDefault("'0'")
    @Column(name = "ID", columnDefinition = "int UNSIGNED not null")
    private Integer id;

    @Id
    @ColumnDefault("0")
    @Column(name = "VerifiedBuild", nullable = false)
    private Integer verifiedBuild;

    @ColumnDefault("'0'")
    @Column(name = "Volume", columnDefinition = "tinyint UNSIGNED not null")
    private Short volume;

    @ColumnDefault("'0'")
    @Column(name = "KeyID", columnDefinition = "tinyint UNSIGNED not null")
    private Short keyID;

    @ColumnDefault("'0'")
    @Column(name = "AudioFileDataID", columnDefinition = "int UNSIGNED not null")
    private Long audioFileDataID;

    @ColumnDefault("'0'")
    @Column(name = "SubtitleFileDataID", columnDefinition = "int UNSIGNED not null")
    private Long subtitleFileDataID;

}