package com.example.deposit.repository;

import javax.persistence.EntityManager;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.example.deposit.commonentities.Account;
 


@Repository
public class Accountdao {
	@Autowired
	private EntityManager em;
	
	@SuppressWarnings("unchecked")
	public Iterable<Account> getallAccounts()
	{
		return em.createNamedStoredProcedureQuery("stored-procedure").getResultList();
	}
	
	@SuppressWarnings("unchecked")
	public Iterable<Account> getallCurrentAccounts ()
	{
		return em.createNamedStoredProcedureQuery("stored-procedure-two").getResultList();
	}
	
	

}
