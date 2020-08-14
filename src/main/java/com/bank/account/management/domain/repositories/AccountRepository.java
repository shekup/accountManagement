package com.bank.account.management.domain.repositories;

import org.springframework.stereotype.Repository;
import com.bank.account.management.domain.entities.Account;
import org.springframework.data.jpa.repository.JpaRepository;

@Repository
public interface AccountRepository extends JpaRepository<Account, Integer>{

}
