package com.pandaria.auth.repository;

import com.pandaria.auth.domain.AccountLastPlayedCharacter;
import com.pandaria.auth.domain.AccountLastPlayedCharacterId;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;
import java.util.Set;

public interface AccountLastPlayedCharacterRepository extends JpaRepository<AccountLastPlayedCharacter, AccountLastPlayedCharacterId> {
    @Query("from AccountLastPlayedCharacter a where a.id.accountId in(:accountIds)")
    List<AccountLastPlayedCharacter> findByIdAccountIds(Set<Long> accountIds);
}