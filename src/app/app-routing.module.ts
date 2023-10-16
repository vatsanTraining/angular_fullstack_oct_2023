import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { LoginComponent } from './login/login.component';
import { ContentComponent } from './content/content.component';
import { OrderComponent } from './order/order.component';
import { VendorComponent } from './vendor/vendor.component';
import { LogoutComponent } from './logout/logout.component';
import { EditVendorComponent } from './edit-vendor/edit-vendor.component';

const routes: Routes = [
  {path:'',redirectTo:'login',pathMatch:'full'},
  {path:'login',component:LoginComponent},
  {path:'vendor',component:VendorComponent},
  {path:'product',component:ContentComponent},
  {path:'order',component:OrderComponent},
  {path:'edit-vendor/:id',component:EditVendorComponent},

  {path:'logout',component:LogoutComponent}





];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
