package com.github.jtrinity.auth.domain;

import jakarta.persistence.Column;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString(onlyExplicitlyIncluded = true)
@Entity
@Table(name = "build_auth_key")
public class BuildAuthKey {
    @EmbeddedId
    private BuildAuthKeyId id;

    @Column(name = "`key`", nullable = false, length = 16)
    private String key;

}