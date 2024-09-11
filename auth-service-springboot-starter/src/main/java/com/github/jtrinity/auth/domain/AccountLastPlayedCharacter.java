package com.github.jtrinity.auth.domain;

import jakarta.persistence.Column;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString(onlyExplicitlyIncluded = true)
@Entity
@Table(name = "account_last_played_character")
public class AccountLastPlayedCharacter {
    @EmbeddedId
    private AccountLastPlayedCharacterId id;

    @Column(name = "realmId", columnDefinition = "int UNSIGNED")
    private Long realmId;

    @Column(name = "characterName", length = 12)
    private String characterName;

    @Column(name = "characterGUID")
    private Long characterGUID;

    @Column(name = "lastPlayedTime", columnDefinition = "int UNSIGNED")
    private Long lastPlayedTime;

}