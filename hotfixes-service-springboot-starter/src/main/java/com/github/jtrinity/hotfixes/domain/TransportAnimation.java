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
@Table(name = "transport_animation")
public class TransportAnimation {
    @Id
    @ColumnDefault("'0'")
    @Column(name = "ID", columnDefinition = "int UNSIGNED not null")
    private Long id;

    @Id
    @ColumnDefault("0")
    @Column(name = "VerifiedBuild", nullable = false)
    private Integer verifiedBuild;

    @ColumnDefault("0")
    @Column(name = "PosX", nullable = false)
    private Float posX;

    @ColumnDefault("0")
    @Column(name = "PosY", nullable = false)
    private Float posY;

    @ColumnDefault("0")
    @Column(name = "PosZ", nullable = false)
    private Float posZ;

    @ColumnDefault("'0'")
    @Column(name = "SequenceID", columnDefinition = "tinyint UNSIGNED not null")
    private Short sequenceID;

    @ColumnDefault("'0'")
    @Column(name = "TimeIndex", columnDefinition = "int UNSIGNED not null")
    private Long timeIndex;

    @ColumnDefault("'0'")
    @Column(name = "TransportID", columnDefinition = "int UNSIGNED not null")
    private Long transportID;

}