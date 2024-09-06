package com.pandaria.auth.repository;

import com.pandaria.auth.domain.Realmcharacter;
import com.pandaria.auth.domain.RealmcharacterId;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.Set;

public interface RealmcharacterRepository extends JpaRepository<Realmcharacter, RealmcharacterId> {

    @Query("""
            SELECT rc, r
            FROM Realmcharacter rc INNER JOIN Realmlist r ON rc.id.realmid = r.id
            WHERE rc.id.acctid in (:acctids)
            """)
    Object[][] findByIdAccounts(Set<Long> accounts);
}