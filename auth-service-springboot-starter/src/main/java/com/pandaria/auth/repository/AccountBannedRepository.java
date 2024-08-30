package com.pandaria.auth.repository;

import com.pandaria.auth.domain.AccountBanned;
import com.pandaria.auth.domain.AccountBannedId;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AccountBannedRepository extends JpaRepository<AccountBanned, AccountBannedId> {
}