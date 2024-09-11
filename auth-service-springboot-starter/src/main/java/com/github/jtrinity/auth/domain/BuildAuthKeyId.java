package com.github.jtrinity.auth.domain;

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
public class BuildAuthKeyId implements Serializable {
    private static final long serialVersionUID = 7084959281169902525L;
    @Column(name = "build", nullable = false)
    private Integer build;

    @Column(name = "platform", nullable = false, length = 4)
    private String platform;

    @Column(name = "arch", nullable = false, length = 4)
    private String arch;

    @Column(name = "type", nullable = false, length = 4)
    private String type;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
        BuildAuthKeyId entity = (BuildAuthKeyId) o;
        return Objects.equals(this.build, entity.build) &&
                Objects.equals(this.arch, entity.arch) &&
                Objects.equals(this.type, entity.type) &&
                Objects.equals(this.platform, entity.platform);
    }

    @Override
    public int hashCode() {
        return Objects.hash(build, arch, type, platform);
    }

}