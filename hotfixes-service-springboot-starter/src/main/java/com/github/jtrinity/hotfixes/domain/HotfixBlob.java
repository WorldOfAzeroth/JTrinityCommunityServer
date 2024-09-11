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
@Table(name = "hotfix_blob")
public class HotfixBlob {
    @Id
    @Column(name = "TableHash", columnDefinition = "int UNSIGNED not null")
    private Long tableHash;

    @Id
    @Column(name = "RecordId", nullable = false)
    private Integer recordId;

    @Id
    @Column(name = "locale", nullable = false, length = 4)
    private String locale;

    @Column(name = "`Blob`")
    private byte[] blob;

    @ColumnDefault("0")
    @Column(name = "VerifiedBuild", nullable = false)
    private Integer verifiedBuild;

}