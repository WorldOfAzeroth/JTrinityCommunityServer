package com.github.jtrinity.auth.repository;

import com.github.jtrinity.auth.domain.BattlenetAccount;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.Optional;


public interface BattlenetAccountRepository extends JpaRepository<BattlenetAccount, Long> {

    @Query("FROM BattlenetAccount a LEFT JOIN FETCH a.accounts b WHERE a.loginTicket = :loginTicket")
    Optional<BattlenetAccount> queryByLoginTicket(@Param("loginTicket") String loginTicket);

}