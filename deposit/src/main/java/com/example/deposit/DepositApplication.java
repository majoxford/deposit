package com.example.deposit;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;
//import org.springframework.cloud.openfeign.FeignClient;

@SpringBootApplication
@EnableFeignClients("com.example.deposit")
public class DepositApplication {

	public static void main(String[] args) {
		SpringApplication.run(DepositApplication.class, args);
	}
}

