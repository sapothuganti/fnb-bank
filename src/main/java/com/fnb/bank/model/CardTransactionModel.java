package com.fnb.bank.model;

public class CardTransactionModel {
	
	String cardNum;
	String nameOnCard;
	Integer pin;
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
	public void setNameOnCard(String nameOnCard) {
		this.nameOnCard = nameOnCard;
	}
	public Integer getPin() {
		return pin;
	}
	public void setPin(Integer pin) {
		this.pin = pin;
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
		return "CardTransactionModel [cardNum=" + cardNum + ", nameOnCard=" + nameOnCard + ", pin=" + pin + ", expDate="
				+ expDate + ", startDate=" + startDate + "]";
	}

}
