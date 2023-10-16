import { Component,Input } from '@angular/core';
import { OrderStatus, StatusCode } from '../order-status';

@Component({
  selector: 'app-show-order',
  templateUrl: './show-order.component.html',
  styleUrls: ['./show-order.component.css']
})
export class ShowOrderComponent {

  @Input() orders:OrderStatus[] = [];
  
  srchString: string='';

}
