package com.nour.bank.entities;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import com.nour.bank.enumerations.AccountType;
import com.nour.bank.enumerations.Status;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
@Entity
public class Account {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "account_id")
	Long id;
	
	@Column(name="account_number")
	String accountNumber;
	
	@Column(name="account_type")
	AccountType accountType;
	
	@Column(name="balance")
	BigDecimal balance;
	
	@Column(name="created_date")
	LocalDateTime createdDate;
	
	@Column(name="status")
	Status status;
	
	@ManyToOne
	private User user;

	public Account() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Account(Long id, String accountNumber, AccountType accountType, BigDecimal balance,
			LocalDateTime createdDate, Status status, User user) {
		super();
		this.id = id;
		this.accountNumber = accountNumber;
		this.accountType = accountType;
		this.balance = balance;
		this.createdDate = createdDate;
		this.status = status;
		this.user = user;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}

	public AccountType getAccountType() {
		return accountType;
	}

	public void setAccountType(AccountType accountType) {
		this.accountType = accountType;
	}

	public BigDecimal getBalance() {
		return balance;
	}

	public void setBalance(BigDecimal balance) {
		this.balance = balance;
	}

	public LocalDateTime getCreatedDate() {
		return createdDate;
	}

	public void setCreatedDate(LocalDateTime createdDate) {
		this.createdDate = createdDate;
	}

	public Status getStatus() {
		return status;
	}

	public void setStatus(Status status) {
		this.status = status;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}
	
	
}
