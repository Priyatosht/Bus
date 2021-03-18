import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { UserService } from '../user.service';
import Swal from 'sweetalert2'

@Component({
  selector: 'app-add-bus',
  templateUrl: './add-bus.component.html',
  styleUrls: ['./add-bus.component.css']
})
export class AddBusComponent implements OnInit {
 

  constructor(private userService: UserService, private route : Router) {

   }
   register(bus:any){
    this.userService.addBus(bus).subscribe(
      response =>{ 
        console.log(response);
        Swal.fire({
          title: 'Success',
          text: 'Bus Added',
        })
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
