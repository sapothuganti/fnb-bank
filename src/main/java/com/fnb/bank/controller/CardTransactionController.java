package com.fnb.bank.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fnb.bank.model.CardDetailsModel;
import com.fnb.bank.model.CardTransactionModel;

@RestController("/transaction")
public class CardTransactionController {
	
	@PostMapping(value="/make-payment")
	public ResponseEntity<String> makeTransaction(CardTransactionModel cardTransactionModel) {
		
		
		
		return null;
		
	}

}
