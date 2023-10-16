import { Injectable } from '@angular/core';
import { Vendor } from './vendor';
@Injectable({
  providedIn: 'root'
})
export class VendorService {

  vendorList: Vendor[] =[]

  constructor() { 

    this.vendorList = [
      {id:101,vendorName:'DHL',serviceType:'Courier',phoneNumber:1023030,url:'www.dhl.com'},
      {id:102,vendorName:'Pista House',serviceType:'Food',phoneNumber:2023030,url:'www.pista.com'},
      {id:103,vendorName:'Udyog',serviceType:'Hr',phoneNumber:3023030}


    ]
  }

  getVendors():Vendor[]{
    return this.vendorList;
  }
}
