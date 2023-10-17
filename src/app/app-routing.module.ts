import { NgModule } from '@angular/core';
import { RouterModule, Routes, CanDeactivateFn } from '@angular/router';
import { LoginComponent } from './login/login.component';
import { ContentComponent } from './content/content.component';
import { OrderComponent } from './order/order.component';
import { VendorComponent } from './vendor/vendor.component';
import { LogoutComponent } from './logout/logout.component';
import { EditVendorComponent } from './edit-vendor/edit-vendor.component';
import { universalDeactivate, universalGuardGuard } from './universal-guard.guard';
import { RegisterComponent } from './register/register.component';
import { AddVendorComponent } from './add-vendor/add-vendor.component';

const routes: Routes = [
  {path:'',redirectTo:'login',pathMatch:'full'},
  {path:'login',component:LoginComponent,canDeactivate:[universalDeactivate]},
  {path:'register',component:RegisterComponent},
  {path:'vendor',component:VendorComponent},
  {path:'product',component:ContentComponent},
  {path:'add-vendor',component:AddVendorComponent},
  {path:'order',component:OrderComponent,canActivate:[universalGuardGuard],canDeactivate:[universalDeactivate]},
  {path:'edit-vendor/:id',component:EditVendorComponent},

  {path:'logout',component:LogoutComponent}





];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
