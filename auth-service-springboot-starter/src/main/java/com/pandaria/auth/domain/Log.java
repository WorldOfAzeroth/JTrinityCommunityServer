package com.pandaria.auth.domain;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.hibernate.annotations.ColumnDefault;

@Getter
@Setter
@ToString(onlyExplicitlyIncluded = true)
@Entity
@Table(name = "logs")
public class Log {
    @Id
    @Column(name = "time", columnDefinition = "int UNSIGNED not null")
    private Long time;

    @Column(name = "realm", columnDefinition = "int UNSIGNED not null")
    private Long realm;

    @Column(name = "type", nullable = false, length = 250)
    private String type;

    @ColumnDefault("'0'")
    @Column(name = "level", columnDefinition = "tinyint UNSIGNED not null")
    private Short level;

    @Lob
    @Column(name = "string")
    private String string;

}