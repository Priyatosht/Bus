import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import Swal from 'sweetalert2';
import { UserService } from '../user.service';

@Component({
  selector: 'app-details',
  templateUrl: './details.component.html',
  styleUrls: ['./details.component.css']
})
export class DetailsComponent implements OnInit {

  ticket:any=new Object();
  constructor(private userService: UserService, private route : Router) { }
  enter(psg:any){
   
    this.ticket.bus=this.userService.bus;
    this.ticket.customer=this.userService.customer;
    this.ticket.passengerName=psg.psgName;
    this.ticket.passengerAge=psg.psgAge;
    this.ticket.journeyDate=this.userService.journeyDate;
    this.ticket.seatNo=psg.seatNo;
    console.log(this.ticket);  
    this.userService.bookTicket(this.ticket).subscribe(
      response =>{ 
        Swal.fire({
          title: 'Success',
          text: 'Booking done',
        })
        console.log(response);
        this.route.navigate(['/buslist'])
      },error =>{
        Swal.fire({
          title: 'Error',
          text: 'unexpected error occured',
        })
      }
    )
  }

  ngOnInit() {
  }

}
