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
 *@Data is a convenient shortcut annotation that bundles the features of @ToString, @EqualsAndHashCode, @Getter / @Setter and @RequiredArgsConstructor together: 
 *In other words, @Data generates all the boilerplate that is normally associated with simple POJOs (Plain Old Java Objects) and beans: 
 *getters for all fields, setters for all non-final fields, and appropriate toString, equals and hashCode implementations that involve the fields of the class, 
 *and a constructor that initializes all final fields, as well as all non-final fields with no initializer that have been marked with @NonNull, in order to ensure the field is never null.
 * 
 * @NoArgsConstructor will generate a constructor with no parameters.
 * @RequiredArgsConstructor generates a constructor with 1 parameter for each field that requires special handling.
 * @AllArgsConstructor generates a constructor with 1 parameter for each field in your class. Fields marked with @NonNull result in null checks on those parameters.
 *
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class CreateAccountCommand {
	
	private String accountName;
	
	private String productClass;

}
