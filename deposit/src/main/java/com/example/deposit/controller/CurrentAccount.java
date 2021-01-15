package com.example.deposit.controller;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.deposit.commonentities.Account;
import com.example.deposit.repository.Accountdao;


@RestController
@RequestMapping(value= "/deposit-account")


public class CurrentAccount {
	
	
	@Autowired
	Accountdao acdao;
	
	private final Logger logger = LoggerFactory.getLogger(this.getClass());
	
	@GetMapping(value= "/current")
    public Iterable<Account> getAllCurrentAccounts() {
        logger.debug("Get all Current Accounts.");
        return acdao.getallCurrentAccounts();
	}
	
	

}
