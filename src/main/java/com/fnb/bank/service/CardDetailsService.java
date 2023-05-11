package com.fnb.bank.service;

import java.util.List;

import com.fnb.bank.model.CardDetailsModel;
import com.fnb.bank.model.CardTransactionModel;

public interface CardDetailsService {
	
	Boolean insertCardDetails(CardDetailsModel cardDetailsModel);
	
	List<CardDetailsModel> retrieveCardDetails();
	
	Boolean doTransaction(CardTransactionModel cardTransactionModel);

}
