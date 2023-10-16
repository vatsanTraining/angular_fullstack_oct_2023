import { Injectable } from '@angular/core';
import { OrderStatus, StatusCode } from './order-status';
@Injectable({
  providedIn: 'root'
})
export class OrderService {

  orders:OrderStatus[] = [];

  constructor() {
    this.orders=[
      {"orderId":101,"status":StatusCode.PEDNING,"value":45000},
      {"orderId":102,"status":StatusCode.COMPLETED,"value":55000},
      {"orderId":103,"status":StatusCode.PEDNING,"value":65000},
      {"orderId":104,"status":StatusCode.TRANSIT,"value":75000}
    ]

   }

   getOrders():OrderStatus[]{

    return this.orders;
   }
}
