package com.pandaria.auth.repository;

import com.pandaria.auth.domain.AccountBanned;
import com.pandaria.auth.domain.AccountBannedId;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface AccountBannedRepository extends JpaRepository<AccountBanned, AccountBannedId> {

    @Query("from AccountBanned as a where a.id.id=:accountId and a.active = 1")
    List<AccountBanned> findByAccountId(@Param("accountId") Long accountId);
}