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
@Table(name = "anim_kit")
public class AnimKit {
    @Id
    @ColumnDefault("'0'")
    @Column(name = "ID", columnDefinition = "int UNSIGNED not null")
    private Integer id;

    @Id
    @ColumnDefault("0")
    @Column(name = "VerifiedBuild", nullable = false)
    private Integer verifiedBuild;

    @ColumnDefault("'0'")
    @Column(name = "OneShotDuration", columnDefinition = "int UNSIGNED not null")
    private Long oneShotDuration;

    @ColumnDefault("'0'")
    @Column(name = "OneShotStopAnimKitID", columnDefinition = "smallint UNSIGNED not null")
    private Integer oneShotStopAnimKitID;

    @ColumnDefault("'0'")
    @Column(name = "LowDefAnimKitID", columnDefinition = "smallint UNSIGNED not null")
    private Integer lowDefAnimKitID;

}