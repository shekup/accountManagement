package com.bank.account.management.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bank.account.management.application.dto.AccountDTO;
import com.bank.account.management.application.service.AccountManagementService;

import io.swagger.annotations.Api;
import lombok.AllArgsConstructor;

@RestController
@RequestMapping(value = "/accounts")
@Api(value = "Bank Account API")
@AllArgsConstructor
public class AccountController {
	
	/**
	 * The @Autowired annotation tells Spring to inject a Bean.
	 * If it finds two such beans it will throw an Exception. To avoid the Exception, use the @Qualifier annotation and tell it which of the two beans to inject 
	 * If don't want to use two annotations (the @Autowired and @Qualifier) use @Resource to combine these two
	 * 
	 * @Autowried follows SOLID principle in a way that @Quqlifier can change the implementation class, whereas the client (this class for example) depends on @Autowried interface
	 * 
	 * The alternative of @Autowired is @Inject
	 * @Autowired is Spring's own annotation. @Inject is part of a Java technology called CDI that defines a standard for dependency injection similar to Spring.
	 */
	@Autowired
	AccountManagementService accountManagementService;
	
	/**
	 * REST API can return String (success, failure) or Future or CompletableFuture or void
	 * Java’s CompletableFuture is an evolution from the regular Future. 
	 * It makes it easy to pipeline multiple asynchronous operations and merge them into a single asynchronous computation.
	 * Axom commandgateway uses CompletableFuture as return
	 */
	@GetMapping("/")
	public String sayHello() {
		return "Hello World";
	}
	
	@PostMapping("/account")
	public String createAccount(@RequestBody AccountDTO account) {
		accountManagementService.createAccount(account);
		return "Saved";
	}
	

}
