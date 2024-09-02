package com.pandaria.auth.domain;

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
@Table(name = "build_executable_hash")
public class BuildExecutableHash {
    @EmbeddedId
    private BuildExecutableHashId id;

    @Column(name = "executableHash", nullable = false, length = 20)
    private String executableHash;

}