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
@Table(name = "chr_customization_req_choice")
public class ChrCustomizationReqChoice {
    @Id
    @ColumnDefault("'0'")
    @Column(name = "ID", columnDefinition = "int UNSIGNED not null")
    private Integer id;

    @Id
    @ColumnDefault("0")
    @Column(name = "VerifiedBuild", nullable = false)
    private Integer verifiedBuild;

    @ColumnDefault("0")
    @Column(name = "ChrCustomizationChoiceID", nullable = false)
    private Integer chrCustomizationChoiceID;

    @ColumnDefault("'0'")
    @Column(name = "ChrCustomizationReqID", columnDefinition = "int UNSIGNED not null")
    private Long chrCustomizationReqID;

}