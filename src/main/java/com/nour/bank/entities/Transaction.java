package com.nour.bank.entities;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import org.hibernate.resource.transaction.spi.TransactionStatus;

import com.nour.bank.enumerations.TransactionType;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
@Entity
public class Transaction {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "transaction_id")
	Long id;
	
	@Column(name ="transaction_date")
	LocalDateTime transactionDate;
	
	@Column(name ="transaction_type")
	TransactionType transactionType;
	
	@Column(name ="amount")
	BigDecimal amount;
	
	@Column(name ="Transaction_status")
	TransactionStatus status;
	
	@Column(name ="description")
	String description;
	
	@ManyToOne
	private Account sourceAccount;
	
	@ManyToOne
	private Account destinationAccount;

	public Transaction() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Transaction(Long id, LocalDateTime transactionDate, TransactionType transactionType, BigDecimal amount,
			TransactionStatus status, String description, Account sourceAccount, Account destinationAccount) {
		super();
		this.id = id;
		this.transactionDate = transactionDate;
		this.transactionType = transactionType;
		this.amount = amount;
		this.status = status;
		this.description = description;
		this.sourceAccount = sourceAccount;
		this.destinationAccount = destinationAccount;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public LocalDateTime getTransactionDate() {
		return transactionDate;
	}

	public void setTransactionDate(LocalDateTime transactionDate) {
		this.transactionDate = transactionDate;
	}

	public TransactionType getTransactionType() {
		return transactionType;
	}

	public void setTransactionType(TransactionType transactionType) {
		this.transactionType = transactionType;
	}

	public BigDecimal getAmount() {
		return amount;
	}

	public void setAmount(BigDecimal amount) {
		this.amount = amount;
	}

	public TransactionStatus getStatus() {
		return status;
	}

	public void setStatus(TransactionStatus status) {
		this.status = status;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Account getSourceAccount() {
		return sourceAccount;
	}

	public void setSourceAccount(Account sourceAccount) {
		this.sourceAccount = sourceAccount;
	}

	public Account getDestinationAccount() {
		return destinationAccount;
	}

	public void setDestinationAccount(Account destinationAccount) {
		this.destinationAccount = destinationAccount;
	}
	
	
}
