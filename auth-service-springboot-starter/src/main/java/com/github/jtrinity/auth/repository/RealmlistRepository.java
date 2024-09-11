package com.github.jtrinity.auth.repository;

import com.github.jtrinity.auth.domain.Realmlist;
import jakarta.persistence.QueryHint;
import org.hibernate.jpa.HibernateHints;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.jpa.repository.QueryHints;

import java.util.stream.Stream;

public interface RealmlistRepository extends JpaRepository<Realmlist, Long> {

    @QueryHints(value = @QueryHint(name = HibernateHints.HINT_FETCH_SIZE, value = "25"))
    @Query("from Realmlist a where a.flag <> 3 ORDER BY a.name")
    Stream<Realmlist> stream();
}