package com.pandaria.auth.repository;

import com.pandaria.auth.domain.*;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.Optional;


public interface BattlenetAccountRepository extends JpaRepository<BattlenetAccount, Long> {

    @Query("FROM BattlenetAccount a LEFT JOIN FETCH a.accounts b WHERE a.loginTicket = :loginTicket")
    Optional<BattlenetAccount> queryByLoginTicket(@Param("loginTicket") String loginTicket);

}