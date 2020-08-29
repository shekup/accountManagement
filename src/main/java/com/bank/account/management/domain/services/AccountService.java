package com.bank.account.management.domain.services;

import com.bank.account.management.application.commands.CreateAccountCommand;
import com.bank.account.management.application.dto.AccountDTO;
import org.axonframework.commandhandling.gateway.CommandGateway;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AccountService {
	
	@Autowired
	CommandGateway commandGateway;
	
	/**
	 * 
	 * Sends the given command, and have the result of the command's execution reported to the given callback.
	 * The given command is wrapped as the payload of the CommandMessage that is eventually posted on the Command Bus, unless Command already implements Message. In that case, a CommandMessage is constructed from that message's payload and MetaData.
	 * @param accountDTO
	 */
	public void createAccount(AccountDTO accountDTO) {
		commandGateway.send(new CreateAccountCommand(accountDTO.getAccountName(), accountDTO.getProductClass()));
	}

}
