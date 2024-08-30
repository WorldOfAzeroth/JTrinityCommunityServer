package com.pandaria.auth.repository;

import com.pandaria.auth.domain.Realmcharacter;
import com.pandaria.auth.domain.RealmcharacterId;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RealmcharacterRepository extends JpaRepository<Realmcharacter, RealmcharacterId> {
}