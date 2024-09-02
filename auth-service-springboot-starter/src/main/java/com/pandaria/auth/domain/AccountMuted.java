package com.pandaria.auth.domain;

import jakarta.persistence.Column;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.hibernate.annotations.ColumnDefault;

@Getter
@Setter
@ToString(onlyExplicitlyIncluded = true)
@Entity
@Table(name = "account_muted")
public class AccountMuted {
    @EmbeddedId
    private AccountMutedId id;

    @ColumnDefault("'0'")
    @Column(name = "mutetime", columnDefinition = "int UNSIGNED not null")
    private Long mutetime;

    @Column(name = "mutedby", nullable = false, length = 50)
    private String mutedby;

    @Column(name = "mutereason", nullable = false)
    private String mutereason;

}