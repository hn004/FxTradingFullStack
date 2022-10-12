import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';
import { TradingData } from '../TradingData';

@Injectable({
  providedIn: 'root',
})
export class PrintServiceService {
  private baseUrl = 'http://localhost:8080/';
  constructor(private http: HttpClient) {}

  printTrade(): Observable<TradingData[]> {
    return this.http.get<TradingData[]>(`${this.baseUrl}printAllBooking`);
  }
  printRate(): Observable<Object> {
    return this.http.get(`${this.baseUrl}printAllBooking/`);
  }
}