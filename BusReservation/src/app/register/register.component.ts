import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import Swal from 'sweetalert2';
import { UserService } from '../user.service';

@Component({
  selector: 'app-register',
  templateUrl: './register.component.html',
  styleUrls: ['./register.component.css']
})
export class RegisterComponent implements OnInit {

  constructor(private userService: UserService, private route : Router) { }

  ngOnInit() {
  }

  register(customer:any){
    console.log("test");
    console.log(customer);
    this.userService.registerCustomer(customer).subscribe(
      response =>{ 
        console.log(response);
        this.userService.customer=response;
        this.route.navigate(['/home'])
      },error =>{
        Swal.fire({
          title: 'Error',
          text: 'unexpected error occured',
        })
      }
    )
}

}
