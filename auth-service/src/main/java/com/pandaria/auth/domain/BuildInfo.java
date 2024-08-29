package com.pandaria.auth.domain;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
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

    @Column(name = "winAuthSeed", length = 32)
    private String winAuthSeed;

    @Column(name = "win64AuthSeed", length = 32)
    private String win64AuthSeed;

    @Column(name = "mac64AuthSeed", length = 32)
    private String mac64AuthSeed;

    @Column(name = "winChecksumSeed", length = 40)
    private String winChecksumSeed;

    @Column(name = "macChecksumSeed", length = 40)
    private String macChecksumSeed;

}