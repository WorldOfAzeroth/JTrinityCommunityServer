package com.pandaria.auth.domain;

import jakarta.persistence.Column;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.ColumnDefault;

@Getter
@Setter
@Entity
@Table(name = "uptime")
public class Uptime {
    @EmbeddedId
    private UptimeId id;

    @ColumnDefault("'0'")
    @Column(name = "uptime", columnDefinition = "int UNSIGNED not null")
    private Long uptime;

    @ColumnDefault("'0'")
    @Column(name = "maxplayers", columnDefinition = "smallint UNSIGNED not null")
    private Integer maxplayers;

    @ColumnDefault("'Trinitycore'")
    @Column(name = "revision", nullable = false)
    private String revision;

}