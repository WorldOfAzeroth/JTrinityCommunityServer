package com.github.jtrinity.auth.repository;

import com.github.jtrinity.auth.domain.BattlenetAccountBan;
import com.github.jtrinity.auth.domain.BattlenetAccountBanId;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface BattlenetAccountBanRepository extends JpaRepository<BattlenetAccountBan, BattlenetAccountBanId> {

    @Query("from BattlenetAccountBan b where b.id.id = :accountId")
    List<BattlenetAccountBan> findByAccount(Long accountId);
}