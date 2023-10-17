import { inject } from '@angular/core';
import { CanActivateFn, CanDeactivateFn } from '@angular/router';
import { AuthenticationService } from './authentication.service';
import { LoginComponent } from './login/login.component';

export const universalGuardGuard: CanActivateFn = (route, state) => {

        return  inject(AuthenticationService).hasAccess()


}

export const universalDeactivate:CanDeactivateFn<LoginComponent>=(component:LoginComponent) => {

   if(component.loginForm.dirty){
    return confirm('you have not submmited yet')
   }
      return confirm('Are you sure you want to Exit')
}