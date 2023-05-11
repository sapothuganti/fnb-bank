package com.fnb.bank.model;
public class CardDetailsModel {

	String cardNum;
	String nameOnCard;
	Double cardLimit;
	String expDate;
	String startDate;

	
	public String getCardNum() {
		return cardNum;
	}
	public void setCardNum(String cardNum) {
		this.cardNum = cardNum;
	}
	public String getNameOnCard() {
		return nameOnCard;
	}
	public void setNameOnCard(String namOnCard) {
		this.nameOnCard = namOnCard;
	}
	public Double getCardLimit() {
		return cardLimit;
	}
	public void setCardLimit(Double cardLimit) {
		this.cardLimit = cardLimit;
	}
	public String getExpDate() {
		return expDate;
	}
	public void setExpDate(String expDate) {
		this.expDate = expDate;
	}
	public String getStartDate() {
		return startDate;
	}
	public void setStartDate(String startDate) {
		this.startDate = startDate;
	}
	@Override
	public String toString() {
		return "CardDetailsModel [cardNum=" + cardNum + ", nameOnCard=" + nameOnCard + ", cardLimit=" + cardLimit
				+ ", expDate=" + expDate + ", startDate=" + startDate + "]";
	}	
	
	
	

}
