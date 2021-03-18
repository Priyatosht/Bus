import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import Swal from 'sweetalert2';
import { UserService } from '../user.service';

@Component({
  selector: 'app-home',
  templateUrl: './home.component.html',
  styleUrls: ['./home.component.css']
})
export class HomeComponent implements OnInit {

  constructor(private userService: UserService, private _route : Router) { }
  search(bus:any){
    console.log(bus);
    this.userService.journeyDate=bus.journeyDate;
    this.userService.searchForBuses(bus).subscribe(
      response =>{ 
        console.log(response);
        this.userService.listOfBuses=response;
        this._route.navigate(['/buslist'])
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
