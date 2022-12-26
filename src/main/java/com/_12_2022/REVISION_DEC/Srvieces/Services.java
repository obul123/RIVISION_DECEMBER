package com._12_2022.REVISION_DEC.Srvieces;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com._12_2022.REVISION_DEC.Entities.Account1;
import com._12_2022.REVISION_DEC.Entities.Accounts;
import com._12_2022.REVISION_DEC.Entities.Customer;
import com._12_2022.REVISION_DEC.Repositories.AccountRepo;
import com._12_2022.REVISION_DEC.Repositories.CustomerRepo;

import jakarta.validation.Valid;

@Service
public class Services {
	
	private static final Logger logger = LoggerFactory.getLogger("Services.class");
	
	@Autowired
	private CustomerRepo customerRepo;
	
	@Autowired
	private AccountRepo accountRepo;

	public Customer createCustomer(@Valid Customer customer) {
		// TODO Auto-generated method stub
		Customer cust=customerRepo.save(customer);
		return cust;
	}

	public Account1 createAccount(@Valid Account1 account) {
		
		// TODO Auto-generated method stub
		int ssn=account.getCustId();
		List<Integer> list=customerRepo.getAllCustomerId();
		boolean b=false;
		if(list.contains(ssn))
			b=true;
		if(b==false)
			return null;
		
//		logger.info(" X "+b);
		Account1 acc=accountRepo.save(account);
		return acc;
	}

	public List<Account1> getAll() {
		// TODO Auto-generated method stub
		
		
		return accountRepo.findAll();
	}

	public List<Accounts> getAllForCustomerId(int customerId) {
		
		// TODO Auto-generated method stub
		
		List<Map<String,Object>> map=(List<Map<String,Object>>) accountRepo.findAccountsByCustomerID(customerId);
		
		List<Accounts> accList=new ArrayList<Accounts>();
		
//		logger.info("OBULREDDY");
		for(Map<String,Object> map1 : map)
		{
		//	logger.info(" "+map1);
			Accounts acs=new Accounts();
	/*		for(Map.Entry<String, Object> entr:map1.entrySet())
			{
				logger.info(entr.getKey()+" $$$$$$$ "+"  "+entr.getValue());
				if(entr.getKey().equals("ACCOUNT_ID"))
					logger.info(entr.getKey()+" $ "+"  "+(Integer)entr.getValue());
				else if(entr.getKey().equals("OPENING_DATE"))
					logger.info(entr.getKey()+" $ "+"  "+(Date)entr.getValue());
				else
					logger.info(entr.getKey()+" $ "+"  "+(String)entr.getValue());
			}
			logger.info("\n");
			logger.info("OBULREDDY "+map1.get("ACCOUNT_ID").toString() + " "+map1.get("ACCOUNT_TYPE")+" "+map1.get("ACCOUNT_NAME")+" "+ map1.get("IBAN") ); */
			acs.setAccountId((Integer)(map1.get("ACCOUNT_ID"))); 
			acs.setAccountType((String)map1.get("ACCOUNT_TYPE"));
			acs.setAccountName((String)map1.get("ACCOUNT_NAME"));
			acs.setIBAN((String)map1.get("IBAN"));
			acs.setOpeningDate((Date)map1.get("OPENING_DATE"));
			accList.add(acs);
		}
		
		return accList;
	}


}
