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
@Table(name = "artifact_tier")
public class ArtifactTier {
    @Id
    @ColumnDefault("'0'")
    @Column(name = "ID", columnDefinition = "int UNSIGNED not null")
    private Integer id;

    @Id
    @ColumnDefault("0")
    @Column(name = "VerifiedBuild", nullable = false)
    private Integer verifiedBuild;

    @ColumnDefault("'0'")
    @Column(name = "ArtifactTier", columnDefinition = "int UNSIGNED not null")
    private Long artifactTier;

    @ColumnDefault("'0'")
    @Column(name = "MaxNumTraits", columnDefinition = "int UNSIGNED not null")
    private Long maxNumTraits;

    @ColumnDefault("'0'")
    @Column(name = "MaxArtifactKnowledge", columnDefinition = "int UNSIGNED not null")
    private Long maxArtifactKnowledge;

    @ColumnDefault("'0'")
    @Column(name = "KnowledgePlayerCondition", columnDefinition = "int UNSIGNED not null")
    private Long knowledgePlayerCondition;

    @ColumnDefault("'0'")
    @Column(name = "MinimumEmpowerKnowledge", columnDefinition = "int UNSIGNED not null")
    private Long minimumEmpowerKnowledge;

}