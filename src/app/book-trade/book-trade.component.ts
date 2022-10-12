import { Component, OnInit } from '@angular/core';
import { NgForm } from '@angular/forms';
import { Router } from '@angular/router';
import { ConfirmBookingService } from '../Services/ConfirmBooking.service';
import { TradingData } from '../TradingData';


@Component({
  selector: 'app-book-trade',
  templateUrl: './book-trade.component.html',
  styleUrls: ['./book-trade.component.css']
})
export class BookTradeComponent implements OnInit {

  load:any=<TradingData>{}

  currencyPairs:any[]=['USDINR'];
  // currencyPairs:any='USDINR'
  exchangeRate:any[]=['Yes','No'];
  isHidden:boolean=true;
  isDisabled:boolean=true;
  Name_Pattern:any='[A-Za-z\\s.]*';

  constructor(private router:Router,
    private service:ConfirmBookingService,
   ) { }

  ngOnInit(): void {
  }
  onSubmit(f:NgForm){
    this.isHidden=false;
    let obj={
      customerName:f.value.name,
      currencyPair:f.value.currencyPair,
      transferAmount:f.value.amount,
      getRate:f.value.getRate
    }
    this.service.getRate(obj)
    .subscribe((response:any)=>{
      alert(response);
    })
  }

  onBook(){
    this.isDisabled=false;
    
    this.service.BookTrade('book')
    .subscribe((response)=>{
      alert(response);
      this.router.navigate(['/display']);
    }) 
  
  }
  onCancel(){
    this.service.BookTrade('cancel')
    .subscribe((response)=>{
      alert(response);
      this.router.navigate(['/display']);
    })  
  }

}


