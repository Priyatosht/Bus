import { Component } from '@angular/core';
import { Router } from '@angular/router';
import { UserService } from './user.service';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  title = 'BusReservation';
  logout(){
    this.userService.user=false;
    this.userService.admin=false;
    this.route.navigate(['/home'])
        .then(() => {
          window.location.reload();
        })
  }

  viewBuses(){
    this.userService.viewAllBuses().subscribe(
      response =>{ 
        console.log(response);
        this.userService.listOfBuses=response;
        // console.log(this.userService.listOfBuses);
        this.route.navigate(['/viewBuses'])
      },error =>{
        alert("unexpected error occured");
      }
    )
  }
  view(){
    this.userService.viewTicketByCustomer(this.userService.customer).subscribe(
      response =>{ 
        console.log(response);
        this.userService.bookings=response;
        this.route.navigate(['/bookings'])
      },error =>{
        alert("unexpected error occured");
      }
    )  
  }
  constructor(public userService: UserService, private route : Router){}
}

