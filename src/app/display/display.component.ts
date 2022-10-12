import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { PrintServiceService } from '../Services/printService.service';
import { TradingData } from '../TradingData';


@Component({
  selector: 'app-display',
  templateUrl: './display.component.html',
  styleUrls: ['./display.component.css']
})
export class DisplayComponent implements OnInit {
  datas: TradingData[] | undefined;

  constructor( private printService: PrintServiceService,private router: Router) { }

  ngOnInit(): void {
  }
  onExit(){
    this.router.navigateByUrl('/exitTrade');
}
  onPrint(){
    this.printService.printTrade().subscribe((data: TradingData[]) => {
      this.datas = data;
    });
    this.router.navigateByUrl('/printtrade');

  }
  onBook(){
    this.router.navigateByUrl('/bookTrade');

  }

}
