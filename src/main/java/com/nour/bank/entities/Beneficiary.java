package com.nour.bank.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
@Entity
public class Beneficiary {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "beneficiary_id")
	Long id;
	
	@Column(name ="name")
	String name;
	
	@Column(name ="account_number")
	String accountNumber;
	
	@Column(name ="bank_name")
	String bankName;
	
	@ManyToOne
	private User user;

	public Beneficiary() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Beneficiary(Long id, String name, String accountNumber, String bankName, User user) {
		super();
		this.id = id;
		this.name = name;
		this.accountNumber = accountNumber;
		this.bankName = bankName;
		this.user = user;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}

	public String getBankName() {
		return bankName;
	}

	public void setBankName(String bankName) {
		this.bankName = bankName;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}
	
	
	
}
