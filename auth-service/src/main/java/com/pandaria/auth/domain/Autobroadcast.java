package com.pandaria.auth.domain;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "autobroadcast")
public class Autobroadcast {
    @EmbeddedId
    private AutobroadcastId id;

    @Column(name = "weight", columnDefinition = "tinyint UNSIGNED")
    private Short weight;

    @Lob
    @Column(name = "text", nullable = false)
    private String text;

}