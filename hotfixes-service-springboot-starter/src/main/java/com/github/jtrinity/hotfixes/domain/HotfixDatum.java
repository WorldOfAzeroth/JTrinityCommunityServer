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
@Table(name = "hotfix_data")
public class HotfixDatum {
    @Id
    @Column(name = "Id", nullable = false)
    private Integer id;

    @Id
    @Column(name = "TableHash", columnDefinition = "int UNSIGNED not null")
    private Long tableHash;

    @Id
    @Column(name = "RecordId", nullable = false)
    private Integer recordId;

    @ColumnDefault("'0'")
    @Column(name = "UniqueId", columnDefinition = "int UNSIGNED not null")
    private Long uniqueId;

    @ColumnDefault("'3'")
    @Column(name = "Status", columnDefinition = "tinyint UNSIGNED not null")
    private Short status;

    @ColumnDefault("0")
    @Column(name = "VerifiedBuild", nullable = false)
    private Integer verifiedBuild;

}