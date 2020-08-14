package com.bank.account.management.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bank.account.management.application.dto.AccountDTO;

import io.swagger.annotations.Api;
import lombok.AllArgsConstructor;

@RestController
@RequestMapping(value = "/accounts")
@Api(value = "Bank Account API")
@AllArgsConstructor
public class AccountController {
	
/**
 * REST API can return String (success, failure) or Future or CompletableFuture or any else
 *  * Java’s CompletableFuture is an evolution from the regular Future. 
 * It makes it easy to pipeline multiple asynchronous operations and merge them into a single asynchronous computation.
 */
	@GetMapping("/")
	public String sayHello() {
		return "Hello World";
	}
	
	@PostMapping("/account")
	public String createAccount(@RequestBody AccountDTO account) {
		return "Saved";
	}
	

}
