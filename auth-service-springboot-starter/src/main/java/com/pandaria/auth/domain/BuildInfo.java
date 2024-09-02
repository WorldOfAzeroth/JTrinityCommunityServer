package com.pandaria.auth.domain;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString(onlyExplicitlyIncluded = true)
@Entity
@Table(name = "build_info")
public class BuildInfo {
    @Id
    @Column(name = "build", nullable = false)
    private Integer id;

    @Column(name = "majorVersion")
    private Integer majorVersion;

    @Column(name = "minorVersion")
    private Integer minorVersion;

    @Column(name = "bugfixVersion")
    private Integer bugfixVersion;

    @Column(name = "hotfixVersion", length = 3)
    private String hotfixVersion;

}