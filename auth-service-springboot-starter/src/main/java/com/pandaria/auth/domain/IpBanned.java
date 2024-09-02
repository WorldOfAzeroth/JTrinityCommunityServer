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
@Table(name = "ip_banned")
public class IpBanned {
    @EmbeddedId
    private IpBannedId id;

    @Column(name = "unbandate", columnDefinition = "int UNSIGNED not null")
    private Long unbandate;

    @ColumnDefault("'[Console]'")
    @Column(name = "bannedby", nullable = false, length = 50)
    private String bannedby;

    @ColumnDefault("'no reason'")
    @Column(name = "banreason", nullable = false)
    private String banreason;

}