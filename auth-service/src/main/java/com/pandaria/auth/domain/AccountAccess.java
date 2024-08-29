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
@Table(name = "account_access")
public class AccountAccess {
    @EmbeddedId
    private AccountAccessId id;

    @Column(name = "SecurityLevel", columnDefinition = "tinyint UNSIGNED not null")
    private Short securityLevel;

    @Column(name = "Comment")
    private String comment;

}