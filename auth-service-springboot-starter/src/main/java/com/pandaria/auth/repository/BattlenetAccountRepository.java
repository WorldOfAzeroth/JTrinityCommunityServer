package com.pandaria.auth.repository;

import com.pandaria.auth.domain.*;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;


public interface BattlenetAccountRepository extends JpaRepository<BattlenetAccount, Long> {

    @Query(name = "BattlenetAccount.queryByLoginTicket")
    Object[][] queryByLoginTicket(@Param("loginTicket") String loginTicket);

}