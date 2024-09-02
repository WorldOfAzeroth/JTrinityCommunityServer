package com.pandaria.auth.domain;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.hibernate.Hibernate;

import java.io.Serializable;
import java.util.Objects;

@Getter
@Setter
@ToString(onlyExplicitlyIncluded = true)
@Embeddable
public class AccountLastPlayedCharacterId implements Serializable {
    private static final long serialVersionUID = -8195625801326111292L;
    @Column(name = "accountId", columnDefinition = "int UNSIGNED not null")
    private Long accountId;

    @Column(name = "region", columnDefinition = "tinyint UNSIGNED not null")
    private Short region;

    @Column(name = "battlegroup", columnDefinition = "tinyint UNSIGNED not null")
    private Short battlegroup;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
        AccountLastPlayedCharacterId entity = (AccountLastPlayedCharacterId) o;
        return Objects.equals(this.accountId, entity.accountId) &&
                Objects.equals(this.battlegroup, entity.battlegroup) &&
                Objects.equals(this.region, entity.region);
    }

    @Override
    public int hashCode() {
        return Objects.hash(accountId, battlegroup, region);
    }

}