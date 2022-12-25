package com._12_2022.REVISION_DEC.Controllers;

import java.net.URI;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com._12_2022.REVISION_DEC.Entities.Account1;
import com._12_2022.REVISION_DEC.Entities.Accounts;
import com._12_2022.REVISION_DEC.Entities.Customer;
import com._12_2022.REVISION_DEC.Exceptions.CustomerNotFoundException;
import com._12_2022.REVISION_DEC.Srvieces.Services;

import jakarta.validation.Valid;

@RestController
public class Controllers {
	
	private static final Logger logger = LoggerFactory.getLogger("Controllers.class");

	@Autowired
	private Services services;

	@RequestMapping(method = RequestMethod.POST, path = "/customer")
	public ResponseEntity<Object> createCustomer(@Valid @RequestBody Customer customer) {
		Customer cust = services.createCustomer(customer);
		URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("{id}").buildAndExpand(cust.getId()).toUri();
		return ResponseEntity.created(uri).build();
	}
	
	@RequestMapping(method=RequestMethod.POST , path="/account")
	public ResponseEntity<Object> createAccount(@Valid @RequestBody Account1 account) throws CustomerNotFoundException
	{
		int custId=account.getCustId();
		Account1 acco=services.createAccount(account);
		if(acco==null)
		{
			throw new CustomerNotFoundException("Customer id "+custId+" is not actibe , please create with active customer");
		}
		URI uri=ServletUriComponentsBuilder.fromCurrentRequest().path("{SSN}").buildAndExpand(acco.getAccountId()).toUri();
		
		return ResponseEntity.created(uri).build();
//		return acco;
	}
	
	@RequestMapping(method = RequestMethod.GET , path="/accounts")
	public List<Account1> getAllAccounts()
	{
		List<Account1> accList=services.getAll();
		
		return accList;
	}
	
	@RequestMapping(method = RequestMethod.GET , path="/accounts/{customerId}")
	public List<Accounts> getAllAccountsOfCustomer(@PathVariable int customerId)
	{
		List<Accounts> accList=services.getAllForCustomerId(customerId);
		
		return accList;
	}
	

}
