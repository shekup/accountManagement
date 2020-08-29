package com.bank.account.management.application.dto;

import lombok.Value;

/**
 * @Value is the immutable variant of @Data; all fields are made private and final by default, and setters are not generated. 
 * The class itself is also made final by default, because immutability is not something that can be forced onto a subclass. 
 * Like @Data, useful toString(), equals() and hashCode() methods are also generated, each field gets a getter method, 
 * and a constructor that covers every argument (except final fields that are initialized in the field declaration) is also generated.
 * 
 *
 */
@Value
public class AccountDTO {
	
	String accountName;
	
	String productClass;
	

}
