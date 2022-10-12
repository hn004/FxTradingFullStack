package com.example.FxTrd.Fxtrading.Entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "booktradeentity")
public class BookTradeEntity {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int tradeNo;
	private String currencyPair;
	private String customerName;
	private double amount;
	private double rate;
	
	
	public BookTradeEntity() {
		super();
		// TODO Auto-generated constructor stub
	}
	public BookTradeEntity(int tradeNo, String currencyPair, String customerName, double amount, double rate) {
		super();
		this.tradeNo = tradeNo;
		this.currencyPair = currencyPair;
		this.customerName = customerName;
		this.amount = amount;
		this.rate = rate;
	}
	
	
	@Override
	public String toString() {
		return "BookTradeEntity [tradeNo=" + tradeNo + ", currencyPair=" + currencyPair + ", customerName="
				+ customerName + ", amount=" + amount + ", rate=" + rate + "]";
	}
	public Integer getTradeNo() {
		return tradeNo;
	}
	public void setTradeNo(int tradeNo) {
		this.tradeNo = tradeNo;
	}
	public String getCurrencyPair() {
		return currencyPair;
	}
	public void setCurrencyPair(String currencyPair) {
		this.currencyPair = currencyPair;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
	public double getRate() {
		return rate;
	}
	public void setRate(double rate) {
		this.rate = rate;
	}
	
	
	

}
