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
@Table(name = "account_access")
public class AccountAccess {
    @EmbeddedId
    private AccountAccessId id;

    @Column(name = "SecurityLevel", columnDefinition = "tinyint UNSIGNED not null")
    private Short securityLevel;

    @Column(name = "Comment")
    private String comment;

}