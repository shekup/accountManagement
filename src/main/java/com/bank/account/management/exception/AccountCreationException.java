package com.bank.account.management.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.INTERNAL_SERVER_ERROR, reason = "Internal Error")
public class AccountCreationException extends RuntimeException{
	
	public AccountCreationException(String message) {
		super(message);
	}

}
