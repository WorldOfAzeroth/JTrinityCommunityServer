package com.pandaria.auth.domain;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.ColumnDefault;

@Getter
@Setter
@Entity
@Table(name = "realmcharacters", indexes = {
        @Index(name = "acctid", columnList = "acctid")
})
public class Realmcharacter {
    @EmbeddedId
    private RealmcharacterId id;

    @ColumnDefault("'0'")
    @Column(name = "numchars", columnDefinition = "tinyint UNSIGNED not null")
    private Short numchars;

}