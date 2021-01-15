package com.example.deposit.Interface;
//import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestMethod;
//import org.slf4j.Logger;
//import org.slf4j.LoggerFactory;
//import org.springframework.web.bind.annotation.PathVariable;
//import org.springframework.web.bind.annotation.RestController;

import com.example.deposit.commonentities.Account;



@FeignClient(name="deposit", url="localhost:8081/deposit-account")
public interface RemoteCallService {
	
	@GetMapping(value= "/current")
	public Iterable<Account> getAllCurrentAccounts();
	
	@GetMapping(value="/saving")
	public Iterable<Account> getAll();
}
