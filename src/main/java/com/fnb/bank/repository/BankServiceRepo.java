package com.fnb.bank.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.fnb.bank.entity.BankServices;

@Repository
public interface BankServiceRepo extends JpaRepository<BankServices, Integer>{

	
	
}
