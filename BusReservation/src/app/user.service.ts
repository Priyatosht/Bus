import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class UserService {
  customer:any;
  admin:any=false;
  bus:any;
  bookings:any;
  listOfBuses:any;
  passengerName:any;
  passengerAge:any;
  user:any=false;
  journeyDate:any;
  

  constructor(private http: HttpClient) { }

  public registerCustomer(customer: any):Observable<any> {
  return this.http.post('http://localhost:9494/users/addCustomer', customer);
  }

  public loginCustomer(customer: any): Observable<any> {
  return this.http.post('http://localhost:9494/users/loginCustomer', customer);
  }

  public loginAdmin(admin: any): Observable<any> {
    return this.http.post('http://localhost:9494/users/loginAdmin', admin);
    }
  public searchForBuses(bus:any):Observable<any> {
    return this.http.post('http://localhost:9494/bus/searchBuses', bus);
  }

  public viewAllBuses():Observable<any>{
    return this.http.get('http://localhost:9494/bus/viewAllBuses');
  }

  public bookTicket(ticket: any):Observable<any> {
    return this.http.post('http://localhost:9494/ticket/addTicket', ticket);
  }
  
  public viewTicketByCustomer(Customer: any):Observable<any> {
    return this.http.post('http://localhost:9494/ticket/viewTicketByCust', Customer);
  }
  
  public  deleteTicket(ticketId:any):Observable<any> {
   return this.http.delete('http://localhost:9494/ticket/deleteTicket/'+ticketId);
  }

  public addBus(Bus:any):Observable<any> {
    return this.http.post('http://localhost:9494/bus/addBus', Bus);
  }
}


