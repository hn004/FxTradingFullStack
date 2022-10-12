import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { BookTradeComponent } from './book-trade/book-trade.component';
import { DisplayComponent } from './display/display.component';
import { ExitComponent } from './exit/exit.component';
import { HeaderComponent } from './header/header.component';
import { PrintTradeComponent } from './print-trade/print-trade.component';

const routes: Routes = [
  {
    path:"printtrade",component:PrintTradeComponent
  },
    {
      path:"bookTrade",component:BookTradeComponent
    },
    {
      path:"exitTrade",component:ExitComponent
    },
    {
      path:"display",component:DisplayComponent
    },
    {
      path:'display',component:DisplayComponent
    },
    {
      path:'**',component:DisplayComponent,pathMatch:'full'
    },
  // {
  //   path:"**",component:HeaderComponent
  // }

];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
