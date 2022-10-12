import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable, Observer } from 'rxjs';
import { environment } from 'src/environments/environment';
import { TradingData } from '../TradingData';


@Injectable({
  providedIn: 'root'
})
export class ConfirmBookingService {
  baseUrl="http://localhost:8080/";
constructor(private http:HttpClient) { }
  

  BookTrade(confirmation:string){
    return this.http.post(`${environment.baseUrl}bookTrade/${confirmation}`,null,{
      responseType:"text"
    });
  }
  getRate(obj:any){
    return this.http.post(`${environment.baseUrl}confBook`,obj,{
      responseType:"text"
    })
  }
}