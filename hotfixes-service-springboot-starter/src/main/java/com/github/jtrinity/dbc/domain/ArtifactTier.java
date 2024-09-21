package com.github.jtrinity.dbc.domain;

import com.github.jtrinity.common.LocalizedString;
import com.github.jtrinity.cache.DbcEntity;
import com.github.jtrinity.dbc.db2.Db2Field;
import com.github.jtrinity.dbc.db2.Db2File;
import com.github.jtrinity.dbc.db2.Db2Type;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.hibernate.annotations.ColumnDefault;

@Getter
@Setter
@ToString
@IdClass(DB2Id.class)
@Entity
@Table(name = "artifact_tier")
@Db2File(name = "ArtifactTier.db2", layoutHash = 0x1A5A50B9)
public class ArtifactTier implements DbcEntity {
    @Id
    @ColumnDefault("'0'")
    @Column(name = "ID", columnDefinition = "int UNSIGNED not null")
    @Db2Field(fieldIndex = 0, type = Db2Type.INT)
    private Integer id;


    @Column(name = "ArtifactTier")
    @Db2Field(fieldIndex = 1, type = Db2Type.INT)
    private Integer artifactTier;


    @Column(name = "MaxNumTraits")
    @Db2Field(fieldIndex = 2, type = Db2Type.INT)
    private Integer maxNumTraits;


    @Column(name = "MaxArtifactKnowledge")
    @Db2Field(fieldIndex = 3, type = Db2Type.INT)
    private Integer maxArtifactKnowledge;


    @Column(name = "KnowledgePlayerCondition")
    @Db2Field(fieldIndex = 4, type = Db2Type.INT)
    private Integer knowledgePlayerCondition;


    @Column(name = "MinimumEmpowerKnowledge")
    @Db2Field(fieldIndex = 5, type = Db2Type.INT)
    private Integer minimumEmpowerKnowledge;

    @Id
    @ColumnDefault("0")
    @Column(name = "VerifiedBuild", nullable = false)
    private Integer verifiedBuild;


}
