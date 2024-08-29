package com.pandaria.auth.repository;

import com.pandaria.auth.domain.BattlenetAccount;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface BattlenetAccountRepository extends JpaRepository<BattlenetAccount, Long> {

    Optional<Object[]> queryByLoginTicket(String loginTicket);

}