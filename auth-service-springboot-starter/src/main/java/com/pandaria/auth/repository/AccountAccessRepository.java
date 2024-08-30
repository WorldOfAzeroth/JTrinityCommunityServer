package com.pandaria.auth.repository;

import com.pandaria.auth.domain.AccountAccess;
import com.pandaria.auth.domain.AccountAccessId;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AccountAccessRepository extends JpaRepository<AccountAccess, AccountAccessId> {
}