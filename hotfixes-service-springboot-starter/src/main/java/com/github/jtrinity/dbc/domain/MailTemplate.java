package com.github.jtrinity.dbc.domain;

import com.github.jtrinity.common.LocalizedString;
import com.github.jtrinity.cache.DbcEntity;
import com.github.jtrinity.dbc.db2.Db2Field;
import com.github.jtrinity.dbc.db2.Db2DataBind;
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
@Table(name = "mail_template")
@Db2DataBind(name = "MailTemplate.db2", layoutHash = 0x25C8D6CC, fields = {
        @Db2Field(name = "id", type = Db2Type.INT),
        @Db2Field(name = "body", type = Db2Type.STRING)
})
public class MailTemplate implements DbcEntity {
    @Id
    @ColumnDefault("'0'")
    @Column(name = "ID", columnDefinition = "int UNSIGNED not null")
    private Integer id;

    @Column(name = "Body")
    private LocalizedString body;

    @Id
    @ColumnDefault("0")
    @Column(name = "VerifiedBuild", nullable = false)
    private Integer verifiedBuild;

}
