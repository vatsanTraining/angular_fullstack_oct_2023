import { Component } from '@angular/core';
import { FormBuilder, FormGroup, Validators } from '@angular/forms';

@Component({
  selector: 'app-add-vendor',
  templateUrl: './add-vendor.component.html',
  styleUrls: ['./add-vendor.component.css']
})
export class AddVendorComponent {

   vendorForm:FormGroup=new FormGroup({},{})

  constructor(private formBuilder:FormBuilder) {}

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
    }
}
