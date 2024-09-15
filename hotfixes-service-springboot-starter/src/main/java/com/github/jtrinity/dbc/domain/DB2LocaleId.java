package com.github.jtrinity.dbc.domain;

import lombok.*;

import java.io.Serializable;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
public class DB2LocaleId implements Serializable {
    public Long id;

    public String locale;

    public Integer verifiedBuild;


}