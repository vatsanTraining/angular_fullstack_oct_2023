import { Component } from '@angular/core';
import { Product } from '../product';
@Component({
  selector: 'app-content',
  templateUrl: './content.component.html',
  styleUrls: ['./content.component.css']
})
export class ContentComponent {

  productList:Product[]=[
    {"id": 1, "productName": "Sony Tv","ratePerUnit":45000},
    {"id": 2, "productName": "Airpod","ratePerUnit":13000}
  ]

   handleClick(){

    console.log('handle click called');
   }
}
