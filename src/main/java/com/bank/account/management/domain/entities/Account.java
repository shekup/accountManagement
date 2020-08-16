package com.bank.account.management.domain.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Column;
import javax.persistence.Id;

import lombok.Getter;
import lombok.Setter;

@Entity
public class Account {
	
	@Id @GeneratedValue(strategy = GenerationType.AUTO) long id;
	
	@Getter @Setter @Column(name="ACCOUNT_NUMBER") private int accountNumber;
	
	@Getter @Setter @Column(name="ACCOUNT_NAME") private String firstName;

}
