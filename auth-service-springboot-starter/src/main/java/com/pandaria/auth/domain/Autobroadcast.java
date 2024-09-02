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
@Table(name = "autobroadcast")
public class Autobroadcast {
    @EmbeddedId
    private AutobroadcastId id;

    @ColumnDefault("'1'")
    @Column(name = "weight", columnDefinition = "tinyint UNSIGNED")
    private Short weight;

    @Lob
    @Column(name = "text", nullable = false)
    private String text;

}