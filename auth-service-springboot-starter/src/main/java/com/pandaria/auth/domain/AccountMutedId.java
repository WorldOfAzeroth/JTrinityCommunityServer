package com.pandaria.auth.domain;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.Hibernate;
import org.hibernate.annotations.ColumnDefault;

import java.io.Serializable;
import java.util.Objects;

@Getter
@Setter
@Embeddable
public class AccountMutedId implements Serializable {
    private static final long serialVersionUID = 4823827999435132693L;
    @ColumnDefault("'0'")
    @Column(name = "guid", columnDefinition = "int UNSIGNED not null")
    private Long guid;

    @ColumnDefault("'0'")
    @Column(name = "mutedate", columnDefinition = "int UNSIGNED not null")
    private Long mutedate;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
        AccountMutedId entity = (AccountMutedId) o;
        return Objects.equals(this.guid, entity.guid) &&
                Objects.equals(this.mutedate, entity.mutedate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(guid, mutedate);
    }

}