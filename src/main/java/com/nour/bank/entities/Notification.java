package com.nour.bank.entities;

import java.time.LocalDateTime;

import com.nour.bank.enumerations.NotificationStatus;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
@Entity
public class Notification {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "notification_id")
	Long id;
	
	@Column(name ="message")
	String message;
	
	@Column(name ="created_date")
	LocalDateTime createdDate;
	
	@Column(name ="notification_status")
	NotificationStatus status;
	
	@ManyToOne
	private User user;

	public Notification() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Notification(Long id, String message, LocalDateTime createdDate, NotificationStatus status, User user) {
		super();
		this.id = id;
		this.message = message;
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

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public LocalDateTime getCreatedDate() {
		return createdDate;
	}

	public void setCreatedDate(LocalDateTime createdDate) {
		this.createdDate = createdDate;
	}

	public NotificationStatus getStatus() {
		return status;
	}

	public void setStatus(NotificationStatus status) {
		this.status = status;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}
	
	
}
