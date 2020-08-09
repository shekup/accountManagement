package com.bank.account;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@EnableSwagger2
public class AccountApplication {

	public static void main(String[] args) {
		SpringApplication.run(AccountApplication.class, args);
	}
	
	/**
	 * 	Docket, Springfox’s, primary api configuration mechanism is initialized for swagger specification 2.0
		select() returns an instance of ApiSelectorBuilder to give fine grained control over the endpoints exposed via swagger.
		apis() allows selection of RequestHandler's using a predicate: default, any, none, withClassAnnotation, withMethodAnnotation and basePackage.
		paths() allows selection of Path's using a predicate: regex, ant, any, none.
	 * @return
	 */
	@Bean
    public Docket api() { 
        return new Docket(DocumentationType.SWAGGER_2)  
          .select()                                  
          .apis(RequestHandlerSelectors.any())              
          .paths(PathSelectors.any())                          
          .build();                                           
    }

}
