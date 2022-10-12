package com.example.FxTrd.Fxtrading.Service;

import java.util.List;

import com.example.FxTrd.Fxtrading.Entity.BookTradeEntity;
import com.example.FxTrd.Fxtrading.Entity.Customer;

public interface AllServices {
	
    public String exchangeRate(Customer details);
	
	public String bookTrade(String bookingConfirmation);
	
	public List<BookTradeEntity> printBookedTrade();

}
