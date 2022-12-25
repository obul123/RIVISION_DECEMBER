package com._12_2022.REVISION_DEC.Repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com._12_2022.REVISION_DEC.Entities.Customer;

@Repository
public interface CustomerRepo extends JpaRepository<Customer,Integer>{
	
	@Query(value="select c.id from customer c",nativeQuery=true)
	List<Integer> getAllCustomerId();

}
