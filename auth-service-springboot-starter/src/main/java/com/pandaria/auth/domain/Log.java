package com.pandaria.auth.domain;

import jakarta.persistence.Column;
import jakarta.persistence.Lob;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Table(name = "logs")
public class Log {
    @Column(name = "time", columnDefinition = "int UNSIGNED not null")
    private Long time;

    @Column(name = "realm", columnDefinition = "int UNSIGNED not null")
    private Long realm;

    @Column(name = "type", nullable = false, length = 250)
    private String type;

    @Column(name = "level", columnDefinition = "tinyint UNSIGNED not null")
    private Short level;

    @Lob
    @Column(name = "string")
    private String string;

}