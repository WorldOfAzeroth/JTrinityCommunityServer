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
@Table(name = "keychain")
@Db2DataBind(name = "Keychain.db2", layoutHash = 0x5B214E82, fields = {
        @Db2Field(name = "id", type = Db2Type.INT),
        @Db2Field(name = {"key1", "key2", "key3", "key4", "key5", "key6", "key7", "key8", "key9", "key10", "key11", "key12", "key13", "key14", "key15", "key16", "key17", "key18", "key19", "key20", "key21", "key22", "key23", "key24", "key25", "key26", "key27", "key28", "key29", "key30", "key31", "key32"}, type = Db2Type.BYTE)
})
public class Keychain implements DbcEntity {
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

    @Column(name = "Key17")
    private Byte key17;

    @Column(name = "Key18")
    private Byte key18;

    @Column(name = "Key19")
    private Byte key19;

    @Column(name = "Key20")
    private Byte key20;

    @Column(name = "Key21")
    private Byte key21;

    @Column(name = "Key22")
    private Byte key22;

    @Column(name = "Key23")
    private Byte key23;

    @Column(name = "Key24")
    private Byte key24;

    @Column(name = "Key25")
    private Byte key25;

    @Column(name = "Key26")
    private Byte key26;

    @Column(name = "Key27")
    private Byte key27;

    @Column(name = "Key28")
    private Byte key28;

    @Column(name = "Key29")
    private Byte key29;

    @Column(name = "Key30")
    private Byte key30;

    @Column(name = "Key31")
    private Byte key31;

    @Column(name = "Key32")
    private Byte key32;

    @Id
    @ColumnDefault("0")
    @Column(name = "VerifiedBuild", nullable = false)
    private Integer verifiedBuild;

}
