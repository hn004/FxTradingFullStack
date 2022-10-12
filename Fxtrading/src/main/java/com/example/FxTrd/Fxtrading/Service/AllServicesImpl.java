package com.example.FxTrd.Fxtrading.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.FxTrd.Fxtrading.Dao.PrintTrade;
import com.example.FxTrd.Fxtrading.Entity.BookTradeEntity;
import com.example.FxTrd.Fxtrading.Entity.Customer;

@Service
public class AllServicesImpl implements AllServices {
	
	@Autowired
	PrintTrade trade;

	
	Customer cust=new Customer();
	static final double RateUsdInr=66.00;
     
	@Override
	public String bookTrade(String bookingConfirmation) {
		
		
			
			if (bookingConfirmation.equalsIgnoreCase("BOOK")) {
				double converted = cust.getTransferAmount() * RateUsdInr;
				trade
						.save(new BookTradeEntity(0, cust.getCurrencyPair(), cust.getCustomerName(), converted, RateUsdInr));
				return "Trade for USDINR has been booked with rate " + RateUsdInr + "," + "The amount of RS " + converted
						+ " will be transferred in 2 working days to " + cust.getCustomerName() + ".";
			} else {
				return "Trade is Cancelled...";
			}
		}
	
	
	public String exchangeRate(Customer userDetails) {

		cust.setCustomerName(userDetails.getCustomerName());
		cust.setCurrencyPair(userDetails.getCurrencyPair());
		cust.setTransferAmount(userDetails.getTransferAmount());
		double converted = userDetails.getTransferAmount() * RateUsdInr;
		if (userDetails.getGetRate().equalsIgnoreCase("YES")) {
			return "You are Transferring INR " + converted + " to " + userDetails.getCustomerName()
					+ ".\n(Assuming that the rate was " + RateUsdInr + "...)";
		} else {
			return "Ok...Book or Cancel the Trade...";
		}

	}

	@Override
	public List<BookTradeEntity> printBookedTrade() {
		return trade.findAll();
	}

}
