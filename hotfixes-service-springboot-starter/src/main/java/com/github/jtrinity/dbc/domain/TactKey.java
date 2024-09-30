package com.github.jtrinity.dbc.domain;

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
@Table(name = "tact_key")
@Db2DataBind(name = "TactKey.db2", layoutHash = 0xF0F98B62, fields = {
        @Db2Field(name = "id", type = Db2Type.INT),
        @Db2Field(name = {"key1", "key2", "key3", "key4", "key5", "key6", "key7", "key8", "key9", "key10", "key11", "key12", "key13", "key14", "key15", "key16"}, type = Db2Type.BYTE)
})
public class TactKey implements DbcEntity {
    @Id
    @ColumnDefault("'0'")
    @Column(name = "ID", columnDefinition = "int UNSIGNED not null")
    private Integer id;

    @Column(name = "Key1")
    private Byte key1;

    @Column(name = "Key2")
    private Byte key2;

    @Column(name = "Key3")
    private Byte key3;

    @Column(name = "Key4")
    private Byte key4;

    @Column(name = "Key5")
    private Byte key5;

    @Column(name = "Key6")
    private Byte key6;

    @Column(name = "Key7")
    private Byte key7;

    @Column(name = "Key8")
    private Byte key8;

    @Column(name = "Key9")
    private Byte key9;

    @Column(name = "Key10")
    private Byte key10;

    @Column(name = "Key11")
    private Byte key11;

    @Column(name = "Key12")
    private Byte key12;

    @Column(name = "Key13")
    private Byte key13;

    @Column(name = "Key14")
    private Byte key14;

    @Column(name = "Key15")
    private Byte key15;

    @Column(name = "Key16")
    private Byte key16;

    @Id
    @ColumnDefault("0")
    @Column(name = "VerifiedBuild", nullable = false)
    private Integer verifiedBuild;

}
