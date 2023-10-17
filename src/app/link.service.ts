import { Injectable } from '@angular/core';
import { Link } from './link';
@Injectable({
  providedIn: 'root'
})
export class LinkService {

  links:Link[] = [];
  constructor() {
    this.links = [{"linkText":'Home',"linkPath":''},
            {"linkText":'Product',"linkPath":'/product'},
            {"linkText":'Logout',"linkPath":'/logout'},
            {"linkText":'Order',"linkPath":'/order'}
          ];
   }

   getLinks():Link[] {
    return this.links;
   }
   
}
