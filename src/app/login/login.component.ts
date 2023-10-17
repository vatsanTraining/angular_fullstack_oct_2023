import { Component,ViewChild } from '@angular/core';
import { User } from '../user';
import { Router } from '@angular/router';
@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.css']
})
export class LoginComponent {

   @ViewChild('loginForm') loginForm: any;

  currentUser:User={userName:'',passWord:''} 

  constructor(private router:Router){

  }
  onSubmit(){
     
    if(this.currentUser.userName==='india' && this.currentUser.passWord=='india'){
      sessionStorage.setItem('loggedIn','logged');
      this.router.navigate(['vendor'])
    }    
  }

  reset(){
   this.loginForm.reset();
  }
}
