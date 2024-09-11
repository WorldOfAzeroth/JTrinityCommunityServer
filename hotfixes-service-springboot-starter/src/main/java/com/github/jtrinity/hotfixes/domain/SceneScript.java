package com.github.jtrinity.hotfixes.domain;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.hibernate.annotations.ColumnDefault;

@Getter
@Setter
@ToString(onlyExplicitlyIncluded = true)
@IdClass(DB2Id.class)
@Entity
@Table(name = "scene_script")
public class SceneScript {
    @Id
    @ColumnDefault("'0'")
    @Column(name = "ID", columnDefinition = "int UNSIGNED not null")
    private Integer id;

    @Id
    @ColumnDefault("0")
    @Column(name = "VerifiedBuild", nullable = false)
    private Integer verifiedBuild;

    @ColumnDefault("'0'")
    @Column(name = "FirstSceneScriptID", columnDefinition = "smallint UNSIGNED not null")
    private Integer firstSceneScriptID;

    @ColumnDefault("'0'")
    @Column(name = "NextSceneScriptID", columnDefinition = "smallint UNSIGNED not null")
    private Integer nextSceneScriptID;

    @ColumnDefault("0")
    @Column(name = "Unknown915", nullable = false)
    private Integer unknown915;

}