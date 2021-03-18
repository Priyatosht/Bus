import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import Swal from 'sweetalert2';
import { UserService } from '../user.service';

@Component({
  selector: 'app-bookings',
  templateUrl: './bookings.component.html',
  styleUrls: ['./bookings.component.css']
})
export class BookingsComponent implements OnInit {
  bookings:any;

  constructor(private userService: UserService, private route : Router) { 

  }
  cancel(ticketId:any){
    this.userService.deleteTicket(ticketId).subscribe(
      data=>{
        Swal.fire({
          title: 'Success',
          text: 'deleted successfully',
        })
        this.view();
      },error =>{
        Swal.fire({
          title: 'Error',
          text: 'unexpected error occured',
        })
      } 
    )
  }
  view(){
    this.userService.viewTicketByCustomer(this.userService.customer).subscribe(
      response =>{ 
        console.log(response);
        this.bookings=response;
      },error =>{
        alert("unexpected error occured");
      }
    )  
  }

  ngOnInit() {
   this.bookings=this.userService.bookings;
  }

}
