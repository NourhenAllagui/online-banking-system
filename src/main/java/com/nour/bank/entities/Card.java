package com.nour.bank.entities;

import java.time.LocalDate;

import com.nour.bank.enumerations.CardStatus;
import com.nour.bank.enumerations.CardType;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
@Entity
public class Card {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "card_id")
	Long id;
	
	@Column(name ="card_number")
	String cardNumber;
	
	@Column(name ="card_type")
	CardType cardType;
	
	@Column(name ="expiry_date")
	LocalDate expiryDate;
	
	@Column(name ="cvv")
	String cvv;
	
	@Column(name ="pin")
	String pin;
	
	@Column(name ="card_status")
	CardStatus status;
	
	@ManyToOne
	private Account account;

	public Card() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Card(Long id, String cardNumber, CardType cardType, LocalDate expiryDate, String cvv, String pin,
			CardStatus status, Account account) {
		super();
		this.id = id;
		this.cardNumber = cardNumber;
		this.cardType = cardType;
		this.expiryDate = expiryDate;
		this.cvv = cvv;
		this.pin = pin;
		this.status = status;
		this.account = account;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getCardNumber() {
		return cardNumber;
	}

	public void setCardNumber(String cardNumber) {
		this.cardNumber = cardNumber;
	}

	public CardType getCardType() {
		return cardType;
	}

	public void setCardType(CardType cardType) {
		this.cardType = cardType;
	}

	public LocalDate getExpiryDate() {
		return expiryDate;
	}

	public void setExpiryDate(LocalDate expiryDate) {
		this.expiryDate = expiryDate;
	}

	public String getCvv() {
		return cvv;
	}

	public void setCvv(String cvv) {
		this.cvv = cvv;
	}

	public String getPin() {
		return pin;
	}

	public void setPin(String pin) {
		this.pin = pin;
	}

	public CardStatus getStatus() {
		return status;
	}

	public void setStatus(CardStatus status) {
		this.status = status;
	}

	public Account getAccount() {
		return account;
	}

	public void setAccount(Account account) {
		this.account = account;
	}
	
	
}
