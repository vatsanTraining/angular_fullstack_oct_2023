import { Component } from '@angular/core';
import { OrderService } from '../order.service';
import { OrderStatus, StatusCode } from '../order-status';
@Component({
  selector: 'app-order',
  templateUrl: './order.component.html',
  styleUrls: ['./order.component.css']
})
export class OrderComponent {
   orderList:OrderStatus[] =[]
  // inject the OrderService and pass the order to the showOrder component
  // in the showOrder component use @Input to capture the details

   constructor(service:OrderService){

     this.orderList = service.getOrders();
   }
}
