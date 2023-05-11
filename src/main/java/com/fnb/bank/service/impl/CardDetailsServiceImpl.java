package com.fnb.bank.service.impl;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fnb.bank.entity.CardBalance;
import com.fnb.bank.entity.CardDetails;
import com.fnb.bank.model.CardDetailsModel;
import com.fnb.bank.model.CardTransactionModel;
import com.fnb.bank.repository.CardBalanceRepo;
import com.fnb.bank.repository.CardDetailsRepo;
import com.fnb.bank.service.CardDetailsService;
import com.fnb.bank.util.ConvertBusinessModelToEntity;

@Service
public class CardDetailsServiceImpl implements CardDetailsService{

	@Autowired
	CardDetailsRepo cardDetailsRepo;
	
	@Autowired
	CardBalanceRepo cardBalanceRepo;
	
	Logger logger = LoggerFactory.getLogger(CardDetailsServiceImpl.class);
	
	@Override
	public Boolean insertCardDetails(CardDetailsModel cardDetailsModel) {

		
		try {
		CardDetails cardDetailsEntity = ConvertBusinessModelToEntity.convertCardDetailsModelToEntity(cardDetailsModel);
		CardBalance cardBalanceEntity = new CardBalance();
		cardBalanceEntity.setCardNum(cardDetailsEntity.getCardNum());
		cardBalanceEntity.setCardAmount(500000.0d);
		cardBalanceEntity.setCardRewards(0.0d);
		cardDetailsRepo.save(cardDetailsEntity);
		cardBalanceRepo.save(cardBalanceEntity);
		return true;
		}catch (Exception e) {
			logger.error("Got an error in service" +e.getMessage());
			// TODO: handle exception
			return false;
		}
	
	}

	@Override
	public List<CardDetailsModel> retrieveCardDetails() {
		List<CardDetails> cardDetailsDb = cardDetailsRepo.findAll();
		List<CardDetailsModel> cardDetailsList = new ArrayList<CardDetailsModel>();
		for(CardDetails cardDetails : cardDetailsDb) {
		CardDetailsModel cardDetailsModel = new CardDetailsModel();
		cardDetailsModel.setNameOnCard(cardDetails.getNameOnCard());
		cardDetailsModel.setCardNum(formatCard(cardDetails.getCardNum().toString()));
		cardDetailsModel.setCardLimit(cardDetails.getCardLimit());
		cardDetailsModel.setStartDate(dateFormat(cardDetails.getStartDate().toString()));
		cardDetailsModel.setExpDate(dateFormat(cardDetails.getExpDate().toString()));
		cardDetailsList.add(cardDetailsModel);
		}
		return cardDetailsList;
	}
	
	//util
	public static String formatCard(String cardNumber) {
	    if (cardNumber == null) return null;
	    char delimiter = '-';
	    return cardNumber.replaceAll(".{4}(?!$)", "$0" + delimiter);
	}

	private static String dateFormat(String incomingDate) {
		// incoming input is in 02/24 format
		
		String[] format = incomingDate.split("-");
		String yearValue = format[0].substring(2);
		String monthValue = format[1];
		String result = monthValue+"/"+yearValue;
		
		return result;
		
	}

	@Override
	public Boolean doTransaction(CardTransactionModel cardTransactionModel) {
		
		CardBalance cardBalanceEntity = new CardBalance();
		if(cardTransactionModel.)
		return null;
	}
	
}
