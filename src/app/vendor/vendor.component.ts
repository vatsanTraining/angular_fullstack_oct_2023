import { Component, OnInit } from '@angular/core';
import { VendorService } from '../vendor.service';
import { Vendor } from '../vendor';

@Component({
  selector: 'app-vendor',
  templateUrl: './vendor.component.html',
  styleUrls: ['./vendor.component.css']
})
export class VendorComponent implements OnInit {

  vendorList:Vendor[] =[] 
  
  constructor(private service:VendorService){}

  ngOnInit(): void {
    
    this.vendorList = this.service.getVendors();
  }
}
