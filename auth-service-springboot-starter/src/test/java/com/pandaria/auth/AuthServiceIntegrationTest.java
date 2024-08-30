package com.pandaria.auth;


import com.pandaria.auth.domain.*;
import com.pandaria.auth.repository.*;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.TestPropertySource;

import java.time.Instant;
import java.util.List;
import java.util.Optional;

@SpringBootTest
@TestPropertySource( locations = "classpath:bnetserver.conf")
@SpringBootApplication
public class AuthServiceIntegrationTest {

    @Autowired
    private BattlenetAccountRepository repository;
    @Autowired
    private AccountRepository accountRepository;
    @Autowired
    private BattlenetAccountBanRepository battlenetAccountBanRepository;
    @Autowired
    private AccountBannedRepository accountBannedRepository;
    @Autowired
    private AccountAccessRepository accountAccessRepository;
    @Autowired
    private RealmcharacterRepository realmcharacterRepository;
    @Autowired
    private RealmlistRepository realmlistRepository;
    @Autowired
    private AccountLastPlayedCharacterRepository accountLastPlayedCharacterRepository;

    @BeforeAll
    static void beforeAll() {
        System.setProperty("spring.config.name", "bnetserver");
    }

    @Test
    public void testQueryByLoginTicket() {



        BattlenetAccount battlenetAccount = new BattlenetAccount();
        battlenetAccount.setLoginTicket("123456");
        battlenetAccount.setEmail("test@test");
        battlenetAccount.setJoindate(Instant.now());
        battlenetAccount.setLastIp("127.0.0.1");
        battlenetAccount.setOs("");
        battlenetAccount.setSalt("00");
        battlenetAccount.setLockCountry("00");
        battlenetAccount.setSrpVersion((byte) 1);
        battlenetAccount.setVerifier("test".getBytes());
        battlenetAccount.setLocale((short) 0);
        battlenetAccount.setLocked((short) 0);
        battlenetAccount.setOnline((short) 0);
        battlenetAccount.setLastCharacterUndelete(1L);
        battlenetAccount.setFailedLogins(0L);
        repository.save(battlenetAccount);

        BattlenetAccountBan battlenetAccountBan = new BattlenetAccountBan();
        BattlenetAccountBanId id = new BattlenetAccountBanId();
        id.setId(battlenetAccount.getId());
        id.setBandate(1L);
        battlenetAccountBan.setId(id);
        battlenetAccountBan.setBannedby("test");
        battlenetAccountBan.setBanreason("test");
        battlenetAccountBan.setUnbandate(2L);
        battlenetAccountBanRepository.save(battlenetAccountBan);


        Account account = new Account();
        account.setBattlenetAccount(battlenetAccount);
        account.setEmail("test@test");
        account.setJoindate(Instant.now());
        account.setLastIp("127.0.0.1");
        account.setOs("");
        account.setSalt("00");
        account.setLockCountry("00");
        account.setVerifier("test");
        account.setLocale((short) 0);
        account.setLocked((short) 0);
        account.setOnline((short) 0);
        account.setFailedLogins(0L);
        account.setLastAttemptIp("127.0.0.1");
        account.setMuteby("test");
        account.setMutereason("test");
        account.setMutetime(10L);
        account.setRegMail("test@test");
        account.setTimezoneOffset((short)0);
        account.setUsername("test");
        account.setExpansion((short)4);
        account.setClientBuild(1L);
        account.setRecruiter(1L);
        accountRepository.save(account);


        Realmlist realmlist = new Realmlist();
        realmlist.setAddress("127.0.0.1");
        realmlist.setLocalAddress("127.0.0.1");
        realmlist.setPort(8080);
        realmlist.setGamebuild(1L);
        realmlist.setLocalSubnetMask("test");
        realmlist.setRegion((short)1);
        realmlist.setBattlegroup((short)1);
        realmlist.setPopulation(1.0f);
        realmlist.setName("test");
        realmlist.setAllowedSecurityLevel((short)1);
        realmlist.setFlag((short)1);
        realmlist.setIcon((short)1);
        realmlist.setTimezone((short)1);

        realmlistRepository.save(realmlist);

        AccountBanned banned = new AccountBanned();
        AccountBannedId accountBannedId = new AccountBannedId();
        accountBannedId.setId(account.getId());
        accountBannedId.setBandate(1L);
        banned.setId(accountBannedId);
        banned.setBannedby("test");
        banned.setBanreason("test");
        banned.setUnbandate(2L);
        banned.setActive((short)1);
        accountBannedRepository.save(banned);



        Realmcharacter realmcharacter = new Realmcharacter();
        RealmcharacterId rcid = new RealmcharacterId();
        rcid.setAcctid(account.getId());
        rcid.setRealmid(realmlist.getId());
        realmcharacter.setId(rcid);
        realmcharacter.setNumchars((short)1);
        realmcharacterRepository.save(realmcharacter);

        AccountAccess aa = new AccountAccess();
        AccountAccessId aaid = new AccountAccessId();
        aaid.setAccountID(account.getId());
        aaid.setRealmID(realmlist.getId().intValue());
        aa.setId(aaid);
        aa.setSecurityLevel((short)1);
        accountAccessRepository.save(aa);

        AccountLastPlayedCharacter alp = new AccountLastPlayedCharacter();
        AccountLastPlayedCharacterId alpid = new AccountLastPlayedCharacterId();
        alpid.setAccountId(account.getId());
        alpid.setRegion(Short.valueOf("1"));
        alpid.setBattlegroup(Short.valueOf("1"));
        alp.setId(alpid);
        accountLastPlayedCharacterRepository.save(alp);

        Object[][] objects = repository.queryByLoginTicket("entry");

        Assertions.assertEquals(0, objects.length);

        objects = repository.queryByLoginTicket("123456");
        Assertions.assertEquals(1, objects.length);

        BattlenetAccount o1 = (BattlenetAccount)objects[0][0];
        BattlenetAccountBan o2 = (BattlenetAccountBan)objects[0][1];
        Account o3 = (Account)objects[0][2];
        AccountBanned o4 = (AccountBanned)objects[0][3];
        AccountAccess o5 = (AccountAccess)objects[0][4];
        Realmcharacter o6 = (Realmcharacter)objects[0][5];
        Realmlist o7 = (Realmlist)objects[0][6];
        AccountLastPlayedCharacter o8 = (AccountLastPlayedCharacter)objects[0][7];

        Assertions.assertEquals(battlenetAccount.getId(), o1.getId());
        Assertions.assertEquals(battlenetAccountBan.getUnbandate(), o2.getUnbandate());
        Assertions.assertEquals(account.getClientBuild(), o3.getClientBuild());
        Assertions.assertEquals(banned.getUnbandate(), o4.getUnbandate());
        Assertions.assertNull(o5);
        Assertions.assertEquals(realmcharacter.getId(), o6.getId());
        Assertions.assertEquals(realmlist.getId(), o7.getId());
        Assertions.assertNull(o8);

    }

}