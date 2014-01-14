package com.ascuntar.estudioJPA.entities;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="TBL_CREDITCARD")
public class CreditCard implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 4743134295401388129L;
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private Long Id;
	private int numberCard;
	private String expiryDate;
	private Integer controlNumber;
	@Enumerated(EnumType.STRING)
	private CreditCardType creditCardType;
	
	public CreditCard() {
	}
	
	public CreditCard(int numberCard, String expiryDate, Integer controlNumber,
			CreditCardType creditCardType) {
		super();
		this.numberCard = numberCard;
		this.expiryDate = expiryDate;
		this.controlNumber = controlNumber;
		this.creditCardType = creditCardType;
	}

	public int getNumberCard() {
		return numberCard;
	}

	public void setNumberCard(int numberCard) {
		this.numberCard = numberCard;
	}

	public String getExpiryDate() {
		return expiryDate;
	}

	public void setExpiryDate(String expiryDate) {
		this.expiryDate = expiryDate;
	}

	public Integer getControlNumber() {
		return controlNumber;
	}

	public void setControlNumber(Integer controlNumber) {
		this.controlNumber = controlNumber;
	}

	public CreditCardType getCreditCardType() {
		return creditCardType;
	}

	public void setCreditCardType(CreditCardType creditCardType) {
		this.creditCardType = creditCardType;
	}

	
	
	
}
