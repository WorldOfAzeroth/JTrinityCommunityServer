package com.github.jtrinity.hotfixes.domain;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.hibernate.annotations.ColumnDefault;

import java.time.Instant;

@Getter
@Setter
@ToString(onlyExplicitlyIncluded = true)
@Entity
@Table(name = "updates")
public class Update {
    @Id
    @Column(name = "name", nullable = false, length = 200)
    private String name;

    @ColumnDefault("''")
    @Column(name = "hash", length = 40)
    private String hash;

    @ColumnDefault("'RELEASED'")
    @Lob
    @Column(name = "state", nullable = false)
    private String state;

    @ColumnDefault("CURRENT_TIMESTAMP")
    @Column(name = "timestamp", nullable = false)
    private Instant timestamp;

    @ColumnDefault("'0'")
    @Column(name = "speed", columnDefinition = "int UNSIGNED not null")
    private Long speed;

}