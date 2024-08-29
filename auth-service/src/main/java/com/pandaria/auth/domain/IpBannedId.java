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
public class IpBannedId implements Serializable {
    private static final long serialVersionUID = -5902251693198107499L;
    @ColumnDefault("'127.0.0.1'")
    @Column(name = "ip", nullable = false, length = 15)
    private String ip;

    @Column(name = "bandate", columnDefinition = "int UNSIGNED not null")
    private Long bandate;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
        IpBannedId entity = (IpBannedId) o;
        return Objects.equals(this.ip, entity.ip) &&
                Objects.equals(this.bandate, entity.bandate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(ip, bandate);
    }

}