package com.bank.account.management.application.dto;

import lombok.Getter;
import lombok.Setter;
import lombok.Value;

@Value
public class AccountDTO {
	
	@Getter @Setter private String accountName;
	
	@Getter @Setter private String productClass;
	

}
