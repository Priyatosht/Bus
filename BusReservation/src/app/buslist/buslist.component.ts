import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { UserService } from '../user.service';

@Component({
  selector: 'app-buslist',
  templateUrl: './buslist.component.html',
  styleUrls: ['./buslist.component.css']
})
export class BuslistComponent implements OnInit {
  busList:any;

  constructor(private userService: UserService, private route : Router) { }
  book(bus:any){
    console.log(bus);
    this.userService.bus=bus;
    this.route.navigate(['/details']);
  }

  ngOnInit() {
     this.busList=this.userService.listOfBuses;
  }

}
