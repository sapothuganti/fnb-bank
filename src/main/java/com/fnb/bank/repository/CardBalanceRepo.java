package com.fnb.bank.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.fnb.bank.entity.CardBalance;

@Repository
public interface CardBalanceRepo extends JpaRepository<CardBalance, Integer> {

}
