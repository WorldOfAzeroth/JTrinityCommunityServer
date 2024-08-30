package com.pandaria.auth.repository;

import com.pandaria.auth.domain.AccountLastPlayedCharacter;
import com.pandaria.auth.domain.AccountLastPlayedCharacterId;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AccountLastPlayedCharacterRepository extends JpaRepository<AccountLastPlayedCharacter, AccountLastPlayedCharacterId> {
}