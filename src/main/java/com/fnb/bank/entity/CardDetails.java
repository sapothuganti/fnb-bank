package com.fnb.bank.entity;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class CardDetails {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="card_id")
	Integer cardId;
	
	@Column(name="card_num")
	Long cardNum;
	
	@Column(name="name_on_card")
	String nameOnCard;
	
	@Column(name="card_limit")
	Double cardLimit;
	
	@Column(name="exp_dt")
	Date expDate;
	
	@Column(name="start_dt")
	Date startDate;
	
	@Column(name="pin")
	Integer pin;

	public Integer getCardId() {
		return cardId;
	}

	public void setCardId(Integer cardId) {
		this.cardId = cardId;
	}

	public Long getCardNum() {
		return cardNum;
	}

	public void setCardNum(Long cardNum) {
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

	public Date getExpDate() {
		return expDate;
	}

	public void setExpDate(Date expDate) {
		this.expDate = expDate;
	}

	public Date getStartDate() {
		return startDate;
	}

	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

	public Integer getPin() {
		return pin;
	}

	public void setPin(Integer pin) {
		this.pin = pin;
	}

	@Override
	public String toString() {
		return "CardDetails [cardId=" + cardId + ", cardNum=" + cardNum + ", nameOnCard=" + nameOnCard + ", cardLimit="
				+ cardLimit + ", expDate=" + expDate + ", startDate=" + startDate + ", pin=" + pin + "]";
	}

	
}
