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
@Table(name = "ip_banned")
public class IpBanned {
    @EmbeddedId
    private IpBannedId id;

    @Column(name = "unbandate", columnDefinition = "int UNSIGNED not null")
    private Long unbandate;

    @Column(name = "bannedby", nullable = false, length = 50)
    private String bannedby;

    @Column(name = "banreason", nullable = false)
    private String banreason;

}