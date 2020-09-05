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
	
	@EventSourcingHandler
	public void on(CreateAccountEvent createAccountEvent) {
		
	}

}

