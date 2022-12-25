package com._12_2022.REVISION_DEC.Repositories;

import java.util.List;
import java.util.Map;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com._12_2022.REVISION_DEC.Entities.Account1;
import com._12_2022.REVISION_DEC.Entities.Accounts;

@Repository
public interface AccountRepo extends JpaRepository<Account1,Integer>{
	
	@Query(value = "select a.ACCOUNT_ID, a.ACCOUNT_TYPE , a.ACCOUNT_NAME, a.IBAN, a.OPENING_DATE from account1 a where a.CUST_ID=?1",nativeQuery = true)
	public List<Map<String,Object>> findAccountsByCustomerID(Integer customerId);

}
