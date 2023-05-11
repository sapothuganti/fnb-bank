package com.fnb.bank.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class CardBalance {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name ="card_balance_id")
	Integer cardBalanceId;
	
	@Column(name ="card_num")
	Long cardNum;
	
	@Column(name ="card_amount")
	Double cardAmount;
	
	@Column(name ="card_rewards")
	Double cardRewards;

	public Integer getCardBalanceId() {
		return cardBalanceId;
	}

	public void setCardBalanceId(Integer cardBalanceId) {
		this.cardBalanceId = cardBalanceId;
	}

	public Long getCardNum() {
		return cardNum;
	}

	public void setCardNum(Long cardNum) {
		this.cardNum = cardNum;
	}

	public Double getCardAmount() {
		return cardAmount;
	}

	public void setCardAmount(Double cardAmount) {
		this.cardAmount = cardAmount;
	}

	public Double getCardRewards() {
		return cardRewards;
	}

	public void setCardRewards(Double cardRewards) {
		this.cardRewards = cardRewards;
	}

	@Override
	public String toString() {
		return "CardBalance [cardBalanceId=" + cardBalanceId + ", cardNum=" + cardNum + ", cardAmount=" + cardAmount
				+ ", cardRewards=" + cardRewards + "]";
	}

	
	
}
