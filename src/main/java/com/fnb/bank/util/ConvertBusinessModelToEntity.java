package com.fnb.bank.util;

import java.sql.Date;
import java.util.Random;

import com.fnb.bank.entity.CardDetails;
import com.fnb.bank.model.CardDetailsModel;

public class ConvertBusinessModelToEntity {
	
	public static CardDetails convertCardDetailsModelToEntity(CardDetailsModel cardDetailsModel) {
		
		CardDetails cardDetailsEnt = new CardDetails();
		Random rand = new Random();
		StringBuffer sb = new StringBuffer();
		String formattedCardDetails = sb.append(cardDetailsModel.getCardNum().replace("-", "").trim()).toString();
		String pin = String.format("%04d", rand.nextInt(10000));
		cardDetailsEnt.setNameOnCard(cardDetailsModel.getNameOnCard());
		cardDetailsEnt.setCardLimit(cardDetailsModel.getCardLimit());
		cardDetailsEnt.setStartDate(dateFormat(cardDetailsModel.getStartDate()));
		cardDetailsEnt.setExpDate(dateFormat(cardDetailsModel.getExpDate()));
		cardDetailsEnt.setCardNum(Long.valueOf(formattedCardDetails));
		cardDetailsEnt.setPin(Integer.valueOf(pin));
		
		return cardDetailsEnt;
		
	}
	
	private static Date dateFormat(String incomingDate) {
		// incoming input is in 02/24 format
		
		String[] format = incomingDate.split("/");
		Integer monthValue = Integer.valueOf(format[0]);
		Integer yearValue = Integer.valueOf("20"+format[1]);
		
		Date date = new Date(yearValue, monthValue, 01);
		
		return date;
		
	}
	

}
