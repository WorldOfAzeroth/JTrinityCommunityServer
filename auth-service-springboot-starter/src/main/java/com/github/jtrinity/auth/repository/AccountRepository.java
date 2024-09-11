package com.github.jtrinity.auth.repository;

import com.github.jtrinity.auth.domain.Account;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AccountRepository extends JpaRepository<Account, Long> {
}