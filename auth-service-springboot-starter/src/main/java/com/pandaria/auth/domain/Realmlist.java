package com.pandaria.auth.domain;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.ColumnDefault;

@Getter
@Setter
@Entity
@Table(name = "realmlist", uniqueConstraints = {
        @UniqueConstraint(name = "idx_name", columnNames = {"name"})
})
public class Realmlist {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", columnDefinition = "int UNSIGNED not null")
    private Long id;

    @ColumnDefault("''")
    @Column(name = "name", nullable = false, length = 32)
    private String name;

    @ColumnDefault("'127.0.0.1'")
    @Column(name = "address", nullable = false)
    private String address;

    @ColumnDefault("'127.0.0.1'")
    @Column(name = "localAddress", nullable = false)
    private String localAddress;

    @ColumnDefault("'255.255.255.0'")
    @Column(name = "localSubnetMask", nullable = false)
    private String localSubnetMask;

    @ColumnDefault("'8085'")
    @Column(name = "port", columnDefinition = "smallint UNSIGNED not null")
    private Integer port;

    @ColumnDefault("'0'")
    @Column(name = "icon", columnDefinition = "tinyint UNSIGNED not null")
    private Short icon;

    @ColumnDefault("'2'")
    @Column(name = "flag", columnDefinition = "tinyint UNSIGNED not null")
    private Short flag;

    @ColumnDefault("'0'")
    @Column(name = "timezone", columnDefinition = "tinyint UNSIGNED not null")
    private Short timezone;

    @ColumnDefault("'0'")
    @Column(name = "allowedSecurityLevel", columnDefinition = "tinyint UNSIGNED not null")
    private Short allowedSecurityLevel;

    @ColumnDefault("'56014'")
    @Column(name = "gamebuild", columnDefinition = "int UNSIGNED not null")
    private Long gamebuild;

    @ColumnDefault("'1'")
    @Column(name = "Region", columnDefinition = "tinyint UNSIGNED not null")
    private Short region;
    @ColumnDefault("'1'")
    @Column(name = "Battlegroup", columnDefinition = "tinyint UNSIGNED not null")
    private Short battlegroup;

    @ColumnDefault("'0'")
    @Column(name = "population", columnDefinition = "float not null")
    private Float population;
}