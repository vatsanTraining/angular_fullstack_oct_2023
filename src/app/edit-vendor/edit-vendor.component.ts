import { Component } from '@angular/core';
import { ActivatedRoute, ActivatedRouteSnapshot } from '@angular/router';
import { VendorService } from '../vendor.service';
import { Vendor } from '../vendor';

@Component({
  selector: 'app-edit-vendor',
  templateUrl: './edit-vendor.component.html',
  styleUrls: ['./edit-vendor.component.css']
})
export class EditVendorComponent {

   id:number=0;
  toEdit:Vendor={id:0,vendorName:'',serviceType:'',phoneNumber:0,url:''};
   constructor(private activeRoute:ActivatedRoute,private service:VendorService){
   this.id = activeRoute.snapshot.params['id']

      service.findById(this.id).subscribe(data => { this.toEdit=data ;console.log(this.toEdit)});
   }

   onSubmit(){
    console.log(this.toEdit);
    let id = this.toEdit.id;
    this.service.update(id,this.toEdit).subscribe(data => { this.toEdit=data})
   }
}
