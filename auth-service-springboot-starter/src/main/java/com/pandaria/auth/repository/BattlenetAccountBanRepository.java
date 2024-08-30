package com.pandaria.auth.repository;

import com.pandaria.auth.domain.BattlenetAccountBan;
import com.pandaria.auth.domain.BattlenetAccountBanId;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BattlenetAccountBanRepository extends JpaRepository<BattlenetAccountBan, BattlenetAccountBanId> {
}