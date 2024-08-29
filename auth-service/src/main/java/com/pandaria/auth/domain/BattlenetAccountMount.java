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
@Table(name = "battlenet_account_mounts")
public class BattlenetAccountMount {
    @EmbeddedId
    private BattlenetAccountMountId id;

    @Column(name = "flags", columnDefinition = "tinyint UNSIGNED not null")
    private Short flags;

}