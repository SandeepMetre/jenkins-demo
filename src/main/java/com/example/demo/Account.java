package com.example.demo;

import java.sql.Date;

import org.hibernate.annotations.CreationTimestamp;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

@Entity
public class Account {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @NotBlank(message = "Name is mandatory")
    @Size(max = 15, message = "Owner name must be less then 15 characters")
    private String ownerName;
    private String city;
    private String state;
    @Max(value =6)
    @Min(value=6)
    private Integer pin;
    private double balanceAmount;
    @CreationTimestamp
    private Date createdDate;
    private ACCOUNTTYPE accountType;
    public ACCOUNTTYPE getAccountType() {
		return accountType;
	}
	public void setAccountType(ACCOUNTTYPE accountType) {
		this.accountType = accountType;
	}
	private ACCOUNTSTATUS status;
	public ACCOUNTSTATUS getStatus() {
		return status;
	}
	public void setStatus(ACCOUNTSTATUS status) {
		this.status = status;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getOwnerName() {
		return ownerName;
	}
	public void setOwnerName(String ownerName) {
		this.ownerName = ownerName;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	
	public double getBalanceAmount() {
		return balanceAmount;
	}
	public void setBalanceAmount(double balanceAmount) {
		this.balanceAmount = balanceAmount;
	}
	public Date getCreatedDate() {
		return createdDate;
	}
	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}
	
}
