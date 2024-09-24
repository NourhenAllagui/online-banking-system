package com.nour.bank.entities;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;

import com.nour.bank.enumerations.BillStatus;
import com.nour.bank.enumerations.BillType;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
@Entity
public class BillPayment {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "bill_id")
	Long id;
	
	@Column(name="bill_type")
	BillType billType;
	
	@Column(name="amount")
	BigDecimal amount;
	
	@Column(name="due_date")
	LocalDate dueDate;
	
	@Column(name="paid_date")
	LocalDateTime paidDate;
	
	@Column(name="bill_status")
	BillStatus status;

	@ManyToOne
	private Account accounts;

	public BillPayment() {
		super();
		// TODO Auto-generated constructor stub
	}

	public BillPayment(Long id, BillType billType, BigDecimal amount, LocalDate dueDate, LocalDateTime paidDate,
			BillStatus status, Account accounts) {
		super();
		this.id = id;
		this.billType = billType;
		this.amount = amount;
		this.dueDate = dueDate;
		this.paidDate = paidDate;
		this.status = status;
		this.accounts = accounts;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public BillType getBillType() {
		return billType;
	}

	public void setBillType(BillType billType) {
		this.billType = billType;
	}

	public BigDecimal getAmount() {
		return amount;
	}

	public void setAmount(BigDecimal amount) {
		this.amount = amount;
	}

	public LocalDate getDueDate() {
		return dueDate;
	}

	public void setDueDate(LocalDate dueDate) {
		this.dueDate = dueDate;
	}

	public LocalDateTime getPaidDate() {
		return paidDate;
	}

	public void setPaidDate(LocalDateTime paidDate) {
		this.paidDate = paidDate;
	}

	public BillStatus getStatus() {
		return status;
	}

	public void setStatus(BillStatus status) {
		this.status = status;
	}

	public Account getAccounts() {
		return accounts;
	}

	public void setAccounts(Account accounts) {
		this.accounts = accounts;
	}
	
	
	
}
