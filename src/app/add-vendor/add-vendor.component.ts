import { Component } from '@angular/core';
import { FormBuilder, FormGroup, Validators } from '@angular/forms';
import { VendorService } from '../vendor.service';

@Component({
  selector: 'app-add-vendor',
  templateUrl: './add-vendor.component.html',
  styleUrls: ['./add-vendor.component.css']
})
export class AddVendorComponent {

   vendorForm:FormGroup=new FormGroup({},{})
   
  message: string='';

  constructor(private formBuilder:FormBuilder,private service:VendorService) {}

  ngOnInit(): void {
    
    this.vendorForm=this.formBuilder.group({
      "id":['',Validators.required],
      "vendorName":['',Validators.required],
      "serviceType":['',Validators.required],
      "phoneNumber":['',Validators.required],
      "url":['',]
    })
  }
    onSubmit(){
      console.log(this.vendorForm.value)

      this.service.add(this.vendorForm.value).subscribe(data =>this.message='one records Added successfully')
    }
}
