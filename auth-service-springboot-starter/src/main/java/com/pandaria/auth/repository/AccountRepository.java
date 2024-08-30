package com.pandaria.auth.repository;

import com.pandaria.auth.domain.Account;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AccountRepository extends JpaRepository<Account, Long> {
}