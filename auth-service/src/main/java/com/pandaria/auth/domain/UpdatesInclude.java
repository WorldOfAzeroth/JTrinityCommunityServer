package com.pandaria.auth.domain;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "updates_include")
public class UpdatesInclude {
    @Id
    @Column(name = "path", nullable = false, length = 200)
    private String path;

    @Lob
    @Column(name = "state", nullable = false)
    private String state;

}