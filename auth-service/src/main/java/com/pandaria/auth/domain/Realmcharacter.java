package com.pandaria.auth.domain;

import jakarta.persistence.Column;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "realmcharacters")
public class Realmcharacter {
    @EmbeddedId
    private RealmcharacterId id;

    @Column(name = "numchars", columnDefinition = "tinyint UNSIGNED not null")
    private Short numchars;

}