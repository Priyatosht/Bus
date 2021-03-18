import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import Swal from 'sweetalert2';
import { UserService } from '../user.service';

@Component({
  selector: 'app-adminlogin',
  templateUrl: './adminlogin.component.html',
  styleUrls: ['./adminlogin.component.css']
})
export class AdminloginComponent implements OnInit {

  constructor(public userService: UserService, private route : Router) { }

  ngOnInit() {
  }

  login(admin:any){
    console.log(admin);
    this.userService.loginAdmin(admin).subscribe(
      response =>{ 
        if(response!=null){
          this.userService.admin=true;
        console.log(response);
        this.route.navigate(['/addBus'])
        }
        else{
          Swal.fire({
            title: 'Invalid',
            text: 'enter valid details,no match found',
          })
        }
      },error =>{
        Swal.fire({
          title: 'Error',
          text: 'unexpected error occured',
        })
      }  
    )

}

}
