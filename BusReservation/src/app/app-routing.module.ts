import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { AddBusComponent } from './add-bus/add-bus.component';
import { AdminloginComponent } from './adminlogin/adminlogin.component';
import { BookingsComponent } from './bookings/bookings.component';
import { BuslistComponent } from './buslist/buslist.component';
import { DetailsComponent } from './details/details.component';
import { HomeComponent } from './home/home.component';
import { LoginComponent } from './login/login.component';
import { RegisterComponent } from './register/register.component';
import { ViewBusesComponent } from './view-buses/view-buses.component';


const routes: Routes = [
  {path:'',component:HomeComponent},
  {path:'home',component:HomeComponent},
  {path:'login',component:LoginComponent},
  {path:'register',component:RegisterComponent},
  {path:'buslist',component:BuslistComponent},
  {path:'details',component:DetailsComponent},
  {path:'bookings',component:BookingsComponent},
  {path:'addBus',component:AddBusComponent},
  {path:'admin',component:AdminloginComponent},
  {path:'viewBuses',component:ViewBusesComponent},
  { path: '**', redirectTo: 'home' }
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
