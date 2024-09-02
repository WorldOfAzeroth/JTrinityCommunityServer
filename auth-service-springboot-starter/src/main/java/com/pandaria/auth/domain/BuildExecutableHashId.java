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
public class BuildExecutableHashId implements Serializable {
    private static final long serialVersionUID = 7132157102854922026L;
    @Column(name = "build", nullable = false)
    private Integer build;

    @Column(name = "platform", nullable = false, length = 4)
    private String platform;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
        BuildExecutableHashId entity = (BuildExecutableHashId) o;
        return Objects.equals(this.build, entity.build) &&
                Objects.equals(this.platform, entity.platform);
    }

    @Override
    public int hashCode() {
        return Objects.hash(build, platform);
    }

}