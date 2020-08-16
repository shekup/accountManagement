package com.bank.account.management.application.commands;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * This class should implement an interface like ICommand if required a standard command interface
 * @author abhishek
 *
 */

/**
 * Why use constructors? 
 * @author abhishek
 *
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class CreateAccountCommand {
	
	@Getter @Setter private String accountName;
	
	@Getter @Setter private String productClass;

}
