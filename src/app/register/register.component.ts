import { Component } from '@angular/core';
import { FormGroup,FormBuilder, Validators } from '@angular/forms';

@Component({
  selector: 'app-register',
  templateUrl: './register.component.html',
  styleUrls: ['./register.component.css']
})
export class RegisterComponent {

  registerForm:FormGroup=new FormGroup({},{})

     constructor(private builder:FormBuilder){
        
         this.registerForm=this.builder.group({
          'firstName': ['',Validators.required],
          'email': ['',Validators.email],
          'phoneNumber': ['106',Validators.required]
         })
     }

     onSubmit() {

      console.log(this.registerForm.value)
     }
}
