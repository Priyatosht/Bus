import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import Swal from 'sweetalert2';
import { UserService } from '../user.service';

@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.css']
})
export class LoginComponent implements OnInit {

  constructor(public userService: UserService, private route : Router) { 
    console.log(userService.user);
  }

  ngOnInit() {
  }

  login(customer:any){
    console.log("test");
    console.log(customer);
    this.userService.loginCustomer(customer).subscribe(
      response =>{ 
        if(response!=null){
        this.userService.user=true;
        console.log(response);
        this.userService.customer=response;
        this.route.navigate(['/home'])
        }
        else{
          Swal.fire({
            title: 'Success',
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
