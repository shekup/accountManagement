package com.bank.account.management.domain;

import java.util.UUID;

import org.axonframework.commandhandling.CommandHandler;
import org.axonframework.eventsourcing.EventSourcingHandler;
import org.axonframework.modelling.command.AggregateIdentifier;
import org.axonframework.modelling.command.AggregateLifecycle;

import com.bank.account.management.application.commands.CreateAccountCommand;
import com.bank.account.management.domain.events.CreateAccountEvent;

public class AccountAggregate {
	
	@AggregateIdentifier
    private UUID accountId;
	
	@CommandHandler
	public void CreateAccountHandler(CreateAccountCommand createAccountCommand) {
		accountId = UUID.randomUUID();
		AggregateLifecycle.apply(new CreateAccountEvent(accountId, createAccountCommand.getAccountName(), createAccountCommand.getProductClass()));
	}
	
	// The constructor will not be no args instead relevant values should be passed to CreditMoneyCommand
	// account Id will not be generated while this command instead, account Id will come as input parameter
	@CommandHandler
	public void CreditAccountHandler(CreditMoneyCommand creditMoneyCommand) {
		AggregateLifecycle.apply(new AccountBalanceUpdatedEvent());
	}
	
	@EventSourcingHandler
	public void on(CreateAccountEvent createAccountEvent) {
		
	}
	
	@EventSourcingHandler
	public void on(AccountBalanceUpdatedEvent accountBalanceUpdatedEvent) {
		
	}

}

