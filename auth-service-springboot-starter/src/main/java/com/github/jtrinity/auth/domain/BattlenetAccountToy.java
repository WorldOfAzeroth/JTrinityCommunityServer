package com.github.jtrinity.auth.domain;

import jakarta.persistence.Column;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.hibernate.annotations.ColumnDefault;

@Getter
@Setter
@ToString(onlyExplicitlyIncluded = true)
@Entity
@Table(name = "battlenet_account_toys")
public class BattlenetAccountToy {
    @EmbeddedId
    private BattlenetAccountToyId id;

    @ColumnDefault("0")
    @Column(name = "isFavourite")
    private Boolean isFavourite;

    @ColumnDefault("0")
    @Column(name = "hasFanfare")
    private Boolean hasFanfare;

}