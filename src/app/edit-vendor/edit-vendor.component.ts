import { Component } from '@angular/core';
import { ActivatedRoute, ActivatedRouteSnapshot } from '@angular/router';

@Component({
  selector: 'app-edit-vendor',
  templateUrl: './edit-vendor.component.html',
  styleUrls: ['./edit-vendor.component.css']
})
export class EditVendorComponent {

   id:number=0;
   constructor(private activeRoute:ActivatedRoute){
   this.id = activeRoute.snapshot.params['id']

   }
}
