import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';
import {MatSlideToggleModule} from '@angular/material/slide-toggle'
import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { HeaderComponent } from './header/header.component';
import { FooterComponent } from './footer/footer.component';
import { ContentComponent } from './content/content.component';
import { LinkService } from './link.service';
import { TrialComponent } from './trial/trial.component';
import { FormsModule, ReactiveFormsModule } from '@angular/forms';
import { ParentComponent } from './parent/parent.component';
import { ChildComponent } from './child/child.component';
import { ShowOrderComponent } from './show-order/show-order.component';
import { OrderComponent } from './order/order.component';
import { VendorComponent } from './vendor/vendor.component';
import { ShowVendorComponent } from './show-vendor/show-vendor.component';
import { VendorService } from './vendor.service';
import { HighLightDirective } from './high-light.directive';
import { FilterPipe } from './filter.pipe';
import { LoginComponent } from './login/login.component';
import { AddVendorComponent } from './add-vendor/add-vendor.component';
import { EditVendorComponent } from './edit-vendor/edit-vendor.component';
import { LogoutComponent } from './logout/logout.component';
import { AuthenticationService } from './authentication.service';
import { RegisterComponent } from './register/register.component';
import {HttpClient, HttpClientModule} from '@angular/common/http';

@NgModule({
  declarations: [
    AppComponent,
    HeaderComponent,
    FooterComponent,
    ContentComponent,
    TrialComponent,
    ParentComponent,
    ChildComponent,
    ShowOrderComponent,
    OrderComponent,
    VendorComponent,
    ShowVendorComponent,
    HighLightDirective,
    FilterPipe,
    LoginComponent,
    AddVendorComponent,
    EditVendorComponent,
    LogoutComponent,
    RegisterComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    FormsModule,ReactiveFormsModule,HttpClientModule
  ],
  providers: [LinkService,VendorService,AuthenticationService,HttpClient],
  bootstrap: [AppComponent]
})
export class AppModule { }
