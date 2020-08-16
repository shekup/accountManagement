package com.bank.account.management.application.service;

import org.springframework.beans.factory.annotation.Autowired;

import com.bank.account.management.application.dto.AccountDTO;
import com.bank.account.management.domain.services.AccountService;

/**
 * This class is orchestrator, which looks dummy in this implementation but will be expanded with functionalities in future 
 * @author abhishek
 *
 */
public class AccountManagementService {
	
	@Autowired
	AccountService accountService;
	
	public void createAccount(AccountDTO accountDTO) {
		
	}

}
