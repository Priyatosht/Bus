import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { UserService } from '../user.service';

@Component({
  selector: 'app-view-buses',
  templateUrl: './view-buses.component.html',
  styleUrls: ['./view-buses.component.css']
})
export class ViewBusesComponent implements OnInit {
  allBuses:any;
  constructor(private userService: UserService, private route : Router) { }

  ngOnInit() {
    console.log(this.userService.listOfBuses);
    this.allBuses=this.userService.listOfBuses;
    console.log(this.allBuses);
  }

}
