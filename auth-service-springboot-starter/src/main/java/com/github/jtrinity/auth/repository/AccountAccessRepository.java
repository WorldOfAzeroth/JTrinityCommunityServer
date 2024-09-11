package com.github.jtrinity.auth.repository;

import com.github.jtrinity.auth.domain.AccountAccess;
import com.github.jtrinity.auth.domain.AccountAccessId;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AccountAccessRepository extends JpaRepository<AccountAccess, AccountAccessId> {
}