import { Injectable } from '@angular/core';

@Injectable({
  providedIn: 'root'
})
export class AuthenticationService {

  constructor() { }


  hasAccess():boolean{

    let status = sessionStorage.getItem("loggedIn")

    return   status === "logged"?true:false;
  }
}
