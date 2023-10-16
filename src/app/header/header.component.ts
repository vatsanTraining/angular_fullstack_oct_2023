import { Component } from '@angular/core';
import { LinkService } from '../link.service';
import { Link } from '../link';
@Component({
  selector: 'app-header',
  templateUrl: './header.component.html',
  styleUrls: ['./header.component.css']
})
export class HeaderComponent {

   author:string ='Ramesh'
   linkList:Link[] = [];

   // Injection
   constructor(service:LinkService){
       this.linkList  = service.getLinks();
   }
}
