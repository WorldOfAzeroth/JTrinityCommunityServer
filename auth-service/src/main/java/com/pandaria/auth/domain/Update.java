package com.pandaria.auth.domain;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.Instant;

@Getter
@Setter
@Entity
@Table(name = "updates")
public class Update {
    @Id
    @Column(name = "name", nullable = false, length = 200)
    private String name;

    @Column(name = "hash", length = 40)
    private String hash;

    @Lob
    @Column(name = "state", nullable = false)
    private String state;

    @Column(name = "timestamp", nullable = false)
    private Instant timestamp;

    @Column(name = "speed", columnDefinition = "int UNSIGNED not null")
    private Long speed;

}