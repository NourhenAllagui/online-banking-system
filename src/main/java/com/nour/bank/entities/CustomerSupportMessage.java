package com.nour.bank.entities;

import java.time.LocalDateTime;

import com.nour.bank.enumerations.CustomerStatus;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
@Entity
public class CustomerSupportMessage {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "customer_id")
	Long id;
	
	@Column(name ="message")
	String message;
	
	@Column(name ="response")
	String response;
	
	@Column(name ="customer_status")
	CustomerStatus status;
	
	@Column(name ="created_date")
	LocalDateTime createdDate;
	
	@ManyToOne
	private User user;

	public CustomerSupportMessage() {
		super();
		// TODO Auto-generated constructor stub
	}

	public CustomerSupportMessage(Long id, String message, String response, CustomerStatus status,
			LocalDateTime createdDate, User user) {
		super();
		this.id = id;
		this.message = message;
		this.response = response;
		this.status = status;
		this.createdDate = createdDate;
		this.user = user;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getResponse() {
		return response;
	}

	public void setResponse(String response) {
		this.response = response;
	}

	public CustomerStatus getStatus() {
		return status;
	}

	public void setStatus(CustomerStatus status) {
		this.status = status;
	}

	public LocalDateTime getCreatedDate() {
		return createdDate;
	}

	public void setCreatedDate(LocalDateTime createdDate) {
		this.createdDate = createdDate;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}
	
	
}
