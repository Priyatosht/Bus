import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { HomeComponent } from './home/home.component';
import { LoginComponent } from './login/login.component';
import { RegisterComponent } from './register/register.component';
import { HttpClientModule } from '@angular/common/http';
import { UserService } from './user.service';
import { FormsModule } from '@angular/forms';
import { BuslistComponent } from './buslist/buslist.component';
import { DetailsComponent } from './details/details.component';
import { BookingsComponent } from './bookings/bookings.component';
import { AddBusComponent } from './add-bus/add-bus.component';
import { AdminloginComponent } from './adminlogin/adminlogin.component';
import { ViewBusesComponent } from './view-buses/view-buses.component';


@NgModule({
  declarations: [
    AppComponent,
    HomeComponent,
    LoginComponent,
    RegisterComponent,
    BuslistComponent,
    DetailsComponent,
    BookingsComponent,
    AddBusComponent,
    AdminloginComponent,
    ViewBusesComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    HttpClientModule,
    FormsModule 
  ],
  providers: [UserService],
  bootstrap: [AppComponent]
})
export class AppModule { }
