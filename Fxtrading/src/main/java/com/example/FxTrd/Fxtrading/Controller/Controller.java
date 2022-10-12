package com.example.FxTrd.Fxtrading.Controller;

import java.util.List;
//import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.FxTrd.Fxtrading.Entity.BookTradeEntity;
import com.example.FxTrd.Fxtrading.Entity.Customer;
import com.example.FxTrd.Fxtrading.Service.AllServicesImpl;

@RestController
@CrossOrigin("http://localhost:4200")
public class Controller {
	
	@Autowired
	AllServicesImpl services;
	

	@PostMapping("confBook")
	public String exchangeRate(@RequestBody @Validated  Customer bookingDetails) {

		String msg=services.exchangeRate(bookingDetails);
		return msg;
	}
    

	@PostMapping("bookTrade/{bookingConfirmation}")
	public String bookTrade(@PathVariable String bookingConfirmation) {
		String book=services.bookTrade(bookingConfirmation);
		return book;
	}

	@GetMapping("printAllBooking")
	public List<BookTradeEntity> printBookedTrade() {
		return services.printBookedTrade();
	}
	
	

}
