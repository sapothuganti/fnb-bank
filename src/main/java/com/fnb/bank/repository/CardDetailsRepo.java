package com.fnb.bank.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.fnb.bank.entity.CardDetails;

@Repository
public interface CardDetailsRepo extends JpaRepository<CardDetails, Integer> {
	
}
