package com.pandaria.auth.domain;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "realmlist")
public class Realmlist {
    @Id
    @Column(name = "id", columnDefinition = "int UNSIGNED not null")
    private Long id;

    @Column(name = "name", nullable = false, length = 32)
    private String name;

    @Column(name = "address", nullable = false)
    private String address;

    @Column(name = "localAddress", nullable = false)
    private String localAddress;

    @Column(name = "localSubnetMask", nullable = false)
    private String localSubnetMask;

    @Column(name = "port", columnDefinition = "smallint UNSIGNED not null")
    private Integer port;

    @Column(name = "icon", columnDefinition = "tinyint UNSIGNED not null")
    private Short icon;

    @Column(name = "flag", columnDefinition = "tinyint UNSIGNED not null")
    private Short flag;

    @Column(name = "timezone", columnDefinition = "tinyint UNSIGNED not null")
    private Short timezone;

    @Column(name = "allowedSecurityLevel", columnDefinition = "tinyint UNSIGNED not null")
    private Short allowedSecurityLevel;

    @Column(name = "gamebuild", columnDefinition = "int UNSIGNED not null")
    private Long gamebuild;

    @Column(name = "Region", columnDefinition = "tinyint UNSIGNED not null")
    private Short region;
    @Column(name = "Battlegroup", columnDefinition = "tinyint UNSIGNED not null")
    private Short battlegroup;

/*
 TODO [Reverse Engineering] create field to map the 'population' column
 Available actions: Define target Java type | Uncomment as is | Remove column mapping
    @ColumnDefault("'0'")
    @Column(name = "population", columnDefinition = "float UNSIGNED not null")
    private Object population;
*/
}