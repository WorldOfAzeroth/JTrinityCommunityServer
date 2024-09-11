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
@Table(name = "friendship_rep_reaction")
public class FriendshipRepReaction {
    @Id
    @ColumnDefault("'0'")
    @Column(name = "ID", columnDefinition = "int UNSIGNED not null")
    private Integer id;

    @Id
    @ColumnDefault("0")
    @Column(name = "VerifiedBuild", nullable = false)
    private Integer verifiedBuild;

    @Lob
    @Column(name = "Reaction")
    private String reaction;

    @ColumnDefault("'0'")
    @Column(name = "FriendshipRepID", columnDefinition = "tinyint UNSIGNED not null")
    private Short friendshipRepID;

    @ColumnDefault("'0'")
    @Column(name = "ReactionThreshold", columnDefinition = "smallint UNSIGNED not null")
    private Integer reactionThreshold;

}