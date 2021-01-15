package com.example.deposit.commonentities;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedStoredProcedureQueries;
import javax.persistence.NamedStoredProcedureQuery;
//import javax.persistence.ParameterMode;
//import javax.persistence.StoredProcedureParameter;
import javax.persistence.Table;



@Entity
@Table(name= "cuentas")
@NamedStoredProcedureQueries(value= {@NamedStoredProcedureQuery(name="stored-procedure", procedureName="GetAllSavingsAccount"),
		@NamedStoredProcedureQuery(name="stored-procedure-two", procedureName="GetAllCurrentAccounts")})

public class Account {
	
	
	@Id
	private int id;
	private String name, accountNumber;
	private double balance;
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	
	@Override 
	public String toString()
	{
		return  "Name= " + name + " , AccountNumber= " + accountNumber + ", Balance= " + balance + "]"; 

	
	}
	
}
