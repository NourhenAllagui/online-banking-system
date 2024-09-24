package com.nour.bank.entities;

import java.math.BigDecimal;
import java.time.LocalDate;

import com.nour.bank.enumerations.LoanStatus;
import com.nour.bank.enumerations.LoanType;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
@Entity
public class Loan {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "loan_id")
	Long id;
	@Column(name ="loan_amount")
	BigDecimal loanAmount;
	@Column(name ="interest_rate")
	BigDecimal interestRate;
	@Column(name ="loan_type")
	LoanType loanType;
	@Column(name ="loan_status")
	LoanStatus status;
	@Column(name ="start_date")
	LocalDate startDate;
	@Column(name ="end_date")
	LocalDate endDate;
	
	@OneToMany(mappedBy ="user")
	private User user;

	public Loan() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Loan(Long id, BigDecimal loanAmount, BigDecimal interestRate, LoanType loanType, LoanStatus status,
			LocalDate startDate, LocalDate endDate, User user) {
		super();
		this.id = id;
		this.loanAmount = loanAmount;
		this.interestRate = interestRate;
		this.loanType = loanType;
		this.status = status;
		this.startDate = startDate;
		this.endDate = endDate;
		this.user = user;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public BigDecimal getLoanAmount() {
		return loanAmount;
	}

	public void setLoanAmount(BigDecimal loanAmount) {
		this.loanAmount = loanAmount;
	}

	public BigDecimal getInterestRate() {
		return interestRate;
	}

	public void setInterestRate(BigDecimal interestRate) {
		this.interestRate = interestRate;
	}

	public LoanType getLoanType() {
		return loanType;
	}

	public void setLoanType(LoanType loanType) {
		this.loanType = loanType;
	}

	public LoanStatus getStatus() {
		return status;
	}

	public void setStatus(LoanStatus status) {
		this.status = status;
	}

	public LocalDate getStartDate() {
		return startDate;
	}

	public void setStartDate(LocalDate startDate) {
		this.startDate = startDate;
	}

	public LocalDate getEndDate() {
		return endDate;
	}

	public void setEndDate(LocalDate endDate) {
		this.endDate = endDate;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}
	
	
}
