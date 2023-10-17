import { Injectable } from '@angular/core';
import { Vendor } from './vendor';
import { HttpClient, HttpHeaders } from '@angular/common/http';
import { Observable } from 'rxjs';
@Injectable({
  providedIn: 'root'
})
export class VendorService {

  vendorList: Vendor[] =[]

  constructor(private http:HttpClient) { 

    // this.vendorList = [
    //   {id:101,vendorName:'DHL',serviceType:'Courier',phoneNumber:1023030,url:'www.dhl.com'},
    //   {id:102,vendorName:'Pista House',serviceType:'Food',phoneNumber:2023030,url:'www.pista.com'},
    //   {id:103,vendorName:'Udyog',serviceType:'Hr',phoneNumber:3023030}


    // ]
  }

  baseURL:string ="http://localhost:3000/vendors"
  findAll(): Observable<Vendor[]> {
    
       return this.http.get<Vendor[]>(this.baseURL)
  }
 
  add(vendor:Vendor):Observable<Vendor> {

    const headers=
          new HttpHeaders().set('content-type', 'application/json');

    return this.http.post<Vendor>(this.baseURL,vendor,{headers})
  }

  findById(id:number):Observable<Vendor> {
    
    return this.http.get<Vendor>(this.baseURL+"/"+id);
  }
  remove(id:number):Observable<Vendor> {
    
    return this.http.delete<Vendor>(this.baseURL+"/"+id);
  }

   update(id:number,obj:Vendor):Observable<Vendor>{

  const headers=
  new HttpHeaders().set('content-type', 'application/json');

return this.http.put<Vendor>(this.baseURL+"/"+id, obj,{headers});

   }




   // getVendors():Vendor[]{
  //   return this.vendorList;
  // }

}
